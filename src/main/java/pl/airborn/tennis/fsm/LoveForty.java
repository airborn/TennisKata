package pl.airborn.tennis.fsm;

class LoveForty implements Score {
    @Override
    public Score player1scored() {
        return new FifteenForty();
    }

    @Override
    public Score player2scored() {
        return new TwoWin();
    }

    @Override
    public String getScore() {
        return "Love-Forty";
    }
}
