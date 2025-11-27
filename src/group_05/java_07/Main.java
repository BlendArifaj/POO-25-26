package group_05.java_07;

public class Main {
    public static void main(String[] args){
        Student student = new Student(
                "101", "Filan Fisteku",
                "filan.fisteku@student.uni-pr.edu", "IKS"
        );
        student.shtypDetajet();

        StafiAkademik akademik = new StafiAkademik(
                "102", "Isak Shabani", "isak.shabani@uni-pr.edu",
                "kompjuterike", 2023, "Prof."
        );
        akademik.shtypDetajet();

        StafiAdministrativ administrativ = new StafiAdministrativ(
                "103", "Filan Fisteku", "filan.fisteku@uni-pr.edu",
                "financa", 2005, "Master"
        );
        administrativ.shtypDetajet();
    }
}

class Person{
    final private String id;
    final private String emri;
    final private String email;
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
    public void shtypDetajet(){
        System.out.println("Id: " + this.getId());
        System.out.println("Emri: " + this.getEmri());
        System.out.println("Email: " + this.getEmail());
    }
}

final class Student extends Person{
    private String drejtimi;
    public Student(String id, String emri, String email, String drejtimi){
        super(id, emri, email);
        this.drejtimi = drejtimi;
    }
    public void setDrejtimi(String drejtimi){
        this.drejtimi = drejtimi;
    }
    public String getDrejtimi(){
        return this.drejtimi;
    }
    @Override
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Drejtimi: " + this.getDrejtimi());
    }
}

class Stafi extends Person{
    final private String departamenti;
    final private int vitiKontrata;
    public Stafi(String id, String emri, String email, String departamenti, int vitiKontrata){
        super(id, emri, email);
        this.departamenti = departamenti;
        this.vitiKontrata = vitiKontrata;
    }
    public String getDepartamenti(){
        return this.departamenti;
    }
    public int getVitiKontrata(){
        return this.vitiKontrata;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Departamenti: " + this.getDepartamenti());
        System.out.println("Viti i kontrates: " + this.getVitiKontrata());
    }
}

final class StafiAkademik extends Stafi{
    private String titulli;
    public StafiAkademik(String id, String emri, String email, String departamenti,
                         int vitiKontrata, String titulli){
        super(id, emri, email, departamenti, vitiKontrata);
        this.titulli = titulli;
    }
    public void setTitulli(String titulli){
        this.titulli = titulli;
    }
    public String getTitulli(){
        return this.titulli;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Titulli: " + this.getTitulli());
    }
}

final class StafiAdministrativ extends Stafi{
    final private String niveli;
    public StafiAdministrativ(String id, String emri, String email, String departamenti,
                              int vitiKontrata, String niveli){
        super(id, emri, email, departamenti, vitiKontrata);
        this.niveli = niveli;
    }
    public String getNiveli(){
        return this.niveli;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Niveli: " + this.getNiveli());
    }
}