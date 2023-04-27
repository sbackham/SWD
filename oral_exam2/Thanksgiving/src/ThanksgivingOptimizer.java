import java.util.ArrayList;


public class ThanksgivingOptimizer {
    public static int EnjoymentPerWeight(Food food){
        return food.getEnjoyment()/ food.getWeight();
    }

    public static int Comparator(int rate1, int rate2){
        int greater = 0;

        if (rate1 > rate2){
            greater = rate1;
        }
        if (rate2 > rate1){
            greater = rate2;
        }
        return greater;
    }

    public static ArrayList<Food> sorter(ArrayList<Food> foodList){
    return null;
    }
}
