import java.util.*;

public class Loacalization_marathi {
    public static void main(String[] args) {
                      Locale l = new Locale("mr","IN");

                        ResourceBundle rs =  ResourceBundle.getBundle("Bundle",l);

                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter word to know marathi meaaning :");

                        String s =sc.next();

                        System.out.println("The marathi meaning of word is :"+rs.getString(s));

                        // System.out.println("होय");

                            
                        
    }
}
