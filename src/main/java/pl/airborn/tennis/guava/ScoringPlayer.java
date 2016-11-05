package pl.airborn.tennis.guava;

public enum ScoringPlayer {
    PLAYER_1,
    PLAYER_2;

    public static ScoringPlayer fromString(String player){
        if("player1".equals(player)){
            return PLAYER_1;
        } else if("player2".equals(player)){
            return PLAYER_2;
        }
        throw new RuntimeException("No such player");
    }
}
