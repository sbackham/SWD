import java.util.ArrayList;
import java.util.Scanner;

public class ThanksgivingDriver {
    public void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String turkey = "turkey";
        String pie = "pie";
        String potatoes = "potatoes";
        String gravy = "gravy";
        String stuffing = "stuffing";
        String cranberries = "cranberries";
        String casserole = "casserole";

        System.out.println("Welcome to the Thanksgiving Dinner Optimizer \n" +
                "For dinner we are having turkey, pie, potatoes, gravy, stuffing, cranberries, and casserole \n" +
                "Please enter the weight of turkey: ");
        int turkeyWeight = scanner.nextInt();

        System.out.println("Please enter the enjoyment units of turkey: ");
        int turkeyEnjoyment = scanner.nextInt();
        Food Turkey = new Food(turkey, turkeyWeight, turkeyEnjoyment);

        System.out.println("Please enter the weight units of pie: ");
        int pieWeight = scanner.nextInt();

        System.out.println("Please enter the enjoyment units of pie: ");
        int pieEnjoyment = scanner.nextInt();
        Food Pie = new Food(pie, pieWeight, pieEnjoyment);

        System.out.println("Please enter the weight units of potatoes: ");
        int potatoesWeight = scanner.nextInt();

        System.out.println("Please enter the enjoyment units of potatoes: ");
        int potatoesEnjoyment = scanner.nextInt();
        Food Potatoes = new Food(potatoes, potatoesWeight, potatoesEnjoyment);

        System.out.println("Please enter the weight units of gravy: ");
        int gravyWeight = scanner.nextInt();

        System.out.println("Please enter the enjoyment units of gravy: ");
        int gravyEnjoyment = scanner.nextInt();
        Food Gravy = new Food(gravy, gravyWeight, gravyEnjoyment);

        System.out.println("Please enter the weight units of stuffing: ");
        int stuffingWeight = scanner.nextInt();

        System.out.println("Please enter the enjoyment units of stuffing: ");
        int stuffingEnjoyment = scanner.nextInt();
        Food Stuffing = new Food(stuffing, stuffingWeight, stuffingEnjoyment);

        System.out.println("Please enter the weight units of cranberries: ");
        int cranberriesWeight = scanner.nextInt();

        System.out.println("Please enter the enjoyment units of cranberries: ");
        int cranberriesEnjoyment = scanner.nextInt();
        Food Cranberries = new Food(cranberries, cranberriesWeight, cranberriesEnjoyment);

        System.out.println("Please enter the weight units of casserole: ");
        int casseroleWeight = scanner.nextInt();

        System.out.println("Please enter the enjoyment units of casserole: ");
        int casseroleEnjoyment = scanner.nextInt();
        Food Casserole = new Food(casserole, casseroleWeight, casseroleEnjoyment);

        int TurkeyRate = Turkey.EnjoymentPerWeight(Turkey);
        System.out.println(TurkeyRate);

    }
}
