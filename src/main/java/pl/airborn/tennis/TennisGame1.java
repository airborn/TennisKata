package pl.airborn.tennis;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;

    public TennisGame1(String player1Name, String player2Name) {
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            player1Score += 1;
        } else {
            player2Score += 1;
        }
    }

    public String getScore() {
        if (player1Score == player2Score) {
            return getEvenScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getWiningScore();
        } else {
            return getIntermediateScore();
        }
    }

    private String getEvenScore(int score) {
        if (score < 3) {
            return getPlayerScore(score) + "-All";
        } else {
            return "Deuce";
        }
    }

    private String getWiningScore() {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private String getIntermediateScore() {
        String player1 = getPlayerScore(player1Score);
        String player2 = getPlayerScore(player2Score);
        return player1 + "-" + player2;
    }

    private String getPlayerScore(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }
    }
}