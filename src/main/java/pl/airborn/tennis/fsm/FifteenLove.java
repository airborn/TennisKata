package pl.airborn.tennis.fsm;

class FifteenLove implements Score {
    @Override
    public Score player1scored() {
        return new ThirtyLove();
    }

    @Override
    public Score player2scored() {
        return new FifteenAll();
    }

    @Override
    public String getScore() {
        return "Fifteen-Love";
    }
}
