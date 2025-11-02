package group_02.java_06;

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
        int id = generateUniqueId();
        return new Student(id, emri, mbiemri);
    }
    private static int generateUniqueId(){
        int id = StudentUtil.random(10000, 99999);
        if(generatedIds.add(id)){
            return id;
        }
        return generateUniqueId();
    }


}

class StudentUtil {
    static int random(int x, int y) {
        double random = x + Math.random() * (y - x);
        return (int) Math.round(random);
    }
}