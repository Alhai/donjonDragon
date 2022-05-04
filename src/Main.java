import Heroes.Heroe;
import Heroes.Mage;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        int Quit = menu.quitGame();
        String testName = menu.getName();
        String nameTrueFalse = menu.nameIsTrue(testName);



        /*  Heroe Heroes = new Heroe("Francis", 9, 7);
        System.out.println(Heroes.getName());
        System.out.println(Heroes.getHp());
        System.out.println(Heroes.getLvlAttack());

        Heroe Heroes2 = new Heroe("Maurice", 5, 11);
        System.out.println(Heroes2.getName());
        System.out.println(Heroes2.getHp());
        System.out.println(Heroes2.getLvlAttack());

        Mage Mage = new Mage();.


*/
    }
}
