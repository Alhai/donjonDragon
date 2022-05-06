package Heroes;

public class Mage extends Heroe {
    // Attributes
    private String Classe;
    private String Sort;
    private String Philtre;
    // Constructors

    public Mage(String pName,String pClass, String pSort, String pPhiltre){
        super(pName);
        this.Classe = pClass;
    }
    public Mage(){
        super("Froz");

    }

    // Methods
    @Override
    public String toString() {
        return "Bienvenue jeune Mage " + "\n" +"Caractéristiques :"+ "\n" +"Nom : " + this.getName() + "\n" + "Point de Vie : "+ this.getHp() + "\n" + "Attaque Physique : " + this.getLvlAttack();
    }

    // Accessors
    public String getClasse(){return this.Classe;}
    public String getSort(){
        return this.Sort;
    }
    public String getPhiltre() {
        return this.Philtre;
    }
}
