package group_02.java_10;

public class Detyra1 {
    public static void main(String[] args){
        ID studentId1 = new StudentID("20251212");
        ID studentId2 = new StudentID("20251213");
        ID professorId = new ProfessorID("205123", "POO");

        FIEKScanner fiekScanner = new FIEKScanner();

        fiekScanner.scan(professorId);
        fiekScanner.scan(studentId2);
        fiekScanner.scan(studentId1);
    }
}

abstract class ID{
    final private String id;
    public ID(String id){
        this.id = id;
    }

    abstract void handle();

    public String getId(){
        return this.id;
    }
}

final class StudentID extends ID{
    public StudentID(String id){
        super(id);
    }
    public void handle(){
        System.out.println("Student with Id: " + this.getId() + " is registered to the open class!");
    }
}

final class ProfessorID extends ID{
    private String subject;
    public ProfessorID(String id, String subject){
        super(id);
        this.subject = subject;
    }
    public void handle(){
        System.out.println("Transaction started.");
        System.out.println("Professor with Id: " + this.getId() + " wants to open a class for " + this.getSubject());
        System.out.println("Class is open.");
    }
    public String getSubject(){
        return this.subject;
    }
}

class FIEKScanner {
    public void scan(ID id){
        System.out.println("Scanning " + id.getId());
        id.handle();
    }
}




