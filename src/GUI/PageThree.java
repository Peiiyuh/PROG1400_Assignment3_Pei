package GUI;

import Classes.Creature;
import Classes.Human;
import Classes.Insects;

import java.awt.Font;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.*;

public class PageThree extends JPanel {
    private JTextArea reportText;
    private JButton restartBtn;
    public PageThree(){
        //Set Panel Properties
        this.setLayout(null);
        setVisible(true);

        //Font
        Font myFont = new Font("Calibri", Font.BOLD, 20);

        //title in 3rd page
        JLabel programTitle = new JLabel("Summary of the Report!");
        programTitle.setBounds(200,50,400,50);
        programTitle.setFont(new Font("Segoe Script", Font.BOLD, 30));

        //textarea in 3rd page
        reportText = new JTextArea();
        reportText.setBounds(100,125,550,500);
        reportText.setFont(myFont);
        reportText.setLineWrap(true);
        reportText.setEnabled(false);
        reportText.setWrapStyleWord(true);

        //restart button in 3rd page
        restartBtn = new JButton("RESTART!");
        restartBtn.setFont(myFont);
        restartBtn.setBounds(300,650,150,50);

        //Add all controls to Panel
        add(programTitle);
        add(reportText);
        add(restartBtn);
    }

    public JButton getRestartBtn() {return restartBtn;} //getter for restartBtn

    public void displayReport() {
        ArrayList<Human> human = MainFrame.humanList;
        String text ="";
        text = human.toString();
        reportText.setText(text);
    }

}