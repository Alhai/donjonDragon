package Cases.Ennemies;

import Cases.Case;

public class monsters extends Case {
    // attributes

    private int vie;
    private int attaque;

    // constructors
    public monsters( int pVie, int pAttaque) {

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



    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }
}
