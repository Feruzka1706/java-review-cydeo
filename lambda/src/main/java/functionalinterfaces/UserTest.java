package functionalinterfaces;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User("Feruza","Jonzokova",30));
        users.add(new User("John","Eston",20));
        users.add(new User("Marina","Ellabos",32));
        users.add(User.builder().firstName("Mark").lastName("Medina").age(45).build());
        users.add(User.builder().firstName("Ramya").lastName("Ekumarasmya").age(40).build());

        //Print all elements in the list

         Consumer<List<User>>display = list ->  users.forEach(System.out::println);
         display.accept(users);

        predicateCheck(users, user -> true);


        System.out.println("***********************************");

        //Print all users that lastname starts with E
       predicateCheck(users, user -> user.getLastName().startsWith("E"));

        System.out.println("***********************************");
       predicateCheck(users, user -> user.getAge()>30);

    }

    public static void predicateCheck(List<User> users, Predicate<User> userPredicate){

        for (User user : users) {

            if(userPredicate.test(user)){
                System.out.println(user);
            }
        }

    }


}


