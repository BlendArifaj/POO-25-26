package group_01.java_03;

public class Main {
    public static void main(String[] args){
        Student std1 = new Student("100", "FIEK");
        Student std2 = new Student("200", "FIEK");

        Student.universiteti = "UT";

        std1.printoTeDhenat();
        std2.printoTeDhenat();

//        MathUtil mathUtil = new MathUtil(); X
        MathUtil.sum(1, 2, 3);
        MathUtil.pow(2, 2);

        System.out.println(Math.pow(5, 5));
        System.out.println(Math.max(9, 10));
        System.out.println(Math.min(12, 8));
        System.out.println(Math.random()); // 0 - 1
        System.out.println(Math.round(12.433));

//        MathUtil mu = new MathUtil();

        for(int i = 0; i < 10; i++){
            System.out.println(MathUtil.random(10, 20));
        }
//        x -> y         gjatesia -(y - x)
//        0 -> (y - x)    rand [0, r * (y - x)]
//                        rand [x, r * y]
    }
}

class Student {
    String id;
    String fakulteti;
    static String universiteti = "UP";

    Student(String id, String fakulteti){
        this.id = id;
        this.fakulteti = fakulteti;
    }

    void printoTeDhenat(){
        System.out.println("Id: " + this.id);
        System.out.println("Fakulteti: " + this.fakulteti);
        System.out.println("Universiteti: " + Student.universiteti);
    }
}

class MathUtil {
    static int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    static int pow(int n1, int pow){
        int result = n1;
        for(int i = 0; i<pow;i++){
            result *= n1;
        }
        return result;
    }

    private MathUtil(){

    }
    static int random(int from, int to){
        double value = from + Math.random() * (to - from);
        return (int) value;
    }
}
