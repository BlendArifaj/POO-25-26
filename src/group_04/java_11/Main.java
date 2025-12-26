package group_04.java_11;

import java.util.ArrayList;
import java.util.Scanner;
//                  Throwable
//          Exception               Error
//  RuntimeException
//      - ArithmeticException
//      - NullPointerException
//      - ArrayOutOfBoundException


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i < 10){
//            System.out.print("Numri i pare: ");
//            int num1 = scanner.nextInt();
//            System.out.print("Numri i dyte: ");
//            int num2 = scanner.nextInt();
//            Kalkulatori.heresi(num1, num2);
            System.out.print("Vendos noten: ");
            int nota = scanner.nextInt();
            try{
                NotaApp.vendosNoten(nota);
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            i++;
        }

//        NotaException.gabimet.forEach(
//                (gabimi) -> System.out.println(gabimi)
//        );
    }
}

class Kalkulatori{
    static void heresi(int num1, int num2){
        try{
            int heresi = num1 / num2;
            System.out.println("Heresi: " + heresi);
        } catch (ArithmeticException e){
            System.out.println("Gabim gjate llogaritjes. " + e.getMessage());
        }catch (NullPointerException e){

        }catch (Exception e){

        }
       finally {
            System.out.println("Finally!");
        }
    }
}

class NotaException extends Exception{
    public NotaException(String message){
        super(message);
        this.handle();
    }

    private void handle(){


    }
}

class NotaApp{
    static void vendosNoten(int nota) throws NotaException, RuntimeException{
        if(nota < 5 || nota > 10){
            throw new NotaException("Nota " + nota + " nuk eshte valide!");
        }

        System.out.println("Nota u vendos me sukses!");
    }
}