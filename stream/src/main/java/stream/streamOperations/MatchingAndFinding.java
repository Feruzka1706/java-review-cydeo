package stream.streamOperations;

import stream.Dish;
import stream.DishData;

import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {

        System.out.println("**************************");
        //ALL MATCH
       boolean isHealthy= DishData.getAllDish().stream()
                .allMatch(dish -> dish.getCalories()<1000);

        System.out.println(isHealthy);


        System.out.println("**************************");
        //ANY MATCH
       if( DishData.getAllDish().stream()
                .anyMatch(Dish::isVegetarian)){
           System.out.println("The menu is vegetarian friendly");
       }


        System.out.println("**************************");
       //NONE MATCH
      boolean isHealthy2 =  DishData.getAllDish().stream()
                .noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);


        System.out.println("**************************");
        //FIND ANY
       Optional<Dish> dish = DishData.getAllDish().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());


        System.out.println("**************************");
        //FIND FIRST
        Optional<Dish> dish2 = DishData.getAllDish().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish2.get());


    }

}
