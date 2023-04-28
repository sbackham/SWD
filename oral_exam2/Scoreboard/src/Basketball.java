/**
 * Each sport specific class is an example of inheritance, Game Basketball is inherited using the framework of class Game
 */
public class Basketball extends Game{

    /**
     * Basketball constructor
     * keyword super calls the constructor of the parent class
     */
    public Basketball(Team homeTeam, Team awayTeam){
        super.homeTeam = homeTeam;
        super.awayTeam = awayTeam;
    }

    /**
     * Basketball specific list of scoring Methods
     */
    Scoring[] scoringMethods = {
            new Scoring("Two Pointer", 2),
            new Scoring("Three Pointer", 3),
            new Scoring("Free Throw", 1)
    };

    /**
     * getter for scoring methods
     */
    public Scoring[] getScoringMethods(){
        return scoringMethods;
    }

    /**
     * getter for period length in minutes (12 per each quarter)
     */
    public int getPeriodLength(){
        return 12;
    }
    /**
     * getter for name of period
     */
    public String periodName = "quarter";
    public String getPeriodName(){
        return periodName;
    }

    /**
     * period count, helps count when game is over
     */
    public void endPeriod() {
        period += 1;
    }
    public boolean isGameOver(){
        gameOver = period == 5;
        return gameOver;
    }
}
