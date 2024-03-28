package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    Font frontFont = new Font("Segoe Script", Font.ITALIC, 24);
    public MainFrame(){
        //Set Frame Properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit program if hit x
        this.setBounds(400,0,800,800);
        this.setTitle("Humans VS Pests");
        this.setLayout(new CardLayout());  //null: telling container all stuff manually

        //Add Panel *screens* (add three pages obj)
        PageOne screenOne = new PageOne();
        PageTwo screenTwo = new PageTwo();
        PageThree screenThree = new PageThree();

        //Add three pages obj to the window
        add(screenOne);
        add(screenTwo);
        add(screenThree);

        //Click starter btn in 1st page to go to 2nd page
        JButton frontBtn = screenOne.getFrontBtn();  //why need static??
        frontBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenOne.setVisible(false);
                screenTwo.setVisible(true);
                screenThree.setVisible(false);
            }
        });

        //Click report btn in 2nd page to go to 3rd page
        JButton reportBtn = screenTwo.getReportBtn();  //why need static??
        reportBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenOne.setVisible(false);
                screenTwo.setVisible(false);
                screenThree.setVisible(true);
            }
        });

        //Click restart btn in 3rd page to go to 1st page
        JButton endBtn = screenThree.getRestartBtn();  //why need static??
        endBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenOne.setVisible(true);
                screenTwo.setVisible(false);
                screenThree.setVisible(false);
            }
        });


    }

    //Getter
    public Font getFrontFont(){return frontFont;}
}