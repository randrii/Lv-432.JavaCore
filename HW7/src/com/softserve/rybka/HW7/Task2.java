package com.softserve.rybka.HW7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();
        deleteSpaces(sentence);
    }

    private static void deleteSpaces(String s){
        String result = s.trim().replaceAll(" +", " ");

        System.out.println("New sentence : "+ result);
    }
}
