import java.util.Scanner;

public class ScoreboardDriver {
    String scoringTeam = "";
    static Game game = null;
    String newHomeTeam, newAwayTeam;

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Scoreboard tracker! \n" +
                "Please select which sport you will be tracking by entering the corresponding digit \n" +
                "(1): Football \n" +
                "(2): Basketball \n" +
                "(3): Hockey \n" +
                "(4): Soccer \n");
        int sport = scanner.nextInt();

        System.out.println("Enter the home team name: ");
        String newHomeTeam = scanner.next();

        System.out.println("Enter the away team name: ");
        String newAwayTeam = scanner.next();

        if (sport == 1) {
            game = new Football(newHomeTeam, newAwayTeam);
        }
        if (sport == 2) {
            game = new Basketball(newHomeTeam, newAwayTeam);
        }
        if (sport == 3) {
            game = new Hockey(newHomeTeam, newAwayTeam);
        }
        if (sport == 4) {
            game = new Soccer(newHomeTeam, newAwayTeam);
        }
        System.out.println("Current Score: \n" + //display current scores
                game.getHomeTeam()+ ":" + game.getHomeScore()+ " " +
                game.getAwayTeam()+ ":" + game.getAwayScore()+ " " +
                "\n" +
                "Current "+ game.getPeriodName()+ ": " + game.getCurrentPeriod()); // "current half, current quarter"
    }
}
