package pl.airborn.tennis;

public class TennisGame2 implements TennisGame {
    private int player1points = 0;
    private int player2Points = 0;

    public TennisGame2(String player1Name, String player2Name) {
    }

    public String getScore() {
        if (player1points == player2Points) {
            return getTieScore();
        }
        if (player1points >= 4 && (player1points - player2Points) >= 2) {
            return "Win for player1";
        }
        if (player2Points >= 4 && (player2Points - player1points) >= 2) {
            return "Win for player2";
        }

        if (player1points > 0 && player2Points == 0) {
            return getPointString(player1points) + "-" + getPointString(player2Points);
        }
        if (player2Points > 0 && player1points == 0) {
            return getPointString(player1points) + "-" + getPointString(player2Points);
        }

        if (player1points > player2Points && player1points < 4) {
            return getPointString(player1points) + "-" + getPointString(player2Points);
        }
        if (player2Points > player1points && player2Points < 4) {
            return getPointString(player1points) + "-" + getPointString(player2Points);
        }

        if (player1points > player2Points && player2Points >= 3) {
            return "Advantage player1";
        } else {
            return "Advantage player2";
        }
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