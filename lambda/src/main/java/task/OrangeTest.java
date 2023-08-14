package task;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.RED).build());
        /**@Builder gives constructor for the class and
         * advantage of using builder constructor is if I have 10 fields in the object class
         * and I will provide 8 or 9 fields for object constructor,
         * it will NOT throw compile error
         * Using regular AllArgConstructor will throw compile error
         * if we don't provide all fields while creating an object
         */
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(300).color(Color.RED).build());

        //OrangeFormatter simpleFormatter = (orange) -> "An orange of "+ orange.getWeight()+" g";
        prettyPrint(inventory,(orange) -> "An orange of "+ orange.getWeight()+" g");

//        OrangeFormatter fancyFormatter = (orange) -> {
//            String orangeCharacteristic = orange.getWeight()>150 ? "Heavy" : "Light";
//            return "A "+ orangeCharacteristic + " " +orange.getColor() +" orange";
//        };

        System.out.println("**************************");

        prettyPrint(inventory,(orange) -> {
            String orangeCharacteristic = orange.getWeight()>150 ? "Heavy" : "Light";
            return "A "+ orangeCharacteristic + " " +orange.getColor() +" orange";
        });

    }

    private static void prettyPrint(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange: inventory) {
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }


}
