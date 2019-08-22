package com.softserve.rybka.HW6;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(51));

        }
        System.out.println("Initial myCollection: "+myCollection.toString());

        List<Integer> newCollection = new ArrayList<>();
        for (int i : myCollection){
            if (i > 5) {
                newCollection.add(myCollection.indexOf(i));
            }
        }
        System.out.println("Initial newCollection: "+newCollection);

        myCollection.removeIf(item -> item > 20);
        System.out.println("new myCollection: "+myCollection);

        Practice1 practice1 = new Practice1();
        practice1.addItem(myCollection, 2, 1);
        practice1.addItem(myCollection, 5, -4);
        practice1.addItem(myCollection, 8, -3);

        for (int i: myCollection) {
            System.out.println("position-"+myCollection.indexOf(i)+", value of element - "+i);
        }

        Collections.sort(myCollection);
        System.out.println("Sorted myCollection: "+myCollection);
    }

    public void addItem(List<Integer> list, int index, int value){
        int tmp = list.size();
        if (index < list.size()){
            list.add(index, value);
        }
        if (index > list.size()){

            while(tmp != index){
                list.add(0);
                tmp++;
            }
            list.add(index, value);
        }
    }
}
