package com.collections;

import java.util.*;

public class MapData {

    public static void main(String[] args) {
        Map<String, String> mapList = new LinkedHashMap<>();
        for (int i = 1; i <=9 ; i++) {
            mapList.put(UUID.randomUUID().toString(), i + " ");

        }
        for (String temp: mapList.keySet()) {
            System.out.println(temp+ " ");
        }

        System.out.println("\n*************************");

        for (String temp: mapList.values()) {
            System.out.print(temp+ " ");
        }

        System.out.println("\n*************************");

        for (String key: mapList.keySet()) {
            System.out.println(key+ " " + mapList.get(key));
        }

        System.out.println("\n**********");
        mapList.entrySet().forEach(System.out::println);
    }
}
