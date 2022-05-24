import Cases.Bonus.Eclair;
import Cases.Bonus.Epee;
import Cases.Bonus.Potion;
import Cases.Case;
import Cases.Ennemies.Dragons;
import Cases.Ennemies.Goblins;
import Cases.EmptyCase;
import Cases.Ennemies.Witchers;
import Cases.Interact;
import Exceptions.myException;
import Heroes.Heroe;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.function.Supplier;

public class Game extends Case {
    private int position;
    ArrayList<Case> plateau = new ArrayList<>();


    public Game() {
        position = 0;
        Case caseVide = new EmptyCase();
        Goblins goblin = new Goblins();
        Epee exca = new Epee();
        Potion potion = new Potion();
        plateau.add(caseVide);
        plateau.add(goblin);
        plateau.add(exca);
        plateau.add(potion);

        System.out.println(plateau.get(3));
    }

    public List generateBoard() {
        Map<Supplier<Case>, Integer> possibleTiles = new HashMap<>();
        possibleTiles.put(Epee::new, 4);
        possibleTiles.put(Dragons::new, 4);
        possibleTiles.put(Witchers::new, 10);
        possibleTiles.put(Goblins::new, 10);
        possibleTiles.put(Eclair::new, 2);
        possibleTiles.put(Potion::new, 6);
        possibleTiles.put(EmptyCase::new, 16);
        possibleTiles.put(EmptyCase::new, 8);
        for (Map.Entry<Supplier<Case>, Integer> entry : possibleTiles.entrySet()) {
            int value = entry.getValue();
            for (int i = 0; i < value; i++) {
                Case key = entry.getKey().get();
                plateau.add(key);
            }
        }
        System.out.println(plateau);
        Collections.shuffle(plateau);
        return plateau;
    }
    /**
     * Methodes qui fait l'action de lancer un de allant de 1 jusqu'à 6
     *
     * @return la valeur du de
     */
    public int lancerleD() {
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
    public void calculPosition(int random) {
        this.position = this.position + random;
    }
    /**
     * Affiche les position de notre dé et celle sur notre plateau
     *
     * @param random
     */
    public void affichePosition(int random) {
        System.out.println("le dé :" + random);
        System.out.println("ma position est :" + this.position);
    }

    /**
     * Un tour de jeu complet
     *
     * @return la nouvelle position de mon de
     */
    public int tourDeJeu() {
        int unlancer = lancerleD();
        calculPosition(unlancer);
        return unlancer;
    }

    public int UneGame() throws myException {
        this.position = tourDeJeu();

        while (this.position < 64) {
            Scanner sc = new Scanner(System.in);
            String tourdejeu = sc.nextLine();
            int lancerdeD = tourDeJeu();
            affichePosition(lancerdeD);

            if (position >= 64) {

                throw new myException();
            } if ( plateau.get(this.position) instanceof Interact){
                System.out.println(plateau.get(this.position).getName() +" : nom");
                ((Interact) plateau.get(this.position)).isInteract();
            }else  {
                System.out.println("evenement = " + plateau.get(this.position));
            }
        }
        return this.position;
    }

    public int startGame( ) {
        generateBoard();
        try {
            UneGame();

        } catch (myException zi) {
            System.out.println(zi.getMessage());
        }
        return this.position;

    }

    // Constructors
    public int getPosition() {
        return this.position;
    }
}
