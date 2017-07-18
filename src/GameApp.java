import java.util.ArrayList;

/**
 * Created by Nathan Saleniuc on 7/17/2017.
 */
public class GameApp {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("", 0, 0, "");
        Warrior warrior2 = new Warrior("", 0, 0, "");
        MagicUsingCharacter magicCharacter = new MagicUsingCharacter("", 0, 0, "", 0);
        Wizard wizard1 = new Wizard("", 0, 0, "", 0, 0);
        Wizard wizard2 = new Wizard("", 0, 0, "", 0, 0);

        ArrayList<GameCharacter> gc = new ArrayList<>();
        gc.add(warrior1);
        gc.add(warrior2);
        gc.add(magicCharacter);
        gc.add(wizard1);
        gc.add(wizard2);


        for (GameCharacter list : gc) {
            list.Play();
            System.out.println();
        }
    }
}
