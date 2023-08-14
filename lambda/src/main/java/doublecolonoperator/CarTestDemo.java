package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTestDemo {

    public static void main(String[] args) {

        //Zero argument const
        Supplier<Car> s1 = Car::new;
        System.out.println(s1.get().getYear());


        //One argument const
        Function<Integer,Car> f1 = (year) -> new Car(year);
        //double column operator
        Function<Integer,Car> f2 = Car::new;

        Car car2 = f2.apply(2018);
        System.out.println(car2.getYear());
        System.out.println("******************");

        //Two argument const
        BiFunction<String,Integer,Car> biF1 = (make,year) -> new Car(make,year);
        Car car1 = biF1.apply("Honda", 2018);
        System.out.println(car1.getMake() + " " + car1.getYear());
        System.out.println("******************");
        //double column operator
        BiFunction<String,Integer,Car> biF2 = Car::new;
        Car car3 = biF2.apply("Mercedes", 2020);
        System.out.println(car3.getMake() + " " + car3.getYear());



    }
}
