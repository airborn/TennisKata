package pl.airborn.tennis.guava;

import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.ValueGraphBuilder;

import pl.airborn.tennis.TennisGame;

public class GraphTennis implements TennisGame {

    private final MutableValueGraph<GameState, ScoringPlayer> graph = ValueGraphBuilder.directed().build();
    private GameState currentState = GameState.LOVE_ALL;

    public GraphTennis() {
        graph.addNode(GameState.LOVE_ALL);

        graph.putEdgeValue(GameState.LOVE_ALL, GameState.FIFTEEN_LOVE, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.LOVE_ALL, GameState.LOVE_FIFTEEN, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.FIFTEEN_LOVE, GameState.THIRTY_LOVE, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.FIFTEEN_LOVE, GameState.FIFTEEN_ALL, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.LOVE_FIFTEEN, GameState.FIFTEEN_ALL, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.LOVE_FIFTEEN, GameState.LOVE_THIRTY, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.THIRTY_LOVE, GameState.FORTY_LOVE, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.THIRTY_LOVE, GameState.THIRTY_FIFTEEN, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.FIFTEEN_ALL, GameState.THIRTY_FIFTEEN, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.FIFTEEN_ALL, GameState.FIFTEEN_THIRTY, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.LOVE_THIRTY, GameState.FIFTEEN_THIRTY, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.LOVE_THIRTY, GameState.LOVE_FORTY, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.FORTY_LOVE, GameState.ONE_WINS, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.FORTY_LOVE, GameState.FORTY_FIFTEEN, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.THIRTY_FIFTEEN, GameState.FORTY_FIFTEEN, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.THIRTY_FIFTEEN, GameState.THIRTY_ALL, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.FIFTEEN_THIRTY, GameState.THIRTY_ALL, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.FIFTEEN_THIRTY, GameState.FIFTEEN_FORTY, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.LOVE_FORTY, GameState.FIFTEEN_FORTY, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.LOVE_FORTY, GameState.TWO_WINS, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.FORTY_FIFTEEN, GameState.ONE_WINS, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.FORTY_FIFTEEN, GameState.FORTY_THIRTY, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.THIRTY_ALL, GameState.FORTY_THIRTY, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.THIRTY_ALL, GameState.THIRTY_FORTY, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.FIFTEEN_FORTY, GameState.THIRTY_FORTY, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.FIFTEEN_FORTY, GameState.TWO_WINS, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.FORTY_THIRTY, GameState.ONE_WINS, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.FORTY_THIRTY, GameState.DEUCE, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.THIRTY_FORTY, GameState.DEUCE, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.THIRTY_FORTY, GameState.TWO_WINS, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.DEUCE, GameState.ADV_ONE, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.DEUCE, GameState.ADV_TWO, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.ADV_ONE, GameState.ONE_WINS, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.ADV_ONE, GameState.DEUCE, ScoringPlayer.PLAYER_2);

        graph.putEdgeValue(GameState.ADV_TWO, GameState.DEUCE, ScoringPlayer.PLAYER_1);
        graph.putEdgeValue(GameState.ADV_TWO, GameState.TWO_WINS, ScoringPlayer.PLAYER_2);
    }

    @Override
    public void wonPoint(String playerName) {
        ScoringPlayer scoringPlayer = ScoringPlayer.fromString(playerName);
        currentState = graph.successors(currentState)
            .stream()
            .filter(successor -> graph.edgeValue(currentState, successor).equals(scoringPlayer))
            .findAny()
            .orElseThrow(() -> new RuntimeException("Illegal transition"));
    }

    @Override
    public String getScore() {
        return currentState.toString();
    }
}
