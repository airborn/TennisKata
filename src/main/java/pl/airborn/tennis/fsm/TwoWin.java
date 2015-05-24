package pl.airborn.tennis.fsm;

class TwoWin implements Score {
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
        return "Win for player2";
    }
}
