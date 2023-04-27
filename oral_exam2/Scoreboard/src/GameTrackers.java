/*
You must at a minimum include methods that:

set the teams X
get the teams X
get the scores for each team X
addScore X
getScoringMethods
start the game X
end the current period of play X
get the current period of play X
get length of period X
get name of period (quarter, half, etc.)X
is the game over?X
winning team X
 */

//Game trackers holds the attributes of a game that do not change based off of what sport we are playing
//no matter what, we have 2 teams playing against each other, gain pts, game ends when period is over, and there will be a winner


public class GameTrackers {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private int currentPeriod;
    private String periodName;
    private int periodsTotal;
    private String gameStatus;
    private String winningTeam;
    private String[] scoringMethods;
    private int period = 1; //so that the game is considered "begun" already

    //constructor to create a new game object with new parameters
    /*public GameTrackers(String homeTeam, String awayTeam, int periodsTotal, String periodName, String[] scoringMethods){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.periodsTotal = periodsTotal;
        this.periodName = periodName;
        this.scoringMethods = scoringMethods;
    }

     */

    public GameTrackers(String c_homeTeam, String c_awayTeam) {
    }

    /*
    Get and set Home team
     */
    public String getHomeTeam(){

        return homeTeam;
    }
    public void setHomeTeam(String homeTeamSet){

        homeTeam = homeTeamSet;
    }

    /*
    Get and set Away team
     */
    public String getAwayTeam(){

        return awayTeam;
    }
    public void setAwayTeam(String awayTeamSet){

        awayTeam = awayTeamSet;
    }

    /*
    Get and set Home/Away Score
     */
    public int getHomeScore(){

        return homeScore;
    }
    public void setHomeScore(int homeScoreSet){

        homeScore = homeScoreSet;
    }

    public int getAwayScore(){
        return awayScore;
    }
    public void setAwayScore(int awayScoreSet){

        awayScore = awayScoreSet;
    }
    /*
    AddScore method
    taking a Scoring object and using the addedPoints method to call how many points to add
     */
    public void addScore(Scoring scoringTeam, String team, int points){
        if (team == "home"){
            setHomeScore(homeScore + scoringTeam.addedPoints());
        }
        if (team == "away"){
            setAwayScore(awayScore + scoringTeam.addedPoints());
        }
    }
    /*
    Start the Game
     */
    public void startGame() {
        period = 1;
    }

    /*
    Period attributes such as current, period Name (quarter, half, etc), length (if quarter, 4), endperiod for new period
     */
    public int getCurrentPeriod(){
        return currentPeriod;
    }
    public String getPeriodName(){
        return periodName;
    }
    public void endPeriod(){
        period = period + 1;
    }
    public int getPeriodLength(){
        return periodsTotal;
    }

    /*
    is the game over
     */
    public String isTheGameOver(int period){
        if(period > periodsTotal){
            gameStatus = "over";
        }
        else{
            gameStatus = "the game continues to the next" + periodName;
        }
        return gameStatus;
    }

    /*
    get winning Team
     */
    public void winningTeam(){
        while(gameStatus == "over"){
            if(homeScore > awayScore){
                winningTeam = "home";
            }
            if(awayScore>homeScore){
                winningTeam = "away";
            }
            else{
                winningTeam = "There is a tie!";
            }
        }
    }


}
