package Classes;

import javax.swing.*;

public class Human extends Creature{
    private int IQ;
    private ImageIcon humanPic;
    private Tools tool;

    //Constructor
    public Human(String name, int attackBase, int IQ, ImageIcon humanPic, Tools tool) {
        super(name, attackBase);
        this.IQ = IQ;
        this.humanPic = humanPic;
        this.tool = tool;
    }

    //Getter
    public int getIQ() {
        return IQ;
    }
    public ImageIcon getHumanPic() {
        return humanPic;
    }

    //Setter
    public Human setTool(Tools tool) {
        this.tool = tool;
        return this;
    }

    @Override
    public String toString() {
        return "My name is " + super.getName() + ", my attack base is " + super.getAttackBase() + ", and my IQ is " + IQ +
                ".\n\nHere is the tool I choose...\n" + this.tool.toString() + "\n";
    }
}
