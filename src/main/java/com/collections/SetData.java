package com.collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetData {

    public static void main(String[] args) {
        Set<Integer> listem = new LinkedHashSet<>();
        listem.add(5);
        listem.add(1);
        listem.add(6);
        listem.add(9);
        listem.add(4);
        listem.add(3);

        listem.stream().forEach((temp) -> System.out.print(temp + " "));
    }
}
