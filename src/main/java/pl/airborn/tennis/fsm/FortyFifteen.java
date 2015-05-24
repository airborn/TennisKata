package pl.airborn.tennis.fsm;

class FortyFifteen implements Score {
    @Override
    public Score player1scored() {
        return new OneWin();
    }

    @Override
    public Score player2scored() {
        return new FortyThirty();
    }

    @Override
    public String getScore() {
        return "Forty-Fifteen";
    }
}
