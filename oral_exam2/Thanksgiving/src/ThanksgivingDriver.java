import java.util.*;

/**
 * Driver Application that prompts the user for inputs for each given food item
 */
public class ThanksgivingDriver {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String turkey = "turkey";
        String pie = "pie";
        String potatoes = "potatoes";
        String gravy = "gravy";
        String stuffing = "stuffing";
        String cranberries = "cranberries";
        String casserole = "casserole";
        ArrayList<Food> sortFood = new ArrayList();
        ArrayList sortedFood = new ArrayList();
        int turkeyCount = 0;
        int pieCount =0;
        int potatoesCount=0;
        int gravyCount=0;
        int stuffingCount=0;
        int cranberriesCount=0;
        int casseroleCount=0;
        int totalEnjoyment =0;


        System.out.println("Welcome to the Thanksgiving Dinner Optimizer \n" +
                "For dinner we are having turkey, pie, potatoes, gravy, stuffing, cranberries, and casserole \n" +
                "Please enter the weight of turkey: ");
        int turkeyWeight = scanner.nextInt();

        /**
         * Takes user inputs for the number for weight and enjoyment
         */
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

        System.out.println("Enter stomach capacity: ");
        int stomachCapacity = scanner.nextInt();

        /**
         * An arraylist that holds the list of foods with their attributes
         */
        sortFood.add(Turkey);
        sortFood.add(Pie);
        sortFood.add(Potatoes);
        sortFood.add(Gravy);
        sortFood.add(Stuffing);
        sortFood.add(Cranberries);
        sortFood.add(Casserole);


        /**
         * sorts food by the highest Enjoyment per Weight ratio
         */
        //Collections.sort(sortFood, Food.foodComparator);

        /**
         * sorts food by the highest Enjoyment per Weight ratio
         */
        for (Food str : sortFood) {
            sortedFood.add(str);
        }

        /**
         * this loop takes stomach capacity while it is not 0 and subtracts the weight of each food starting at the one
         * with the greatest ratio
         */
        for(int i =0; i<sortedFood.size(); i++){
            String currentFood = sortedFood.get(i).toString();
            while (stomachCapacity > 0){
                if(currentFood.equals("turkey")){
                      while(stomachCapacity >=turkeyWeight){
                          stomachCapacity = (int) (stomachCapacity - turkeyWeight);
                          turkeyCount = turkeyCount+1;
                          totalEnjoyment= (int) (totalEnjoyment + turkeyEnjoyment);
                      }
                }
                if(currentFood.equals("pie")){
                    while(stomachCapacity>=pieWeight){
                        stomachCapacity = (int) (stomachCapacity - pieWeight);
                        pieCount = pieCount+1;
                        totalEnjoyment= (int) (totalEnjoyment + pieEnjoyment);
                    }
                }
                if(currentFood.equals("potatoes")){
                    while(stomachCapacity>=potatoesWeight){
                        stomachCapacity = (int) (stomachCapacity - potatoesWeight);
                        potatoesCount = potatoesCount+1;
                        totalEnjoyment= (int) (totalEnjoyment + potatoesEnjoyment);
                    }
                }
                if(currentFood.equals("gravy")){
                    while(stomachCapacity>=gravyWeight){
                        stomachCapacity = (int) (stomachCapacity -gravyWeight);
                        gravyCount = gravyCount+1;
                        totalEnjoyment= (int) (totalEnjoyment + gravyEnjoyment);
                    }
                }
                if(currentFood.equals("stuffing")){
                    while(stomachCapacity>=stuffingWeight){
                        stomachCapacity = (int) (stomachCapacity - stuffingWeight);
                        stuffingCount = stuffingCount+1;
                        totalEnjoyment= (int) (totalEnjoyment + stuffingEnjoyment);
                    }
                }
                if(currentFood.equals("cranberries")){
                    while(stomachCapacity>=cranberriesWeight){
                        stomachCapacity = (stomachCapacity - cranberriesWeight);
                        cranberriesCount = cranberriesCount+1;
                        totalEnjoyment= (totalEnjoyment + cranberriesEnjoyment);
                    }
                }
                if(currentFood.equals("casserole")){
                    while(stomachCapacity>=casseroleWeight){
                        stomachCapacity = (stomachCapacity - casseroleWeight);
                        casseroleCount = casseroleCount+1;
                        totalEnjoyment=  (totalEnjoyment + casseroleEnjoyment);
                    }
                }
            }
        }
        /**
         * returns the count for each food and the total enjoyment
         */
        System.out.println("Turkey: " + turkeyCount);
        System.out.println("Pie: " + pieCount);
        System.out.println("Potatoes: " + potatoesCount);
        System.out.println("Gravy: " + gravyCount);
        System.out.println("Stuffing: " + stuffingCount);
        System.out.println("Cranberries: " + cranberriesCount);
        System.out.println("Casserole: " + casseroleCount);
        System.out.println("Total Enjoyment: " + totalEnjoyment);

    }
 };

