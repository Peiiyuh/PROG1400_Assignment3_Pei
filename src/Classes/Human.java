package Classes;

import javax.swing.*;

public class Human extends Creature{
    private int IQ;
    private ImageIcon humanPic;

    //Constructor
    public Human(String name, int attackBase, int IQ, ImageIcon humanPic) {
        super(name, attackBase);
        this.IQ = IQ;
        this.humanPic = humanPic;
    }

    public int getIQ() {
        return IQ;
    }
    public ImageIcon getHumanPic() {
        return humanPic;
    }

    @Override
    public String toString() {
        return "My name is " + super.getName() + ", my attack base is " + super.getAttackBase() + ", and my IQ is " + IQ;
    }
}
