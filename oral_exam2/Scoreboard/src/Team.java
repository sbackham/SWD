/**
 * Team class
 */

public class Team {
    private final String TeamName;
    private int TeamScore;

    /**
     * Team constructor
     */
    public Team(String TeamName){
        this.TeamName = TeamName;
    }

    /**
     * method to add points to a team score
     */
    public void addScore(int point){
        TeamScore += point;
    }

    /**
     * getter for team name
     */
    public String getTeamName() {
        return TeamName;
    }

    /**
     * getter for team score
     */
    public int getTeamScore() {
        return TeamScore;
    }
}