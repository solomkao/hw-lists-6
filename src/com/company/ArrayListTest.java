package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //1. Write a Java program to create a new array list, add some colors (string)
        // and print out the collection.
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("White");
        list.add("Grey");
        System.out.println(list);
        //2. Write a Java program to iterate through all elements in a array list.
        for (String s : list) {
            System.out.println("color = " + s);
        }
        //3. Write a Java program to insert an element into the array list at the first position.
        list.add(0, "Black");
        System.out.println("After insert "+list);
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        String element = list.get(1);
        System.out.println("Rcompareetrieved element = " + element);
        //5. Write a Java program to update specific array element by given element.
        list.set(2, "Rose");
        System.out.println("After update " + list);
        //6. Write a Java program to remove the third element from a array list.
        list.remove(2);
        System.out.println("After remove " + list);
        //7. Write a Java program to search an element in a array list.
        if (list.contains("Red")) {
            System.out.println("We've found red");
        } else {
            System.out.println("There's no such color");
        }
        //8. Write a Java program to sort a given array list.
        list.sort(Comparator.naturalOrder());
        System.out.println("After sort " + list);
        //9. Write a Java program to copy one array list into another.
        List<String> copiedList = new ArrayList<>();
        copiedList.add("Cherry");
        copiedList.add("Wine");
        copiedList.add("Ruby");
        copiedList.add("Blood");
        copiedList.add("Merlot");
        Collections.copy(list, copiedList);
        System.out.println("Source list " + copiedList);
        System.out.println("After copy " + list);
        //10. Write a Java program to shuffle elements in a array list.
        System.out.println("Before shuffle " + list);
        Collections.shuffle(list);
        System.out.println("After shuffle " + list);
        //11. Write a Java program to reverse elements in a array list.
        System.out.println("Before reverse " + list);
        Collections.reverse(list);
        System.out.println("After reverse " + list);
        //12. Write a Java program to extract a portion of a array list
        List<String> subList = list.subList(2, list.size());
        System.out.println("Sub list " + subList);
        //13. Write a Java program to compare two array lists.
        List<String> comparedList = new ArrayList<>();
        comparedList.add("Blue");
        comparedList.add("Sky");
        comparedList.add("Wine");
        comparedList.add("Navy");
        comparedList.add("Indigo");
        comparedList.add("Ocean");
        comparedList.add("Blood");
        List<String> commonElements = new ArrayList<>();
        int count = 0;
        for (String s : list) {
            if (comparedList.contains(s)) {
                commonElements.add(s);
                count++;
            }
        }
        System.out.println("Lists have " + count + " common elements " + commonElements);
        //14. Write a Java program of swap two elements in an array list
        System.out.println("Before swap " + list);
        Collections.swap(list, 0, list.size() - 1);
        System.out.println("After swap " + list);
        //15. Write a Java program to join two array lists.
        List<String> joinedList = new ArrayList<>();
        joinedList.addAll(list);
        joinedList.addAll(comparedList);
        System.out.println("Joined list " + joinedList);
        //16. Write a Java program to clone an array list to another array list.
        List<String> clonedList = new ArrayList<>(list);
        System.out.println("Cloned list " + clonedList);
        //17. Write a Java program to empty an array list.
        joinedList.removeAll(joinedList);
        System.out.println("Empty list " + joinedList);
        //18. Write a Java program to test an array list is empty or not
        if (joinedList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is dark and full of terrors");
        }
        //19. Write a Java program to trim the capacity of an array list the current list size.
        ((ArrayList<String>) list).trimToSize();
        //20. Write a Java program to increase the size of an array list.
        ((ArrayList<String>) list).ensureCapacity(10);
        //21. Write a Java program to replace the second element of a ArrayList with the specified element
        String oliveColor = "Olive";
        System.out.println("Before replace " + list);
        list.set(1, oliveColor);
        System.out.println("After replace " + list);
        //22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        for (int i = 0; i < list.size(); i++) {
            System.out.print("[" + i + "] " + list.get(i) + " ");
        }
    }
}
