package group_01.java_09;


public class Main {
    public static void main(String[] args){
        ClassA objA = new ClassA(10);
        objA.method1(10);
        objA.shtypDetajet();

        objA = new ClassB(8);
        objA.shtypDetajet();
        System.out.println("Numri: " + objA.numri);
//        objA.method3();   X

        objA = new ClassC(5);

        objA = new ClassD(8);

        ClassB objB = new ClassB(10);

    }
}

class ClassA{
    int numri = 5;
    public ClassA(int numri){
        this.numri = numri;
    }
    public void method1(String emri){
        System.out.println("Emri: " + emri);
    }

    public void method1(int numri){
        System.out.println("Forma 2, Numri: " + numri);
    }

    public void shtypDetajet(){
        System.out.println("ClassA");
    }
}

class ClassB extends ClassA{
    public ClassB(int numri){
        super(numri);
    }
    public void shtypDetajet(){
        System.out.println("ClassB");
    }

    public void method3(){
        System.out.println("Method3");
    }
}

class ClassC extends ClassA{
    public ClassC(int numri){
        super(numri);
    }
    public void shtypDetajet(){
        System.out.println("ClassC");
    }
}

class ClassD extends ClassB{
    public ClassD(int numri){
        super(numri);
    }
    public void shtypDetajet(){
        System.out.println("ClassD");
    }
}
