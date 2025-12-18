package group_04.java_10;

public class Detyra1 {
    public static void main(String[] args){
        ID id1 = new StudentID("20251212");
        ID id2 = new StudentID("20251213");
        ID id3 = new ProfessorID("205123", "POO");

        FIEKScanner.scan(id1);
        FIEKScanner.scan(id2);
        FIEKScanner.scan(id3);
    }
}


class FIEKScanner{
    public static void scan(ID id){
        System.out.println("Scanning : " + id.getId());
        id.action();
    }
}

abstract class ID{
    final private String id;
    public ID(String id){
        this.id = id;
    }
    abstract void action();

    public String getId(){
        return this.id;
    }
}

final class StudentID extends ID{
    public StudentID(String id){
        super(id);
    }
    public void action(){
        System.out.println("Student with id: " + this.getId() + " is registered successfully!");
    }
}

final class ProfessorID extends ID{
    private String subject;
    public ProfessorID(String id, String subject){
        super(id);
        this.subject = subject;
    }

    public void action(){
        System.out.println("Transaction started.");
        System.out.println("Professor with id: " + this.getId() + " started a course for " + this.getSubject());
    }
    public String getSubject(){
        return this.subject;
    }
}
