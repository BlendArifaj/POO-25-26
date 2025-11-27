package group_03.java_08;

import java.util.ArrayList;

public class Detyra2 {
}

class Student{
    int id;
    String emri;
    ArrayList<Provim> provimet;

    float notaMesatare(){
        int sum = 0;
        int count = 0;
        for(Provim provim : this.provimet){
            if(provim instanceof ProvimPerfunduar obj){
                int nota = obj.nota;
                if(nota > 5){
                    sum += nota;
                    count++;
                }
            }
        }
        return sum / count;
    }
}

class Provim{
    String lenda;
    String semestri;
}
class ProvimPerfunduar extends Provim{
    int piket;
    int nota;

    int nota(){
        return LlogariteNoten.getNota(this.piket);
    }
}
class ProvimPaPerfunduar extends Provim{
    int heraParaqitjes;
}
class LlogariteNoten{
    static int getNota(int piket){
        if(piket > 90 ){
            return 10;
        }
// ...
        else{
            return 5;
        }
    }
}

