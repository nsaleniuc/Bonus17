/**
 * Created by Nathan Saleniuc on 7/17/2017.
 */
public class Warrior extends GameCharacter {
    private String weaponType;

    public String getWeaponType() {
        weaponType = randomWeaponType();
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

    @Override
    public void printName() {
        System.out.println("Name: " + getName());
    }

    @Override
    public void printStrength() {
        System.out.println("Strength: " + getStrength());
    }
    @Override
    public void printIntelligence() {
        System.out.println("Intelligence: " + getIntelligence());
    }
    public void printWeaponType() {
        System.out.println("Weapon Type: " + getWeaponType());
    }
    public void Play() {
        System.out.print("Warrior ");
        printName();
        printStrength();
        printIntelligence();
        printWeaponType();
    }
}
