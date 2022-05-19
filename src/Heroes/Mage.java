package Heroes;


public class Mage extends Heroe {

    // Attributes
    private String Sort;
    // Constructors

    public Mage(String pName){
        super(pName);
    }
    public Mage(){
       super("Froz", 4 , 9,6,15);


    }
    // Methods
    @Override
    public String criDeGuerre() {

        return "euh j'envoi des boule de feu ! (●´ω｀●) ";
    }
    @Override
    public String toString() {
        return "Jeune Mage " + "\n" +"Nom : " + this.getName() + "\n" + "Point de Vie : "+ this.getHp() + "\n" + "Attaque Physique : " + this.getLvlAttack();
    }

    // Accessors
    public String getSort(){
        return this.Sort;
    }


    public void setSort(String sort) {
        Sort = sort;
    }

}

