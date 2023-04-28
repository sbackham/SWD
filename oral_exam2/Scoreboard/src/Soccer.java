/**
 * Each sport specific class is an example of inheritance, Game Soccer is inherited using the framework of class Game
 */
public class Soccer extends Game{

    public Soccer(Team homeTeam, Team awayTeam){
        super.homeTeam = homeTeam;
        super.awayTeam = awayTeam;
    }

    /**
     * Soccer specific list of scoring Methods
     */
    Scoring[] scoringMethods = {
            new Scoring("Goal", 1)
    };
    /**
     * getter for scoring
     */
    public Scoring[] getScoringMethods(){
        return scoringMethods;
    }

    /**
     * getter for name of period
     */
    public String periodName = "half";
    public String getPeriodName(){
        return periodName;
    }

    /**
     * check if game is over
     * soccer played in 2 halves, over if period ==3
     */
    public boolean isGameOver(){
        gameOver = period == 3;
        return gameOver;
    }
}