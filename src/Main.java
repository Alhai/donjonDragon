import Heroes.Heroe;
import Heroes.Mage;

public class Main {

    public static void main(String[] args) {

//        String testName = menu.getName();
//        String nameTrueFalse = menu.nameIsTrue(testName);
        Menu menu = new Menu();
        String begin = menu.Start();
        System.out.println(begin);
        Heroe hiro = menu.createPerso();
        System.out.println(hiro);
        String choiceName = menu.changeName();
        System.out.println(choiceName);

        //Menu général ( Lancer partie, infos, modifier )
       // menu.parametres(h);

        //Commence le jeu ici
        // While()





//        Heroe Heroes = new Heroe("Francis", 9, 7);
//        System.out.println(Heroes.getName());
//        System.out.println(Heroes.getHp());
//        System.out.println(Heroes.getLvlAttack());
//
//        Heroe Heroes2 = new Heroe("Maurice", 5, 11);
//        System.out.println(Heroes2.getName());
//        System.out.println(Heroes2.getHp());
//        System.out.println(Heroes2.getLvlAttack());





    }
}
