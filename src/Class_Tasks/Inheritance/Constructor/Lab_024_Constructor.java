package Class_Tasks.Inheritance.Constructor;

// Parent class
class Parent{

    //constructor of parent class
    Parent(){
        System.out.println("Parent class constructor called");
    }
}

// Chlid class inheriting from Parent
class Child extends Parent{
    // constructor of child class
    Child(){
        System.out.println("Child class constructor called");
    }
}
public class Lab_024_Constructor {
    public static void main (String[] args){

        // Creating object of the Child class

        Child child= new Child();
    }
}
