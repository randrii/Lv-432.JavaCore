package com.softserve.rybka.HW6;

import java.util.*;

public class Task12{
    private static Set<Integer> set3 = new HashSet<>();

    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(6);

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Rybka", "Andrew");
        personMap.put("Bond", "James");
        personMap.put("Fox", "Alice");
        personMap.put("Jobs", "Steve");
        personMap.put("Lohan", "Linsey");
        personMap.put("Gates", "Bill");
        personMap.put("Willis", "Bruce");
        personMap.put("Lambert", "Adam");
        personMap.put("Spears", "Britney");
        personMap.put("Wozniak", "Steve");

        System.out.println("Set1: "+set1);
        System.out.println("Set2: "+set2);

        Task12.union(set1, set2);
        System.out.println("Union: "+set3);

        Task12.intersect(set1, set2);
        System.out.println("Intersection: "+set3);

        for (Map.Entry<String, String> person : personMap.entrySet()){
            System.out.println(person.getKey()+"\t"+person.getValue());
        }

        Task12.sameName(personMap);
        Task12.removeByName(personMap, "Andrew");
    }

    private static void union(Set set1, Set set2){
        Task12.set3.clear();
        Task12.set3.addAll(set1);
        set3.addAll(set2);
    }

    private static void intersect(Set set1, Set set2){
        Task12.set3.clear();
        Task12.set3.addAll(set1);
        set3.retainAll(set2);
    }

    private static void sameName(Map personMap){
        Set<String> names = new HashSet<>();
        for (Iterator i = personMap.entrySet().iterator(); i.hasNext();){
            Map.Entry target = (Map.Entry) i.next();
            for (Iterator j = personMap.entrySet().iterator(); j.hasNext();){
                Map.Entry entry = (Map.Entry) j.next();
                if (entry.getValue().equals(target.getValue()) && !entry.getKey().equals(target.getKey())){
                    names.add(entry.getKey()+"  "+entry.getValue());
                }
            }
        }
        System.out.println(names);
    }

    private static void removeByName(Map map, String firstName){
        for (Iterator j = map.entrySet().iterator(); j.hasNext();){
            Map.Entry entry = (Map.Entry) j.next();
            if (entry.getValue().equals(firstName)){
                j.remove();
            }
        }
        System.out.println("After removing "+firstName+": "+map);
    }
}