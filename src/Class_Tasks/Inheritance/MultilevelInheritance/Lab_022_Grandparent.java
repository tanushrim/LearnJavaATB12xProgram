package Class_Tasks.Inheritance.MultilevelInheritance;

// Grand parent class
class Grandparent{
    void grandparentMethod(){
        System.out.println("Grandparent method");
    }
}

// Parent class
class Parent extends Grandparent{
    void parentMethod(){
        System.out.println("Parent method");
    }
}

//Child class
class Child  extends Parent{
    void childMethod() {
        System.out.println("Child method");
    }
}

// Main class to test multilevel inheriance
public class Lab_022_Grandparent {
    public static void main(String[] args) {
        Child child= new Child();

        //Access method from Grandparent, Parent and child

        child.childMethod();         // from Child
        child.parentMethod();        // from Parent
        child.grandparentMethod();   // from grandparent
    }

}
