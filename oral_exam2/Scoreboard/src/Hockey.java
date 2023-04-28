/**
 * Each sport specific class is an example of inheritance, Game Hockey is inherited using the framework of class Game
 */
public class Hockey extends Game{

    /**
     * Hockey constructor
     * keyword super calls the constructor of the parent class
     */
    public Hockey(Team homeTeam, Team awayTeam){
        super.homeTeam = homeTeam;
        super.awayTeam = awayTeam;
    }

    /**
     * Hockey specific list of scoring Methods
     */
    Scoring[] scoringMethods = {
            new Scoring("Goal", 1)
    };

    /**
     * getter for scoring methods
     */
    public Scoring[] getScoringMethods(){
        return scoringMethods;
    }

    /**
     * getter for name of period
     */
    public String periodName = "third";
    public String getPeriodName(){
        return periodName;
    }

    /**
     * check if game is over
     * since hockey is played in 3 periods its over when periods ==4 since a period is ended by ++
     */
    public boolean isGameOver(){
        gameOver = period == 4;
        return gameOver;
    }
}
