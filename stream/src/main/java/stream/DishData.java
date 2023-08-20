package stream;

import java.util.Arrays;
import java.util.List;

public class DishData {

    public static List<Dish> getAllDish(){
        return Arrays.asList(
                new Dish("Pork",false,800,Type.MEAT),
                new Dish("Beef",false,700,Type.MEAT),
                new Dish("Chicken",false,400,Type.MEAT),
                new Dish("Fries",true,530,Type.OTHER),
                new Dish("Rice",true,350,Type.OTHER),
                new Dish("Fruit",true,120,Type.OTHER),
                new Dish("Pizza",true,550,Type.OTHER),
                new Dish("Prawns",false,300,Type.FISH),
                new Dish("Salmon",false,450,Type.FISH)
        );
    }
}
