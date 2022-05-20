import Cases.Bonus.Epee;
import Cases.Bonus.Potion;
import Cases.Case;
import Cases.Ennemies.goblins;
import Cases.emptyCase;
import Exceptions.myException;

import java.util.ArrayList;
import java.util.Scanner;

public class Game extends Case {
    private int position;
    ArrayList<Case> plateau = new ArrayList<>();


    public Game() {
        position = 0;
        Case caseVide = new emptyCase();
        goblins goblin = new goblins();
        Epee exca = new Epee();
        Potion potion = new Potion();
        plateau.add(caseVide);
        plateau.add(goblin);
        plateau.add(exca);
        plateau.add(potion);
    }
//    public ArrayList <Goblins.Case> duJeu() {
//
//        ArrayList cases = new ArrayList<Monsters.Goblins.Case>();
//
//        cases.add(new caseVide());
//        cases.add(new Goblins());
//        cases.add(new Epee());
//        cases.add(new Potion());
//        return cases;
//    }

    /**
     * Affiche le resultat d'un lancement de de a chaque a tour de "jeu"
     *
     * @return
     * @cases Lecases affiche l'emplacement de depart d'un de
     * @max&Min LeMaxetMin sont les valeur possibles d'un lancer de de
     */
//    public void lancementDdeJeu() throws myException {
//        int max = 2;
//        int min = 1;
////                int range = max - min + 1;
//        while (this.position < 64) {
//
//            Scanner sc = new Scanner(System.in);
//            String tourDeJeu = sc.nextLine();
//            int random = (int) Math.ceil((Math.random() * (max - min)));
//            System.out.println(random);
//            position = position + random;
//
////            try {
////
////                if (position >= 64) {
////                    throw new myException();
////
////                }
////            } catch (myException ex) {
////                position  = 64;
////                System.out.println(ex.getMessage());
////
////            }
////            System.out.println("Tu es à la case " + position);
////
////        }
//
//        }


//
//    public int positionHero () throws myException {
//        int posHero = lancementDdeJeu(position);
//        System.out.println(posHero);
//
//        return posHero;
//    }

    }

    /**
     * Methodes qui fait l'action de lancer un de allant de 1 jusqu'à 6
     * @return la valeur du de
     */
    public int lancerleD(){
        int max = 7;
        int min = 1;
        int random = (int) Math.ceil((Math.random() * (max - min)));
        System.out.println(random);
        return random;
    }

    /**
     * Methode qui récupère la valeur de notre de pour calculer la position sur notre plateau de jeu
     *
     * @param random valeur de notre de
     * @return
     */
    public int calculPosition(int random){
        this.position = this.position + random;

        return this.position;
    }



    /**
     * Affiche les position de notre dé et celle sur notre plateau
     * @param random
     */
    public void affichePosition(int random){
        System.out.println("le dé :" + random);
        System.out.println("ma position est :" + this.position);
    }

    /**
     * Un tour de jeu complet
     * @return la nouvelle position de mon de
     */
    public int tourDeJeu(){
       int unlancer = lancerleD();
       int resultatDuD = calculPosition(unlancer);
       return resultatDuD;

    }
    // Constructors
    public int getPosition() {
        return this.position;
    }
}
