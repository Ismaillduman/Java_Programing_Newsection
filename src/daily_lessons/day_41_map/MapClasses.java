package daily_lessons.day_41_map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        //key can not be duplicate, but value can be
        Map<String,Integer> hashMap= new HashMap<>();//random order, accept null key & value
        hashMap.put("Daniel",18000);
        hashMap.put("Kevin",65000);
        hashMap.put("Barbara",55000);
        //hashMap.put(null,null);
        hashMap.put("Bob",null);
        hashMap.put("Carl",null);
        hashMap.put(null,73000);
        hashMap.put(null,83000);
        System.out.println("hashMap = " + hashMap);
        Map<String,Integer> linkedHashMap= new LinkedHashMap<>();//insertion order,accept null key& null values
        linkedHashMap.put("Daniel",18000);
        linkedHashMap.put("Kevin",65000);
        linkedHashMap.put("Barbara",55000);
        //linkedHashMap.put(null,null);
        linkedHashMap.put("Bob",null);
        linkedHashMap.put("Carl",null);
        linkedHashMap.put(null,73000);
        linkedHashMap.put(null,83000);
        System.out.println("linkedHashMap = " + linkedHashMap);
        Map<String,Integer> hashTable= new Hashtable<>();//random order,don't accept null key and null value, synchronized
        hashTable.put("Daniel",18000);
        hashTable.put("Kevin",65000);
        hashTable.put("Barbara",55000);
        //hashTable.put(null,null);
        try {
            hashTable.put("Bob",null);
            hashTable.put("Carl",null);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        //hashTable.put(null,73000);
        //hashTable.put(null,83000);
        System.out.println("hashTable = " + hashTable);
        Map<String,Integer> treeMap= new TreeMap<>();//sorted order does not accept null accept null values
        treeMap.put("Daniel",18000);
        treeMap.put("Kevin",65000);
        treeMap.put("Barbara",55000);
        //treeMap.put(null,null);
        treeMap.put("Bob",null);
        treeMap.put("Carl",null);
        try {
            treeMap.put(null,73000);
            treeMap.put(null,83000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("treeMap = " + treeMap);
    }
}
