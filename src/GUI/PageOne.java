package GUI;

import javax.swing.*;
import java.awt.*;

public class PageOne extends JPanel {
    private JButton frontBtn;

    public PageOne(){
        //Set Panel Properties
        this.setLayout(null);
        this.setVisible(true);

        //Font
        Font myFont = new Font("Calibri", Font.BOLD, 20);

        //title in 1st page
        JLabel programTitle = new JLabel("Welcome to Humans VS Pests!");
        programTitle.setBounds(150,50,500,50);
        programTitle.setFont(new Font("Segoe Script", Font.BOLD, 30));

        //image in 1st page
        JLabel programImage = new JLabel();
        programImage.setBounds(100,150,550,550);
        ImageIcon frontImage = new ImageIcon("src/Images/ftontPage.png");
        Image image = frontImage.getImage();
        Image newing = image.getScaledInstance(500,550,java.awt.Image.SCALE_SMOOTH);
        frontImage = new ImageIcon(newing);
        programImage.setIcon(frontImage);

        //button in 1st page
        frontBtn = new JButton("START!");
        frontBtn.setFont(myFont);
        frontBtn.setBounds(625,700,150,50);

        //Add all controls to Panel
        add(programTitle);
        add(programImage);
        add(frontBtn);
    }

    public JButton getFrontBtn() {return frontBtn;}  //getter for frontBtn
}
