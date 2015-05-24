package pl.airborn.tennis.fsm;

public class ScoreFactory {
    public static Score getStartingScore() {
        return new LoveAll();
    }
}
