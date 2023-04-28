/**
 * Each sport specific class is an example of inheritance, Game Football is inherited using the framework of class Game
 */
public class Football extends Game{

    /**
     * Football constructor
     * keyword super calls the constructor of the parent class
     */
    public Football(Team homeTeam, Team awayTeam){
        super.homeTeam = homeTeam;
        super.awayTeam = awayTeam;
    }

    /**
     * List of scoring methods specific to football
     */
    Scoring[] scoringMethods = {
            new Scoring("Touchdown", 6),
            new Scoring("Field Goal", 3),
            new Scoring("Extra-point", 1),
            new Scoring("Two-point Conversion", 2),
            new Scoring("Safety", 2)
    };

    /**
     * getter for scoring methods
     */
    public Scoring[] getScoringMethods(){
        return scoringMethods;
    }
    /**
     * getter for period length of football (15 mins per quarter)
     */
    public int getPeriodLength(){
        return 15;
    }

    /**
     * getter for name of period
     */
    public String periodName = "quarter";
    public String getPeriodName(){
        return periodName;
    }

    /**
     * check if game is over
     */
    public boolean isGameOver(){
        gameOver = period == 5;
        return gameOver;
    }

}