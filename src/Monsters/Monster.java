package Monsters;

import Cases.Case;

public class Monster extends Case {
    // attributes
    private String name;
    private int vie;
    private int attaque;

    // constructors
    public Monster(String pName, int pVie, int pAttaque){
        this.name = pName;
        this.vie = pVie;
        this.attaque = pAttaque;
    }


    // methods

    // accessors


    public int getVie() {
        return vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }
}
