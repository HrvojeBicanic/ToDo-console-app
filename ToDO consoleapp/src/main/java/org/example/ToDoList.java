package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<ToDo> list;
    private Scanner scanner;

    public ToDoList(ArrayList<ToDo> list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void addToList() {
        System.out.println("Add task:");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            return;
        } else {
            list.add(new ToDo(input));
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

    public void editList() {
        System.out.println("Which task you want to edit? (Choose number)");
        printList();
        int inputNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Edit " + list.get(inputNumber - 1) +  ":");
        String editInput = scanner.nextLine();
        list.set(inputNumber - 1, new ToDo(editInput));
    }

    public void removeFromList() {
        System.out.println("Which task you want to delete? (Choose number)");
        printList();
        int input = Integer.valueOf(scanner.nextLine());
        list.remove(input - 1);

        System.out.println("Task number " + input + " has been removed.");
    }

    public void deleteList() {
        System.out.println("Are you sure you want to delete whole list? This action can not be undone!\n(Yes to delete or No to cancel)");
        String choose = scanner.nextLine();
        if (choose.equalsIgnoreCase("yes")) {
            list.clear();
        } else if (choose.equalsIgnoreCase("no")) {
            return;
        } else {
            System.out.println("Wrong input");
        }
    }

    public ArrayList<ToDo> getList() {
        return list;
    }
}