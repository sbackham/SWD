/**
 * Scoring class
 */

public class Scoring{

    private final String method;
    private final int points;

    /**
     * constructor for a score, parameters what the method is and how many pts it is worth
     */
    public Scoring(String method, int point) {
        this.method = method;
        this.points = point;
    }
    /**
     * getter for method
     */
    public String getMethod(){
        return method;
    }
    /**
     * gets added points per method
     */
    public int addedPoints(){
        return points;
    }
}