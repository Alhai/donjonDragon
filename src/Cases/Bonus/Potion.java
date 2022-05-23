package Cases.Bonus;

import Cases.Interact;

public class Potion extends surpriseCrate  implements Interact {
    private String name;
    private int vie;

    public Potion(){
        this.name = "potion Standard";
        this.vie = 2;

    }

    @Override
    public void isInteract() {

    }
}
