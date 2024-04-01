package GUI;

import Classes.Human;
import Classes.Insects;
import Classes.Mammals;
import Classes.Tools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    static ArrayList<Human> humanList;  //don't make it as private bc will be used in PageTwo
    static ArrayList<Insects> insList;
    static ArrayList<Mammals> mamList;
    public MainFrame(){
        //Set Frame Properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit program if hit x
        this.setBounds(400,0,800,800);
        this.setTitle("Humans VS Pests");
        this.setLayout(new CardLayout());  //null: telling container all stuff manually

        ////Add human in list
        humanList = new ArrayList<>();
        humanList.add(new Human(null,550, 120,new ImageIcon("src/Images/bro.png")));
        humanList.add(new Human(null,350, 80,new ImageIcon("src/Images/mom.png")));
        humanList.add(new Human(null,250, 175,new ImageIcon("src/Images/dad.png")));
        humanList.add(new Human(null,150, 150,new ImageIcon("src/Images/sis.png")));

        //Add insects in list
        insList = new ArrayList<>();
        insList.add(new Insects("John",60,100,"Low",false,new ImageIcon("src/Images/ant.png")));
        insList.add(new Insects("Keren",200,150,"Medium",true,new ImageIcon("src/Images/mosquito.png")));
        insList.add(new Insects("Taylor",100,120,"Medium",true,new ImageIcon("src/Images/fly.png")));

        //Add mammals in list
        mamList = new ArrayList<>();
        mamList.add(new Mammals("Peanut",350, 320, "High",true,new ImageIcon("src/Images/squirrel.png")));
        mamList.add(new Mammals("Remy",300, 250, "High",true,new ImageIcon("src/Images/rat.png")));
        mamList.add(new Mammals("Meatloaf",50, 500, "Low",false,new ImageIcon("src/Images/guineaPig.png")));

        // Add Panel *screens* (add three pages obj)
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
                screenTwo.createFinalChoice();
                screenThree.displayReport();
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

}