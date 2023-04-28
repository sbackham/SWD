/**
 * Food class exists to be able to create objects of type "Food" with names such as turkey, pie, potatoes, with attributes weight and enjoyment
 */
public class Food {
    String foodName;
    double foodWeight;
    double foodEnjoyment;

    /**
     * Food constructor (creates objects of type Food with attributes Name, Weight, Enjoyment
     */
    public Food(String fName, double fWeight, double fEnjoy) {
        this.foodName = fName;
        this.foodWeight = fWeight;
        this.foodEnjoyment = fEnjoy;


    }
    /**
     * Getters for weight and Enjoyment
     */
    public double getWeight() {
        return foodWeight;
    }

    public double getEnjoyment() {
        return foodEnjoyment;
    }

    /**
     * Method computes the ratio of Enjoyment per Weight
     */
    public static double EnjoymentPerWeight(Food food) {
        return food.getEnjoyment() / food.getWeight();
    }
    /**
     * comparator code adjusted from https://www.geeksforgeeks.org/how-to-sort-an-arraylist-of-objects-by-property-in-java/
     */
    public static java.util.Comparator<Food> foodComparator = new java.util.Comparator<Food>() {

        /**
         * compares enjoyment rates of 2 foods at a time
         */
        public int compare(Food s1, Food s2) {

            double rollno1 = Food.EnjoymentPerWeight(s1);
            double rollno2 = Food.EnjoymentPerWeight(s2);
            return (int) (rollno2 - rollno1);
        }


    };
}

