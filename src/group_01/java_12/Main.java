package group_01.java_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  /* throws IOException */ {
//        File, FileWriter edhe Scanner
        File file = new File("src/group_01/java_12/ushtrimet.txt");
        System.out.println("File exists: " + file.exists());
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("File is not created because " + e.getMessage());
            }
        }
        file.length();
        file.canRead();

        Scanner scanner = null;
        try{
            scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }finally {
            if(scanner != null)
                scanner.close();
        }

//        FileWriter fileWriter = new FileWriter("src/group_01/java_12/ushtrimet.txt", true);
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(file, true);
            fileWriter.write("Writing ...\n");
            fileWriter.append("Appending ...\n");
            fileWriter.flush();
        }catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }finally {
            if(fileWriter != null){
                try{
                    fileWriter.close();
                }catch (Exception e){
                    System.out.println("Exception: " + e.getMessage());
                }
            }

        }
    }
}
