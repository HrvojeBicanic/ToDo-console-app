package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Goran",  "novasifra"));
        users.add(new User("GLMafija", "novasifra1"));
        users.add(new User("DirektorSvemira", "novasifra2"));



        while (true) {
            System.out.println("Enter username:");
            String userName = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            Boolean isAuthenticated = false;
            for (User user: users) {
                if (userName.equals(user.getUserName()) && password.equals(user.getPassword())){
                    System.out.println("Welcome " + userName);
                    isAuthenticated = true;
                    break;
                }
            }
            if (isAuthenticated == true) {// moze i ovaj oblik if(isAuthenticated)

                break;
            }
            else {
                System.out.println("Wrong username or password!");
            }
        }




        ArrayList<String> list = new ArrayList<>();

        ToDoList lista = new ToDoList(list, scanner);

        label:
        while(true) {
            System.out.println("What you want to do:");
            System.out.println("1 - Add item to your list");
            System.out.println("2 - Check your list");
            System.out.println("3 - Edit your list");
            System.out.println("4 - Delete your item on your list");
            System.out.println("5 - Clear your list");
            System.out.println("X - (case-sensitive) To end");
            String numberToChoose = scanner.nextLine();

            switch (numberToChoose) {
                case "1":
                    lista.addToList();
                    break;
                case "2":
                    lista.printList();
                    break;
                case "3":
                    lista.editList();
                    break;
                case "4":
                    lista.removeFromList();
                    break;
                case "5":
                    lista.deleteList();
                    break;
                case "X":
                    break label;
            }

        }

    }
}




