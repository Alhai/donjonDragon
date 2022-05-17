import Exceptions.myException;
import Heroes.Heroe;
import Heroes.Mage;

public class Main {

    /**
     * Appel les méthodes qui sont instanciées dans ma classe menu et les affiches dans un scanner
     * @param args
     * @author Aly HAIDARA
     *
     */
public static void main(String[] args) throws myException {

//        String testName = menu.getName();
//        String nameTrueFalse = menu.nameIsTrue(testName);
    String Over = "";
  do {
      Menu menu = new Menu();
      String begin = menu.Start();
      System.out.println(begin);
      Heroe hiro = menu.createPerso();
      System.out.println(hiro);
      String choiceName = menu.changeName(hiro);
      System.out.println(choiceName);
      int LancerdeD = menu.lancementDdeJeu();
      System.out.println(LancerdeD);
      Over = menu.menuEnd();
      System.out.println(Over);
  } while (Over == "restart");





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
