package pl.airborn.tennis.fsm;

class ThirtyFifteen implements Score {
    @Override
    public Score player1scored() {
        return new FortyFifteen();
    }

    @Override
    public Score player2scored() {
        return new ThirtyAll();
    }

    @Override
    public String getScore() {
        return "Thirty-Fifteen";
    }
}
