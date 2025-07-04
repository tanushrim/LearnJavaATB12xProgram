package Class_Tasks.Inheritance.SuperKeword;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        super.sound(); // Calling the parent class method
        System.out.println("Dog barks");
    }
}

// Main class to test the program
public class Lab_026_Super {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
    }
}

