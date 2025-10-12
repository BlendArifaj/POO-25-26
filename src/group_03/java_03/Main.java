package group_03.java_03;

public class Main {
    public static void main(String[] args){
        Student std1 = new Student("100", "Filan 1");
        std1.uuid = "UUID1";

        Student std2 = new Student("200", "Filan 2");
        std2.uuid = "UUID2";

        System.out.println("Std1 uuid: " + std1.uuid);
        System.out.println("Std2 uuid: " + std2.uuid);

        Student.uuid = "UUID3";

        std1.shtypDetajet();
        std2.shtypDetajet();

        System.out.println("Nota: " + Student.nota(100));

        System.out.println("Max: " + Math.max(10, 7));
        System.out.println("Min: " + Math.min(9, 12));
//        Math.abs()
        System.out.println("Round: " + Math.round(10.2));
        System.out.println("Random: " + Math.random()); // [0, 1)

        for(int i = 0; i < 10; i++){
            System.out.println("Random: " + StudentUtil.random(10, 20));
        }
    }
}

class Student{
    static String uuid;
    String id;
    String emri;

    Student(String id, String emri){
        this.id = id;
        this.emri = emri;
    }

    void shtypDetajet(){
        System.out.println("UUID: " + uuid);
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
    }

    static int nota(int piket){
        return 10;
    }
}

class StudentUtil{
    static int random(int x, int y){
        double rand = x + Math.random() * (y - x);
        return (int) Math.round(rand);
    }
}
