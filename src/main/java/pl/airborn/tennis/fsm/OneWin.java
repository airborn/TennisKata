package pl.airborn.tennis.fsm;

class OneWin implements Score {
    @Override
    public Score player1scored() {
        return this;
    }

    @Override
    public Score player2scored() {
        return this;
    }

    @Override
    public String getScore() {
        return "Win for player1";
    }
}
