package Class_Tasks.Inheritance.HierarchicalInheritance;

// Vehicle class
 class Vehicle{
  void display(){
   System.out.println("This is a vehicle");
  }
 }

// Derived class Car inherits from Vehicle

class Car extends Vehicle{
  void carFeatures(){
   System.out.println("Car is red");
  }
}

//Derived class Bike inherits from Vehicle

class Bike extends Vehicle{
  void bikeFeatures(){
   System.out.println("Bike has 2 wheels");
  }
}
// Main class to test hierarchical inheritance
public class Lab_023_Vehicle {
 public static void main(String[] args) {
  Car car= new Car();
  Bike bike= new Bike();

  // calling methods from Vehicle and respective subclassed
  car.display();
  car.carFeatures();
  bike.display();
  bike.bikeFeatures();
 }
}
