package Heroes;

    // Attributes


public abstract class Heroe {
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
        this(pName, 8, 7);
    }

    public Heroe(){
        this ("Gerome");
//
    }

    // Methods
    public abstract String presentation();

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

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLvlAttack(int lvlAttack) {
        this.lvlAttack = lvlAttack;

    }
}