package pl.airborn.tennis;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum GameState {
    LOVE_ALL {
        @Override
        public GameState player1Scores() {
            return FIFTEEN_LOVE;
        }

        @Override
        public GameState player2Scores() {
            return LOVE_FIFTEEN;
        }
    },
    FIFTEEN_LOVE {
        @Override
        public GameState player1Scores() {
            return THIRTY_LOVE;
        }

        @Override
        public GameState player2Scores() {
            return FIFTEEN_ALL;
        }
    },
    LOVE_FIFTEEN {
        @Override
        public GameState player1Scores() {
            return FIFTEEN_ALL;
        }

        @Override
        public GameState player2Scores() {
            return LOVE_THIRTY;
        }
    },
    THIRTY_LOVE {
        @Override
        public GameState player1Scores() {
            return FORTY_LOVE;
        }

        @Override
        public GameState player2Scores() {
            return THIRTY_FIFTEEN;
        }
    },
    FIFTEEN_ALL {
        @Override
        public GameState player1Scores() {
            return THIRTY_FIFTEEN;
        }

        @Override
        public GameState player2Scores() {
            return FIFTEEN_THIRTY;
        }
    },
    LOVE_THIRTY {
        @Override
        public GameState player1Scores() {
            return FIFTEEN_THIRTY;
        }

        @Override
        public GameState player2Scores() {
            return LOVE_FORTY;
        }
    },
    FORTY_LOVE {
        @Override
        public GameState player1Scores() {
            return ONE_WINS;
        }

        @Override
        public GameState player2Scores() {
            return FORTY_FIFTEEN;
        }
    },
    THIRTY_FIFTEEN {
        @Override
        public GameState player1Scores() {
            return FORTY_FIFTEEN;
        }

        @Override
        public GameState player2Scores() {
            return THIRTY_ALL;
        }
    },
    FIFTEEN_THIRTY {
        @Override
        public GameState player1Scores() {
            return THIRTY_ALL;
        }

        @Override
        public GameState player2Scores() {
            return FIFTEEN_FORTY;
        }
    },
    LOVE_FORTY {
        @Override
        public GameState player1Scores() {
            return FIFTEEN_FORTY;
        }

        @Override
        public GameState player2Scores() {
            return TWO_WINS;
        }
    },
    FORTY_FIFTEEN {
        @Override
        public GameState player1Scores() {
            return ONE_WINS;
        }

        @Override
        public GameState player2Scores() {
            return FORTY_THIRTY;
        }
    },
    THIRTY_ALL {
        @Override
        public GameState player1Scores() {
            return FORTY_THIRTY;
        }

        @Override
        public GameState player2Scores() {
            return THIRTY_FORTY;
        }
    },
    FIFTEEN_FORTY {
        @Override
        public GameState player1Scores() {
            return THIRTY_FORTY;
        }

        @Override
        public GameState player2Scores() {
            return TWO_WINS;
        }
    },
    ONE_WINS {
        @Override
        public GameState player1Scores() {
            return ONE_WINS;
        }

        @Override
        public GameState player2Scores() {
            return ONE_WINS;
        }


        @Override
        public String toString() {
            return "Win for player1";
        }
    },
    FORTY_THIRTY {
        @Override
        public GameState player1Scores() {
            return ONE_WINS;
        }

        @Override
        public GameState player2Scores() {
            return DEUCE;
        }
    },
    THIRTY_FORTY {
        @Override
        public GameState player1Scores() {
            return DEUCE;
        }

        @Override
        public GameState player2Scores() {
            return TWO_WINS;
        }
    },
    TWO_WINS {
        @Override
        public GameState player1Scores() {
            return TWO_WINS;
        }

        @Override
        public GameState player2Scores() {
            return TWO_WINS;
        }


        @Override
        public String toString() {
            return "Win for player2";
        }
    },
    ADV_ONE {
        @Override
        public GameState player1Scores() {
            return ONE_WINS;
        }

        @Override
        public GameState player2Scores() {
            return DEUCE;
        }

        @Override
        public String toString() {
            return "Advantage player1";
        }
    },
    DEUCE {
        @Override
        public GameState player1Scores() {
            return ADV_ONE;
        }

        @Override
        public GameState player2Scores() {
            return ADV_TWO;
        }
    },
    ADV_TWO {
        @Override
        public GameState player1Scores() {
            return DEUCE;
        }

        @Override
        public GameState player2Scores() {
            return TWO_WINS;
        }

        @Override
        public String toString() {
            return "Advantage player2";
        }
    };

    public abstract GameState player1Scores();

    public abstract GameState player2Scores();

    @Override
    public String toString() {
        String originalName = super.toString();
        return Stream.of(originalName.split("_"))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .collect(Collectors.joining("-"));
    }
}
