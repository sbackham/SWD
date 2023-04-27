//Food class exists to be able to create objects of type "Food" with names such as turkey, pie, potatoes, with attributes weight and enjoyment

public class Food  {
    String foodName;
    int foodWeight;
    int foodEnjoyment;

//Food constructor
    public Food(String fName, int fWeight, int fEnjoy){
        this.foodName = fName;
        this.foodWeight = fWeight;
        this.foodEnjoyment = fEnjoy;
    }

    public String getName(){
        return foodName;
    }
    public int getWeight(){
        return foodWeight;
    }
    public int getEnjoyment(){
        return foodEnjoyment;
    }

    public static int EnjoymentPerWeight(Food food){
        return food.getEnjoyment()/ food.getWeight();
    }

}
