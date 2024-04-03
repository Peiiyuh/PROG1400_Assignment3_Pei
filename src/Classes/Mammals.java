package Classes;

import javax.swing.*;

public class Mammals extends Pests{
    private boolean hasTail;
    private ImageIcon mamPic;

    //Constructor
    public Mammals(String name, int attackBase, int HP, String level, boolean hasTail, ImageIcon mamPic) {
        super(name, attackBase, HP, level);
        this.hasTail = hasTail;
        this.mamPic = mamPic;
    }

    //Getter
    public ImageIcon getMamPic() {
        return mamPic;
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
