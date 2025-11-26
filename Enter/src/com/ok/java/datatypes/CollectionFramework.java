package com.ok.java.datatypes;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework {
    public static void main(String[] args) {
        // List --> Array and Linked List implementations (These are interfaces)
        // Set --> HashSet, LinkedHashSet, TreeSet implementations (These are
        // interfaces)
        // Map --> HashMap, LinkedHashMap, TreeMap implementations (These are
        // interfaces)
        List<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList elements: " + arrayList);
    }
}
