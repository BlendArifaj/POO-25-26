package group_01.java_01;

// shuma_e_numrave()
// shumaENumrave()
// ShumeENumrave()


import java.util.Scanner;

// Lexo prej tastieres
public class Detyra01 {
    public static void main(String[] args){
//        cin >> emri;
//        Scanner
        int numri = 55;
//        while-True
//        scan number
//        if
//        break

        Scanner scanner = new Scanner(System.in);
        System.out.print("Shtypeni nje numer: ");
        int numri2 = scanner.nextInt();

        System.out.print("Shkruani emrin: ");
        String emri = scanner.next();


        System.out.println(emri + " ka shtypur: " + numri);

        String mbetur = scanner.nextLine();
        System.out.print("Ka mbetur: " + mbetur);
    }
}
