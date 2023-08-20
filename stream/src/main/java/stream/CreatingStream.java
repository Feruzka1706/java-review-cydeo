package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //Creating Stream from Array
        //Any Data Structure can be used to convert/create stream object
        String[] courses = {"Java","JS","TS"};
       Stream<String> courseStream= Arrays.stream(courses);

       //Creating Stream from Collection
        List<String > courseList =Arrays.asList( "Java","Data Structure","Spring");
       Stream<String> courseStream2= courseList.stream();

       List<Course> myCourses = Arrays.asList(
              new Course( "Java",100),
               new Course( "DS",101),
               new Course( "Spring",102),
               new Course( "Microservices",103)
       );

      Stream<Course> myCourseStream= myCourses.stream();


       //Creating Stream from Values
        //Passing one value to make a Stream
        //Usually in development creating a stream from values is not being used commonly
        Stream<Integer> stream = Stream.of(20);

    }
}
