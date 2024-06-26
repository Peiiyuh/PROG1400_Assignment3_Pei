package GUI;

import Classes.*;

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
    private JLabel humanPic;
    private JTextArea toolBox;
    private JRadioButton spatula;
    private JRadioButton lid;
    private JRadioButton peeler;
    private JRadioButton  vacuum;
    private JTextArea pestBox;
    private JLabel pestsPic;
    private JButton insectsBtn;
    private JButton mammalsBtn;
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

        //Human images
        humanPic = new JLabel();
        humanPic.setBounds(500,175,150,250);
        humanPic.setBorder(BorderFactory.createLineBorder(Color.BLACK));  //Source: https://stackoverflow.com/questions/43244092/java-gui-jlabel-with-fixed-border
        humanGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    Random random = new Random(); //https://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist
                    int index = random.nextInt(MainFrame.getHumanList().size());
                    attackBaseValue.setText(Integer.toString(MainFrame.getHumanList().get(index).getAttackBase()));
                    iqValue.setText(Integer.toString(MainFrame.getHumanList().get(index).getIQ())); //https://stackoverflow.com/questions/4841559/how-to-convert-an-int-to-a-string
                    ImageIcon dimg = new ImageIcon(new ImageIcon(String.valueOf(MainFrame.getHumanList().get(index).getHumanPic())).getImage().getScaledInstance(150,250, Image.SCALE_SMOOTH));
                    humanPic.setIcon(dimg);  //https://stackoverflow.com/questions/16343098/resize-a-picture-to-fit-a-jlabel
                    MainFrame.setSelectedHumanIndex(index); //store index in SelectHumanIndex
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
        spatula.setBounds(350,275,150,50);
        spatula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tools spatula = MainFrame.getToolList().get(0);
                toolBox.setText(spatula.toString());
            }
        });
        lid = new JRadioButton("Lid");
        lid.setFont(myFont);
        lid.setBounds(350,325,150,50);
        lid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tools lid = MainFrame.getToolList().get(1);
                toolBox.setText(lid.toString());
            }
        });
        peeler = new JRadioButton("Peeler");
        peeler.setFont(myFont);
        peeler.setBounds(350,375,150,50);
        peeler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tools peeler = MainFrame.getToolList().get(2);
                toolBox.setText(peeler.toString());
            }
        });
        vacuum = new JRadioButton("Vacuum");
        vacuum.setFont(myFont);
        vacuum.setBounds(350,425,150,50);
        vacuum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tools vacuum = MainFrame.getToolList().get(3);
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
        pestBox.setBounds(100,525,400,100);
        pestBox.setLineWrap(true);
        pestBox.setEnabled(false);
        pestBox.setWrapStyleWord(true);

        //Pests image
        pestsPic = new JLabel();
        pestsPic.setBounds(550,475,150,150);
        pestsPic.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        //Insects btn
        insectsBtn = new JButton("Insects");
        insectsBtn.setFont(myFont);
        insectsBtn.setBounds(100,650,150,50);
        insectsBtn.addActionListener(new ActionListener() { //NOTE: JButton doesn't match to .isSelected()//
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("InsBtn clicked"); //testing
                Random random = new Random(); //https://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist
                int index = random.nextInt(MainFrame.getInsList().size());
                pestBox.setText(MainFrame.getInsList().get(index).toString());
                pestsPic.setIcon(new ImageIcon(new ImageIcon(String.valueOf(MainFrame.getInsList().get(index).getInsPic())).getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
            }
        });

        //Mammals btn
        mammalsBtn = new JButton("Mammals");
        mammalsBtn.setFont(myFont);
        mammalsBtn.setBounds(275,650,150,50);
        mammalsBtn.addActionListener(new ActionListener() { //NOTE: JButton doesn't match to .isSelected()//
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("MamBtn clicked"); //testing
                Random random = new Random(); //https://stackoverflow.com/questions/5034370/retrieving-a-random-item-from-arraylist
                int index = random.nextInt(MainFrame.getMamList().size());
                pestBox.setText(MainFrame.getMamList().get(index).toString());
                pestsPic.setIcon(new ImageIcon(new ImageIcon(String.valueOf(MainFrame.getMamList().get(index).getMamPic())).getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH)));
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
        add(pestsPic);
        add(insectsBtn);
        add(mammalsBtn);
        add(reportBtn);
    }

    public JButton getReportBtn() {return reportBtn;}  //getter for reportBtn
    public void createFinalChoice(){
        //Human info
        ArrayList<Human> character = MainFrame.getHumanList();
        String name = userName.getText();
        for(int i =0; i< character.size(); i++) {
            if(MainFrame.getSelectedHumanIndex()==i){
                Human selectHuman = character.get(i); //let selectHuman = the human state that randomly generated
                selectHuman.setName(name); //store and set the name in selectHuman
                //Tools info   //Should be another efficient way to do....??
                if (spatula.isSelected()){
                    selectHuman.setTool(MainFrame.getToolList().get(0));
                }
                else if (lid.isSelected()){
                    selectHuman.setTool(MainFrame.getToolList().get(1));
                }
                else if (peeler.isSelected()){
                    selectHuman.setTool(MainFrame.getToolList().get(2));
                }
                else if (vacuum.isSelected()){
                    selectHuman.setTool(MainFrame.getToolList().get(3));
                }
            }
        }

        //Pest info
        String pestInfo = pestBox.getText(); //grab content from pestBox TextArea
        MainFrame.setPestInfoReport(pestInfo); //let value store back to mainframe PestInfoReport
    }
}
