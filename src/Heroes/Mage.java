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
        return this.getName();
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
