package group_05.java_08;

import java.util.ArrayList;

// Class A
//          Class B
//                  Class C
//          Class D
public class Main {
    public static void main(String[] args){
        ArrayList<ClassA> listA = new ArrayList<>();
        ArrayList<ClassB> listB = new ArrayList<>();
        ArrayList<ClassC> listC = new ArrayList<>();

        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        ClassC objC = new ClassC();

        listA.add(objA);
        listA.add(objB);
        listA.add(objC);

//        listB.add(objA); X
        listB.add(objB);
        listB.add(objC);

//        listC.add(objA); X
//        listC.add(objB); X
        listC.add(objC);

//        objA instanceof ClassA
//        object instanceof Class
        for(ClassA element : listA){
            if(element instanceof ClassC newObj){
//                ClassC newObj = (ClassC) element;
                System.out.println(newObj.nota);
            }else if(element instanceof ClassB newObj){
                System.out.println(newObj.emri);
            }
        }

        for(ClassA element : listA){
            if(element.id == 10){
                System.out.println(element);
            }
        }

    }
}

class ClassA extends Object{
    int id;
}

class ClassB extends ClassA{
    String emri;
}

class ClassC extends ClassB{
    int nota;
}
