package com.company;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        //1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Purple");
        treeSet.add("Violet");
        treeSet.add("Lavender");
        treeSet.add("Plum");
        treeSet.add("Magenta");
        System.out.println("Original Tree Set " + treeSet);
        //2. Write a Java program to iterate through all elements in a tree set.
        for (String s : treeSet) {
            System.out.println(s);
        }
        //3. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> anotherTreeSet = new TreeSet<>(treeSet);
        anotherTreeSet.add("Sangria");
        anotherTreeSet.add("Grape");
        anotherTreeSet.add("Plum");
        anotherTreeSet.addAll(treeSet);
        System.out.println("Another Tree Set " + anotherTreeSet);
        //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        Iterator<String> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //5. Write a Java program to get the first and last elements in a tree set.
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("First element = " + firstElement);
        System.out.println("Last element = " + lastElement);
        //6. Write a Java program to clone a tree set list to another tree set.
        TreeSet<String> clonedTreeSet = new TreeSet<>(treeSet);
        System.out.println("Cloned Tree Set " + clonedTreeSet);
        //7. Write a Java program to get the number of elements in a tree set.
        int size = treeSet.size();
        System.out.println("The number of elements = " + size);
        //8. Write a Java program to compare two tree sets.
        TreeSet<String> commonElements = new TreeSet<>();
        int count = 0;
        for (String s : treeSet) {
            if (anotherTreeSet.contains(s)) {
                commonElements.add(s);
                count++;
            }
        }
        System.out.println("Tree sets have " + count + " common elements " + commonElements);
        //9. Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(5);
        integerTreeSet.add(3);
        integerTreeSet.add(21);
        integerTreeSet.add(16);
        integerTreeSet.add(8);
        integerTreeSet.add(0);
        integerTreeSet.add(7);
        SortedSet<Integer> subTreeSet = integerTreeSet.headSet(7);
        System.out.println("The numbers less than 7 in a tree set " + subTreeSet);
        //10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        Integer greaterElement = integerTreeSet.ceiling(8);
        System.out.println("The number greater than or equal 8 in a tree set " + greaterElement);
        //11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
        Integer smallerElement = integerTreeSet.floor(8);
        System.out.println("The number less than or equal 8 in a tree set " + smallerElement);
        //12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.
        Integer strictlyGreaterElement = integerTreeSet.higher(5);
        System.out.println("The number strictly greater  than 5 in a tree set " + strictlyGreaterElement);
        //13. Write a Java program to get an element in a tree set which is strictly less than the given element.
        Integer strictlySmallerElement = integerTreeSet.lower(5);
        System.out.println("The number strictly less  than 5 in a tree set " + strictlySmallerElement);
        //14. Write a Java program to retrieve and remove the first element of a tree set.
        System.out.println("Original Tree Set " + integerTreeSet);
        Integer removedFirstElement = integerTreeSet.pollFirst();
        System.out.println("Removed First Element = " + removedFirstElement);
        System.out.println("Tree Set after removing first element " + integerTreeSet);
        //15. Write a Java program to retrieve and remove the last element of a tree set.
        Integer removedLastElement = integerTreeSet.pollLast();
        System.out.println("Removed Last Element = " + removedLastElement);
        System.out.println("Tree Set after removing last element " + integerTreeSet);
        //16. Write a Java program to remove a given element from a tree set.
        System.out.println("Original Tree Set " + integerTreeSet);
        integerTreeSet.remove(7);
        System.out.println("Tree Set after removing given element: " + integerTreeSet);
    }
}
