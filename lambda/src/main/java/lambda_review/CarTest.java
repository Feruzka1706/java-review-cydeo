package lambda_review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {

        //Car car1 = Car.builder().make("Honda").year(2018).topSpeed(240).build();
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Toyota",140,1998));
        carsList.add(new Car("Audi",200,2008));
        carsList.add(new Car("BMW",210,2020));
        carsList.add(new Car("Nissan",150,2018));


        System.out.println("Fast Cars");
        System.out.println(filterCars(carsList, car -> car.getTopSpeed() > 150));

        System.out.println("*******************************");
        System.out.println("New Cars");
        System.out.println(filterCars(carsList, car -> car.getYear() > 2018));
    }

    private static List<Car> filterCars(List<Car> list, CarPredicate predicate){
        List<Car> result = new ArrayList<>();
        for (Car car : list) {
            if (predicate.test(car)){
               result.add(car) ;
            }
        }

        return result;
    }
}
