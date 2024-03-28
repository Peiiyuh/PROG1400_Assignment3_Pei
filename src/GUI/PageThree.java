package GUI;

import javax.swing.*;
import java.awt.*;

public class PageThree extends JPanel {
    private JTextArea reportText;
    private JButton restartBtn;
    public PageThree(){
        //this.setBounds(400,0,800,800);
        this.setLayout(null);

        //title in 3rd page
        JLabel programTitle = new JLabel("Summary of the report!");
        programTitle.setBounds(200,50,400,50);
        programTitle.setFont(new Font("Segoe Script", Font.BOLD, 30));

        //textarea in 3rd page
        reportText = new JTextArea();
        reportText.setBounds(100,125,550,500);
        reportText.setFont(new Font("Calibri", Font.BOLD, 18));
        reportText.setLineWrap(true);
        reportText.setEnabled(false);
        reportText.setWrapStyleWord(true);

        //restart button in 3rd page
        restartBtn = new JButton("RESTART!");
        restartBtn.setBounds(300,650,150,50);

        //Add all controls to Panel
        add(programTitle);
        add(reportText);
        add(restartBtn);
        setVisible(true);
    }

    public JButton getRestartBtn() {return restartBtn;} //getter for restartBtn

}