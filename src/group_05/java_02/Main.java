package group_05.java_02;

public class Main {
    public static void main(String[] args){
        System.out.println("Java 02!");
        int numri = 5;
        Makina makina1 = new Makina(2025, "kuqe", "audi");
/*      makina1.viti = 2025;
        makina1.ngjyra = "kuqe";
        makina1.modeli = "audi";
        makina1.cmimi = 105; */
//        System.out.println("==================");
//        System.out.println("Modeli: " + makina1.modeli);
//        System.out.println("Ngjyra: " + makina1.ngjyra);
//        System.out.println("Viti: " + makina1.viti);
//        System.out.println("Cmimi: " + makina1.cmimi + "$");
        makina1.shtypDetajetNeEkran();

        Makina makina2 = new Makina(2020,"bmw");
//        makina2.viti = 2022;
//        makina2.cmimi = 102;
//        makina2.modeli = "bmw";
//        System.out.println("==================");
//        System.out.println("Modeli: " + makina2.modeli);
//        System.out.println("Ngjyra: " + makina2.ngjyra);
//        System.out.println("Viti: " + makina2.viti);
//        System.out.println("Cmimi: " + makina2.cmimi + "$");
        makina2.shtypDetajetNeEkran();
    }
}


// cmimi baze: 1000, viti: 2025
// 2024: cmimi = cmimi - 4%, 2023: cmimi = (cmimi - 4%) - 4%)
// ngjyra: kuqe: cmimi + 100 | zeze: cmimi + 80
// modeli: audi: cmimi + 12% | bmw: cmimi - 7%
class Makina {
    int viti;
    String ngjyra;
    String modeli;
    double cmimi;
    Makina(int viti, String ngjyra, String modeli, double cmimi){
        this.viti = viti;
        this.ngjyra = ngjyra;
        this.modeli = modeli;
        this.cmimi = cmimi;
    }

    Makina(int viti, String modeli, double cmimi){
        this.viti = viti;
        this.ngjyra = "bardhe";
        this.modeli = modeli;
        this.cmimi = cmimi;
    }

    Makina(int viti, String ngjyra, String modeli){
        this.viti = viti;
        this.ngjyra = ngjyra;
        this.modeli = modeli;
        this.cmimi = this.kalkuloCmimin();
    }

    Makina(int viti, String modeli){
        this.viti = viti;
        this.ngjyra = "bardhe";
        this.modeli = modeli;
        this.cmimi = this.kalkuloCmimin();
    }

    void shtypDetajetNeEkran(){
        System.out.println("==============");
        System.out.println("Modeli: " + this.modeli);
        System.out.println("Ngjyra: " + this.ngjyra);
        System.out.println("Viti: " + this.viti);
        System.out.println("Cmimi: " + this.cmimi + "$");

    }

    double kalkuloCmimin(){
        double cmimi = 1000.0;
        for(int i = 2025; i > this.viti; i--){
            cmimi *= 0.96;
        }

        if(this.ngjyra.equals("kuqe")){
            cmimi += 100;
        }else if(this.ngjyra.equals("zeze")){
            cmimi += 80;
        }

        if(this.modeli.equals("audi")){
            cmimi *= 1.12;
        }else if(this.modeli.equals("bmw")){
            cmimi *= 0.93;
        }

        return cmimi;
    }



}












