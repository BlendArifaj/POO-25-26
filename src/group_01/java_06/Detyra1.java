package group_01.java_06;

import java.util.HashSet;

public class Detyra1 {
}

class Student{
    private static HashSet<Integer> generatedIds = new HashSet<>();

    private int id;
    private String emri;
    private String mbiemri;
    private Student(int id, String emri, String mbiemri){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }
    public static Student getInstance(String emri, String mbiemri){
        int id = Student.generateNewId();
        return new Student(id, emri, mbiemri);
    }
    private static int generateNewId(){
        int id = MathUtil.random(10000, 99999);
        if(Student.generatedIds.add(id)){
            return id;
        }
        return Student.generateNewId();
    }
}

class MathUtil {
    private MathUtil(){

    }
    static int random(int from, int to){
        double value = from + Math.random() * (to - from);
        return (int) value;
    }
}
