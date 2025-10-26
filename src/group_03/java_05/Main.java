package group_03.java_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        Integer numri = 5;
        ArrayList<Integer> numrat = new ArrayList<>();
        numrat.add(10);
        numrat.add(12);
        numrat.add(15);
        numrat.add(numri);
        System.out.println("Numrat: " + numrat);
        numrat.add(0, 50);
        System.out.println("Numrat: " + numrat);

        Integer numberToRemove = 10;
        numrat.remove(numberToRemove);
        System.out.println("Numrat: " + numrat);

        int index = numrat.indexOf(10);
        System.out.println("Index: " + index);
        numrat.contains(10);
        numrat.removeFirst();
        numrat.removeLast();
        numrat.get(0);
        numrat.getFirst();
        numrat.getLast();

        for(int i = 0; i < numrat.size(); i++){
            System.out.println(numrat.get(i));
        }
        numrat.forEach(
                (item) -> {
                    System.out.println("Item: " + item);
                }
        );
        ArrayList<Integer> numrat2 = new ArrayList<>();
        numrat.addAll(numrat2);
        numrat.removeAll(numrat2);
        numrat.lastIndexOf(5);

        System.out.println("Unique: " + uniqueWords("Sot eshte nje dite e mire dhe shume e mire e mire"));

        HashSet<String> words = new HashSet<>();
        words.add("Sot");
        words.add("eshte");
        words.add("Dite");
        words.add("Sot");
        words.add("eshte");
        System.out.println("HashSet: " + words);
        words.remove("Sot");
        words.size();
        words.contains("Sot");
        words.isEmpty();
        words.clear();

        System.out.println("UniqueV2: " + uniqueWordsV2("Sot eshte nje dite e mire dhe shume e mire e mire"));

        words.add("Sot");
        words.add("eshte");
        words.forEach(
                (item) -> {
                    // logic ...
                    System.out.println("Item: " + item);
                }
        );

        wordsFrequency("Sot eshte nje dite Sot eshte nje");
//        {
//            key -> value
//            Sot -> 2
//            Student( ) -> List Notat
//
//        }

        HashMap<String, Integer> wordsFrequency = new HashMap<>();
        wordsFrequency.put("Sot", 10);
        wordsFrequency.put("Dite", 20);
        wordsFrequency.put("Sot", 5);
        wordsFrequency.get("Sot"); // -> 5 / null
        wordsFrequency.getOrDefault("Sot1", 0);
        wordsFrequency.forEach(
                (key, value) -> {
                    System.out.println(key + " -> " + value);
                }
        );
        System.out.println("HashMap: " + wordsFrequency);

        System.out.println("Words frequency: " + wordsFrequencyV2("Sot eshte nje dite e mire dhe shume e mire"));

    }
    // eshte eshte eshte
    // ["eshte"]

    // Sot eshte eshte
    // ["Sot", "eshte"]
    static ArrayList<String> uniqueWords(String text){
        String[] words = text.split(" ");
        ArrayList<String> unique = new ArrayList<>();
//        for(int i = 0; i < words.length; i++){
//            String word = words[i];
//        }

        for(String word : words){
            if(!unique.contains(word)){
                unique.add(word);
            }
        }
        return unique;
    }

    static HashSet<String> uniqueWordsV2(String text){
        String[] words = text.split(" ");
        HashSet<String> unique = new HashSet<>();
        for(String word : words){
            unique.add(word);
        }
        return unique;
    }

//    Sot eshte nje dite e mire Sot eshte
//    Sot -> 2, eshte -> 2, nje -> 1, dite -> 1, e -> 1, mire -> 1
    static int wordFrequency(String word, String[] words){
        int count = 0;
        for(String w : words){
            if(w.equals(word)){
                count++;
            }
        }
        return count;
    }
    static void wordsFrequency(String text){
        String[] words = text.split(" ");
        HashSet<String> unique = uniqueWordsV2(text);
        unique.forEach(
                (word) -> {
                    int frequency = wordFrequency(word, words);
                    System.out.println(word + " -> " + frequency);
                }
        );
    }

    static HashMap<String, Integer> wordsFrequencyV2(String text){
        String[] words = text.split(" ");
        HashMap<String, Integer> wordsFrequency = new HashMap<>();
        for(String word : words){
            int currentCount = wordsFrequency.getOrDefault(word, 0);
            wordsFrequency.put(word, currentCount + 1);
        }
        return wordsFrequency;
    }
}
