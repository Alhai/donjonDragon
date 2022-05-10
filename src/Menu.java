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

                        default:hero = new Guerrier();

                }
                return  hero;
        }

        public String changeName(Heroe hero){

                Scanner sc = new Scanner(System.in);
                System.out.println("T'aimes ton prénom ?");
                System.out.println("1. Oui");
                System.out.println("2. Non");;
                System.out.println("3. Quitter le jeu");
                String choiceName = sc.nextLine();

                switch (choiceName){
                        case "1" :
                                System.out.println( "Parfait ʘ‿ʘ " );
                                break;


                        case "2" :
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
                                switch (choiceMenu2){
                                        case "1":
                                        break;

                                        case "2": System.out.println(hero);
                                        break;

                                        case "3": hero.setName(nameChanged);
                                        break;

                                        case "4": System.exit(0);
                                        break;
                                }
                                break;
                        case "3":
                                System.exit(0);

                        default:
                                return changeName(hero);


                }       return choiceName;
        }

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


                }