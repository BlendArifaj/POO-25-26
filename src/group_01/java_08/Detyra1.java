package group_01.java_08;

import java.util.ArrayList;

public class Detyra1 {
    public static void main(String[] args){
        ProvimPerfunduar p1 = new ProvimPerfunduar("POO", "III", 70);
        ProvimPerfunduar p2 = new ProvimPerfunduar("AK", "IV", 90);
        ProvimPaPerfunduar p3 = new ProvimPaPerfunduar("KNK", "IV", 1);
        ArrayList<Provimi> provimet = new ArrayList<>();
        provimet.add(p1);
        provimet.add(p2);
        provimet.add(p3);
        Student student = Student.getInstance("2025205", "Filan Fisteku", provimet);
        student.shtypDetajet();
        student.provimetEArdhshme();
    }
}

class Student{
    private String id;
    private String emri;
    private ArrayList<Provimi> provimet;
    private Student(String id, String emri, ArrayList<Provimi> provimet){
        this.id = id;
        this.emri = emri;
        this.provimet = provimet;
    }
    public static Student getInstance(String id, String emri, ArrayList<Provimi> provimet){
        return new Student(id, emri, provimet);
    }

    public void shtypDetajet(){
        System.out.println("Id: " + this.id);
        System.out.println("Emri: " + this.emri);
        System.out.println("Nota mesatare: " + this.notaMesatare());
    }

    public void provimetEArdhshme(){
        for(Provimi provim : this.provimet){
            if(provim instanceof ProvimPaPerfunduar){
                provim.shtypDetajet();
            }
        }
    }
    public double notaMesatare(){
        double count = 0.0;
        double notat = 0;
        for(Provimi provimi : this.provimet){
            if(provimi instanceof ProvimPerfunduar){
                int nota = ((ProvimPerfunduar) provimi).nota();
                if(nota > 5){
                    notat++;
                    count += nota;
                }
            }
        }
        if (notat > 0){
            return count / notat;
        }
        return 0.0;
    }
}

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

    public ProvimPerfunduar(String lenda, String semestri, int piket){
        super(lenda, semestri);
        this.piket = piket;
    }
    public int nota(){
        return LlogariteNoten.getNota(this.piket);
    }
}

class ProvimPaPerfunduar extends Provimi{
    private int heraEParaqitjes;
    public ProvimPaPerfunduar(String lenda, String semestri, int heraEParaqitjes){
        super(lenda, semestri);
        this.heraEParaqitjes = heraEParaqitjes;
    }

    public void shtypDetajet(){
        super.shtypDetajet();
        System.out.println("Hera e paraqitjes: " + this.heraEParaqitjes);
    }
}

class LlogariteNoten{
    private LlogariteNoten(){}
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
