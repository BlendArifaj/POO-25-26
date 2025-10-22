package group_04.java_03;

public class Main {
    public static void main(String[] args){
        Student std1 = new Student("100", "FIEK");
        std1.uuid = "UP-FIEK";

        Student std2 = new Student("200", "FNA");
        std2.uuid = "UP-FIM";

        Student.uuid = "UP-FNA";

        System.out.println("Std1: " + std1.uuid);
        System.out.println("Std2: " + std2.uuid);

        Student.nota(90);

        System.out.println("Max: " + Math.max(Math.max(10, 20), 30));
        System.out.println("Min: " + Math.min(5, 8));
        System.out.println("SQRT: " + Math.sqrt(9));
        System.out.println("Round: " + Math.round(8.2));
        System.out.println("Random: " + Math.random()); // [0, 1)

        for(int i = 0; i < 20; i++){
            System.out.println("Math random: " + MathUtil.random(10, 20));
        }
    }
}

class Student {
    static String uuid = "UP-FIEK";
    String id;
    String fakuleti;

    Student(String id, String fakuleti){
        this.id = id;
        this.fakuleti = fakuleti;
    }

    void shtypDetajet(){
        System.out.println("UUID: " + Student.uuid);
        System.out.println("Id: " + this.id);
        System.out.println("Fakulteti: " + this.fakuleti);
    }

    static int nota(int piket){
        if(piket >= 90){
            return 10;
        }
        return 5;
    }
}
// 19231453432423
// 1923145343242319231453432423
class MathUtil{
    static int random(int x, int y){
        // 0 - 100?
        double value = x + Math.random() * (y - x);
        return (int) Math.round(value);
    }
}
