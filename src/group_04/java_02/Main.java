package group_04.java_02;

public class Main {
    public static void main(String[] args){
        Makina makina1 = new Makina(2025, "zeze");
//        System.out.println("Viti: " + makina1.viti);
//        System.out.println("Ngjyra: " + makina1.ngjyra);
//        System.out.println("Cmimi: " + makina1.cmimi);
        makina1.shtypTeDhenat();

        Makina makina2 = new Makina(2024, 1000);
//        System.out.println("Viti: " + makina2.viti);
//        System.out.println("Ngjyra: " + makina2.ngjyra);
//        System.out.println("Cmimi: " + makina2.cmimi);
        makina2.shtypTeDhenat();

    }

}

//2025, ngjyra: bardhe => 5000
//2024, ngjyra: bardhe => 5000 - 5%
//ngjyren: zeze => cmimi + 13%
//ngjyren: kuqe => cmimi + 22%
class Makina {
    int viti;
    String ngjyra;
    double cmimi;

    Makina(int viti, String ngjyra, double cmimi){
        this.viti = viti;
        this.ngjyra = ngjyra;
        this.cmimi = cmimi;
    }

    Makina(int viti, double cmimi){
        this.viti = viti;
        this.ngjyra = "bardhe";
        this.cmimi = cmimi;
    }

    Makina(int viti, String ngjyra){
        this.viti = viti;
        this.ngjyra = ngjyra;
        this.cmimi = this.kalkuloCmimin();
    }

    double kalkuloCmimin(){
        double cmimi = 5000;
        for(int i = 2025; i > this.viti; i--){
            cmimi *= 0.95;
        }
        if(ngjyra.equals("kuqe")){
            cmimi *= 1.22;
        }else if(ngjyra.equals("zeze")){
            cmimi *= 1.13;
        }
        return cmimi;
    }

    void shtypTeDhenat(){
        System.out.println("Viti: " + this.viti);
        System.out.println("Ngjyra: " + this.ngjyra);
        System.out.println("Cmimi: " + this.cmimi);
    }
}
