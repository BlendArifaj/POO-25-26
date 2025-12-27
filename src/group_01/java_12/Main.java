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
                Student student = Student.fromFileLine(line);

            }

        }catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }finally {
            if(scanner != null)
                scanner.close();
        }

//        FileWriter fileWriter = new FileWriter("src/group_01/java_12/ushtrimet.txt", true);
        FileWriter fileWriter = null;
        Student student = new Student(400, "Filan Filan", 9.12);

        try{
            fileWriter = new FileWriter(file, true);
            fileWriter.write(student.toFileLine());
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


class Student{
    int id;
    String emri;
    double notaMesatare;

    public Student(int id, String emri, double notaMesatare){
        this.id = id;
        this.emri = emri;
        this.notaMesatare = notaMesatare;
    }

    public String toFileLine(){
        return this.id + ";" + this.emri + ";" + this.notaMesatare + "\n";
    }
    public static Student fromFileLine(String line){
        String[] values = line.split(";");
        int id = Integer.parseInt(values[0]);
        String emri = values[1];
        double notaMesatare = Double.parseDouble(values[2]);
        return new Student(id, emri, notaMesatare);
    }
}