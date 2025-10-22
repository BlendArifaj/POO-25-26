package group_01.java_04;

public class Main {
    public static void main(String[] args){
        String emri = "Filan";
        String emri2 = new String("Filan");
        String emri3 = "Filan";

        boolean isEqual = emri.equals("Filan");
        boolean isEqual2 = emri.equalsIgnoreCase("filan");

        System.out.println("Emri == Emri2: " + (emri == emri2));
        System.out.println("Emri == Emri3: " + (emri == emri3));
        System.out.println("Emri3 == Emri2: " + (emri3 == emri2));

        emri = emri + " Fisteku";
        System.out.println("Emri: " + emri);

        emri = emri.concat(" Fisteku");
        System.out.println("Emri: " + emri);

        emri.toLowerCase();
        emri.toUpperCase();
        char[] array = emri.toCharArray();
        String newEmri = new String(array);
//      "  emri " => "emri"
        emri.trim();
//      "filani" => "fil"
        emri.substring(0, 3);
//      "filan"  => 'a'
        emri.charAt(3);
//        emri.equals("");
        emri.isEmpty();
        emri.length();
//      emri.split("") => ["f", "i", "l", "a", "n"]
//      emri.split("l") => ["fi", "an"]
//      emri.split(" ") => ["filan", "fisteku", "fisteku"]
        emri.split("");

//        String v StringBuilder v StringBuffer
        StringBuilder sb = new StringBuilder("Filan");
        sb.append(" Fisteku");
        System.out.println("StringBuilder value: " + sb);
        sb.substring(0, 3);
        sb.replace(0, 3, "Fisteku2");
        System.out.println("Updated value: "+ sb);
        sb.reverse();

        String value = "";
        StringBuilder valueSb = new StringBuilder("");

        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            value += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start));

        start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            valueSb.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start));

    }
}
