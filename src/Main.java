import Exceptions.myException;
import Heroes.Heroe;
import Heroes.Mage;
import Bonus.Case;
import java.util.ArrayList;


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
//  do {

        Menu menu = new Menu();
        String begin = menu.Start();
        System.out.println(begin);
        Heroe hiro = menu.createPerso();
        System.out.println(hiro);
        String choiceName = menu.changeName(hiro);
        System.out.println(choiceName);
        Game game = new Game();
        String chant = hiro.criDeGuerre();
        System.out.println(chant);
        int lanceLeJeu = game.Case();
        System.out.println(lanceLeJeu);
        try {
            int LancerdeD = game.lancementDdeJeu();
            System.out.println(LancerdeD);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
//      Over = menu.menuEnd();
//      System.out.println(Over);
//  } while (Over == "restart");

    }
}
