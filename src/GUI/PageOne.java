package GUI;

import javax.swing.*;
import java.awt.*;

public class PageOne extends JPanel {
    private static JButton frontBtn;  //why need static?

    public PageOne(){
        //this.setBounds(400,0,800,800);
        this.setLayout(null);

        //title in 1st page
        JLabel programTitle = new JLabel("Welcome to Humans VS Pests!");
        programTitle.setBounds(150,50,500,50);
        programTitle.setFont(new Font("Segoe Script", Font.BOLD, 30));

        //image in 1st page
        JLabel programImage = new JLabel();
        programImage.setBounds(100,100,550,550);
        ImageIcon frontImage = new ImageIcon("src/Images/ftontPage.png");
        Image image = frontImage.getImage();
        Image newing = image.getScaledInstance(500,550,java.awt.Image.SCALE_SMOOTH);
        frontImage = new ImageIcon(newing);
        programImage.setIcon(frontImage);

        //button in 1st page
        frontBtn = new JButton("START!");
        frontBtn.setBounds(600,650,150,50);

        //Add all controls to Panel
        add(programTitle);
        add(programImage);
        add(frontBtn);
        setVisible(true);

    }

    public static JButton getFrontBtn() {return frontBtn;}  //getter for starter  //??why need static
}
