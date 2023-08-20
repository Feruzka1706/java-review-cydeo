package stream;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all emails of employees - One employee has one email - One to One
        EmployeeData.readAll()
                .map(Employee::getEmployeeEmail)
                .forEach(System.out::println);


        System.out.println("******************");
        //Print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmployeePhoneNumbers)
                .forEach(System.out::println);

        System.out.println("******************");
        //1st way of doing Stream<Stream<T>> - flatMap
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmployeePhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("******************");
        //2nd way of doing Stream<Stream<T>> - flatMap
        EmployeeData.readAll()
                .map(Employee::getEmployeePhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }



}
