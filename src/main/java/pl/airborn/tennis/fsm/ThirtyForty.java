package pl.airborn.tennis.fsm;

class ThirtyForty implements Score {
    @Override
    public Score player1scored() {
        return new Deuce();
    }

    @Override
    public Score player2scored() {
        return new TwoWin();
    }

    @Override
    public String getScore() {
        return "Thirty-Forty";
    }
}
