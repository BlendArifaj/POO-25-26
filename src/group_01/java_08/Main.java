package group_01.java_08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        Parent obj3 = new Parent();

        // Lista me perfshi elemente te Child1 dhe Child2
        ArrayList<Parent> list = new ArrayList<>();
        list.add(obj3);
        list.add(obj2);
        list.add(obj1);

        for(Parent element: list){
            if(element instanceof Child1){

            }else if(element instanceof Child2){

            }else{

            }
        }

    }
}
//     A
//   B   C
class Parent{}

class Child1 extends Parent{}

class Child2 extends Parent{}

class AnotherParent{
}

class ClassC{}