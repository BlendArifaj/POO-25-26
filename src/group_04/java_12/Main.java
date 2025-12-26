package group_04.java_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){ //  throws IOException, FileNotFoundException

//        FileReadWrite file = new FileReadWrite("src/group_04/java_12/ushtrimet.txt");
//
//        file.read();
//
//        file.write("Text");


//        File
        File file = new File("src/group_04/java_12/ushtrimet.txt");
        System.out.println("File exists: " + file.exists());
        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Ka ndodhur nje gabim gjate krijimit te fajllit: " + e.getMessage());
        }
        file.canRead();
        file.length();

//        Scanner
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }catch (FileNotFoundException e){
            System.out.println("Gabim: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Ka ndodhur nje gabim: " + e.getMessage());
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }
//        FileWriter
        try{
//            FileWriter fileWriter = new FileWriter("src/group_04/java_12/ushtrimet.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("This is a text from FileWriter\n");
            fileWriter.append("This is an append string\n");
            fileWriter.write("Another text\n");
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Ka ndodhur nje gabim: " + e.getMessage());
        }

    }
}
