package pl.airborn.tennis.fsm;

class Deuce implements Score {
    @Override
    public Score player1scored() {
        return new AdvantageOne();
    }

    @Override
    public Score player2scored() {
        return new AdvantageTwo();
    }

    @Override
    public String getScore() {
        return "Deuce";
    }
}
