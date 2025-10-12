package group_02.java_03;

public class Main {
    public static void main(String[] args){
        Student std1 = new Student("100", "FIEK");
        std1.uuid = "UUID1";

        Student std2 = new Student("200", "FNA");
        std2.uuid = "UUID2";

        System.out.println("Std1 uuid: " + std1.uuid);
        System.out.println("Std2 uuid: " + std2.uuid);

        System.out.println("UUID: " + Student.uuid);

        std1.shtypDetajet();
        std2.shtypDetajet();
//        Student.shtypDetajet();

        StudentUtil su = new StudentUtil(); // X
        System.out.println("Nota: " + StudentUtil.nota(95));

//        Math
        System.out.println("Min: " + Math.min(5 ,6));
        System.out.println("Max: " + Math.max(10, 12));
        System.out.println("Round: " + Math.round(10.49));
        System.out.println("Random: " + Math.random()); // [0 - 1)

//        [0 - 1) - Random
//        [0 - 100) - Random * 100
//        [x - y) - Random ??
        for(int i = 0; i < 10; i++){
            System.out.println("Random: " + StudentUtil.random(10, 20));
        }
    }
}

class Student {
    String id;
    String fakulteti;
    static String uuid; // vlera e njejte per te gjitha objektet

    Student(String id, String fakulteti){
        this.id = id;
        this.fakulteti = fakulteti;
    }
    void shtypDetajet(){
        System.out.println("UUID: " + Student.uuid);
        System.out.println("Id: " + this.id);
        System.out.println("Fakulteti: " + this.fakulteti);
    }
}

class StudentUtil {
// "10"
    static int random(int x, int y){
        double random = x + Math.random() * (y - x);
        return (int) Math.round(random);
    }
    static int nota(int piket){
        if(piket >= 90){
            return 10;
        }else if(piket >= 80){
            return 9;
        }
//        ...
        else{
            return 5;
        }
    }
}


