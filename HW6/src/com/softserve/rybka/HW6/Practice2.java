package com.softserve.rybka.HW6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Practice2 {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(2, "Alex");
        employeeMap.put(4, "Andri");
        employeeMap.put(6, "Mari");
        employeeMap.put(1, "Bill");
        employeeMap.put(3, "Sarah");
        employeeMap.put(5, "Bob");
        employeeMap.put(7, "Ron");

        System.out.println("initial map: "+employeeMap);

        Practice2.getNameById(employeeMap);
        Practice2.getIdByName(employeeMap);
    }

    private static void getNameById(Map<Integer,String> employeeMap) throws IOException {
        System.out.println("input ID: ");
        int id = Integer.parseInt(reader.readLine());
        if (employeeMap.containsKey(id)){
            System.out.println("name = "+employeeMap.get(id));
        } else {
            System.out.println("Sorry, nothing found");
        }
    }

    private static void getIdByName(Map<Integer,String> employeeMap) throws IOException {
        System.out.println("input name: ");
        String name = reader.readLine();
        for (Map.Entry<Integer, String> entry: employeeMap.entrySet()){
            if (entry.getValue().toLowerCase().trim()
                    .equals(name.toLowerCase().trim()))  {
                System.out.println("key= " + entry.getKey());
                break;
            }
        }
    }
}
