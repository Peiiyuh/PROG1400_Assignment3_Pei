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
import java.util.Random;

public class PageTwo extends JPanel {
    private JTextField userName; //box for user to enter name
    private JLabel attackBaseValue;
    private JLabel iqValue;
    private JButton humanGo;
    private ArrayList<Human> humanList;
    private JLabel humanPic;
    private ArrayList<Human> humanPicList;
    private JTextArea toolBox;
    private JRadioButton spatula;
    private JRadioButton lid;
    private JRadioButton peeler;
    private JRadioButton  vacuum;
    private JTextArea pestBox;
    private JButton insectsBtn;
    private ArrayList<Insects> insList;
    private JButton mammalsBtn;
    private ArrayList<Mammals> mamList;
    private JButton reportBtn; //report btn for jump into next page

    public PageTwo(){
        //Set Panel Properties
        this.setLayout(null);
        this.setVisible(true);

        //Font
        Font myFont = new Font("Calibri", Font.BOLD, 20);

        //title in 2nd page
        JLabel programTitle = new JLabel("Let's Select Characters!");
        programTitle.setBounds(200,50,400,50);
        programTitle.setFont(new Font("Segoe Script", Font.BOLD, 30));

        //Label before enter name
        JLabel nameLabel = new JLabel("Enter your name: ");
        nameLabel.setFont(myFont);
        nameLabel.setBounds(100,125,200,50);
        //Enter name box
        userName = new JTextField();
        userName.setFont(myFont);
        userName.setBounds(250,125,200,50);

        //Label for attack Base
        JLabel attackBaseLabel = new JLabel("Your attack base: ");
        attackBaseLabel.setFont(myFont);
        attackBaseLabel.setBounds(100,175,200,50);
        //Label for attack base value
        attackBaseValue = new JLabel();
        attackBaseValue.setFont(myFont);
        attackBaseValue.setBounds(250,175,200,50);

        //Label for IQ
        JLabel iqLabel = new JLabel("Your IQ: ");
        iqLabel.setFont(myFont);
        iqLabel.setBounds(100,225,200,50);
        //Label for IQ value
        iqValue = new JLabel();
        iqValue.setFont(myFont);
        iqValue.setBounds(180,225,200,50);

        //Select human attackBase and IQ
        humanGo = new JButton("GO");
        humanGo.setFont(myFont);
        humanGo.setBounds(480,125,100,50);
        //Add human in list
        humanList = new ArrayList<>();
        humanList.add(new Human(userName.getText(),550, 120,new ImageIcon("src/Images/bro.png")));
        humanList.add(new Human(userName.getText(),350, 80,new ImageIcon("src/Images/mom.png")));
        humanList.add(new Human(userName.getText(),250, 175,new ImageIcon("src/Images/dad.png")));
        humanList.add(new Human(userName.getText(),150, 150,new ImageIcon("src/Images/sis.png")));

        //Human images
        humanPic = new JLabel();
        humanPic.setBounds(500,175,150,250);
        //humanPic.setBorder(BorderFactory.createLineBorder(Color.BLACK));  //Source: https://stackoverflow.com/questions/43244092/java-gui-jlabel-with-fixed-border

        humanGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random(); //https://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist
                int index = random.nextInt(humanList.size());
                attackBaseValue.setText(Integer.toString(humanList.get(index).getAttackBase()));
                iqValue.setText(Integer.toString(humanList.get(index).getIQ())); //https://stackoverflow.com/questions/4841559/how-to-convert-an-int-to-a-string
                ImageIcon dimg = new ImageIcon(new ImageIcon(String.valueOf(humanList.get(index).getHumanPic())).getImage().getScaledInstance(150,250, Image.SCALE_SMOOTH));
                humanPic.setIcon(dimg);  //https://stackoverflow.com/questions/16343098/resize-a-picture-to-fit-a-jlabel

            }
        });

        //Label for tools
        JLabel toolLabel = new JLabel("Choose your tool: ");
        toolLabel.setFont(myFont);
        toolLabel.setBounds(100,275,200,50);
        //Text Area for tool description
        toolBox = new JTextArea();
        toolBox.setFont(myFont);
        toolBox.setBounds(100,325,200,150);
        toolBox.setLineWrap(true);
        toolBox.setEnabled(false);
        toolBox.setWrapStyleWord(true);
        //Tools choices
        spatula = new JRadioButton("Spatula");
        spatula.setFont(myFont);
        spatula.setBounds(350,275,200,50);
        spatula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tools spatula = new Tools("Spatula",300,"kitchenware");
                toolBox.setText(spatula.toString());
            }
        });
        lid = new JRadioButton("Lid");
        lid.setFont(myFont);
        lid.setBounds(350,325,200,50);
        lid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tools lid = new Tools("Lid", 400,"kitchenware");
                toolBox.setText(lid.toString());
            }
        });
        peeler = new JRadioButton("Peeler");
        peeler.setFont(myFont);
        peeler.setBounds(350,375,200,50);
        peeler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tools peeler = new Tools("Peeler", 80,"kitchenware");
                toolBox.setText(peeler.toString());
            }
        });
        vacuum = new JRadioButton("Vacuum");
        vacuum.setFont(myFont);
        vacuum.setBounds(350,425,200,50);
        vacuum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tools vacuum = new Tools("Vacuum", 1200,"appliances");
                toolBox.setText(vacuum.toString());
            }
        });
        ButtonGroup grpToolRads = new ButtonGroup();
        grpToolRads.add(this.spatula);
        grpToolRads.add(this.lid);
        grpToolRads.add(this.peeler);
        grpToolRads.add(this.vacuum);

        //Pests information
        JLabel pestsInfoLabel = new JLabel("Pest's information: ");
        pestsInfoLabel.setFont(myFont);
        pestsInfoLabel.setBounds(100,475,200,50);
        //Pests box
        pestBox = new JTextArea();
        pestBox.setFont(myFont);
        pestBox.setBounds(100,525,600,100);
        pestBox.setLineWrap(true);
        pestBox.setEnabled(false);
        pestBox.setWrapStyleWord(true);

        //Insects btn
        insectsBtn = new JButton("Insects");
        insectsBtn.setFont(myFont);
        insectsBtn.setBounds(100,650,150,50);
        //Add insects in list
        insList = new ArrayList<>();
        insList.add(new Insects("John",60,100,"Low",false));
        insList.add(new Insects("Amy",200,150,"Medium",true));
        insList.add(new Insects("Taylor",100,120,"Medium",true));
        insectsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random(); //https://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist
                int index = random.nextInt(insList.size());
                pestBox.setText(insList.get(index).toString());
            }
        });

        //Mammals btn
        mammalsBtn = new JButton("Mammals");
        mammalsBtn.setFont(myFont);
        mammalsBtn.setBounds(275,650,150,50);
        //Add mammals in list
        mamList = new ArrayList<>();
        mamList.add(new Mammals("Peanut",350, 320, "High",true));
        mamList.add(new Mammals("Remy",300, 250, "High",true));
        mamList.add(new Mammals("Meatloaf",50, 500, "Low",false));
        mammalsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random(); //https://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist
                int index = random.nextInt(mamList.size());
                pestBox.setText(mamList.get(index).toString());
            }
        });

        //Get report btn
        reportBtn = new JButton("FIGHT!");
        reportBtn.setFont(myFont);
        reportBtn.setBounds(550,650,150,50);

        //Add all controls to Panel
        add(programTitle);
        add(nameLabel);
        add(userName);
        add(attackBaseLabel);
        add(attackBaseValue);
        add(iqLabel);
        add(iqValue);
        add(humanGo);
        add(humanPic);
        add(toolLabel);
        add(toolBox);
        add(spatula);
        add(lid);
        add(peeler);
        add(vacuum);
        add(pestsInfoLabel);
        add(pestBox);
        add(insectsBtn);
        add(mammalsBtn);
        add(reportBtn);

        //get random insect

        //get random mammal

    }



    public JButton getReportBtn() {return reportBtn;}  //getter for reportBtn
}
