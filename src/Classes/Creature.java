package Classes;

import static java.lang.Integer.valueOf;

public abstract class Creature {
    private String name;
    private int attackBase;

    //Constructor
    public Creature(String name, int attackBase) {
        this.name = name;
        this.attackBase = attackBase;
    }

    public String getName() {
        return name;
    }

    public int getAttackBase() {
        return attackBase;
    }

    @Override
    public String toString() {
        return "My name is "+ name +". Attack base: " + attackBase + "\n";
    }
}
