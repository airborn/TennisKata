package pl.airborn.tennis.fsm;

class ThirtyAll implements Score {
    @Override
    public Score player1scored() {
        return new FortyThirty();
    }

    @Override
    public Score player2scored() {
        return new ThirtyForty();
    }

    @Override
    public String getScore() {
        return "Thirty-All";
    }
}
