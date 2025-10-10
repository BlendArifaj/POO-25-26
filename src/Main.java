public class Main {
    public static void main(String[] args) {
//        int, float, double, boolean, char
//        String
        int numri = 10;
        String emri = "Filan";
        char c = 'c';


        int[] vargu = new int[10];
        vargu[0] = 5;
        vargu[1] = 6;

        int[][] matrix = new int[5][5];
        matrix[0][1] = 5;

//        while, do-while, for (foreach)
        int start = 0;
        while(true){
            if(start % 2 == 0){
//                printo ne ekran
//                cout << start;
                System.out.println(start);
            }
            start++;
            if(start == 20)
                break;

        }
//        do-while
        do{
            if(start % 2 == 0){
//                printo ne ekran
//                cout << start;
                System.out.println(start);
            }
            start++;
            if(start == 20)
                break;

        }while(true);

        for(int i = 0;i < 20; i++){

        }

        char t = 't';
        switch (t){
            case 'a':
//                logic ...
                break;
            case 'b':
//                logic ...
                break;
            default:
//                logic ...
        }
        if(1 == 2){
//            logic ...
        }else if(1 == 3){
//            logic ...
        }else{
//            logic ...
        }

//        +, -, *, /, %
//        &&, ||, !=, >, <, >=, <=, ==
        int num2 = 100;
        boolean isTrue = num2 >= 10 && num2 <=100;
        if(isTrue){

        }

        shuma(5, 6);
    }


    static void shuma(int num1, int num2){
        int shuma = num1 + num2;
        System.out.println("Shuma: " + shuma);
    }
}
