package Bonus;

public class Popo {
    private String name;
    private int vie;

    public Popo (String pName, int pVie){
        this.name = pName;
        this.vie = pVie;
    }
    public Popo (String pName){
       this.name =  "Grande Potion";
       this.vie = 5;

    }
    public Popo (){
        this.name =  "potion Standard";
        this.vie = 2;

    }

}
