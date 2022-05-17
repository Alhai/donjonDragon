import Heroes.Guerrier;
import Heroes.Heroe;
import Heroes.Mage;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Cette classe affiche et gere les Menus du jeu
 */
public class Menu {
        // Attributes
        private Scanner myObj;

        /**
         * Instancie le premier scanner de la classe
         */
        // Constructors
        public Menu() {
                this.myObj = new Scanner(System.in);
        }


        /**
         * Valide l'entree sur le jeu et sert de porte d'entree pour la creation d'un personnage.
         * @Println LesPrintsLn affiche l'instance de mon scanner
         * @return l'entree du scanner
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
         * Instancie une methode qui permet la creation d'un personnage
         * @Println LesPrintln affiche les choix possibles a rentrer sur le scanner
         * @choiceHero LeChoiceHero Attend le resultat pour choisir quel classe instancier
         * @return Les caracteristiques du personnage choisi
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
         * Permet d'apres le return du nouveau hero qui a etait instancier de pouvoir changer sont attribut nom
         * grace a un setter.
         * @param hero
         * @Println LesPrintln affiche les choix possibles a rentrer sur le scanner ou les interactions possibles
         * sur les menu.
         * @
         * @return le choix de l'utilisateur si il decide de changer le nom cela retourne les modifications
         */
        public String changeName(Heroe hero) {


                Scanner sc = new Scanner(System.in);
                System.out.println("Veux tu changer ton Nom ?");
                System.out.println("1. Non");
                System.out.println("2. Oui");
                ;
                System.out.println("3. Quitter le jeu");
                String choiceName = sc.nextLine();

                switch (choiceName) {
                        case "1":
                                System.out.println("Parfait ʘ‿ʘ ");
                                break;


                        case "2":
                                try {
                                        Scanner NoSc = new Scanner(System.in);
                                        System.out.println("Quoi (╬ ಠ益ಠ) ? t'aime rien toi");
                                        System.out.println("Modifie le nom et tape entrée, ce sera définitif cette fois");
                                        System.out.println("Les chiffres et caractères spéciaux ne sont pas possible");
                                        String nameChanged = NoSc.next("^[-a-zA-Z]+");
                                        hero.setName(nameChanged);
                                        System.out.println("Ton nouveau nom est " + nameChanged);
                                } catch (InputMismatchException e){
                                        System.out.println("Le nouveau nom n'est pas valide");
                                        return changeName(hero);

                                }

                                System.out.println("+----------------------------------+\n" +
                                        "|              Menu                |\n" +
                                        "+----------------------------------+");
                                System.out.println("1. Lancer la partie");
                                System.out.println("2. Infos héro");
                                System.out.println("3. Quitter le jeu");
                                String choiceMenu2 = sc.nextLine();
                                switch (choiceMenu2) {
                                        case "1":
                                                break;

                                        case "2":
                                                System.out.println(hero);
                                                return menuPrincipal(hero);

//

                                        case "3":
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
         * Menu qui affiche les choix possibles apres l'etape de creation d'un hero
         * @param hero
         * @Println LesPrintln affiche les choix possibles a rentrer sur le scanner ou les interactions possibles
         * sur les menu.
         * @mainMenu LeMainMenu Declaration d'une variable qui attend une entree sur le scanner
         * @Switch LeSwitch Apres l'entree scanner defini les conditions possibles et reagi en consequence
         * @return Le choix scanner qui a etait rentre
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
         * Affiche le resultat d'un lancement de de a chaque a tour de "jeu"
         * @cases Lecases affiche l'emplacement de depart d'un de
         * @max&Min LeMaxetMin sont les valeur possibles d'un lancer de de
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

        /**
         * Cette classe permet au joueur de choisir si il décide de recommencer une partie ou de quitter le jeu
         * @gameOver variable qui instancie le scanner qui permet a l utilisateur de faire son choix
         * @return le choix de l'utilisateur
         */
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