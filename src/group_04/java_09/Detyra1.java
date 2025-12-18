package group_04.java_09;

public class Detyra1 {
    public static void main(String[] args){
        Makina blender = new Makina();

        Fruti f1 = new Molla();
        Dardha f2 = new Dardha();

        blender.krijoLengje(f1);
        blender.krijoLengje(f2);
    }
}

class Fruti{
    public String ngjyra(){
        return "Pa ngjyre";
    }
}

class Molla extends Fruti{
    public String ngjyra(){
        return "Verdhe";
    }
}

class Dardha extends Fruti{
    public String ngjyra(){
        return "Bardhe";
    }
}

class Makina{
    public void krijoLengje(Fruti fruti){
        String ngjyra = fruti.ngjyra();
        System.out.println("Lengu me ngjyre te " + ngjyra);
    }
}