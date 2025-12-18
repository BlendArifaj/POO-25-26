package group_02.java_10;

// Klasave abstrakte

// Nderfaqeve (Interface)

public class Main {
    public static void main(String[] args){
//        Tipi obj = new Forma();
//        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle1 = new Car("Red");
        vehicle1.accelerate();
        vehicle1.printDetails();

        vehicle1 = new Truck("White");
        vehicle1.accelerate();
        vehicle1.printDetails();

        Driveable driveable1 = new Bicycle();
        driveable1.accelerate();
        driveable1.brake();

        Driveable driveable2 = new Car("Blue");
        driveable2.accelerate();
        driveable2.brake();

        Driveable driveable3 = new Truck("Black");

        if(driveable2 instanceof Cloneable){

        }

    }
}

interface Driveable{
    void accelerate();
    void brake();
}

class Bicycle implements Driveable, Cloneable{
    public void accelerate(){

    }

    public void brake(){

    }

    public Bicycle clone(){
        return new Bicycle();
    }
}

abstract class Vehicle implements Driveable, Cloneable{
    private String color;
    public Vehicle(String color){
        this.color = color;
    }

    public void printDetails(){
        System.out.println("Vehicle details.");
        System.out.println("Color: " + this.color);
    }

    public void brake(){
        System.out.println("Vehicle brake!");
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
        System.out.println("Warming up ...");
        System.out.println("Truck is speeding ...");
    }
}