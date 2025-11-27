package group_03.java_08;

import java.util.ArrayList;

//    ClassA
//          - ClassB
//                   - ClassC
public class Main {
    public static void main(String[] args){
        ArrayList<ClassA> listA = new ArrayList<>();
        ArrayList<ClassB> listB = new ArrayList<>();
        ArrayList<ClassC> listC = new ArrayList<>();

        ClassA objA = new ClassA();
        ClassB objB = new ClassB();
        ClassC objC = new ClassC();

//        ListA:
        listA.add(objA);
        listA.add(objB);
        listA.add(objC);

//        ListB:
//        listB.add(objA); X
        listB.add(objB);
        listB.add(objC);

//        ListC:
//        listC.add(objA);
//        listC.add(objB);
        listC.add(objC);

        for(ClassA obj : listA){
            if(obj instanceof ClassB newObjB){
//                ClassB newObjB = (ClassB) obj;
                System.out.println("Emri:" + newObjB.emri);
//
            }
        }
    }
}

class ClassA{
    int id;
}

class ClassB extends ClassA{
    String emri;
}

class ClassC extends ClassB{
    int nota;
}

