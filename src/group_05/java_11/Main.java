package group_05.java_11;

// Exception

// RuntimeException
//   - NullPointerException
//   - ArithmeticException

// IOException
//   - FileNotFoundException

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        try{
//            int numri = 5;
//            System.out.println(numri / 0);

            String emri = null;
            System.out.println(emri.toLowerCase());
            // CSVParseException
        } catch(ArithmeticException e){
            System.out.println("Trajtimi i gabimit aritmetik: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Exception!");
        } finally {
            System.out.println("Finally!");
        }
    }
}

class NotaException extends Exception{
    public NotaException(int nota){
        super("Nota nuk eshte valide. Nota: " + nota);
        this.handle();
    }

    private void handle(){
        String filename = "logs.txt";
        try{
            FileWriter fw = new FileWriter(filename, true);
            fw.write(this.getMessage());
            fw.flush();
            fw.close();
        }catch (Exception e){

        }
    }
}

class Sems{
    public void vendosNoten(int nota) throws NotaException{
        if(nota < 5 || nota > 10){
//            me shkaktu nje gabim
            throw new NotaException(nota);
        }

        System.out.println("Nota u vendos u sukses!");
    }
}

class App{
    void notaPerStudent(int nota, String student) throws NotaException{
        Sems sems = new Sems();
        sems.vendosNoten(nota);

        try{
            sems.vendosNoten(nota);
        }catch (NotaException e){
            System.out.println("Nota nuk eshte valide." + e.getMessage());
        }
    }
}