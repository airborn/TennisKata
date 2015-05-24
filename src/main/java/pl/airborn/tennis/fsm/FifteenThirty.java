package pl.airborn.tennis.fsm;

class FifteenThirty implements Score {
    @Override
    public Score player1scored() {
        return new ThirtyAll();
    }

    @Override
    public Score player2scored() {
        return new FifteenForty();
    }

    @Override
    public String getScore() {
        return "Fifteen-Thirty";
    }
}
