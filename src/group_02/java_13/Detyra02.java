package group_02.java_13;

import java.io.FileWriter;

/*
Të shkruhet një program në gjuhën programuese Java, i cili i mundëson profesorit të ruaj
në fajll notat e studenteve,të arritura në provim.
Kërkesat:
-	Logjika e funksionimit të programit do të vendoset në klasën Profesori, e cila do të
        zgjerohet nga klasa UserData, që i përmban vecoritë private: id dhe emri,
        dhe metodën abstrakte shtypDetajet, e cila kur të implementohet duhet të shtyp
        detajet e klasës në ekran.
-	Logjika e notimit për një student dhe ruajtja e notave ne fajll duhet të deklarohet
        në ndërfaqen NotimiInterface dhe implementimi të bëhet në klasën Profesori.
-	Programi nuk duhet te dështoj nese ka gabim gjatë ruatjes së notave në fajll, por
        duhet ta njoftoj profesorin se notat nuk jan ruajtur me sukses!
-	Nota duhet të deklarohet si një objekt, që përmban id-n e studentit (studentId),
        lenden dhe notën.
-   Formati i ruajtjes ne fajll duhet të jetë: studentId – lenda – nota,
        p.sh: 150714-POO-10, 150713-KNK-9.
 */
public class Detyra02 {
}
abstract class UserData{
    private int id;
    private String emri;

    public UserData(int id, String emri) {
        this.id = id;
        this.emri = emri;
    }

    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    abstract void shtypDetajet();
}

class Nota{
    int id;
    String lenda;
    int nota;

    public Nota(int id, String lenda, int nota) {
        this.id = id;
        this.lenda = lenda;
        this.nota = nota;
    }

    public String toFileLine(){
        return this.id + "-" + this.lenda + "-" + this.nota + "\n";
    }
}
interface NotimiInterface{
    String FILE_NAME = "src/group_02/java_13/notat.txt";

    void vendosNoten(Nota nota);
}
class Profesori extends UserData implements NotimiInterface{

    public Profesori(int id, String emri) {
        super(id, emri);
    }

    @Override
    void shtypDetajet() {
        System.out.println("Id: " + this.getId());
        System.out.println("Emri: " + this.getEmri());
    }

    public void vendosNoten(Nota nota){
        try{
            FileWriter fw = new FileWriter(FILE_NAME, true);
            fw.write(nota.toFileLine());
            fw.close();
        }catch (Exception e){
            System.out.println("Ka ndodhur nje gabim: " + e.getMessage());
        }
    }
}
