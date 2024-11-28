package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        ToDoList lista = new ToDoList(list, scanner);

        while(true) {
            System.out.println("What you want to do:");
            System.out.println("1 - Add item to your list");
            System.out.println("2 - Check your list");
            System.out.println("3 - Edit your list");
            System.out.println("4 - Delete your item on your list");
            System.out.println("5 - Clear your list");
            System.out.println("X - (case-sensitive) To end");
            String numberToChoose = scanner.nextLine();

            if (numberToChoose.equals("1")) {
                lista.addToList();
            } else if (numberToChoose.equals("2")) {
                lista.printList();
            } else if (numberToChoose.equals("3")) {
                lista.editList();
            } else if (numberToChoose.equals("4")) {
                lista.removeFromList();
            } else if (numberToChoose.equals("5")) {
                lista.deleteList();
            } else if (numberToChoose.equals("X")) {
                break;
            }

        }

    }
}




