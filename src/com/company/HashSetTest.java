package com.company;

import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a hash set
        Set<String> set = new HashSet<>();
        set.add("Yellow");
        set.add("Canary");
        set.add("Gold");
        set.add("Butter");
        set.add("Lemon");
        //2. Write a Java program to iterate through all elements in a hash list.
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //3. Write a Java program to get the number of elements in a hash set.
        int size = set.size();
        System.out.println("The number of elements in a hash set " + size);
        //4. Write a Java program to empty an hash set.
        set.removeAll(set);
        System.out.println("The hash set is empty " + set);
        //5. Write a Java program to test a hash set is empty or not.
        System.out.println("The hash set is empty " + (set.isEmpty() ? "Yes" : "No"));
        //6. Write a Java program to clone a hash set to another hash set.
        set.add("Yellow");
        set.add("Canary");
        set.add("Gold");
        set.add("Butter");
        set.add("Lemon");
        Set<String> clonedSet = new HashSet<>(set);
        System.out.println("Cloned set " + clonedSet);
        //7. Write a Java program to convert a hash set to an array.
        String[] array = set.toArray(new String[0]);
        System.out.println("Array " + Arrays.toString(array));
        //8. Write a Java program to convert a hash set to a tree set.
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Tree set " + treeSet);
        //9. Write a Java program to convert a hash set to a List/ArrayList.
        List<String> arrayList = new ArrayList<>(set);
        List<String> linkedList = new LinkedList<>(set);
        System.out.println("Array List " + arrayList);
        System.out.println("Linked List " + linkedList);
        //10. Write a Java program to compare two hash set.
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Yellow");
        anotherSet.add("Mustard");
        anotherSet.add("Corn");
        anotherSet.add("Lemon");
        System.out.println(set);
        for (String element : set) {
            System.out.print(anotherSet.contains(element) ? "Yes " : "No ");
        }
        System.out.println();
        //11. Write a Java program to compare two sets and retain elements which are same on both sets
        anotherSet.retainAll(set);
        System.out.println(anotherSet);
        //12. Write a Java program to remove all of the elements from a hash set.
        set.removeAll(set);
        System.out.println("After remove all elements " + set);
    }
}
