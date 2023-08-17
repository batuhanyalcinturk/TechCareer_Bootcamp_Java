package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListData {

    public static void main(String[] args) {
        //List<Integer> listem = new ArrayList<>();
        List<Integer> listem = new LinkedList<>();
        listem.add(5);
        listem.add(1);
        listem.add(6);
        listem.add(9);

        for (int i = 0; i < listem.size(); i++) {
            System.out.print(listem.get(i) + " ");
        }
        System.out.println("\n*****************");
        for (Integer temp : listem){
            System.out.print(temp + " ");
        }

        System.out.println("\n*****************");
        listem.stream().forEach((temp) -> System.out.print(temp + " "));

        System.out.println("\n*****************");
        Iterator iterator = listem.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
