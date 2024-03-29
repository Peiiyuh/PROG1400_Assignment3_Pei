package GUI;

import javax.swing.*;
import java.awt.*;

public class PageTwo extends JPanel {
    private JTextField userName; //box for user to enter name
    private JLabel attackBaseValue;
    private JLabel iqValue;
    private JLabel humanPic;
    private JTextArea toolBox;
    private JRadioButton spatula;
    private JRadioButton lid;
    private JRadioButton peeler;
    private JRadioButton  vacuum;
    private JTextArea pestBox;
    private JButton genHumanBtn;
    private JButton genPestBtn;
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
        attackBaseValue = new JLabel("Test value here ");
        attackBaseValue.setFont(myFont);
        attackBaseValue.setBounds(250,175,200,50);

        //Label for IQ
        JLabel iqLabel = new JLabel("Your IQ: ");
        iqLabel.setFont(myFont);
        iqLabel.setBounds(100,225,200,50);
        //Label for IQ value
        iqValue = new JLabel("Test value here ");
        iqValue.setFont(myFont);
        iqValue.setBounds(180,225,200,50);

        //Human images
        humanPic = new JLabel();
        humanPic.setBounds(500,125,150,150);
        humanPic.setBorder(BorderFactory.createLineBorder(Color.BLACK));  //Source: https://stackoverflow.com/questions/43244092/java-gui-jlabel-with-fixed-border

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
        lid = new JRadioButton("Lid");
        lid.setFont(myFont);
        lid.setBounds(350,325,200,50);
        peeler = new JRadioButton("Peeler");
        peeler.setFont(myFont);
        peeler.setBounds(350,375,200,50);
        vacuum = new JRadioButton("Vacuum");
        vacuum.setFont(myFont);
        vacuum.setBounds(350,425,200,50);

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
        pestBox.setWrapStyleWord(true);//Generate human btn
        genHumanBtn = new JButton("New Human");
        genHumanBtn.setFont(myFont);
        genHumanBtn.setBounds(100,650,150,50);

        //Generate pest btn
        genPestBtn = new JButton("New Pest");
        genPestBtn.setFont(myFont);
        genPestBtn.setBounds(275,650,150,50);

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
        add(humanPic);
        add(toolLabel);
        add(toolBox);
        add(spatula);
        add(lid);
        add(peeler);
        add(vacuum);
        add(pestsInfoLabel);
        add(pestBox);
        add(genHumanBtn);
        add(genPestBtn);
        add(reportBtn);

    }

    public JButton getReportBtn() {return reportBtn;}  //getter for reportBtn
}
