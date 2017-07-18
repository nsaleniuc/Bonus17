/**
 * Created by Nathan Saleniuc on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {
    private int spellNumber;

    public Wizard(String name, int strength, int intelligence, String magicalEnergy,
                  int magicalPower, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy, magicalPower);
        this.spellNumber = spellNumber;
    }

    public int getSpellNumber() {
        spellNumber = randomSpellNumber();
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    public void Play() {
        System.out.print("Wizard ");
        printName();
        printStrength();
        printIntelligence();
        printMagicalEnergy();
        printMagicalPower();
        printSpellNumber();
    }

    public void printSpellNumber() {
        System.out.println("Spell Number: " + getSpellNumber());
    }

}
