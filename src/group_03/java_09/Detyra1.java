package group_03.java_09;

public class Detyra1 {
    public static void main(String[] args){
        StudentID stdId1 = new StudentID();
        StudentID stdId2 = new StudentID();
        ProfessorID prfId1 = new ProfessorID();

        IDScanner fiekScanner = new IDScanner();

        fiekScanner.handle(prfId1);
        fiekScanner.handle(stdId1);
        fiekScanner.handle(stdId2);
    }
}

class ID{
    public void handle(){
        System.out.println("No valid action!");
    }
}

class StudentID extends ID{
    public void handle(){
        System.out.println("Student registered in open class!");
    }
}

class ProfessorID extends ID{
    public void handle(){
        System.out.println("Transaction started ....");
        System.out.println("Class is open now.");
    }
}

class IDScanner{
    public void handle(ID id){
        id.handle();
    }
}

