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
    Font frontFont = new Font("Segoe Script", Font.ITALIC, 24);
    private static ArrayList<Tools> toolList = new ArrayList<>();
    private static ArrayList<Insects> insList = new ArrayList<>();
    private static ArrayList<Mammals> mamList = new ArrayList<>();
    private static ArrayList<Human> humanList = new ArrayList<>();
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

        //Create a list of tools
        toolList.add(new Tools("Spatula",300,"kitchenware"));
        toolList.add(new Tools("Lid", 400,"kitchenware"));
        toolList.add(new Tools("Peeler", 80, "kitchenware"));
        toolList.add(new Tools("Vacuum", 1200, "appliances"));

        //Create pests
//        insList.add(new Insects("John",60,100,"Low",false));
//        insList.add(new Insects("Amy",200,150,"Medium",true));
//        insList.add(new Insects("Taylor",100,120,"Medium",true));
//        mamList.add(new Mammals("Peanut",350, 320, "High",true));
//        mamList.add(new Mammals("Remy",300, 250, "High",true));
//        mamList.add(new Mammals("Meatloaf",50, 500, "Low",false));

        //Create Human
        humanList.add(new Human(null,500, 130, new ImageIcon("src/Images/bro.png")));
        humanList.add(new Human(null,500, 130, new ImageIcon("src/Images/sis.png")));
        humanList.add(new Human(null,500, 130, new ImageIcon("src/Images/mom.png")));
        humanList.add(new Human(null,500, 130, new ImageIcon("src/Images/dad.png")));

    }

    //Getter
    public Font getFrontFont(){return frontFont;}

    public ArrayList<Tools> getToolList() {
        return toolList;
    }

    public ArrayList<Insects> getInsList() {
        return insList;
    }

    public ArrayList<Mammals> getMamList() {
        return mamList;
    }

    public ArrayList<Human> getHumanList() {
        return humanList;
    }
}