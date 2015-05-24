package pl.airborn.tennis.fsm;

class LoveFifteen implements Score {
    @Override
    public Score player1scored() {
        return new FifteenAll();
    }

    @Override
    public Score player2scored() {
        return new LoveThirty();
    }

    @Override
    public String getScore() {
        return "Love-Fifteen";
    }
}
