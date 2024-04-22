package org.example;


import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Basic initialization
        List<Integer> list= new ArrayList<>();
        List<Integer> numbers= new ArrayList<Integer>(Arrays.asList(60, 25, 12));
// Or
        Integer[] arr = {2,3,4,4};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

// Two dimentional list
        List<List<String>> countries = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            countries.add(new ArrayList<>());
        }
// Or
        List<String>[] countries = new ArrayList[100];
        for(int i = 0; i < 100; i++){
            list[i] = new ArrayList<>();
        }

// Desfine the array size
        list.size();

// Add new item
        list.add(10);
        list.add(20);
        list.add(int index, E element); // insert data in specific position
        list.addAll(numbers);

// Get new item
        list.get(int index);

// Remove item by index
        list.remove(int index);
        list.clear(); // clear all data;

        list.contains(120)); // returns true/false
        list.indexOf(Object o); // returns first index of finding or -1
        list.isEmpty(); // returns true/false

        list.toString(); // make the array string
        list.toArray(); // Returns an array containing all of the elements

// Sorting and changed the data source for both cases
        list.sort(Comparator.naturalOrder()); // ASC
        list.sort(Comparator.reverseOrder()); // DSC
// Or
        Collections.sort(list); // ASC
        Collections.sort(list, Collections.reverseOrder()); // DSC
// custom sorting you can check the bellow link
// https://www.geeksforgeeks.org/java-program-to-sort-an-arraylist/

    }
}