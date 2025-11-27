package group_04.java_07;

public class Main {
    public static void main(String[] args){
        Person person = new Person(100, "Person", "person@uni-pr.edu");
        person.shtypDetajet();

        Student student = new Student(
                101, "Filan Fisteku", "filan.fisteku@student.uni-pr.edu", "Kompjuterike", 9.9
                );
        student.shtypDetajet();

        StafAkademik akademik = new StafAkademik(
                102, "Isak Shabani", "isak.shabani@uni-pr.edu", "FIEK", "Prof. Dr."
        );
        akademik.shtypDetajet();

        StafAdministrativ administrativ = new StafAdministrativ(
                103, "Filan Fisteku Administrativ", "filan.fisteku@uni-pr.edu", "Financa", "Bachelor"
        );
        administrativ.shtypDetajet();
    }
}

//                          Person
//              Student                 Staf
//                           StafAkademik    StafAdministrativ

class Person{
    final private int id;
    final private String emri;
    final private String email;
    public Person(int id, String emri, String email){
        this.id = id;
        this.emri = emri;
        this.email = email;
    }
    public int getId(){
        return this.id;
    }
    public String getEmri(){
        return this.emri;
    }
    public String getEmail(){
        return this.email;
    }
    public void shtypDetajet(){
        System.out.println("Id: " + this.getId());
        System.out.println("Emri: " + this.getEmri());
        System.out.println("Email: " + this.getEmail());
    }

}
final class Student extends Person{
    private String drejtimi;
    private double notaMesatare;
    public Student(int id, String emri, String email, String drejtimi, double notaMesatare){
        super(id, emri, email);
        this.drejtimi = drejtimi;
        this.notaMesatare = notaMesatare;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Drejtimi: " + this.getDrejtimi());
        System.out.println("Nota mesatare: " + this.getNotaMesatare());
    }
    public String getDrejtimi(){
        return this.drejtimi;
    }
    public double getNotaMesatare(){
        return this.notaMesatare;
    }
}

class Staf extends Person{
    private String departamenti;
    public Staf(int id, String emri, String email, String departamenti){
        super(id, emri, email);
        this.departamenti = departamenti;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Departamenti: " + this.getDepartamenti());
    }
    public String getDepartamenti(){
        return this.departamenti;
    }
}
final class StafAkademik extends Staf{
    private String titulli;
    public StafAkademik(int id, String emri, String email,
                        String departamenti, String titulli){
        super(id, emri, email, departamenti);
        this.titulli = titulli;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Titulli: " + this.getTitulli());
    }
    public String getTitulli(){
        return this.titulli;
    }
}
final class StafAdministrativ extends Staf{
    private String niveli;
    public StafAdministrativ(int id, String emri, String email,
                             String departamenti, String niveli){
        super(id, emri, email, departamenti);
        this.niveli = niveli;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Niveli: " + this.getNiveli());
    }
    public String getNiveli(){
        return this.niveli;
    }
}
