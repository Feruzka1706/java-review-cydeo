package comparatorinterface;

import java.util.*;

import static java.util.Comparator.comparing;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,0,15,5,20);

        System.out.println(list);

        //Ascending sorting
        Collections.sort(list);
        System.out.println(list);

        System.out.println("******************");

        //Descending order of sorting
        Collections.sort(list,new MyComparator());

        System.out.println(list);

        System.out.println("******************");
        Collections.sort(list,((o1, o2) -> (o1>o2)? -1 :(o1<o2) ? 1: 0));

        System.out.println("Ascending");

        //Ascending sort
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //Descending sort
        System.out.println("Descending");
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);


        System.out.println("******************");

        List<Apple> appleInventory= Arrays.asList(
        new Apple(80,Color.GREEN),
        new Apple(155,Color.RED),
        new Apple(120,Color.GREEN)
        );

        Comparator<Apple> sortApple = comparing((Apple apple)->apple.getWeight());
        appleInventory.sort(sortApple);
        System.out.println(appleInventory);

        System.out.println("******************");

        appleInventory.sort(comparing(Apple::getWeight));
        System.out.println(appleInventory);


        System.out.println("******************");
        //Reversed order
        appleInventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(appleInventory);

        System.out.println("******************");
        //Chaining
        appleInventory
                .sort(comparing(Apple::getWeight)
                        .reversed()
                        .thenComparing(Apple::getColor));

        System.out.println(appleInventory);





    }
}
