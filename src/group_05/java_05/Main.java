package group_05.java_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        ArrayList
//        int - Integer
//        double - Double
//        float - Float
//        boolean - Boolean
        ArrayList<Integer> numrat = new ArrayList<>();
        Integer numri = 5;
        numrat.add(10);
        numrat.add(5);
        numrat.add(8);
        Integer numberToRemove = 10;
        numrat.remove(numberToRemove);
        numrat.remove(0);
        numrat.add(0, 10);

        System.out.println("Numrat: " + numrat);
        ArrayList<Integer> numrat2 = new ArrayList<>();
        numrat2.add(55);
        numrat2.add(66);
        numrat2.add(77);

        numrat.addAll(numrat2);
        System.out.println("Numrat: " + numrat);

        numrat.removeAll(numrat2);
        numrat.indexOf(55);
        numrat.getLast(); // numrat.get(numrat.size() - 1)
        numrat.getFirst(); // numrat.get(0)
        numrat.get(1); // numrat[i]
        numrat.contains(10);
        numrat.containsAll(numrat2);
        numrat.size();
        numrat.removeFirst();
        numrat.removeLast();


        Scanner sc = new Scanner(System.in);
        System.out.println("Fjalia: ");
        String fjalia = sc.nextLine();
        System.out.println("Unique Words: " + uniqueWords(fjalia));

//        HashSet
        HashSet<String> words = new HashSet<>();
        words.add("Sot");
        words.add("eshte");
        words.add("Sot");
        words.add("Eshte");
        System.out.println("HashSet: " + words);
        words.contains("Eshte");
        HashSet<String> fjalet = new HashSet<>();
        words.addAll(fjalet);
        words.size();
        words.clear();
        words.isEmpty();
        words.remove("Eshte");
        words.forEach(
                (element) -> {
                    //logic ...
                }
        );


        wordsFrequency("Sot eshte eshte nje dite dite");
//        Sot -> 1
//        eshte -> 2
//        nje -> 1
//        dite -> 2

//        202600 -> [10, 10, 5, 10, 9]
//        202601 -> [9, 8, 10, 10, 9]
//        HashMap
        HashMap<String, Integer> wordsFrequency = new HashMap<>();
        HashMap<Integer, Integer> numrat3 = new HashMap<>();
        numrat3.put(0, 10);
        numrat3.put(1, 20);

        wordsFrequency.put("Sot", 5);
        wordsFrequency.put("eshte", 6);
        wordsFrequency.put("Sot", 2);
        wordsFrequency.get("Sot");
        wordsFrequency.getOrDefault("Test", 0);
//        wordsFrequency.clear();
        wordsFrequency.size();
        wordsFrequency.containsKey("Sot");
        wordsFrequency.containsValue(10);
        wordsFrequency.forEach(
                (key, value) -> {
                    System.out.println(key + " -> " + value);
                }
        );

        System.out.println("Words frequency v2: " +
                wordsFrequencyV2("Sot eshte Sot eshte nje dite dite e mire"));

    }

//    Input: "Sot eshte nje dite e mire dhe nje dite me shi"
//    Ouput: [Sot, eshte, nje, dite, e mire, dhe, me, shi]
    static ArrayList<String> uniqueWords(String text){
        String[] words = text.split(" ");
        ArrayList<String> unique = new ArrayList<>();
//        for(int i = 0; i < words.length; i++){
//            String word = words[i];
//
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
//        for(int i = 0; i < words.length; i++){
//            String word = words[i];
//
//        }
        for(String word : words){
            unique.add(word);
        }
        return unique;
    }

    // Input: Sot eshte eshte eshte
    // Output: Sot -> 1, eshte -> 3

    static int wordCount(String word, String[] words){
        int count = 0;
        for(String item : words){
            if(item.equals(word)){
                count++;
            }
        }
        return count;
    }
    static void wordsFrequency(String text){
        String[] words = text.split(" ");
        HashSet<String> unique = uniqueWordsV2(text);
        for(String word: unique){
            int frequency = wordCount(word, words);
            System.out.println(word + " -> " + frequency);
        }
    }

    static HashMap<String, Integer> wordsFrequencyV2(String text){
        String[] words = text.split(" ");
        HashMap<String, Integer> wordsFrequency = new HashMap<>();
        for(String word: words){
            int currentFrequency = wordsFrequency.getOrDefault(word, 0);
            wordsFrequency.put(word, currentFrequency + 1);
        }
        return wordsFrequency;
    }

}
