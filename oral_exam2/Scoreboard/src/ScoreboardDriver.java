import java.util.Scanner;

public class ScoreboardDriver {
    public static void main (String[] args){
        String sport = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the home team?: ");
        String homeTeam = scanner.next();

        System.out.println("What is the away team?: ");
        String awayTeam = scanner.next();

        System.out.println("What sport are we playing? " +
                "Choose from the list:" +
                "1. Football" +
                "2. Soccer" +
                "3. Basketball" +
                "4. Hockey" +
                "Enter the digit only to select");
        int choice = scanner.nextInt();
        if (choice == 1){
            sport = "Football";
        }
        if (choice == 2){
            sport = "Soccer";
        }
        if (choice ==3){
            sport = "Basketball";
        }
        if (choice == 4){
            sport = "Hockey";
        }
    }

}
