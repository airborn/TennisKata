package pl.airborn.tennis;

import pl.airborn.tennis.fsm.Score;
import pl.airborn.tennis.fsm.ScoreFactory;

public class TennisGameInterfaceFSM implements TennisGame {

    private Score currentScore = ScoreFactory.getStartingScore();

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            currentScore = currentScore.player1scored();
        } else {
            currentScore = currentScore.player2scored();
        }
    }

    @Override
    public String getScore() {
        return currentScore.getScore();
    }
}
