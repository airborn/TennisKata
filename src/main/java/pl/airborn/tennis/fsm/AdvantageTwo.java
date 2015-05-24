package pl.airborn.tennis.fsm;

class AdvantageTwo implements Score {
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
        return "Advantage player2";
    }
}
