package Class_Tasks.Inheritance.MethodOverriding;

//Parent class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

// Main class to run the program
public class Lab_025_MethodOverriding {
    public static void main(String[] args) {
        // Creating an object of the parent class
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  // Calls Animal's version

        // Creating an object of the child class
        Dog myDog = new Dog();
        myDog.makeSound();  // Calls Dog's overridden version

        // Polymorphism: Parent reference, Child object
        Animal polymorphicDog = new Dog();
        polymorphicDog.makeSound();  // Still calls Dog's version due to overriding
    }
}
