package group_02.java_09;

//                  ClassA
//         ClassB             ClassC
// ClassD
public class Main {
    public static void main(String[] args){
        ClassA objA;

        objA = new ClassA(10);
        objA.method1();
        objA.method1(10);

        objA.method2();

        objA = new ClassB(12);
        objA.method2();

        objA = new ClassD(15);
        objA.method2();

        objA = new ClassC(18);
        objA.method2();
//        objA.method3();   X
        System.out.println(objA.number);


    }
}

class ClassA{
    public int number = 10;
    public ClassA(int number){
        this.number = number;
    }
    public void method1(){
        System.out.println("Method 1 - Form 1");
    }
    public void method1(int number){
        System.out.println("Method 1 - Form 2");
    }

    public void method2(){
        System.out.println("Method 2 - Form 1");
    }
}
class ClassB extends ClassA{
    public ClassB(int number){
        super(number);
    }
    public void method2(){
        System.out.println("Method 2 - Form 2");
    }

}

class ClassC extends ClassA{
    public int number = 12;
    public ClassC(int number){
        super(number);
    }
    public void method2(){
        System.out.println("Method 2 - Form 3");
    }
    public void method3(){
        System.out.println("Method 3 - Form 1");
    }
}

class ClassD extends ClassB{
    public ClassD(int number){
        super(number);
    }
    public void method2(){
        System.out.println("Method 2 - Form 4");
    }
}
