package pl.airborn.tennis;

public class TennisGameEnumFSM implements TennisGame {

    private GameState gameState = GameState.LOVE_ALL;

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            gameState = gameState.player1Scores();
        } else {
            gameState = gameState.player2Scores();
        }
    }

    @Override
    public String getScore() {
        return gameState.toString();
    }
}
