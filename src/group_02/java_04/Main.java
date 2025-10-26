package group_02.java_04;

public class Main {
    public static void main(String[] args){
//        String
//        Class object = new Class();
        String emri1 = "Filan";
        String emri2 = new String("Filan");
        String emri3 = "Filan";

        System.out.println("Emri1 == Emri2: " + (emri1 == emri2));
        System.out.println("Emri2 == Emri3: " + (emri2 == emri3));
        System.out.println("Emri3 == Emri1: " + (emri3 == emri1));

        // "filan fisteku".split(" ") => ["filan", "fisteku"]
        // "filan fisteku".split("") => ["f", "i", ...," ", ..., "u"]
        // "filan".split("l") => ["fi", "an"]
        emri1.split(" ");

        // "filan fisteku".length() => 13
        emri1.length();

        // "filan fisteku".charAt(0) => 'f'
        emri1.charAt(0);

        char[] chars = emri1.toCharArray();
        String newEmri = new String(chars);

        System.out.println("Emri1.toLowerCase(): " + emri1.toLowerCase());
        emri1 = emri1.toUpperCase();
        System.out.println("Emri1: " + emri1);
        emri1 += "Fisteku";
        System.out.println("Emri1: " + emri1);

        System.out.println(" ".isBlank());
        // isEmpty =>
        // isBlank =>
        // "  filan  ".trim() => "filan"
        emri1.trim();

        emri1.replace('e', 'd');
        emri1.replace("Fi", "Lan");
        emri1.replaceFirst("Filan", "Fisteku");
        emri1.replaceAll("Filan", "Fisteku");

        // "filan".substring(3) => "an"
        // "filan".substring(1,3) => "il"
        System.out.println("filan".substring(3));
        System.out.println("filan".substring(1, 3));
//        "filan" => "nalif"
        String word = "filan";
        char[] reverse = new char[word.length()];
        for(int i = word.length() - 1; i >= 0; i--){
            reverse[word.length() - 1 - i] = word.charAt(i);
        }
        System.out.println("Reverse: " + new String(reverse));

//        String v StringBuilder v StringBuffer
        StringBuilder sb = new StringBuilder("Universiteti i Prishtines");
        System.out.println("SB: " + sb.toString());
        sb.append("FIEK", 0, 3);
        sb.insert(0, "FIEK");
        System.out.println("SB: " + sb);
        sb.reverse();
        sb.replace(0, 1, "TEST");


        String words = "";
        StringBuilder sbWords = new StringBuilder("");
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            words += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Time for String: " + (end - start));
        start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            sbWords.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Time for SB: " + (end - start));
    }
}
