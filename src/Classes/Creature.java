package Classes;

public abstract class Creature {
    private String name;
    private int attackBase;

    //Constructor
    public Creature(String name, int attackBase) {
        this.name = name;
        this.attackBase = attackBase;
    }

    //Getter
    public String getName() {
        return name;
    }
    public int getAttackBase() {
        return attackBase;
    }
    public Creature setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "My name is "+ name +". Attack base: " + attackBase + "\n";
    }
}
