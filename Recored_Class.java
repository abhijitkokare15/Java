record Student(String name, int age) { 
    public Student {
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative");
    }

       public void display() {
        System.out.println(name + " " + age);
    }
}

public class Recored_Class {
    public static void main(String[] args) {

        Student s = new Student("Abhijit", 21);

        System.out.println(s.name());
        System.out.println(s.age());
        System.out.println(s);
    }
}

/* 
A record is a special type of class used primarily to hold immutable data.
A record is implicitly final, so it cannot be extended.
Every record implicitly extends java.lang.Record.
Record components (fields) are implicitly private and final.
Record components cannot be modified after object creation (immutable).
The compiler automatically generates:
A canonical constructor
Accessor methods
toString()
equals()
hashCode()
Accessor methods have the same name as the record components (not getXxx()).
A record can implement one or more interfaces.
A record can define its own methods.
A record can define constructors (canonical, compact, or overloaded constructors with delegation).
A record can have static fields and static methods.
A record cannot declare additional instance (non-static) fields.
A record can contain nested types, such as nested classes, interfaces, enums, and records.
A record can implement generic interfaces and can itself be generic.

*/