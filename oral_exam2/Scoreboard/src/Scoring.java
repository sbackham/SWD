/*
all methods are included in GameTrackers.java except for scoring, which is dependent on the sport
 */

public class Scoring {
    private final int points;

    Scoring(int addPoints) {
        points = addPoints;
    }
    public int addedPoints() {
        return points;
    }
}

