/**
 * Game class
 */
public abstract class Game {
    public Team homeTeam, awayTeam;
    public boolean gameOver = true;
    public int period;
    String periodName;

    /**
     * starts game period at 1 and bool gameOver to false (gamestart)
     */
    public void startGame() { /* starts game */
        gameOver = false;
        period = 1;
    }

    /**
     * period count, helps count when game is over
     */
    public void endPeriod() {
        period += 1;
    }

    /**
     * getter for name of period (quarter, half, etc)
     */
    public String getPeriodName(){
        return periodName;
    }
    /**
     * get which period (integer)
     */
    public int getPeriod(){
        return period;
    }


    /**
     * get list of Scoring methods from which ever sport specified
     */
    public abstract Scoring[] getScoringMethods();

    /**
     * get points from scoring method applicable, add to appropriate team
     */
    public void addScore(Scoring method, Team name){
        int point = method.addedPoints();
        name.addScore(point);
    }

    /**
     * Compares scores to decide who the winner is
     */
    public String getWinner(){
        if(homeTeam.getTeamScore() > awayTeam.getTeamScore()){
            return homeTeam.getTeamName();
        }
        else if(awayTeam.getTeamScore() > homeTeam.getTeamScore()){
            return awayTeam.getTeamName();
        }
        else {
            return "We have a TIE!";
        }
    }
    /**
     * Prints current game stats
     */
    public String printScoreUpdate(){
        return homeTeam.getTeamName() + ": " + homeTeam.getTeamScore() + " \n"
                + awayTeam.getTeamName() + ": " + awayTeam.getTeamScore();
    }

    public boolean isOver(){
        gameOver = period == 5;
        return gameOver;
    }

}