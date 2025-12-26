package group_04.java_10;

// Klasave abstrakte
// Nderfaqet (Interface)

public class Main {
    public static void main(String[] args){
//        Vehicle vehicle1 = new Vehicle(); X
        Vehicle vehicle1 = new Car("Red");
        vehicle1.accelerate();
        vehicle1.printDetails();

        Vehicle vehicle2 = new Truck("White");
        vehicle2.accelerate();
        vehicle2.printDetails();


        Drivable obj1 = new Bicycle();
        obj1.accelerate();
        obj1.brake();

        Drivable obj2 = new Truck("Black");
        obj2.accelerate();
        obj2.brake();
    }
}


interface Drivable{
    int NUMRI = 5;
    void accelerate();
    void brake();

//    java 8+
    default void method1(){
        // logic ...
    }
    private void method2(){
        // logic ...
    }
    static void method3(){

    }
}

class Bicycle implements Drivable, Cloneable{
    public void accelerate(){

    }
    public void brake(){

    }

    public Bicycle clone(){
        return new Bicycle();
    }
}

abstract class Vehicle implements Drivable{
    private String color;
    public Vehicle(String color){
        this.color = color;
    }

    public void brake(){
        System.out.println("Vehicle is slowing down.");
    }

    public void printDetails(){
        System.out.println("Vehicle Details: ");
        System.out.println("Color: " + this.getColor());
    }
    public String getColor(){
        return this.color;
    }
}

class Car extends Vehicle{
    public Car(String color){
        super(color);
    }
    public void accelerate(){
        System.out.println("Car is speeding ...");
    }
}

class Truck extends Vehicle{
    public Truck(String color){
        super(color);
    }
    public void accelerate(){
        System.out.println("Engine is warming up.");
        System.out.println("Truck is speeding ...");
    }
}
