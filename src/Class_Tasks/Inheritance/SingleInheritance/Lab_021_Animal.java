package Class_Tasks.Inheritance.SingleInheritance;
// Super class(Parent class)
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Sub class (Child class)
    class Dog extends Animal {

        // Overriding the sound method
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
//Main class
public class Lab_021_Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}