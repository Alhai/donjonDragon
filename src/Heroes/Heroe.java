package Heroes;

    // Attributes

public class Heroe {
    private String name;
    private int hp;
    private int lvlAttack;

    /* Constructors */
    public Heroe(String pName, int pHp, int plvlAttack){
        this.name = pName;
        this.hp = pHp;
        this.lvlAttack = plvlAttack;
    }

    public Heroe(String pName){
        this.name = pName;
    }

    // Methods

    // Accessors
    public int getHp(){
        return this.hp;
    }
    public String getName(){
        return this.name;
    }
    public int getLvlAttack(){
        return this.lvlAttack;
    }
}