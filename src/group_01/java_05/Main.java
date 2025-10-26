package group_01.java_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] vargu = new int[5];
//        ArrayList
//        int -> Integer
        ArrayList<Integer> notat = new ArrayList<>();
        notat.add(10);
        notat.add(8);
        notat.add(0, 7);
        notat.add(7);
        notat.add(10);
        System.out.println("Notat: " + notat);
        int indexToRemove = notat.indexOf(7);
        if(indexToRemove >= 0){
            notat.remove(indexToRemove);
        }
//        notat.removeFirst();
//        notat.removeLast();

//        notat.remove(0);
        System.out.println("Notat: " + notat);
        for(int i = 0; i < notat.size(); i++){
            System.out.println(notat.get(i));
        }

        if(notat.contains(10)){
            System.out.println("10 eshte ne liste!");
        }
        ArrayList<Integer> notat2 = new ArrayList<>();
        notat.addAll(notat2);
        notat.removeAll(notat2);

//        HashSet
        HashSet<String> unique = new HashSet<>();
        unique.add("Sot");
        unique.add("eshte");
        unique.add("dite");
        unique.add("dite");
        System.out.println("HashSet: " + unique);
        unique.remove(0);
        unique.remove("dite");
        System.out.println("HashSet: " + unique);
        unique.size();
        unique.contains("Sot");
        unique.forEach(
                element -> {
                    if(element.length() > 2){
                        System.out.println(element + " has size greater then 2");
                    }
                }
        );

//        HashMap
//        {
//            "key": "value",
//            "Sot": 1,
//            "eshte": 2,
//        }
        HashMap<String, Integer> wordsCount = new HashMap<>();
        wordsCount.put("Sot", 1);
        wordsCount.put("eshte", 2);
        wordsCount.get("Sot");
        wordsCount.put("Sot", 2);
        wordsCount.forEach(
                (key, value) -> {
                    System.out.println("Key: " + key);
                    System.out.println("Value: " + value);
                    System.out.println("----");
                }
        );

        System.out.println("Words count: " + wordsCountV2("Sot eshte eshte mire"));

        //Input: Sot eshte nje dite e mire dhe shume e mire!
        //Output: Sot, eshte, nje, dite, e, mire, dhe, shume
        //Output: Sot -> 1, eshte -> 1, ..., shume -> 2, e -> 2
    }

    static HashSet<String> uniqueWords(String input){
        String[] words = input.split(" ");
        HashSet<String> unique = new HashSet<>();
        // vargu -> list: of -> List
        // String[] words -> ArrayList<String> => List.of(words)
//        unique.addAll(List.of(words));
        for(int i = 0; i < words.length; i++){
            unique.add(words[i]);
        }
        return unique;
    }

    static int wordCountInText(String word, String text){
        int count = 0;
        String[] words = text.split(" ");
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word)){
                count++;
            }
        }
        return count;
    }
    static void wordsCount(String text){
        HashSet<String> unique = uniqueWords(text);
        unique.forEach(
                word -> {
                    int count = wordCountInText(word, text);
                    System.out.println(word + " -> " + count);
                }
        );
    }
    static HashMap<String, Integer> wordsCountV2(String text){
        HashMap<String, Integer> wordsCount = new HashMap<>();
        String[] words = text.split(" ");
        for(String word : words){ // word = words[i]
            int actualCount = wordsCount.getOrDefault(word, 0);
            wordsCount.put(word, actualCount+1);
        }
        return wordsCount;
    }
}
