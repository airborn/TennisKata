package pl.airborn.tennis;

public class TennisGame2 implements TennisGame {
    public int player1points = 0;
    public int player2Points = 0;

    public String P1res = "";
    public String P2res = "";

    public TennisGame2(String player1Name, String player2Name) {
    }

    public String getScore() {
        String score = "";
        if (player1points == player2Points && player1points < 4) {
            if (player1points == 0) {
                score = "Love";
            }
            if (player1points == 1) {
                score = "Fifteen";
            }
            if (player1points == 2) {
                score = "Thirty";
            }
            score += "-All";
        }
        if (player1points == player2Points && player1points >= 3) {
            score = "Deuce";
        }

        if (player1points > 0 && player2Points == 0) {
            if (player1points == 1) {
                P1res = "Fifteen";
            }
            if (player1points == 2) {
                P1res = "Thirty";
            }
            if (player1points == 3) {
                P1res = "Forty";
            }

            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (player2Points > 0 && player1points == 0) {
            if (player2Points == 1) {
                P2res = "Fifteen";
            }
            if (player2Points == 2) {
                P2res = "Thirty";
            }
            if (player2Points == 3)
                P2res = "Forty";

            P1res = "Love";
            score = P1res + "-" + P2res;
        }

        if (player1points > player2Points && player1points < 4) {
            if (player1points == 2) {
                P1res = "Thirty";
            }
            if (player1points == 3) {
                P1res = "Forty";
            }
            if (player2Points == 1) {
                P2res = "Fifteen";
            }
            if (player2Points == 2) {
                P2res = "Thirty";
            }
            score = P1res + "-" + P2res;
        }
        if (player2Points > player1points && player2Points < 4) {
            if (player2Points == 2) {
                P2res = "Thirty";
            }
            if (player2Points == 3) {
                P2res = "Forty";
            }
            if (player1points == 1) {
                P1res = "Fifteen";
            }
            if (player1points == 2) {
                P1res = "Thirty";
            }
            score = P1res + "-" + P2res;
        }

        if (player1points > player2Points && player2Points >= 3) {
            score = "Advantage player1";
        }

        if (player2Points > player1points && player1points >= 3) {
            score = "Advantage player2";
        }

        if (player1points >= 4 && player2Points >= 0 && (player1points - player2Points) >= 2) {
            score = "Win for player1";
        }
        if (player2Points >= 4 && player1points >= 0 && (player2Points - player1points) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    public void wonPoint(String player) {
        if (player.equals("player1")) {
            player1points++;
        } else {
            player2Points++;
        }
    }
}