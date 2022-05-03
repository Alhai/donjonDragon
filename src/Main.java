import Heroes.Heroe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);

        Heroe Heroes = new Heroe("Francis",8,6);
        System.out.println(Heroes.getName());
        System.out.println(Heroes.getHp());
        System.out.println(Heroes.getLvlAttack());

        Heroe Heroes2 = new Heroe("Maurice",5,9);
        System.out.println(Heroes2.getName());
        System.out.println(Heroes2.getHp());
        System.out.println(Heroes2.getLvlAttack());
    }
}
