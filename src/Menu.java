import Heroes.Heroe;

import java.util.Scanner;

public class Menu {
        // Attributes
        private Scanner myObj;

        // Constructors
        public Menu() {
                this.myObj = new Scanner(System.in);  // Create a Scanner object
        }


        // Methods

        public int displayFirstMenu() {
                System.out.println("1. Créer un nouveau héro");
                System.out.println("2. Quitter le jeu");


                int quitGame = myObj.nextInt();
                if (quitGame == 1){

                }
                else if (quitGame == 2) System.exit(0);

                return quitGame;
                }

        }



        public String getName() {
                System.out.println("Entre ton nom ");

                String userName = myObj.nextLine();  // Read user input
                System.out.println("Oh" + userName + "c'est le même nom que mon animal de companie ");
                return userName;

        }

        public String nameIsTrue(String testName) {

                System.out.println(testName + " Est-ce ton nom ?");
                String ConfirmName = myObj.nextLine();

                if (testName == "yes") {
                        System.out.println( " AHAHAH ok !");
                }
                return ConfirmName;
        }
}
        // Accessors


