package com.ihsan.id;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Junaidi");
        linkedList.add("Eko");
        linkedList.add("Risky");
        linkedList.add("Firhad");
        linkedList.add("Fadhli");
//        System.out.println(linkedList);


        addElement(linkedList, "Andi");
//        printElement(linkedList);
//        System.out.println(linkedList.get(0));
    }

    private static void printElement(LinkedList<String> linkedList) {
        ListIterator<String> i = linkedList.listIterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("=====================");
    }
    
    private static LinkedList<String> testMethod() {
        LinkedList<String> check = new LinkedList<>();
        return check;
    }

    private static void addElement(LinkedList<String> linkedList, String element) {
        ListIterator<String> i = linkedList.listIterator();

        while (i.hasNext()) {
            int comparison = i.next().compareTo(element);
            if (comparison == 0) {
                System.out.println(element + " is already in the list");
            } else if (comparison > 0) {
                i.previous();
                linkedList.add(element);
            } else {
            }
            linkedList.add(element);
        }
    }
}
