package laba1;


import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {
    @Override
    public int compare(Food food1, Food food2) {
        return food2.get_name().compareTo(food1.get_name());
    }
}
