package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> list;
    private Scanner scanner;

    public ToDoList(ArrayList<String> list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void addToList() {
        System.out.println("Add task:");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            return;
        } else {
            list.add(input);
            System.out.println(input + " added.");
        }
    }

    public void printList() {
        if (list.isEmpty()) {
            System.out.println("Your list is empty!");
            System.out.println("");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 +") " + list.get(i));
        }
    }






}
