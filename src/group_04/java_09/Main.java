package group_04.java_09;

public class Main {
    public static void main(String[] args){
        ClassA objA = new ClassA(10);
        objA.shtypDetajet();
        System.out.println("Numri: " + objA.numri);

        objA.method2(10);

        objA = new ClassB(7);
        objA.shtypDetajet();
        System.out.println("Numri: " + objA.numri);

        objA = new ClassC(9);
//        objA.method1();

        objA = new ClassD(15);

        ClassC objC = new ClassC(15);
        objC.method1();

//        objC = new ClassA(12);

        if(objA instanceof ClassC){

        }
        if(objC instanceof ClassA){

        }

    }
}

class ClassA{
    int numri = 5;

    public ClassA(int numri){
        this.numri = numri;
    }

    public void shtypDetajet(){
        System.out.println("ClassA");
    }

    public void method2(String emri){
        System.out.println("Method 2: Form 1");
    }

    public void method2(int numri){
        System.out.println("Method 2: Form 2");
    }

}

class ClassB extends ClassA{
    int numri = 6;
    public ClassB(int numri){
        super(numri);
    }
    public void shtypDetajet(){
        System.out.println("ClassB");
    }
}

class ClassC extends ClassB{
    public ClassC(int numri){
        super(numri);
    }
    public void shtypDetajet(){
        System.out.println("ClassC");
    }

    public void method1(){
        System.out.println("Method 1");
    }
}

class ClassD extends ClassA {
    public ClassD(int numri){
        super(numri);
    }
    public void shtypDetajet(){
        System.out.println("ClassD");
    }
}
