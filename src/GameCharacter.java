/**
 * Created by Nathan Saleniuc on 7/17/2017.
 */
public abstract class GameCharacter {
    private String name;
    private int Strength;
    private int intelligence;

    public abstract void printName();

    public abstract void printStrength();

    public abstract void printIntelligence();

    public void Play() {
        printName();
        printStrength();
        printIntelligence();
    }

    public GameCharacter(String name, int strength, int intelligence) {
        this.name = name;
        Strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        name = randomNameSelection();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        Strength = randomStrength();
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getIntelligence() {
        intelligence = randomIntelligence();
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public static String randomNameSelection() {
        int rand = (int) (Math.random() * 10 + 1);
        switch (rand) {
            case 1:
                return "Crazy Phil";
            case 2:
                return "Pauly";
            case 3:
                return "Edwin";
            case 4:
                return "Freddy";
            case 5:
                return "Frank";
            case 6:
                return "Bobby";
            case 7:
                return "Gordon";
            case 8:
                return "Simon";
            case 9:
                return "Ramsay";
            case 10:
                return "Cameron";
        }
        return "Something has gone awry";
    }
    public static int randomStrength() {
        int randStrength = 60 + (int) (Math.random() * 20);
        return randStrength;
    }

    public static int randomIntelligence() {
        int randIntelligence = 65 + (int) (Math.random() * 35 + 1);
        return randIntelligence;
    }

    public static String randomWeaponType() {
        int rand = (int) (Math.random() * 6 + 1);
        switch (rand) {
            case 1:
                return "Sword";
            case 2:
                return "Mace";
            case 3:
                return "Crossbow";
            case 4:
                return "Shield";
            case 5:
                return "Knife";
            case 6:
                return "Battle axe";
        }
        return "you've messed up";
    }
    public static String randomMagicalEnergy() {
        int rand = (int) (Math.random() * 6 + 1);
        switch (rand) {
            case 1:
                return "Force-field generation";
            case 2:
                return "Healing";
            case 3:
                return "Flight";
            case 4:
                return "Telekinesis";
            case 5:
                return "Invisibility";
            case 6:
                return "Shape shifting";
        }
        return "you messed up";
    }

    public static int randomMagicalPower() {
        int randMagicalPower = 60 + (int) (Math.random() * 40 + 1);
        return randMagicalPower;
    }
    public static int randomSpellNumber() {
        int randSpell = (int) (Math.random() * 10 + 1);
        return randSpell;
    }

}