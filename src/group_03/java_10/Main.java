package group_03.java_10;

// Klasa Abstrakte
// Nderfaqet (Interface)

public class Main {
    public static void main(String[] args){
//        Person person = new Person();
        Student student1 = new Student(10);
        Profesor profesor1 = new Profesor(12);

        Person student = new Student(10);
        student.shtypDetajet();

        Airplane<String> airplane = new Airplane();

        Flyable airplane1 = new Airplane();
        airplane1.fly();

        Cloneable airplane2 = new Airplane();
        airplane2.cloneObject();


    }
}

interface Interface1 extends Flyable{

}
abstract class Person{
    private int id;
    public Person(int id){
        this.id = id;
    }
    abstract void shtypDetajet();

    public void metodeKonkrete(){
        System.out.println("Metode konkrekte!");
    }
    public int getId(){
        return this.id;
    }
}

class Student extends Person{
    public Student(int id){
        super(id);
    }
    public void shtypDetajet(){
        System.out.println("Detajet e studentit: ");
        System.out.println("Id: " + this.getId());
    }
}

class Profesor extends Person{
    public Profesor(int id){
        super(id);
    }
    public void shtypDetajet(){
        System.out.println("Detajet e profesorit: ");
        System.out.println("Id: " + this.getId());
    }

}

interface Flyable{
    int numri = 10;
    void fly();
    default void defaultMethod(){
        System.out.println("Default method!");
    }
    static void staticMethod(){
        System.out.println("Static method!");
    }
    private void privateMethod(){
        System.out.println("Private method!");
    }
}

interface Cloneable<T>{
    T cloneObject();
}

class Bird implements Flyable{
    public void fly(){
        System.out.println("Bird is flying ...");
    }

}

class Airplane<T> implements Flyable, Cloneable<Airplane>{
    public void fly(){
        System.out.println("Airplane is flying ...");
    }

    public Airplane cloneObject(){
        return new Airplane(); // ...
    }
}