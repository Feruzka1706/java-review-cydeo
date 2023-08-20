package stream;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class StreamTask {
    public static void main(String[] args) {

        //Given List of words, print the numbers of characters for each word in the list
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .forEach(eachWord -> System.out.println(eachWord.length()));


        //Print all dish's name that has less than 400 calories

        DishData.getAllDish().stream()
                .filter(eachDish -> eachDish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);


        //Print length of each dish's name
        System.out.println("Printing length of each dish's name");
        DishData.getAllDish().stream()
                .map(Dish::getName)
                .forEach(eachDish->System.out.println(eachDish.length()));


        System.out.println("******* Stream recording 2 - Task 1");

         //Print 3 High Caloric Dish Name (>300)
        DishData.getAllDish().stream()
                .filter(dish -> dish.getCalories()>300)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        System.out.println("******* Stream recording 2 - Task 2");
        //Print all dish name that are below < 400 calories in sorted order (asc)
        DishData.getAllDish().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .sorted()
                .forEach(System.out::println);
    }

}
