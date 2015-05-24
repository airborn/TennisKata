package pl.airborn.tennis.fsm;

class LoveAll implements Score {
    @Override
    public Score player1scored() {
        return new FifteenLove();
    }

    @Override
    public Score player2scored() {
        return new LoveFifteen();
    }

    @Override
    public String getScore() {
        return "Love-All";
    }
}
