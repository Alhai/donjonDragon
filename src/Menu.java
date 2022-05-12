import Heroes.Guerrier;
import Heroes.Heroe;
import Heroes.Mage;
import org.w3c.dom.ls.LSOutput;

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


        /**
         * Valide l'entrée sur le jeu et sert de porte d'entrée pour la création d'un personnage.
         * @Println LesPrintsLn affiche l'instance de mon scanner
         * @return l'entrée du scanner
         */
        // Methods
        public String Start() {

                Scanner sc = new Scanner(System.in);
                System.out.println("Bienvenue vile gredin dans le donjon du dragon AbduRozik");
                System.out.println("Appuye entrée pour démarrer une nouvelle partie");
                String choiceStart = sc.nextLine();

                return choiceStart;
        }

        /**
         * Instancie une méthode qui permet la création d'un personnage
         * @Println LesPrintln affiche les choix possibles à rentrer sur le scanner
         * @choiceHero LeChoiceHero Attend le résultat pour choisir quel classe instancier
         * @return Les caractéristiques du personnage choisi
         */
        public Heroe createPerso() {
                Heroe hero;
                Scanner sc = new Scanner(System.in);
                System.out.println("Choisi t'as classe ");
                System.out.println("Appuye 1 pour être Guerrier");
                System.out.println("Appuye 2 pour être Mage");
                String choiceHero = sc.nextLine();


                switch (choiceHero) {
                        case "1":
                                hero = new Guerrier();
                                System.out.println("|\\             //\n" +
                                        " \\\\           _!_\n" +
                                        "  \\\\         /___\\\n" +
                                        "   \\\\        [+++]\n" +
                                        "    \\\\    _ _\\^^^/_ _\n" +
                                        "     \\\\/ (    '-'  ( )\n" +
                                        "     /( \\/ | {&}   / \\ \\ \1\\n" +
                                        "       \\  / \\     / _> )\n" +
                                        "        \"`   >:::;-'`\"\"'-.\n" +
                                        "            /:::/         \\\n" +
                                        "           /  /||   {&}   |\n" +
                                        "          (  / (\\         /\n" +
                                        "          / /   \\'-.___.-'\n" +
                                        "    hai _/ /     \\ \\\n" +
                                        "       /___|    /___|");
                                break;

                        case "2":
                                hero = new Mage();
                                System.out.println(
                                        "                         --:'''':--\n" +
                                                "                           :'_' :\n" +
                                                "                           _:\"\":\\___\n" +
                                                "            ' '      ____.' :::     '._\n" +
                                                "           . *=====<<=)           \\    :\n" +
                                                "            .  '      '-'-'\\_      /'._.'\n" +
                                                "                             \\====:_ \"\"\n" +
                                                "                            .'     \\\\\n" +
                                                "                           :       :\n" +
                                                "                          /   :    \\\n" +
                                                "                         :   .      '.\n" +
                                                "         ,. _            :  : :      :\n" +
                                                "      '-'    ).          :__:-:__.;--'\n" +
                                                "    (        '  )        '-'   '-'\n" +
                                                " ( -   .00.   - _\n" +
                                                "(    .'  _ )     )\n" +
                                                "'-  ()_.\\,\\,   -");
                                break;

                        default:
                                return createPerso();

                }
                return hero;
        }

        /**
         * Permet d'après le return du nouveau héro qui a était instancier de pouvoir changer sont attribut nom
         * grace à un setter.
         * @param hero
         * @Println LesPrintln affiche les choix possibles à rentrer sur le scanner ou les interactions possibles
         * sur les menu.
         * @
         * @return le choix de l'utilisateur si il décide de changer le nom celà retourne les modifications
         */
        public String changeName(Heroe hero) {


                Scanner sc = new Scanner(System.in);
                System.out.println("T'aimes ton prénom ?");
                System.out.println("1. Oui");
                System.out.println("2. Non");
                ;
                System.out.println("3. Quitter le jeu");
                String choiceName = sc.nextLine();

                switch (choiceName) {
                        case "1":
                                System.out.println("Parfait ʘ‿ʘ ");
                                break;


                        case "2":
                                try {
                                        
                                }
                                System.out.println("Quoi (╬ ಠ益ಠ) ? t'aime rien toi");
                                System.out.println("Modifie le nom et tape entrée, ce sera définitif cette fois");
                                String nameChanged = sc.nextLine();
                                hero.setName(nameChanged);
                                System.out.println("Ton nouveau nom est " + nameChanged);
                                System.out.println("+----------------------------------+\n" +
                                        "|              Menu                |\n" +
                                        "+----------------------------------+");
                                System.out.println("1. Lancer la partie");
                                System.out.println("2. Infos héro");
                                System.out.println("3. Changer ENCORE le nom");
                                System.out.println("4. Quitter le jeu");
                                String choiceMenu2 = sc.nextLine();
                                switch (choiceMenu2) {
                                        case "1":
                                                break;

                                        case "2":
                                                System.out.println(hero);
                                                break;

                                        case "3":
                                                hero.setName(nameChanged);
                                                break;

                                        case "4":
                                                System.exit(0);
                                                break;
                                }
                                break;
                        case "3":
                                System.exit(0);

                        default:
                                return changeName(hero);


                }
                return choiceName;
        }

        /**
         * Menu qui affiche les choix possibles après l'étape de création d'un héro
         * @param hero
         * @Println LesPrintln affiche les choix possibles à rentrer sur le scanner ou les interactions possibles
         * sur les menu.
         * @mainMenu LeMainMenu Déclaration d'une variable qui attend une entrée sur le scanner
         * @Switch LeSwitch Après l'entrée scanner défini les conditions possibles et réagi en conséquence
         * @return Le choix scanner qui à était rentré
         */
        public String menuPrincipal(Heroe hero) {
                Scanner sc = new Scanner(System.in);
                System.out.println("+----------------------------------+\n" +
                        "|              Menu                |\n" +
                        "+----------------------------------+");
                System.out.println("1. Lancer la partie");
                System.out.println("2. Infos héro");
                System.out.println("3. Quitter le jeu");
                String mainMenu = sc.nextLine();
                switch (mainMenu) {
                        case "1":
                                break;
                        case "2":
                                System.out.println(hero);
                                return menuPrincipal(hero);
                        case "3":
                                System.exit(0);
                        default:
                                return menuPrincipal(hero);

                }
                return mainMenu;
        }         // Accessors

        /**
         * Affiche le résultat d'un lancement de dé à chaque à tour de "jeu"
         * @cases Lecases affiche l'emplacement de depart d'un dé
         * @max&Min LeMax&Min sont les valeur possibles d'un lancer de dé
         *
         * @return
         */
        public int lancementDdeJeu() {
                int cases = 0;
                int max = 7;
                int min = 1;
//                int range = max - min + 1;
                while ( cases < 64){
                        cases++;
                        Scanner sc = new Scanner(System.in);
                        String tourDeJeu = sc.nextLine();
                        int random = (int)Math.ceil((Math.random() * (max - min) ));
                        System.out.println(random);
                        cases = cases + random;

                       if (cases > 64){
                                cases = 64;
                               System.out.println("Tu as gagné");

                       }
                        System.out.println("Tu es à la case " + cases);
                }
                return cases;
        }
                                public String menuEnd(){

                                        System.out.println("+----------------------------------+\n" +
                                                "|       Recommencer une Partie     |\n" +
                                                "+----------------------------------+");
                                        System.out.println("+----------------------------------+\n" +
                                                "|           Quitter le jeu         |\n" +
                                                "+----------------------------------+");
                                        System.out.println("Appuyez sur 1 pour recommencer et 2 pour quitter le jeu");
                                        Scanner sc = new Scanner(System.in);
                                        String gameOver = sc.nextLine();
                                        switch (gameOver){
                                                case "1":
                                                        System.out.println("Une nouvelle partie cool");
                                                        return "restart";

                                                case "2": System.exit(0);
                                                        break;
                                                default: return menuEnd();
                                        }
                                        return gameOver;
                                }
}