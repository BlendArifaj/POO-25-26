package group_04.java_02;

public class Main {
    public static void main(String[] args){
        Makina makina1 = new Makina(2025,  "kuqe", "audi");
/*        makina1.viti = 2025;
        makina1.cmimi = 100;
        makina1.ngjyra = "kuqe";
        makina1.modeli = "audi";*/
//        System.out.println("------------------");
//        System.out.println("Modeli: " + makina1.modeli);
//        System.out.println("Ngjyra: " + makina1.ngjyra);
//        System.out.println("Viti: " + makina1.viti);
//        System.out.println("Cmimi: " + makina1.cmimi + "$");
        makina1.shtypDetajet();



        Makina makina2 = new Makina(2020, "bmw");
//        makina2.viti = 2020;
//        makina2.ngjyra = "zeze";
//        makina2.modeli = "bmw";
//        System.out.println("------------------");
//        System.out.println("Modeli: " + makina2.modeli);
//        System.out.println("Ngjyra: " + makina2.ngjyra);
//        System.out.println("Viti: " + makina2.viti);
//        System.out.println("Cmimi: " + makina2.cmimi + "$");
        makina2.shtypDetajet();

    }
}

// Cmimi baze: 1000, per vitin 2025
// Viti 2024: cmimi - 5%
// Viti 2023: (cmimi - 5%) - 5%
// Ngjyra e bardhe - nuk e ndryshon cmimin
// Ngjyra e kuqe: cmimi + 100, Ngjyra e zeze: cmimi + 80
// Modeli audi: cmimi + 12%, Modeli bmw: cmimi + 18%
class Makina {
    int viti;
    double cmimi;
    String ngjyra;
    String modeli;
    Makina(int viti, double cmimi, String ngjyra, String modeli){
       this.viti = viti;
       this.cmimi = cmimi;
       this.ngjyra = ngjyra;
       this.modeli = modeli;
    }
    Makina(int viti, double cmimi, String modeli){
        this.viti = viti;
        this.cmimi = cmimi;
        this.ngjyra = "bardhe";
        this.modeli = modeli;
    }
    Makina(int viti, String ngjyra, String modeli){
        this.viti = viti;
        this.ngjyra = ngjyra;
        this.modeli = modeli;
        this.cmimi = this.calculoCmimin();
    }
    Makina(int viti, String modeli){
        this.viti = viti;
        this.ngjyra = "bardhe";
        this.modeli = modeli;
        this.cmimi = this.calculoCmimin();
    }
    double calculoCmimin(){
        double cmimi = 1000;
        for(int i = 2025; i > this.viti; i--){
            cmimi *= 0.95;
        }

        if(ngjyra.equals("kuqe")){
            cmimi += 100;
        }else if(ngjyra.equals("zeze")){
            cmimi += 80;
        }

        if(modeli.equals("audi")){
            cmimi *= 1.12;
        }else if(modeli.equals("bmw")){
            cmimi *= 1.18;
        }

        return cmimi;
    }
    void shtypDetajet(){
        System.out.println("===================");
        System.out.println("Modeli: " + this.modeli);
        System.out.println("Ngjyra: " + this.ngjyra);
        System.out.println("Viti: " + this.viti);
        System.out.println("Cmimi: " + this.cmimi);
    }
}

