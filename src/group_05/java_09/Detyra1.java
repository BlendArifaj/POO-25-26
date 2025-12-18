package group_05.java_09;

public class Detyra1 {
    public static void main(String[] args){
        ID studentID1 = new StudentID();
        ID professorID = new ProfessorID();
        ID studentID2 = new StudentID();

        UPScanner.action(professorID);
        UPScanner.action(studentID1);
        UPScanner.action(studentID2);
    }
}

class ID{
    public void handle(){
        System.out.println("Not implemented yet!");
    }
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

class UPScanner{
    public static void action(ID id){
        id.handle();
    }
}
