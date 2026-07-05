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