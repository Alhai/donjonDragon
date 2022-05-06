import Heroes.Guerrier;
import Heroes.Heroe;
import Heroes.Mage;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {
        // Attributes
        private Scanner myObj;

        // Constructors
        public Menu() {
                this.myObj = new Scanner(System.in);  // Create a Scanner object
        }



        // Methods
        public String Start(){

                Scanner sc = new Scanner(System.in);
                System.out.println("Bienvenue vile gredin dans le donjon du dragon AbduRozik");
                System.out.println("Appuye entrée pour démarrer une nouvelle partie");
                String choiceStart = sc.nextLine();

                return choiceStart;
        }
        public Heroe createPerso() {
                Heroe hero ;
                Scanner sc = new Scanner(System.in);
                System.out.println("Choisi t'as classe ");
                System.out.println("Appuye 1 pour être Guerrier");
                System.out.println("Appuye 2 pour être Mage");
                String choiceHero = sc.nextLine();


                switch (choiceHero){
                        case "1":
                                 hero = new Guerrier();
                                 break;

                        case "2":
                                hero = new Mage();
                                break;

                        default:hero = new Guerrier();

                }
                return  hero;
        }

        public String changeName(){
                Heroe hero ;
                Scanner sc = new Scanner(System.in);
                System.out.println("T'aime ton prénom ?");
                System.out.println("1. Oui");
                System.out.println("2. Non");;
                String choiceName = sc.nextLine();
                return choiceName;
        }





        // Menu création choix classe héro



        // Accessors


}