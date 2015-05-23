package pl.airborn.tennis;

public class TennisGame2 implements TennisGame {
    private int player1points = 0;
    private int player2Points = 0;

    public String P1res = "";
    public String P2res = "";

    public TennisGame2(String player1Name, String player2Name) {
    }

    public String getScore() {
        String score = "";
        if (player1points == player2Points) {
            return getTieScore();
        }

        if (player1points > 0 && player2Points == 0) {
            P1res = getPointString(player1points);
            P2res = getPointString(player2Points);
            score = P1res + "-" + P2res;
        }
        if (player2Points > 0 && player1points == 0) {
            P2res = getPointString(player2Points);
            P1res = getPointString(player1points);
            score = P1res + "-" + P2res;
        }

        if (player1points > player2Points && player1points < 4) {
            P1res = getPointString(player1points);
            P2res = getPointString(player2Points);
            return P1res + "-" + P2res;
        }
        if (player2Points > player1points && player2Points < 4) {
            P1res = getPointString(player1points);
            P2res = getPointString(player2Points);
            return P1res + "-" + P2res;
        }

        if (player1points > player2Points && player2Points >= 3) {
            score = "Advantage player1";
        }

        if (player2Points > player1points && player1points >= 3) {
            score = "Advantage player2";
        }

        if (player1points >= 4 && (player1points - player2Points) >= 2) {
            score = "Win for player1";
        }
        if (player2Points >= 4 && (player2Points - player1points) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    private String getPointString(int playerPoints) {
        if (playerPoints == 0) {
            return "Love";
        } else if (playerPoints == 1) {
            return "Fifteen";
        } else if (playerPoints == 2) {
            return "Thirty";
        } else {
            return "Forty";
        }
    }

    private String getTieScore() {
        if (player1points >= 3) {
            return "Deuce";
        } else {
            return getPointString(player1points) + "-All";
        }
    }

    public void wonPoint(String player) {
        if (player.equals("player1")) {
            player1points++;
        } else {
            player2Points++;
        }
    }
}