import Bonus.Epee;
import Bonus.Case;
import Bonus.Potion;
import Exceptions.myException;
import Monsters.Goblins;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Case> plateau;

    public Game(){
        plateau = new ArrayList<>();
        plateau.add();
    }
//    public ArrayList <Case> duJeu() {
//
//        ArrayList cases = new ArrayList<Case>();
//
//        cases.add(new caseVide());
//        cases.add(new Goblins());
//        cases.add(new Epee());
//        cases.add(new Potion());
//        return cases;
//    }
    /**
     * Affiche le resultat d'un lancement de de a chaque a tour de "jeu"
     * @cases Lecases affiche l'emplacement de depart d'un de
     * @max&Min LeMaxetMin sont les valeur possibles d'un lancer de de
     * @return
     */
    public int lancementDdeJeu() throws myException {
        int position = 0;
        int max = 2;
        int min = 1;
//                int range = max - min + 1;
        while (position < 64) {

            Scanner sc = new Scanner(System.in);
            String tourDeJeu = sc.nextLine();
            int random = (int) Math.ceil((Math.random() * (max - min)));
            System.out.println(random);
            position = position + random;

            try {

                if (position >= 64) {
                    throw new myException();

                }
            } catch (myException ex) {
                position  = 64;
                System.out.println(ex.getMessage());

            }
            System.out.println("Tu es à la case " + position);


        }

        return position;
    }

    public static void main(String[] args) {
        Game joue = new Game();
        joue.lancementDdeJeu ();
    }
    public int Case() throws myException {
        int positionHero = 0;


        if (positionHero == 0){
            positionHero = lancementDdeJeu();
            caseDuJeu.get(positionHero);

//           return positionHero;
        }
        return positionHero;
    }


}
