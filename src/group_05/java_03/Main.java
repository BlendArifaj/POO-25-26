package group_05.java_03;

public class Main {
    public static void main(String[] args){
        Student std1 = new Student("100", "FIEK");
        std1.uuid = "UUID5";

        Student std2 = new Student("200", "FNA");
        std2.uuid = "UUID6";

        System.out.println("Std1 uuid: " + std1.uuid);
        System.out.println("Std2 uuid: " + std2.uuid);

        Student.uuid = "UUID7";
        System.out.println("Nota: " + Student.nota(100));

        int nota = StudentUtil.nota();
//        StudentUtil su = new StudentUtil();

//        Math
//        Math math = new Math();
        System.out.println("Min: " + Math.min(10, 5));
        System.out.println("Max: " + Math.max(12, 15));
//        Random, Round
        System.out.println("Round: " + Math.round(10.8));
        System.out.println("Random: " + Math.random());
        for(int i = 0; i < 10; i++){
            System.out.println("Random: " + StudentUtil.random(5, 20));
        }
//        [0, 1) * 100 => [0, 100)

    }
}

class Student {
    static String uuid = "UUID001";
    String id;
    String fakulteti;
    Student(String id, String fakulteti){
        this.id = id;
        this.fakulteti = fakulteti;
    }

    void shtypDetajet(){
        System.out.println("UUID: " + Student.uuid);
        System.out.println("Id: " + this.id);
        System.out.println("Fakulteti: " + this.fakulteti);
    }

    static int nota(int piket){
        if(piket > 90){
            return 10;
        }else if(piket > 80){
            return 9;
        }
        // ...
        else{
            return 5;
        }
    }
}

class StudentUtil{
    private StudentUtil(){}
    static int nota(){
        return 10;
    }
    static int random(int x, int y){
//        0 - 100
        double rand = x + Math.random() * (y - x);
        return (int) Math.round(rand);
    }
}