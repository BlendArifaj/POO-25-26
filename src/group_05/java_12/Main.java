package group_05.java_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// File, FileWriter, Scanner
public class Main {
    public static void main(String[] args) {
        File file = new File("src/group_05/java_12/ushtrimet.txt");
        System.out.println("File exists: " + file.exists());

        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Gabim: " + e.getMessage());
            }
        }
        file.getAbsoluteFile();
        file.getAbsolutePath();

        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
//            scanner.nextLine();
//            scanner.hasNextLine();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println("Line: " + line);
            }

        }catch (FileNotFoundException e){
            System.out.println("Fajlli nuk gjindet ne lokacionin e kerkuar.");
        }finally {
            if(scanner != null)
                scanner.close();
        }

        try{
//            FileWriter fileWriter = new FileWriter("src/group_05/java_12/ushtrimet.txt", true);
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("Random text!\n");
            fileWriter.append("Append text!\n");
            fileWriter.flush();
        }catch (IOException e){

        }


    }

    static String readFile(String pathname){
        StringBuilder output = new StringBuilder();
        File file = new File(pathname);
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
//            scanner.nextLine();
//            scanner.hasNextLine();
            while(scanner.hasNextLine()){
                output.append(scanner.nextLine());
            }

        }catch (FileNotFoundException e){
            System.out.println("Fajlli nuk gjindet ne lokacionin e kerkuar.");
        }finally {
            if(scanner != null)
                scanner.close();
        }

        return output.toString();
    }
}
