package Bonus;

public class Attack {
    private String name;
    private int attack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Attack(String pName, int pAttack){
        this.name = pName;
        this.attack = pAttack;


    }
}
