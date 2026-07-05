import java.util.Arrays;
import java.util.List;

public class MethodRefernce {

    public static void printDouble(int ui) {
        System.out.println(ui * 2);
    }

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);

        l.forEach(MethodRefernce::printDouble);
    }
}