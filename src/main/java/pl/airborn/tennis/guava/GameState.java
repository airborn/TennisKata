package pl.airborn.tennis.guava;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum GameState {
    LOVE_ALL,
    FIFTEEN_LOVE,
    LOVE_FIFTEEN,
    THIRTY_LOVE,
    FIFTEEN_ALL,
    LOVE_THIRTY,
    FORTY_LOVE,
    THIRTY_FIFTEEN,
    FIFTEEN_THIRTY,
    LOVE_FORTY,
    FORTY_FIFTEEN,
    THIRTY_ALL,
    FIFTEEN_FORTY,
    ONE_WINS {
        @Override
        public String toString() {
            return "Win for player1";
        }
    },
    FORTY_THIRTY,
    THIRTY_FORTY {
    },
    TWO_WINS {
        @Override
        public String toString() {
            return "Win for player2";
        }
    },
    ADV_ONE {
        @Override
        public String toString() {
            return "Advantage player1";
        }
    },
    DEUCE,
    ADV_TWO {
        @Override
        public String toString() {
            return "Advantage player2";
        }
    };

    @Override
    public String toString() {
        String originalName = super.toString();
        return Stream.of(originalName.split("_"))
            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
            .collect(Collectors.joining("-"));
    }
}
