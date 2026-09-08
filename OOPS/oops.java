package OOPS;

class OOPS {
    // 1.What is OOPS?
    // Object-oriented programing-> way of writing code in form of objects and
    // classes.

    // 2.Classes and Objects:
    // objects are entities in real world and class is group of entities
    // student -> name,gender -> object
    // classroom -> multuiple student -> same age, same subjects

    // 3.Calling class object in main() method:
    public static void main(String[] args) {
        Student s = new Student(); // obeject of the Student class
        // s is reference variable that refers to Student object
        s.name = "sarthak";
        s.roll = 19;
        s.display();

        Student2 s2 = new Student2();
        // System.out.println(s2.marks); private - cannot access directly
        System.out.println(s2.name); // default
        System.out.println(s2.age); // protected (same package)
        System.out.println(s2.clg); // public

        Student3 s3 = new Student3();
        s3.setName("SARTHAK");
        String res = s3.getName();
        System.out.println(res);

        Student4 s4 = new Student4("Aarti", 12);
        Student4 s5 = new Student4();
    }
}

// Class + Objects Implementation:
class Student { // student is class
    int roll; // properties
    String name; // properties

    void display() {
        System.out.println(name);
        System.out.println(roll);
    }
}

// Encapsulation: Acess Modifiers Implementation:
class Student2 {
    private int marks = 90;
    String name = "adarsh";
    protected int age = 21;
    public String clg = "BVCOE";

    void display() {
        System.out.println(name);
        System.out.println(marks);
        System.out.println(age);
        System.out.println(clg);
    }
    // private -> accesible only inside same class
    // default-> accesible inside same class + within package
    // protected->acessible inside same class + within package + outside package by
    // subclass only
    // public-> anywhere like outside package also
}

// Encapsulation: private AM:
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Encapsulation: getters and setters and this:
class Student3 {
    private String name;
    private int age;

    // to access them outside calss use getters and setters:

    // setter:
    // this referes to current object:
    void setName(String name) {
        this.name = name;
        // object variable = parameter of class property
    }

    // getter:
    String getName() {
        return name;
    }

}

// Encapsulation: Constructors-> method to initiaize object when object is
// created
class Student4 {
    String name;
    int age;

    // will get call automatically when object is created
    // parametarized constructor:
    Student4(String name, int age) {
        System.out.println(name + " " + age);
    }

    // non-parametraized constructor:
    Student4() {
        System.out.println("constructor called");
    }

    // rules:
    // should have same name as class
    // do not have any return type not even void
    // can only called once
    // memory allocation happens when new keyword is defined

}
