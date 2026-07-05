interface Parser {
    String parse(String str);
}

class StringParser {

    public static String StringConvert(String s) {
        if (s.length() <= 3)
            return s.toUpperCase();
        else
            return s.toLowerCase();
    }
}

class MyPrinter {

    public void print(String str, Parser p) {
        System.out.println(p.parse(str));
    }

    public String  toString(String str)
    {
         return str +" The string is conveted successsfully";
    }
}

public class MethodRefernce {

    public static void main(String[] args) {

        String str = "Abhijit Kokare";
        MyPrinter mp = new MyPrinter();
      
       
        // mp.print(str,s->StringParser.StringConvert(s));
        mp.print(str,StringParser::StringConvert);
          mp.print(str,mp::toString);
          // this is used when method accept same paramaeter

    }
}

// You can use a method reference only if the method's signature is compatible with the single abstract method of the functional interface.

// A method signature includes:

// ✅ Number of parameters
// ✅ Parameter types
// ✅ Return type (or a compatible return type)