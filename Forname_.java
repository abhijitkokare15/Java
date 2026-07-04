public class Forname_
{
    public static void main() throws Exception
    {
        // Pqr q= new Pqr();
        Class.forName("Pqr"); //.newInstance();
    }
}

class Pqr
{
    static{
        System.out.println("The static block of the class");
    }

    //instance block
    {
        System.out.println("This is the instance block");
    }
}