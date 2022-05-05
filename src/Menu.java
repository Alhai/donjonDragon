import Heroes.Guerrier;
import Heroes.Heroe;
import Heroes.Mage;

import java.util.Scanner;

public class Menu {
        // Attributes
        private Scanner myObj;

        // Constructors
        public Menu() {
                this.myObj = new Scanner(System.in);  // Create a Scanner object
        }



        // Methods

        public Heroe createPerso() {
                Heroe heroes ;
                Scanner sc = new Scanner(System.in);
                System.out.println("Choisi t'as classe ");
                System.out.println("Appuye 1 pour être Guerrier");
                System.out.println("Appuye 2 pour être Mage");
                String choiceHero = sc.nextLine();


                switch (choiceHero){
                        case "1":
                                 heroes = new Guerrier();
                                 break;

                        case "2":
                                heroes = new Mage();
                                break;

                        default:heroes = new Guerrier();

                }
                return  heroes;
        }





        // Menu création choix classe héro



        // Accessors


}