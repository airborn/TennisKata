package pl.airborn.tennis.fsm;

class FortyLove implements Score {
    @Override
    public Score player1scored() {
        return new OneWin();
    }

    @Override
    public Score player2scored() {
        return new FortyFifteen();
    }

    @Override
    public String getScore() {
        return "Forty-Love";
    }
}
