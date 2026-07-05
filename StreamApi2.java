import java.util.*;
public class StreamAPI2 {
    public static void main()
    {
          List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
// System.out.println(l.stream( ).map(i->i*2).reduce(0,(c,e)->Integer.sum(c,e)));
    System.out.println(l.stream( ).map(i->i*2).reduce(0,Integer::sum));
    }
}
// intger class has a sum method