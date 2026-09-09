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

        // Copy Constructor:
        Car c1= new Car("XUV 700",2010);
        Car c2 = new Car(c1);

        System.out.println(c2.name);
        System.out.println(c2.model);


        // Ingeritance:
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat(); // not in Dog class but defined in Animal class
        d.bark(); // defined in own Dog class

        // multi level inheritance:
        Cat c = new Cat();
        c.eat();

        // polymorphism: Method overloading
        Calculator cl = new Calculator();
        cl.sum(2,3);
        cl.sum(1.4f,32.3f);
        cl.sum(1,1,1);

        // Method Overriding
        Gajni g = new Gajni();
        g.start();


        // Abstraction
        // AnimalX ax = new AnimalX(); // cannot call due to abstract
        Horse h =new Horse();
        h.wallk();


        Goat g1 = new Goat();
        g1.makeSound();  
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

// Encapsulation: copy constructors:
class Car{
    String name;
    int model;

    // Normal Constructor:
    Car(String name,int model){
        this.name = name;
        this.model =model;
    }

    //  Copy Constructor:
    Car(Car c){
        this.name = c.name;
        this.model = c.model;
    }
}

// Encapsulation: Shallow copy aur deep copy khud se padho mujhe nahi samjha

// Inheritance:
// When a base class passes its properites and methods to derived class

// Base / parent class:
class Animal{
    String name;
    int age;
    String color;

    void eat(){
        System.out.println("animal eats");
    }
}

// Derived class / subclass:
class Dog extends Animal{
    int legs;

    void bark(){
        System.out.println("bhow!");
    }
}

// 1.Single-level ineritance: when 1 based class passes its properties to one derived class
// as above

// 2.multi level inheritance:
// when 1 base class passes to one derived class and then that derived class passes to another derived class

// Base class:
// class Animal{
//     String name;
//     int age;
//     String color;

//     void eat(){
//         System.out.println("animal eats");
//     }
// }

// Base class -> Derived Class
class Mamal extends Animal{
    int legs;

    void wallk(){
        System.out.println("mamal wallks");
    }
}

// Base class-> Derived Class-> Derived Class
class Cat extends Mamal{
    String breed;

    void speak(){
        System.out.println("meow");
    }
}

// 3.one base class and multiple derived classes:
// parent class: Hall
class Hall{
    int number;
    void fucntion(){
        System.out.println("welcome");
    }
}

// derived class 1: Hall-> Table
class Table extends Hall{
    int pos;
    String color;
}

// derived class 2: Hall->Decoration
class Decoration extends Hall{
    float rating;
}

// Polymorphism
// many  + forms:

// Compile time polymorphism: Method Overloading
// same fnx name + diffrent parametrs || count of parameters
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

// Run time polymorphism: Marhod Overriding
// when a class is derived from base class and both have same methods defined then child class method runs:
class Theater{
    void start(){
        System.out.println("starts in 3..2..1..");
    }
}

class Gajni extends Theater{
    // g.start()-> this method will run during run time polymorphism not t.start()
    void start(){
        System.out.println("started Gajni");
    }
}


// Abstraction: hides uneccesary data + shows importatnt data to useer:
// 1.using abstract classes:

// defined using abstract keyword:
abstract class AnimalX{
    // normal method:
    void eat(){
        System.out.println("animal eats");
    }

    // abstract method: do not initialize the method to implement this extend the abstarct class
    abstract void wallk();

    // can have constructors:
    AnimalX(){
        System.out.println("AnimalX constructor called");
    }
}

class Horse extends AnimalX{
    // now we must need to implement Wallk() method here:
    void wallk(){
        System.out.println("4legs");
    }

    Horse(){
        System.out.println("Horse constructor called");
    }
}

// Interfaces:
// all methods in interfaces are pulic, abstarct and without implementation by default
// this is used to acheive full abstraction
// variables in interface are final, static and public by default

interface AnimalY{
    // by default abstract, public and withould implementation:
    void makeSound();
}

// use implements to use interface:
class Cow implements AnimalY{
    // must to imlpement makeSound() to achieve interface
    public void makeSound(){
        System.out.println("MOO");
    }
}

class Goat implements AnimalY{
    public void makeSound(){
        System.out.println("MEHEE");
    }
}