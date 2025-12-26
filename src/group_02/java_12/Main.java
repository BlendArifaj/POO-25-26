package group_02.java_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        File, FileWriter, Scanner
        File file = new File("src/group_02/java_12/ushtrimet.txt");
        System.out.println("File exists: " + file.exists());
        file.canRead();
        file.canWrite();
        file.canExecute();

        file.length();
        file.getAbsoluteFile();

        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String text = scanner.nextLine();
                Student student = Student.fromFileRow(text);
                System.out.println("Student: " + student);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Ka ndodhur nje gabim: " + e.getMessage());
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }
        FileWriter fileWriter = null;
        try{
//            FileWriter fileWriter = new FileWriter("src/group_02/java_12/ushtrimet.txt");
            fileWriter = new FileWriter(file, true);
            Student student = new Student(2025, "Filan Fisteku", 8.8);
            fileWriter.write(student.toFileRow());
        }catch (IOException e){

        }finally {
            if(fileWriter != null){
                try{
                    fileWriter.close();
                }catch (IOException e){

                }
            }
        }


    }
}
