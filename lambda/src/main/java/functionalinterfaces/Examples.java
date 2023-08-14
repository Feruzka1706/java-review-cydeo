package functionalinterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        //******** PREDICATE ***************
        Predicate<Integer> lessThan = integer -> integer < 18;
        //implementation of test() method that belongs to Predicate interface


        System.out.println(lessThan.test(50));

        //******** CONSUMER ***************
        //Consumer<String> orangeFormatter = System.out::println;
        Consumer<Integer> display = integer -> System.out.println(integer);
        display.accept(20);

        //******** BICONSUMER ***************
        BiConsumer<Integer,Integer> display2 = (x,y) -> System.out.println(x+y);
        display2.accept(100,200);


        //******** FUNCTION ***************
        Function<String,Integer> function = String::length;
        System.out.println(function.apply("Feruza"));


        //******** Supplier ***************
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());


    }

}
