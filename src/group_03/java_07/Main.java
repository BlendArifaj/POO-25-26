package group_03.java_07;

public class Main {
    public static void main(String[] args){
        Student student = new Student(
                "2025200", "Filan Fisteku", "filan.fisteku@student.uni-pr,edu", 2025, 9.5
        );
        student.shtypDetajet();

        StafAdministrativ administrativ = new StafAdministrativ(
                "SA2025", "Filan Fisteku", "filan.fisteku@uni-pr.edu", 2005, "Financa"
        );
        administrativ.shtypDetajet();

        StafAkademik akademik = new StafAkademik(
                "15023", "Blerim Rexha", "blerim.rexha@uni-pr.edu", 2003, "Dr", "Prof"
        );
        akademik.shtypDetajet();
    }
}

class Person{
    final private String id;
    private String emri;
    private String email;
    public Person(String id, String emri, String email){
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
    public void setEmri(String emri){
        this.emri = emri;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void shtypDetajet(){
        System.out.println("Id: " + this.getId());
        System.out.println("Emri: " + this.getEmri());
        System.out.println("Email: " + this.getEmail());
    }
}
final class Student extends Person{
    final private int vitiStudimeve;
    final private double notaMesatare;
    public Student(String id, String emri, String email, int vitiStudimeve, double notaMesatare){
        super(id, emri, email);
        this.vitiStudimeve = vitiStudimeve;
        this.notaMesatare = notaMesatare;
    }
    public int getVitiStudimeve(){
        return this.vitiStudimeve;
    }
    public double getNotaMesatare(){
        return this.notaMesatare;
    }
    public void shtypDetajet(){
        System.out.println("* Student *");
        super.shtypDetajet();
        System.out.println("Viti i studimeve: " + this.getVitiStudimeve());
        System.out.println("Nota mesatare: " + this.getNotaMesatare());
    }
}
class Staf extends Person{
    final private int vitiPunesimit;
    public Staf(String id, String emri, String email, int vitiPunesimit){
        super(id, emri, email);
        this.vitiPunesimit = vitiPunesimit;
    }
    public int getVitiPunesimit(){
        return this.vitiPunesimit;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Viti i punesimit: " + this.getVitiPunesimit());
    }
}
final class StafAdministrativ extends Staf{
    private String departamenti;
    public StafAdministrativ(String id, String emri, String email, int vitiPunesimit, String departamenti){
        super(id, emri, email, vitiPunesimit);
        this.departamenti = departamenti;
    }
    public String getDepartamenti(){
        return this.departamenti;
    }
    public void setDepartamenti(String departamenti){
        this.departamenti = departamenti;
    }
    public void shtypDetajet(){
        System.out.println("* Staf Administrativ *");
        super.shtypDetajet();
        System.out.println("Departamenti: " + this.getDepartamenti());
    }

}
final class StafAkademik extends Staf{
    final private String titulli;
    final private String pozita;
    public StafAkademik(String id, String emri, String email, int vitiPunesimit, String titulli, String pozita){
        super(id, emri, email, vitiPunesimit);
        this.titulli = titulli;
        this.pozita = pozita;
    }
    public String getTitulli(){
        return this.titulli;
    }
    public String getPozita(){
        return this.pozita;
    }
    public void shtypDetajet(){
        System.out.println("* Staf Akademik *");
        super.shtypDetajet();
        System.out.println("Titulli: " + this.getTitulli());
        System.out.println("Pozita: " + this.getPozita());
    }
}
