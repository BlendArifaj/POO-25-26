package group_02.java_08;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<ParentClass> list = new ArrayList<>();

        ParentClass obj1 = new ParentClass();
        list.add(obj1);

        Child1 obj2 = new Child1();
        list.add(obj2);

        Child2 obj3 = new Child2();
        list.add(obj3);

        ArrayList<Object> objects = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) instanceof Child1){
                Child1 obj = (Child1) list.get(i);
                // ...
            }
        }

        for(ParentClass obj : list){
            if(obj instanceof Child1){
                Child1 ch = (Child1) obj;

            }
        }

    }
}

class ParentClass{ }

class Child1 extends ParentClass{}

class Child2 extends ParentClass{}

class AnotherParentClass {}

class AnotherChild {}