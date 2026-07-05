import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamAPi1 {

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
// System.out.println(l.stream( ).map(i->i*2).reduce(0,(c,e)->c+e))
        // Function implementation
        Function<Integer, Integer> f = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer i) {
                return i * 2;
            }
        };

        // BinaryOperator implementation
        BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer i, Integer j) {
                return i + j;
            }
        };

        // Create Stream
        Stream<Integer> s = l.stream();

        // map() returns another Stream
        Stream<Integer> s1 = s.map(f);

        // reduce() returns a single Integer
        Integer result = s1.reduce(0, bo);

        System.out.println(result);
    }
}