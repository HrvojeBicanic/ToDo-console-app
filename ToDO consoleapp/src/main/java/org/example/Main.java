package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //main menu?
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("What you want to do:");
            System.out.println("1 - Add item to your list");
            System.out.println("2 - Check your list");
            System.out.println("3 - Edit your list");
            System.out.println("4 - Delete your item on your list"); // ubaci upozerenje u metodu prije odabira: zelis li obrisati item: da /ne
            System.out.println("5 - Clear your list"); // stavi upozerenje u metodi zelis li obrisati sve s liste i ponudi da ne opciju
            System.out.println("X - (case-sensitive) To end");
            String numberToChoose = scanner.nextLine();

            if (numberToChoose.equals("1")) {
                addToList(scanner, list);
                continue;
            } else if (numberToChoose.equals("2")) {
                System.out.println("Your list:");
                printList(list);
            } else if (numberToChoose.equals("3")) {

            } else if (numberToChoose.equals("4")) {
                removeFromItemList(scanner, list);
            } else if (numberToChoose.equals("5")) {
                deleteList(scanner, list);
            } else if (numberToChoose.equals("X")) {
                break;
            } else {
                System.out.println("Wrong input!");
                continue;
            }
        }


    }

    //Dodajem iteme u listu, ako je unos prazan metoda se prekida
    public static void addToList(Scanner scanner, ArrayList<String> list) {

        System.out.println("Add task:");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            return;
        }
        list.add(input);
        System.out.println(input + " added.");
        System.out.println("");

    }

    //izlistava iteme
    public static void printList(ArrayList<String> list) {

        if (list.isEmpty()) {
            System.out.println("Your list is empty!");
            System.out.println("");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ") " + list.get(i));
        }
        System.out.println("");
    }

    //dodaje mogucnost mjenjanja vec dodanih itema na listi
    public static void editItemList() {

    }

    // briše određeni item s liste
    public static void removeFromItemList(Scanner scanner, ArrayList<String> list) {
        System.out.println("Which task you want to delete? (Choose number)");
        printList(list);
        int input = Integer.valueOf(scanner.nextLine());
            list.remove(input - 1);

        System.out.println("Task number " + input + " has been removed." );

    }

    public static void deleteList(Scanner scanner, ArrayList<String> list) {
        System.out.println("Are you sure you want to delete whole list? This action can't be undone!");
        String choose = scanner.nextLine();
        if (choose.equalsIgnoreCase("yes")) {
            list.clear();
        } else {
            System.out.println("Wrong input!");
        }
    }
}




