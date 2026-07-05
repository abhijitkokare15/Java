public class VarDemo {

    // var cannot be used as an instance variable
    // var x = 10;

    //var cannot be used as a static variable
    // static var y = 20;

    public static void main(String[] args) {

        // Primitive type
        var a = 10;
        System.out.println(a);

        // String
        var name = "Abhijit";
        System.out.println(name);

        // Object
        var s = new Student();
        s.show();

        // for loop
        for (var i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        // Enhanced for loop
        var  arr =new int [] {10, 20, 30};

        for (var n : arr) {
            System.out.println(n);
        }
         // variable name
        String var ="Open";
        System.out.println(var);


    }
}

class Student {

    void show() {
        System.out.println("Student Method");
    }
}


// The main reason var is not a keyword is backward compatibility.

// Before Java 10, programmers could legally write code like:

// class var {
// }

// int var = 10;

// void var() {
// }

// If Java had made var a keyword, all this existing code would stop compiling.

// To avoid breaking older programs, Java introduced var as a reserved type name, not as a keyword.



// Why only local variables?

// For local variables, the compiler can immediately infer the type from the initializer.

// var name = "Abhijit";

// ↓

// String name = "Abhijit";

// For fields, method parameters, return types, and class declarations, Java requires the type to be written explicitly to keep APIs clear and readable.