package Classes;

public class Pests extends Creature {
    private int HP;
    private String level;

    //Constructor
    public Pests(String name, int attackBase, int HP, String level) {
        super(name, attackBase);
        this.HP = HP;
        this.level = level;
    }

    public int getHP() {
        return HP;
    }
    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return super.toString() + "HP: "+ HP + "\n" + "Level: " + level + "\n";
    }
}
