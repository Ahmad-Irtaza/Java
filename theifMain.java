import java.util.Scanner;
class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void attack() {
    }
}

class Warrior extends Character {
    private int strength;

    public Warrior(String name, int strength) {
        super(name);
        this.strength = strength;
    }

    public void attack() {
        System.out.println(name + " attacks with strength " + strength);
    }
}

class Mage extends Character {
    private int inteligence;

    public Mage(String name, int inteligence) {
        super(name);
        this.inteligence = inteligence;
    }

    public void attack() {
        System.out.println(name + " attacks with inteligence " + inteligence);
    }
}

class Thief extends Character {
    private int agility;

    public Thief(String name, int agility) {
        super(name);
        this.agility = agility;
    }

    public void attack() {
        System.out.println(name + " attacks with agility " + agility);
    }
}
public class theifMain {
    public static void main(String[] args) {
        Character warrior = new Warrior("Imran khan", 200);
        Character mage = new Mage("Hafiz", 30);
        Character thief = new Thief("Mian g", 25);

        warrior.attack();
        mage.attack();
        thief.attack();
    }
}
