import java.util.*;
import java.util.function.Predicate;
public class StreamApi3 {
public static  void main(String[] args)
{
    List<Integer> l = Arrays.asList(12,20,35,46,55,68,75);

    // System.out.println( l.stream().filter(i -> i % 5 == 0).reduce(0, (c, e) -> c + e));



    // Working of 
    /*
      filter wants obj of predicate functional interface 
      // filter check retun value from object if it is true then it is 
      //include other wise remove the value

     */
      Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer i) {
                return i % 5 == 0;
            }
        };

        System.out.println(
                l.stream()
                 .filter(p)
                 .reduce(0, (c, e) -> c + e)
        );

}

}
