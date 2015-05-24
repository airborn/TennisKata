package pl.airborn.tennis.fsm;

class FifteenAll implements Score {
    @Override
    public Score player1scored() {
        return new ThirtyFifteen();
    }

    @Override
    public Score player2scored() {
        return new FifteenThirty();
    }

    @Override
    public String getScore() {
        return "Fifteen-All";
    }
}
