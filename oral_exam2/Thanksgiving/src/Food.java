//Food class exists to be able to create objects of type "Food" with names such as turkey, pie, potatoes, with attributes weight and enjoyment

import java.util.Comparator;
import static java.util.Collections.sort;

public class Food {
    String foodName;
    double foodWeight;
    double foodEnjoyment;

    //Food constructor
    public Food(String fName, double fWeight, double fEnjoy) {
        this.foodName = fName;
        this.foodWeight = fWeight;
        this.foodEnjoyment = fEnjoy;


    }

    public String getName() {
        return foodName;
    }

    public double getWeight() {
        return foodWeight;
    }

    public double getEnjoyment() {
        return foodEnjoyment;
    }

    public static double EnjoymentPerWeight(Food food) {
        return food.getEnjoyment() / food.getWeight();
    }

    public static java.util.Comparator<Food> foodComparator = new java.util.Comparator<Food>() { ///comparator code adjusted from https://www.geeksforgeeks.org/how-to-sort-an-arraylist-of-objects-by-property-in-java/

        // Method
        public int compare(Food s1, Food s2) {

            double rollno1 = Food.EnjoymentPerWeight(s1);
            double rollno2 = Food.EnjoymentPerWeight(s2);
            return (int) (rollno2 - rollno1);
        }


    };

    @Override
    public String toString() {

//        return "[ name=" + foodName + ", Weight="
//                + foodWeight + ", enjoyment=" + foodEnjoyment + "]";
        return foodName;


    }
}

