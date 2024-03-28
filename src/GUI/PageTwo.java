package GUI;

import javax.swing.*;
import java.awt.*;

public class PageTwo extends JPanel {
    private static JButton reportBtn;
    public PageTwo(){
        //this.setBounds(400,0,800,800);
        this.setLayout(null);

        //title in 2nd page
        JLabel programTitle = new JLabel("Let's set up characters!");
        programTitle.setBounds(200,50,400,50);
        programTitle.setFont(new Font("Segoe Script", Font.BOLD, 30));

        //button in 2nd page
        reportBtn = new JButton("FIGHT!");
        reportBtn.setBounds(250,600,200,50);

        //Add all controls to Panel
        add(programTitle);
        add(reportBtn);
        setVisible(true);

    }

    public static JButton getReportBtn() {return reportBtn;}  //getter for reportBtn
}
