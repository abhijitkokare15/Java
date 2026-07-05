import java.util.*;

public class StreamApi5 {

    static int k = 0;
    static int j = 0;

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(12, 20, 21, 98, 46, 56, 68, 77);

        System.out.println(
                l.stream()
                 .filter(Api5::isDiv5)
                 .map(Api5::MDouble)
                 .findFirst()
                 .orElse(0)
        );
    }

    public static boolean isDiv5(int i) {
        System.out.println("Filter Iteration " + (++k));
        return i % 5 == 0;
    }

    public static int MDouble(int i) {
        System.out.println("Map Iteration " + (++j));
        return i * 2;
    }
}