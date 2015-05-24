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
        String s;
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            s = pointsNames[p1];
            if (p1 == p2) {
                return s + "-All";
            } else {
                return s + "-" + pointsNames[p2];
            }
        } else if (p1 == p2) {
            return "Deuce";
        } else {
            if (p1 > p2) {
                s = p1N;
            } else {
                s = p2N;
            }
            if ((p1 - p2) * (p1 - p2) == 1) {
                return "Advantage " + s;
            } else {
                return "Win for " + s;
            }
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