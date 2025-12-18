package group_05.java_09;

public class Main {
    public static void main(String[] args){
        ClassA objA = new ClassA(10);
        objA.metoda1("String");
        objA.metoda1(10);
        objA.metoda1(15);

        objA.shtypDetajet();

        System.out.println("Numri: " + objA.numri);
        objA = new ClassB(8);
        objA.shtypDetajet();
        System.out.println("Numri: " + objA.numri);
//        objA.metoda2(); X

        objA = new ClassC(7);

        ClassB objB = new ClassB(6);
//        objB = new ClassA(); X
        objB.metoda2();
    }
}

class ClassA{
    int numri = 5;
    public ClassA(int numri){
        this.numri = numri;
    }
    public void shtypDetajet(){
        System.out.println("Class A");
    }
    public void metoda1(String emri){
        System.out.println("Metoda 1 (Form 1)");
    }
    public void metoda1(int numri){
        System.out.println("Metoda 1 (Form 2)");
    }
}
class ClassB extends ClassA{
    int numri = 7;
    public ClassB(int numri){
        super(numri);
    }
    public void shtypDetajet(){
        System.out.println("Class B");
    }
    public void metoda2(){
        System.out.println("Metoda 2 - ClassB");
    }
}
class ClassC extends ClassB{
    public ClassC(int numri){
        super(numri);
    }
    public void shtypDetajet(){
        System.out.println("Class C");
    }
}
class ClassD extends ClassA{
    public ClassD(int numri){
        super(numri);
    }
    public void shtypDetajet(){
        System.out.println("Class D");
    }
}





