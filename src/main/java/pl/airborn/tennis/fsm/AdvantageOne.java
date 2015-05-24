package pl.airborn.tennis.fsm;

class AdvantageOne implements Score {
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
        return "Advantage player1";
    }
}
