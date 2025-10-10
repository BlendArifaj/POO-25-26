package group_04.java_01;

import java.util.Scanner;

// main
public class Detyra01 {
    public static void main(String[] args){ // void main()
//        count << "Hello World! \n";
        System.out.println("Hello World!");

//        int double boolean char float
//        String
        int num = 10;
        String emri = "Filan";
        char c = 'c';
        boolean check = true; // false
//        + - * / %
//        &&, ||, !, !=, ==, >=, <=, >, <
//        if/else switch
        if(num >= 20 && num <= 100){
            System.out.println("Test 1!");
        }else if(num < 40 || num > 150){
            System.out.println("Test 2!");
        }else{
            System.out.println("Test 3!");
        }

        switch (c){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            default:
                System.out.println("default");
        }

//        for, while, do-while

        for(int i = 0;i < 10; i++ ){

        }
        int i = 0;
        do{
            // logic ...
            System.out.println("Test");
            i += 2;
        }while(i < 0);

//        array, matrix
        int[] vargu = new int[5];
        vargu[0] = 5;

        int[][] matrix = new int[5][5];
        matrix[0][1] = 12;

        shtypNeEkran(10, 'f');

//        count << "Shtyp numrin: ";
//        int numri;
//        cin >> numri;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shtyp numrin: ");
        int numri1 = scanner.nextInt();
        int numri2 = scanner.nextInt();
        int numri3 = scanner.nextInt();

//        scanner.next();
//        scanner.nextBoolean();
//        scanner.nextFloat();
//        scanner.nextLine();

        System.out.println("Numri1: " + numri1);
        System.out.println("Numri2: " + numri2);
        System.out.println("Numri3: " + numri3);
        scanner.next();
        String mbetur = scanner.nextLine();
        System.out.println("Mbetur: " +  mbetur);
    }


    static void shtypNeEkran(int num1, char c1){
        System.out.println("Num1: " + num1);
        System.out.println("Char1: " + c1);
    }

}