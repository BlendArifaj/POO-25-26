package group_02.java_01;

import java.util.Scanner;

public class Ushtrimet {
    public static void main(String[] args){
//        count << "Hello World!";
        System.out.println("Hello World!");
//        int, double, float, boolean, char,
//        String
        int numri;
        numri = 10;
        String emri = "filan";
        char c = 'c';

//        if, else, else if
        if(c == 'd'){
            System.out.println("c == d");
        }else if(c == 'e'){

        }else if(c == 'f'){

        }else{

        }

        switch (c){
            case 'd':
                System.out.println("d");
                break;
            case 'e':
                // ....
                break;
            default:
                break;
        }
//        for, while, do-while
        for(int i = 0; i < 20; i++){
            System.out.println(i + " ");
        }
        int i = 0;
        while(i < 20){
            System.out.println(i);
            i += 3;
        }

        do{

        }while (i < 20);

        int[] vargu = new int[5];
        vargu[0] = 5;
        vargu[vargu.length - 1] = 5;

        int[][] matrix = new int[5][5];
        matrix[0][1] = 10;

        printoNeEkran(100, 'z');

        int num;
//    count << "Shtyp nje numer: ";
//    cin >> num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shtyp nje numer: ");
        num = scanner.nextInt();
        int num2 = scanner.nextInt();
        String name = scanner.next();
        boolean check = scanner.nextBoolean(); // true / false
        float sum = scanner.nextFloat();
        String sentence = scanner.nextLine();

        System.out.println("Numri: " + num);
        System.out.println("Numri 2: " + num2);

    }

    static void printoNeEkran(int num1, char c1){
        System.out.println("Numri: " + num1);
        System.out.println("Char: " + c1);
    }


}
