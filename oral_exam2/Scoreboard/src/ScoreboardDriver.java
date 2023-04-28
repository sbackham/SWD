import java.util.Scanner;
import java.util.LinkedList;

public class ScoreboardDriver {
    public static void main(String[] args) {
        Game game = null; // initialize a game
        Scanner scanner = new Scanner(System.in);
        boolean gameOver;

        System.out.println("Welcome to the Scoreboard. Please select a sport: ");
        System.out.println("1. Football");
        System.out.println("2. Basketball");
        System.out.println("3. Soccer");
        System.out.println("4. Hockey");
        System.out.print("Enter the digit of your sport of choice!: ");

        int sport = scanner.nextInt();

        /**
         * prompt the user for the game details
         */
        System.out.print("Enter Home Team: ");
        Scanner home = new Scanner(System.in);
        Team homeTeam = new Team(home.nextLine());

        System.out.print("Enter Away Team: ");
        Scanner away = new Scanner(System.in);
        Team awayTeam = new Team(away.nextLine());

        /**
         * Given the user input integer and team names, create a new game with parameters given home and away team names
         * Polymorphism begins to accur here. Creating a new game object uses the super keyword to take the framework of game
         * and make a specific type of game with specific attributes
         */
        if(sport == 1){
            game = new Football(homeTeam, awayTeam);
        }
        if(sport == 2){
            game = new Basketball(homeTeam, awayTeam);
        }
        if(sport == 3){
            game = new Soccer(homeTeam, awayTeam);
        }
        if(sport == 4){
            game = new Hockey(homeTeam, awayTeam);
        }

        /**
         * start the game
         */
        game.startGame();
        gameOver = game.isOver(); // change the game staus

        /**
         * this while loop keeps the game running until game status changes to gameOver
         */
        while(!gameOver){
            System.out.print("Current " + game.getPeriodName()+ ": " + game.getPeriod());

            /**
             * Prints the menu and scoring options
             */
            System.out.println("\nMenu:");
            Scoring[] methods = game.getScoringMethods();
            int count = 0;
            int number = 1;

            /**
             * 2 is for the scoring methods for each team
             */
            while(count < 2){

                String teamName = homeTeam.getTeamName();
                if(count == 1){
                    teamName = awayTeam.getTeamName();
                }

                for(Scoring method: methods){
                    System.out.println(number + ". " + teamName + " " + method.getMethod());
                    number++;
                }
                count++;
            }

            /**
             * can end game period when done adding scores
             */
            System.out.println(number + ". End " + game.getPeriodName());
            System.out.print("Enter Choice: ");


            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            /**
             * home team menu options
             */
            if(choice <= methods.length){
                Scoring methodChoice = game.getScoringMethods()[choice - 1];
                game.addScore(methodChoice, homeTeam);
            }
            /**
             * away team menu options
             */
            else if (choice <= (methods.length * 2)){
                Scoring methodChoice = game.getScoringMethods()[choice - methods.length - 1];
                game.addScore(methodChoice, awayTeam);
            }
            else {
                game.endPeriod();
            }

            gameOver = game.isOver();
        }

        /**
         * Game ended, prints out end game stats and winner
         */
        System.out.println();
        System.out.println("GAME OVER");

        System.out.println(game.printScoreUpdate());
        System.out.println("Winner: " + game.getWinner());

    }
}