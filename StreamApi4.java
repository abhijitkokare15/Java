import java.util.*;
import java.util.function.Predicate;
public class Api4 {
public static  void main(String[] args)
{
    List<Integer> l = Arrays.asList(12,,20,21,98,46,56,68,77);

    System.out.println( l.stream().filter(i -> i % 5 == 0).map(i->i*2).   findFirst().orElse(0));
//findFirst () -> return optional value --if present
//                                   empty -- if not present 
//.orElse(val) -> change empty to specified val & not return


    // Working of 
    /*
      filter wants obj of predicate functional interface 
      // filter check retun value from object if it is true then it is 
      //include other wise remove the value

     */
    //   Predicate<Integer> p = new Predicate<Integer>() {

    //         @Override
    //         public boolean test(Integer i) {
    //             return i % 5 == 0;
    //         }
    //     };

    //     System.out.println(
    //             l.stream()
    //              .filter(p)
    //              .reduce(0, (c, e) -> c + e)
    //     );

}

}
