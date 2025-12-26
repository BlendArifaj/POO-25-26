package group_05.java_10;

// Klasave Abstrakte
// Nderfaqeve (Interface)
public class Main {
    public static void main(String[] args){
        UserDetails user;

        user = new Student(1, "Student");
        user.printDetails();

        user = new Professor(2, "Profesor");
        user.printDetails();

        Flyable airplane = new Airplane();
        fly(airplane);

        Flyable bird = new Bird();
        fly(bird);
    }

    public static void fly(Flyable object){
        object.fly();
    }
}

abstract class UserDetails{
    private int id;
    private String emri;

    public UserDetails(int id, String emri){
        this.id = id;
        this.emri = emri;
    }

    abstract void printDetails();

    public int getId(){
        return this.id;
    }

    public void method1(){
//        logic ...
    }
}

class Student extends UserDetails{
    public Student(int id, String emri){
        super(id, emri);
    }
    void printDetails(){
        System.out.println("Student details!");
        System.out.println("Id: " + this.getId());
    }
}

class Professor extends UserDetails{
    public Professor(int id, String emri){
        super(id, emri);
    }
    void printDetails(){
        System.out.println("Professor details!");
        System.out.println("Id: " + this.getId());
    }
}

interface Flyable{
    int numri = 5;

    void fly();

    default void printDetails(){
        System.out.println("Flyable interface!");
    }
    private void method1(){

    }
    static void method2(){

    }
}

class Airplane implements Flyable{
    public void fly(){
        System.out.println("Airplane flying ...");
    }
}

class Bird implements Flyable{
    public void fly(){
        System.out.println("Bird is flying ...");
    }
}

