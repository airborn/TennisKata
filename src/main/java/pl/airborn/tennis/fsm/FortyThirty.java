package pl.airborn.tennis.fsm;

class FortyThirty implements Score {
    @Override
    public Score player1scored() {
        return new OneWin();
    }

    @Override
    public Score player2scored() {
        return new Deuce();
    }

    @Override
    public String getScore() {
        return "Forty-Thirty";
    }
}
