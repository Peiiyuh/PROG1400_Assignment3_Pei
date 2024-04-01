package Classes;

import javax.swing.*;

public class Insects extends Pests{
    private static boolean canFly;
    private ImageIcon insPic;

    //Constructor
    public Insects(String name, int attackBase, int HP, String level, boolean canFly, ImageIcon insPic) {
        super(name, attackBase, HP, level);
        this.canFly = canFly;
        this.insPic = insPic;
    }

    public ImageIcon getInsPic() {
        return insPic;
    }

    @Override
    public String toString() {
        String fly = "";
        if(canFly){
            fly = "fly.";
        }
        else{
            fly = "NOT fly.";
        }
        return super.toString() + "I am an insect and I can " + fly;
    }
}
