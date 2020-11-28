package com.company;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Brown");
        list.add("Coffee");
        list.add("Walnut");
        list.add("Caramel");
        System.out.println(list);
        //2. Write a Java program to iterate through all elements in a linked list
        for (String s : list) {
            System.out.print(s + " ");
        }
        //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        System.out.println();
        Iterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        //4. Write a Java program to iterate a linked list in reverse order.
        System.out.println();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //5. Write a Java program to insert the specified element at the specified position in the linked list.
        list.add(0, "Wood");
        list.add(3, "Umber");
        System.out.println(list);
        //6. Write a Java program to insert elements into the linked list at the first and last position.
        list.addFirst("Pecan");
        list.addLast("Penny");
        System.out.println(list);
        //7. Write a Java program to insert the specified element at the front of a linked list.
        list.offerFirst("Chocolate");
        System.out.println(list);
        //8. Write a Java program to insert the specified element at the end of a linked list.
        list.offerLast("Brunette");
        System.out.println(list);
        //9. Write a Java program to insert some elements at the specified position into a linked list.
        list.add(1, "Gingerbread");
        list.add(2, "Cinnamon");
        list.add(3, "Chocolate");
        System.out.println(list);
        //10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        System.out.println("First occurrence " + list.indexOf("Chocolate"));
        System.out.println("Last occurrence " + list.lastIndexOf("Chocolate"));
        //11. Write a Java program to display the elements and their positions in a linked list.
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] " + list.get(i) + " ");
        }
        //12. Write a Java program to remove a specified element from a linked list.
        System.out.println("Before remove " + list);
        list.remove("Chocolate");
        System.out.println("After remove " + list);
        //13. Write a Java program to remove first and last element from a linked list.
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        //14. Write a Java program to remove all the elements from a linked list
        list.removeAll(list);
        System.out.println("After removing all the element " + list);
        //15. Write a Java program of swap two elements in an linked list.
        list.add("Pink");
        list.add("Rose");
        list.add("Fuchsia");
        list.add("Coral");
        list.add("Magenta");
        System.out.println("Before swap " + list);
        Collections.swap(list, 0, 2);
        System.out.println("After swap " + list);
        //16. Write a Java program to shuffle the elements in a linked list.
        System.out.println("Before shuffle " + list);
        Collections.shuffle(list);
        System.out.println("After shuffle " + list);
        //17. Write a Java program to join two linked lists.
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Salmon");
        list2.add("Watermelon");
        LinkedList<String> joinedList = new LinkedList<>();
        joinedList.addAll(list);
        joinedList.addAll(list2);
        System.out.println("Joined list " + joinedList);
        //18. Write a Java program to clone an linked list to another linked list.
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        //19. Write a Java program to remove and return the first element of a linked list.
        String removedElement = list.poll();
        System.out.println("Removed first element " + removedElement);
        System.out.println(list);
        //20. Write a Java program to retrieve but does not remove, the first element of a linked list.
        String retrievedElement = list.peek();
        System.out.println("Retrieve first element " + retrievedElement);
        System.out.println(list);
        //21. Write a Java program to retrieve but does not remove, the last element of a linked list.
        String retrievedLastElement = list.peekLast();
        System.out.println("Retrieve last element " + retrievedLastElement);
        System.out.println(list);
        //22. Write a Java program to check if a particular element exists in a linked list.
        if (list.contains("Flamingo")) {
            System.out.println("Color Flamingo is present in the list");
        } else {
            System.out.println("There's no such color");
        }
        //23. Write a Java program to convert a linked list to array list.
        List<String> arrayList = new ArrayList<>(list);
        System.out.println("Array list" + arrayList);
        //24. Write a Java program to compare two linked lists.
        List<String> commonElements = new LinkedList<>();
        int count = 0;
        for (String s : list) {
            if (joinedList.contains(s)) {
                commonElements.add(s);
                count++;
            }
        }
        System.out.println("Lists have " + count + " common elements " + commonElements);
        //25. Write a Java program to test an linked list is empty or not.
        System.out.println(list.isEmpty() ? "Yes" : "No");
        //26. Write a Java program to replace an element in a linked list.
        System.out.println("Before replace " + list);
        list.set(0,"Hot pink");
        System.out.println("After replace " + list);
    }
}
