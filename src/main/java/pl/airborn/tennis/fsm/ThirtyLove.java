package pl.airborn.tennis.fsm;

class ThirtyLove implements Score {
    @Override
    public Score player1scored() {
        return new FortyLove();
    }

    @Override
    public Score player2scored() {
        return new ThirtyFifteen();
    }

    @Override
    public String getScore() {
        return "Thirty-Love";
    }
}
