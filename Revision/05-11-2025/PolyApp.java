/* Q.7 Create a class Person with method setDetails(String name, int age).
   Create two subclasses:
   Student → method getDetails() → prints student's name & age
   Teacher → method getDetails() → prints teacher's name & age
   Demonstrate runtime polymorphism using Person reference.
*/

class Person {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getDetails() {   // base method for overriding
        System.out.println("Person Details");
    }
}

class Student extends Person {
    @Override
    void getDetails() {
        System.out.println("Student Name = " + name);
        System.out.println("Student Age = " + age);
    }
}

class Teacher extends Person {
    @Override
    void getDetails() {
        System.out.println("Teacher Name = " + name);
        System.out.println("Teacher Age = " + age);
    }
}

class PolyApp {
    public static void main(String[] args) {
        // Person reference holding Student object
        Person p;

        p = new Student();
        p.setDetails("Shivtej", 22);
        p.getDetails();  // calls Student's getDetails()  → runtime polymorphism

        p = new Teacher();
        p.setDetails("Dipak", 40);
        p.getDetails();  // calls Teacher's getDetails()  → runtime polymorphism
    }
}
