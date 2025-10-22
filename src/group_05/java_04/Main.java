package group_05.java_04;

public class Main {
    public static void main(String[] args){
//               String
        //
        String emri1 = "Filan"; // FFCA
        String emri2 = new String("Filan"); // 34FB
        String emri3 = "Filan"; // FFCA

        System.out.println("Emri1: " + emri1);
        System.out.println("Emri2: " + emri2);
        System.out.println("Emri3: " + emri3);

//        ==
        System.out.println("Emri1 == Emri2: " + (emri1 == emri2));
        System.out.println("Emri2 == Emri3: " + (emri2 == emri3));
        System.out.println("Emri3 == Emri1: " + (emri3 == emri1));

        emri1 += " Fisteku"; // Filan, Filan Fisteku
        System.out.println("Emri1: " + emri1);
        System.out.println("Emri3: " + emri3);

//        equals,
        if(emri1.equals(emri2)){ // Filan v filan => False

        }else if(emri1.equalsIgnoreCase(emri2)){ // Filan v filan => True

        }
        emri1.charAt(0);
        emri1.length();
        char[] chars = emri1.toCharArray();
        String emri4 = new String(chars);
        emri1 = emri1.toLowerCase();
        emri1.toUpperCase();
        emri1 = emri1.replace("Fil", "Nal"); // Filan, Nalan

        // "filan fisteku".split(" ") => ["filan", "fisteku"]
        // "filan fisteku".split("") => ["f", "i", ..., " ", ..., "u"]
        // "filan fisteku".split("i") => ["f", "lan f", "steku"]
        emri1.split(" ");

        // "    filan    " => "filan"
        emri1.trim();

        emri1.isEmpty();
        emri1.isBlank();

//        StringBuilder dhe StringBuffer
        StringBuilder sb = new StringBuilder("Filan");
        sb.append(" Fisteku");
        sb.insert(0, "FIEK - ");
        sb.reverse();
        sb.deleteCharAt(10);

        System.out.println("SB: " + sb.toString());
        String student = sb.toString();


        String numbers = "";
        StringBuilder sbNumbers = new StringBuilder("");
//        int 1435322343232
//        long 14353223432321435322343232

        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            numbers += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String time: " + (end - start));

        start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            sbNumbers.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start));










    }
}
