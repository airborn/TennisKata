package pl.airborn.tennis;

public class TennisGame3 implements TennisGame {

    private int player1Points;
    private int player2Points;
    private String player1Name;
    private String player2Name;
    private final String[] pointsNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        if (player1Points == player2Points) {
            return getTieScore();
        } else if (player1Points < 4 && player2Points < 4) {
            return getNormalScore();
        } else {
            return getWiningScore();
        }
    }

    private String getWiningScore() {
        String s;
        if (player1Points > player2Points) {
            s = player1Name;
        } else {
            s = player2Name;
        }
        int diff = Math.abs(player1Points - player2Points);
        if (diff == 1) {
            return "Advantage " + s;
        } else {
            return "Win for " + s;
        }
    }

    private String getNormalScore() {
        return pointsNames[player1Points] + "-" + pointsNames[player2Points];
    }

    private String getTieScore() {
        if (player1Points >= 3) {
            return "Deuce";
        } else {
            return pointsNames[player1Points] + "-All";
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            this.player1Points += 1;
        } else {
            this.player2Points += 1;
        }

    }

}