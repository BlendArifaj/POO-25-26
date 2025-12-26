package group_02.java_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
//            System.out.print("Num1: ");
//            int num1 = sc.nextInt();
//
//            System.out.print("Num2: ");
//            int num2 = sc.nextInt();
//
//            System.out.println("Heresi: " + Kalkulatori.heresi(num1, num2));
            System.out.print("Vendose noten: ");
            int nota = sc.nextInt();
            try{
                NotaApp.vendosNoten(nota);
            }catch (NotaException e){
                System.out.println("Nota nuk eshte valide! Provoni perseri");
            }catch (AnotherException e){

            }catch (Exception e){

            }

        }
    }

}

//            Throwable
//   Exception              Error
//   RuntimeException
//      - ArithmeticException
//      - NullPointerException
//      - Any other exception

class Kalkulatori{
    static double heresi(int num1, int num2){
        try{
            return num1 / num2;
        }catch (ArithmeticException e){
            System.out.print("Vlerat nuk jane valide. " + e.getMessage());
        }catch (Exception e){
            System.out.println("Error!");
        }
        finally {
            System.out.println("Finally block!");
        }
        return 0.0;
    }

    static double shumezimi(int num1, int num2){
        return num1 * num2;
    }
}

class NotaException extends Exception{
    static ArrayList<String> gabimet = new ArrayList<>();
    public NotaException(String message){
        super(message);
        this.handle();
    }
    private void handle(){
        gabimet.add(this.getMessage());
    }
}

class AnotherException extends Exception{

}

class NotaApp{
    public static void vendosNoten(int nota) throws Exception{
        if(nota < 5 || nota > 10){
            throw new NotaException("Nota nuk eshte valide!");
        }

        System.out.println("Nota u vendos me sukses!");
    }
}