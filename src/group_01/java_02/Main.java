package group_01.java_02;

public class Main {
    public static void main(String[] args){
        System.out.println("Java 02!");

        Makina makina1 = new Makina("kuqe", 2025, 100.5, "audi");
        /* CTRL + /
        System.out.println("Ngjyra: " + makina1.ngjyra);
        System.out.println("Viti: " + makina1.viti);
        System.out.println("Cmimi: " + makina1.cmimi);
        System.out.println("Modeli: " + makina1.modeli);
         */
        makina1.shtypDetajet();

        Makina makina2 = new Makina("zeze", 2020, 20, "bmw");
//        System.out.println("Ngjyra: " + makina2.ngjyra);
//        System.out.println("Viti: " + makina2.viti);
//        System.out.println("Cmimi: " + makina2.cmimi);
//        System.out.println("Modeli: " + makina2.modeli);
        makina2.shtypDetajet();

        Makina makina3 = new Makina(2005, 10, "wv");
        makina3.shtypDetajet();

        Makina makina4 = new Makina("zeze", 2023, "bmw");
        makina4.shtypDetajet();

    }
}

// Viti aktual 2025, Cmimi Baze: 1000
// Cdo vit ma i vjeter: cmimi - 100
// Ngjyra e bardhe: cmimi nuk ndryshon
// Ngjyra e kuqe: cmimi + 100
// Ngjyra e zeze: cmimi + 70
// Modeli audi: cmimi * 10%
// Modeli bmw: cmimi * 15%
class Makina {
    String ngjyra;
    int viti;
    double cmimi;
    String modeli;

    Makina(String ngjyra, int viti, double cmimi, String modeli){
        System.out.println("Makina 1");
       this.ngjyra = ngjyra;
       this.viti = viti;
       this.cmimi = cmimi;
       this.modeli = modeli;
    }

    Makina(String ngjyra, int viti, int cmimi, String modeli){
        System.out.println("Makina 2");
        this.ngjyra = ngjyra;
        this.viti = viti;
        this.cmimi = cmimi;
        this.modeli = modeli;
    }

    Makina(int viti, double cmimi, String modeli){
        System.out.println("Makina 3");
        this.ngjyra = "bardhe";
        this.viti = viti;
        this.cmimi = cmimi;
        this.modeli = modeli;
    }

    Makina(int viti, String modeli){
        this.ngjyra = "bardhe";
        this.viti = viti;
        this.modeli = modeli;
        this.cmimi = this.calkuloCmimin();
    }
    Makina(String ngjyra, int viti, String modeli){
        this.ngjyra = ngjyra;
        this.viti = viti;
        this.modeli = modeli;
        this.cmimi = this.calkuloCmimin();
    }

    double calkuloCmimin(){
        double cmimi = 1000;

        if(this.ngjyra.equals("kuqe")){
            cmimi += 100;
        }else if(this.ngjyra.equals("zeze")){
            cmimi += 70;
        }

        int diferenca = (2025 - this.viti) * 100;
        cmimi -= diferenca;

        if(this.modeli.equals("audi")){
            cmimi *= 1.1;
        }else if(this.modeli.equals("bmw")){
            cmimi *= 1.15;
        }

        return cmimi;
    }

    void shtypDetajet(){
        System.out.println("Ngjyra: " + this.ngjyra);
        System.out.println("Viti: " + this.viti);
        System.out.println("Cmimi: " + this.cmimi);
        System.out.println("Modeli: " + this.modeli);
    }
}
