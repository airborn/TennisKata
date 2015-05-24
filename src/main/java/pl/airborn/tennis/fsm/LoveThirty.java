package pl.airborn.tennis.fsm;

class LoveThirty implements Score {
    @Override
    public Score player1scored() {
        return new FifteenThirty();
    }

    @Override
    public Score player2scored() {
        return new LoveForty();
    }

    @Override
    public String getScore() {
        return "Love-Thirty";
    }
}
