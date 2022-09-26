package com.algstructs.algs;


import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        int[] intArray = {1,4,6,8,3,2,9,5,0,7};
        Arrays.sort(intArray);
//        Arrays.stream(intArray).forEach(System.out::print);

        Collections.emptyList();

        System.out.println();

        Map<String, String> map = new TreeMap<>();
        map.put("1", "val1");
        map.put("3", "val3");
        map.put("2", "val2");
//        map.entrySet().forEach(System.out::println);
//        map.keySet().forEach(System.out::println);
//        map.values().forEach(System.out::println);

//        System.out.println();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(7);

        arrayList.stream()
                .sorted()
                .forEach(System.out::print);


    }
}
