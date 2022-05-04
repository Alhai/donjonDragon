package Heroes;

public class Mage extends Heroe {
    // Attributes
    private String Sort;
    private String Philtre;
    // Constructors

    public Mage(String pName, String pSort, String pPhiltre){
        super(pName);
        this.Sort = pSort;
        this.Philtre = pPhiltre;
    }


    // Methods
    
    // Accessors
    public String getSort(){
        return this.Sort;
    }
    public String getPhiltre() {
        return this.Philtre;
    }
}
