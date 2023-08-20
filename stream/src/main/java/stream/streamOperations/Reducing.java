package stream.streamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        //reduce() method of stream
      int result =  numbers.stream()
                .reduce(0,(a,b) ->  a+b);
        System.out.println(result);

        System.out.println("*************");
      //No Initial value
       Optional<Integer> optionalInt = numbers.stream()
                .reduce((a,b) ->  a+b);
        System.out.println(optionalInt.get());


        System.out.println("*************");
        //Max and Min and Sum
       Optional<Integer> maxNum = numbers.stream().reduce(Integer::max);
       Optional<Integer> minNum = numbers.stream().reduce(Integer::min);
       Optional<Integer> sumNum = numbers.stream().reduce(Integer::sum);

        System.out.println("Max: "+ maxNum.get());
        System.out.println("Min: "+ minNum.get());
        System.out.println("Sum: "+ sumNum.get());

    }

}
