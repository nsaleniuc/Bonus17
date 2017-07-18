import java.util.ArrayList;

/**
 * Created by Nathan Saleniuc on 7/17/2017.
 */
public class GameApp {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("", 0, 0, "");
        MagicUsingCharacter magicUsingCharacter = new MagicUsingCharacter("", 0, 0, "", 0);
        Wizard wizard = new Wizard("", 0, 0, "", 0, 0);
        ArrayList<GameCharacter> gc = new ArrayList<GameCharacter>();
        gc.add(warrior);
        gc.add(warrior);
        gc.add(magicUsingCharacter);
        gc.add(wizard);
        gc.add(wizard);

        for (GameCharacter list : gc) {
            list.Play();
            System.out.println();
        }
    }
}
