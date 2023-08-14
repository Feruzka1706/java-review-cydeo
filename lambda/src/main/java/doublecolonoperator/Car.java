package doublecolonoperator;

import lombok.Data;

@Data
public class Car {

    private String make;
    private int year;


    public Car (){

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
}
