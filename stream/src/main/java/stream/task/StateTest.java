package stream.task;

import stream.Dish;
import stream.DishData;

import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        State stateMO = new State();

        stateMO.addCity("St Louis");
        stateMO.addCity("Springfield");
        stateMO.addCity("Saint Peters");
        stateMO.addCity("O'Fallon");

        State stateCA = new State();

        stateCA.addCity("Sacramento");
        stateCA.addCity("San Fransisco");
        stateCA.addCity("Los Angelos");
        stateCA.addCity("San Jose");

        List<State> states = Arrays.asList(stateMO,stateCA);

        //1st way of doing flat map
        states.stream()
                        .flatMap(state ->state.getCities().stream())
                                .forEach(System.out::println);

        //2nd way of doing for flatMap
        states.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);


        System.out.println("***********************");
        //How would you count the number of dishes in a stream using the map
        //and reduce methods
       int dishCount = DishData.getAllDish().stream()
                .map(dish -> 1)
                .reduce(0, (a,b) -> a+b);
        System.out.println(dishCount);

        System.out.println("***********************");
       long dishCount2 = DishData.getAllDish().stream().count();
        System.out.println(dishCount2);


    }


}
