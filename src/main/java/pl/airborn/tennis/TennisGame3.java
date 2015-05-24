package pl.airborn.tennis;

public class TennisGame3 implements TennisGame {

    private int p2;
    private int p1;
    private String p1N;
    private String p2N;
    private final String[] pointsNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame3(String p1N, String p2N) {
        this.p1N = p1N;
        this.p2N = p2N;
    }

    public String getScore() {
        if (p1 == p2) {
            return getTieScore();
        } else if (p1 < 4 && p2 < 4) {
            return getNormalScore();
        } else {
            return getWiningScore();
        }
    }

    private String getWiningScore() {
        String s;
        if (p1 > p2) {
            s = p1N;
        } else {
            s = p2N;
        }
        int diff = Math.abs(p1 - p2);
        if (diff == 1) {
            return "Advantage " + s;
        } else {
            return "Win for " + s;
        }
    }

    private String getNormalScore() {
        return pointsNames[p1] + "-" + pointsNames[p2];
    }

    private String getTieScore() {
        if (p1 >= 3) {
            return "Deuce";
        } else {
            return pointsNames[p1] + "-All";
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            this.p1 += 1;
        } else {
            this.p2 += 1;
        }

    }

}