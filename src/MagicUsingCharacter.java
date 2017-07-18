import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter {
    static Scanner scan = new Scanner(System.in);

    private String magicalEnergy;
    private int magicalPower;

    public MagicUsingCharacter(String name, int strength, int intelligence,
                               String magicalEnergy, int magicalPower) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
        this.magicalPower = magicalPower;
    }

    public int getMagicalPower() {
        magicalPower = randomMagicalPower();
        return magicalPower;
    }

    public void setMagicalPower(int magicalPower) {
        this.magicalPower = magicalPower;
    }

    public String getMagicalEnergy() {
        magicalEnergy = randomMagicalEnergy();
        return magicalEnergy;
    }

    public void setMagicalEnergy(String magicalEnergy) {

        this.magicalEnergy = magicalEnergy;
    }

    public void Play() {
        System.out.print("Magical Character ");
        printName();
        printStrength();
        printIntelligence();
        printMagicalEnergy();
        printMagicalPower();
    }

    @Override
    public void printName() {
        System.out.println("Name: " + randomNameSelection());
    }
    @Override
    public void printStrength() {
        System.out.println("Strength: " + getStrength());
    }
    @Override
    public void printIntelligence() {
        System.out.println("Intelligence: " + getIntelligence());
    }
    public void printMagicalEnergy() {
        System.out.println("Magical Energy: " + getMagicalEnergy());
    }
    public void printMagicalPower() {
        System.out.println("Magical Power: " + getMagicalPower());
    }

}
