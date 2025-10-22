package group_04.java_04;

public class Main {
    public static void main(String[] args){
        // String
        String emri1 = "Filan"; // StringPool: Filan, Filan Fisteku, filan, FILAN
        String emri2 = new String("Filan");
        String emri3 = "Filan";

        System.out.println("emri1 == emri2: " + (emri1 == emri2));
        System.out.println("emri1 == emri3: " + (emri1 == emri3));
        System.out.println("emri2 == emri3: " + (emri2 == emri3));

        if(emri1.equals(emri2)){ // Filan v filan => False

        }else if(emri1.equalsIgnoreCase(emri2)){ // Filan v filan => True

        }
        char c = emri1.charAt(0);
        // "filan".toCharArray() => ['f', 'i', 'l', 'a', 'n']
        char[] chars = emri1.toCharArray();
        String newEmri = new String(chars);

        emri1 = emri1.toLowerCase(); //
        emri1.toUpperCase();

        // "  filan fisteku    " => "filan fisteku"
        emri1.trim();

        emri1.length();

        emri1.replace("Filan", "Emri");

        emri1.concat("Fisteku");

        emri1.replaceFirst("Filan", "Fisteku");

        // "filan fiskute".split(" ") => ["filan", "fisteku"]
        // "filan".split("l") => ["fi", "an"]
        // "filan".split("") => ["f", "i", ... , "n"]
        emri1.split(" ");

        emri1 += " Fisteku";

        // Filan => naliF
        System.out.println("Emri1: " + emri1);

        // String v StringBuilder v StringBuffer

//        StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder("Filan");
        sb.append(" Fisteku");
        sb.reverse();
        String newSb = sb.toString();
        sb.insert(1, "Test");
        sb.substring(10, 12);

        System.out.println("SB: " + sb);

    }
}
