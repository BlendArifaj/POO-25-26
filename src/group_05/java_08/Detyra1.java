package group_05.java_08;

import java.util.ArrayList;

public class Detyra1 {
}

class GeneralDetail {
    private int id;
    private String emri;
    private String adresa;
}
class Fakuleti extends GeneralDetail{
    ArrayList<Staf> stafi;

    public void shtoStaf(Staf staf){
        this.stafi.add(staf);
    }
    public void largoStaf(Staf staf){
        this.stafi.remove(staf);
    }
    public void shtypTeDhenatPerStafinAkademik(){
        for(Staf staf : this.stafi){
            if(staf instanceof StafAkademik){
//                staf.shtypDetajet();
            }
        }
        String i = "";
        char c1 = i.charAt(0);
//        char[] chars = new char['a', 'b', 'c'];





    }
}

class Staf extends GeneralDetail{

}

class StafAkademik extends Staf{
    String titulli;
    String lenda;
}

class StafAdministrativ extends Staf{
    int vitiPunes;
}
