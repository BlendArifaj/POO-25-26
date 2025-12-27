package group_02.java_13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
100;Filan Fisteku;10.0
200;Fisteku Filan;8.8
300;Random Name;9.92
 */
class Student{
    int id;
    String emri;
    double notaMesatare;
    public Student(int id, String emri, double notaMesatare){
        this.id = id;
        this.emri = emri;
        this.notaMesatare = notaMesatare;
    }

    public static Student getFromLine(String line){
        String[] values = line.split(";");
        int id = Integer.parseInt(values[0]);
        String emri = values[1];
        double notaMesatare = Double.parseDouble(values[2]);
        return new Student(id, emri, notaMesatare);
    }
    public String toFileLine(){
        return this.id + ";" + this.emri + ";" + this.notaMesatare + "\n";
    }
}
public class Detyra06 {
    public static void main(String[] args) /* throws Exception */ {
        String pathname = "src/group_02/java_13/students.txt";
        File file = new File(pathname);
        if(!file.exists()){
            System.out.println("Fajlli nuk ekziston!");
        }
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                /* 100;Filan Fisteku;10.0 */
                /* ["100", "Filan Fisteku", "10.0"] */
               Student student = Student.getFromLine(line);
               students.add(student);
            }

        }catch (Exception e){
            System.out.println("Ka ndodhur nje gabim!");
        }finally {
            if(scanner != null)
                scanner.close();
        }

//        FileWriter
//        FileWriter fileWriter = new FileWriter(pathname);
//        FileWriter fileWriter = new FileWriter(file);
//        FileWriter fileWriter = new FileWriter(pathname, true);
//        FileWriter fileWriter = new FileWriter(file, true);
        try{
            Student student = new Student(123, "Filan Fisteku", 8.88);
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(student.toFileLine());
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Ka ndodhur nje gabim: " + e.getMessage());
        }

    }
}
