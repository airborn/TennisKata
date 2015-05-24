package pl.airborn.tennis.fsm;

public interface Score {
    Score player1scored();

    Score player2scored();

    String getScore();
}
