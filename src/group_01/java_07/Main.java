package group_01.java_07;

public class Main {
    public static void main(String[] args){
        Person person1 = new Person("150", "Filan", "filan@student.uni-pr.edu");
        person1.shtypDetajet();

        Student student1 = new Student("20251050", "Art Shala", "art.shala@student.uni-pr.edu", 2025, 8.8);
        student1.shtypDetajet();

        Asistent asistent1 = new Asistent("12353", "Luan Jaha", "luan.jaha@uni-pr.edu", "PhD", "Blerim Rexha");
        asistent1.shtypDetajet();

        Profesor profesor1 = new Profesor("5413", "Profesor", "profesor@uni-pr.edu", "Dr", "POO");
        profesor1.shtypDetajet();
    }
}

class Person extends Object{
    private String id;
    private String emri;
    private String email;
    protected Person(String id, String emri, String email){
        this.id = id;
        this.emri = emri;
        this.email = email;
    }

    public String getId(){
        return this.id;
    }
    public String getEmri(){
        return this.emri;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void shtypDetajet(){
        System.out.println("ID: " + this.getId());
        System.out.println("Emri: " + this.getEmri());
        System.out.println("Email: " + this.getEmail());
    }
}

final class Student extends Person{
    private int vitiStudimeve;
    private double notaMesatare;
    public Student(String id, String emri, String email, int vitiStudimeve, double notaMesatare){
        super(id, emri, email);
        this.vitiStudimeve = vitiStudimeve;
        this.notaMesatare = notaMesatare;
    }
    public void shtypDetajet(){
        System.out.println("* Student *");
        super.shtypDetajet();
        System.out.println("Viti i studimeve: " + this.getVitiStudimeve());
        System.out.println("Nota mesatare: " + this.getNotaMesatare());
    }
    public int getVitiStudimeve(){
        return this.vitiStudimeve;
    }
    public double getNotaMesatare(){
        return this.notaMesatare;
    }
}

class StafAkademik extends Person{
    private String titulli;
    public StafAkademik(String id, String emri, String email, String titulli){
        super(id, emri, email);
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

final class Profesor extends StafAkademik{
    private String lenda;
    public Profesor(String id, String emri, String email, String titulli, String lenda){
        super(id, emri, email, titulli);
        this.lenda = lenda;
    }

    public void shtypDetajet(){
        System.out.println("* Profesor *");
        super.shtypDetajet();
        System.out.println("Lenda: " + this.getLenda());
    }
    public String getLenda(){
        return this.lenda;
    }
}

final class Asistent extends StafAkademik{
    private String profesori;
    public Asistent(String id,String emri, String email, String titulli, String profesori){
        super(id, emri, email, titulli);
        this.profesori = profesori;
    }
    public void shtypDetajet(){
        System.out.println("* Asistent *");
        super.shtypDetajet();
        System.out.println("Profesori: " + this.getProfesori());
    }
    public String getProfesori(){
        return this.profesori;
    }
}