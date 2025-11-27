package group_03.java_08;

import java.util.ArrayList;

public class Detyra1 {
}

class GeneralDetails{
    int id;
    String emri;
    String adresa;
}
class Fakulteti extends GeneralDetails{
    ArrayList<Stafi> stafi;

    public void shtoStaf(Stafi stafi){

    }
    public void largoStaf(Stafi stafi){

    }
    public void shtypTeDhenatPerStafinAkademik(){

    }
    public void shtypTeDhenatPerProfesor(){

    }
    public void shtpTeDhenatPerStafAdministativ(){

    }
}

class Stafi extends GeneralDetails{ }

class StafAkademik extends Stafi{
    String titulli;
    String lenda;
}
class StafAdministrativ extends Stafi{
    int vitiFillimitTePunes;
}









