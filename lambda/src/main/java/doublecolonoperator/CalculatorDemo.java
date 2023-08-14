package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class CalculatorDemo {
    public static void main(String[] args) {

        //Reference to a static method
        Calculate s1 = Calculator::findSum;
        s1.calculate(10,20);

        Calculate s2 = (x,y) ->Calculator.findSum(x,y);
       // s2.calculate(20,30);


        Calculate s3 = (x,y) -> new Calculator().findMultiply(x,y);
       // s3.calculate(20,30);

        System.out.println("******************");

        //shorthand method reference way
        Calculate s4 = new Calculator()::findMultiply;
        s4.calculate(10,20);

        BiFunction<String,Integer,String> fn = String::substring;
        System.out.println(fn.apply("Feruza", 1));

        Consumer<String> display = System.out::println;
        display.accept("Feruza");

    }


}
