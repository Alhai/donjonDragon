package Cases.Bonus;


import Cases.Interact;

public class Attack extends surpriseCrate implements Interact {

    private int attack;

    public String getName() {
        return this.name;
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


    @Override
    public String isInteract() {
        return "Oh une Arme !!";
    }
}
