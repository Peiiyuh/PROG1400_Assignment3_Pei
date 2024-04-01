package Classes;

import javax.swing.*;

public class Mammals extends Pests{
    private boolean hasTail;
    private ImageIcon mamPic;

    //Constructor
    public Mammals(String name, int attackBase, int HP, String level, boolean hasTail) {
        super(name, attackBase, HP, level);
        this.hasTail = hasTail;
    }

    //Setter
    public void setMamPic(ImageIcon mamPic) {
        this.mamPic = mamPic;
    }

    @Override
    public String toString() {
        String tail = "";
        if(hasTail){
            tail= "a tail.";
        }
        else{
            tail="NO tail.";
        }
        return super.toString() + "I am a mammal and I have " + tail;
    }
}
