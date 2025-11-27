package group_02.java_08;

import java.util.ArrayList;

public class Detyra1 {

}

class Student{
    private int id;
    private String emri;
    private ArrayList<Provimi> provimet;
    private Student(int id, String emri, ArrayList<Provimi> provimet){
        this.id = id;
        this.emri = emri;
        this.provimet = provimet;
    }
    public static Student getInstance(int id, String emri, ArrayList<Provimi> provimet){
        return new Student(id, emri, provimet);
    }
    // getEmri, getProvimet
    // setEmri, setId, ...
    public void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        for(Provimi provimi: this.provimet){
            provimi.shtypDetajet();
        }
    }
    public void provimetEArdhshme(){
        for(Provimi provimi : this.provimet){
            if(provimi instanceof ProvimPaPerfunduar){
                provimi.shtypDetajet();
            }
        }
    }

    public void notaMesatare(){
        double sum = 0;
        double count = 0;
        for(Provimi provimi : this.provimet){
            if(provimi instanceof ProvimPerfunduar){
                ProvimPerfunduar p = (ProvimPerfunduar) provimi;
                int nota = p.getNota();
                if (nota > 5){
                    sum += nota;
                    count++;
                }
            }
        }
        if(count > 0){
            System.out.println("Nota mesatare: " + (sum/ count));
        }else{
            System.out.println("Nuk ka provim te kaluar ende!");
        }
    }
}


// Provim -> ProvimPerfunduar, ProvimPaPerfunduar
// [lenda, semestri] -> [piket] , [heraParaqitjes]
class Provimi {
    private String lenda;
    private String semestri;
    public Provimi(String lenda, String semestri){
        this.lenda = lenda;
        this.semestri = semestri;
    }
    public void shtypDetajet(){
        System.out.println("Lenda: " + this.lenda);
        System.out.println("Semestri: " + this.semestri);
    }
}

class ProvimPerfunduar extends Provimi{
    private int piket;
    private int nota;
    public ProvimPerfunduar(String lenda, String semestri, int piket){
        super(lenda, semestri);
        this.piket = piket;
        this.nota = LlogariteNoten.getNota(this.piket);
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Piket: " + this.piket);
        System.out.println("Nota: " + this.nota);
    }
    public int getNota(){
        return this.nota;
    }
}
class ProvimPaPerfunduar extends Provimi{
    private int heraPaqitjes;
    public ProvimPaPerfunduar(String lenda, String semestri, int heraPaqitjes){
        super(lenda, semestri);
        this.heraPaqitjes = heraPaqitjes;
    }
    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Hera e paraqitjes: " + this.heraPaqitjes);
    }
}
class LlogariteNoten{
    private LlogariteNoten(){

    }

    public static int getNota(int piket){
        if(piket >= 90){
            return 10;
        }else if(piket >= 80){
            return 9;
        }else if(piket >= 70){
            return 8;
        }else if(piket >= 60){
            return 7;
        }else if(piket >= 50){
            return 6;
        }else{
            return 5;
        }
    }
}