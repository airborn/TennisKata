package pl.airborn.tennis.fsm;

class FifteenForty implements Score {
    @Override
    public Score player1scored() {
        return new ThirtyForty();
    }

    @Override
    public Score player2scored() {
        return new TwoWin();
    }

    @Override
    public String getScore() {
        return "Fifteen-Forty";
    }
}
