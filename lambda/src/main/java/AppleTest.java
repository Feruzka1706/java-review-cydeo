import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        apples.add(Apple.builder().weight(200).color(Color.RED).build());
        apples.add(Apple.builder().weight(300).color(Color.GREEN).build());
        apples.add(Apple.builder().weight(100).color(Color.RED).build());
        apples.add(Apple.builder().weight(250).color(Color.GREEN).build());
        apples.add(Apple.builder().weight(150).color(Color.GREEN).build());

        //Printing GREEN color apples
        System.out.println(appleFilter(apples, apple -> apple.getColor().equals(Color.GREEN)));

        System.out.println("******************************");

        //Printing heavy - weight > 150  apples
        System.out.println(appleFilter(apples, apple -> apple.getWeight() > 150));



    }

    public static List<Apple>  appleFilter (List<Apple> list, Predicate<Apple> predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : list) {
            if (predicate.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }
}
