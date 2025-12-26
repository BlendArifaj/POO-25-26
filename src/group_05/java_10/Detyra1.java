package group_05.java_10;

public class Detyra1 {
    public static void main(String[] args){
        ID studentID1 = new StudentID();
        ID professorID = new ProfessorID();
        ID studentID2 = new StudentID();
        ID deanId1 = new DeanId();

        UPScanner.action(professorID);
        UPScanner.action(studentID1);
        UPScanner.action(studentID2);
        UPScanner.action(deanId1);
    }
}

abstract class ID{
    abstract public void handle();
}

class StudentID extends ID{
    public void handle(){
        System.out.println("Student registered! ...");
    }
}

class ProfessorID extends ID{
    public void handle(){
        System.out.println("Start transaction ....");
        System.out.println("Class is open.");
    }
}

class DeanId extends ID{
    public void handle(){
        System.out.println("Dean requested statistics for the class!");
    }
}

class UPScanner{
    public static void action(ID id){
        id.handle();
    }
}
