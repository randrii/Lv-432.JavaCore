package com.softserve.rybka.HW7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();
        longestWord(sentence);
        countLetters(sentence);
        reverseSecondWord(sentence);

    }

    private static void longestWord(String s){
        String[] words = s.split(" ");
        String max = "";
        for (String word: words){
            max = max.length() < word.length()? word.trim() : max;
        }
        System.out.println("The longest word is "+ max);
    }

    private static void countLetters(String s){
        String[] words = s.split(" ");
        int count = 0;

        for (String word: words){
            count+=word.trim().length();
        }
        System.out.println("The number of its letters is "+ count);
    }

    private static void reverseSecondWord(String s){
        String[] words = s.split(" ");
        int count = 0;
        StringBuilder reversed = new StringBuilder();
        for (String word: words){
            count++;

            if (count == 2) {
                reversed.append(word);
                reversed.reverse();
            }
        }
        System.out.println("The second word in reverse order is "+ reversed);
    }
}
