package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;


public class QuizPage extends JPanel{
    
    String name;
    
    
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String user_answers[][] = new String[10][1];
    
    
    
    JLabel qno;
    JTextArea question;
    JRadioButton opt1;
    JRadioButton opt2;
    JRadioButton opt3;
    JRadioButton opt4;
    ButtonGroup groupoption;
    JButton next;
    JButton submit;
    JButton previous;
    JLabel bg1;
    Image bgimg;
    
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    QuizPage(String name){
        
        
        this.name = name;
        
        setLayout(null);
        setBackground(Color.white);
        
        try {
            bgimg  = ImageIO.read(new File("C:\\Users\\ASUS\\Vedant\\Desktop\\Portfolio\\human-body-gf12f8be08_1280.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Image newimg = bgimg.getScaledInstance(220, 650,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(newimg);

        bg1 = new JLabel(imageIcon);
        bg1.setBounds(0, 0, 350, 650);
        add(bg1);
       
        
        qno = new JLabel();
        qno.setFont(new Font("verdana",Font.BOLD,14));
        qno.setBounds(400, 145, 50, 30);
        add(qno);
        
        question = new JTextArea();
        question.setFont(new Font("verdana",Font.BOLD,14));
        question.setBounds(450, 150, 1100-500, 100);
        question.setEditable(false);
        add(question);
        
        questions[0][0] = "During cellular respiration, the carbon dioxide produced is";
        questions[0][1] = "absorbed";
        questions[0][2] = "taken out";
        questions[0][3] = "stored";
        questions[0][4] = "consumed";

        questions[1][0] = "Oxidative phosphorylation is the production of?";
        questions[1][1] = "NADH in respiration";
        questions[1][2] = "ATP in respiration";
        questions[1][3] = "NADPH in photosynthesis";
        questions[1][4] = "ATP in photosynthesis";

        questions[2][0] = "What is the end product of glycolysis?";
        questions[2][1] = "Fructose I – phosphate";
        questions[2][2] = "Glucose I – phosphate";
        questions[2][3] = "Pyruvic acid";
        questions[2][4] = "Acetyl CoA";

        questions[3][0] = "Before pyruvate enters the Krebs cycle, the connecting link between Krebs cycle and glycolysis is changed to";
        questions[3][1] = "PEP";
        questions[3][2] = "Oxaloacetate";
        questions[3][3] = "Pyruvate";
        questions[3][4] = "Acetyl CoA";

        questions[4][0] = "Reduction of NADP+ to NADPH is seen in";
        questions[4][1] = "Glycolysis";
        questions[4][2] = "HMP";
        questions[4][3] = "EMP (1988)";
        questions[4][4] = "Calvin cycle";

        questions[5][0] = "Pick the incorrect statement regarding Krebs cycle";
        questions[5][1] = "cycle starts with condensation of acetyl group with pyruvic acid to produce citric acid";
        questions[5][2] = "during the conversion of succinyl Co-A to succinic acid, synthesis of a molecule of GTP occurs";
        questions[5][3] = "at a point, reduction of FAD+ to FADH2. occurs";
        questions[5][4] = "the cycle has three points where reduction of NAD+ to NADH + H+ occurs";

        questions[6][0] = "In the cellular respiration of one molecule of glucose, _________ of energy is conserved as 38 ATP molecules";
        questions[6][1] = "686 Kcal";
        questions[6][2] = "456 Kcal";
        questions[6][3] = "654 Kcal";
        questions[6][4] = "277 Kcal";

        questions[7][0] = "Which of these yields the maximum number of ATP molecules and is the ultimate respiratory substrate";
        questions[7][1] = " Amylose";
        questions[7][2] = "Glucose";
        questions[7][3] = "Ketogenic amino acid";
        questions[7][4] = "Glycogen";

        questions[8][0] = "The CH bond of food in cellular respiration is disintegrated through";
        questions[8][1] = "metabolism";
        questions[8][2] = "catalysis";
        questions[8][3] = "oxidation";
        questions[8][4] = "reduction";

        questions[9][0] = "___________ is the incomplete oxidation of glucose into pyruvic acid involving many intermediate steps";
        questions[9][1] = "Krebs cycle";
        questions[9][2] = "HMS-pathway";
        questions[9][3] = "Glycolysis";
        questions[9][4] = "TCA-pathway";
        
        
        answers[0][1] = "taken out";
        answers[1][1] = "ATP in respiration";
        answers[2][1] = "Pyruvic acid";
        answers[3][1] = "Acetyl CoA";
        answers[4][1] = "HMP";
        answers[5][1] = "cycle starts with condensation of acetyl group with pyruvic acid to produce citric acid";
        answers[6][1] = "277 Kcal";
        answers[7][1] = "Glycogen";
        answers[8][1] = "oxidation";
        answers[9][1] = "Glycolysis";
        
        
        opt1 = new JRadioButton();
        opt1.setBounds(400, 250, 1100- 500, 50);
        opt1.setFont(new Font("verdana",Font.BOLD,14));
        opt1.setBackground(null);
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(400, 310, 1100- 500, 50);
        opt2.setFont(new Font("verdana",Font.BOLD,14));
        opt2.setBackground(null);
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(400, 370, 1100- 500, 50);
        opt3.setFont(new Font("verdana",Font.BOLD,14));
        opt3.setBackground(null);
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(400, 430, 1100- 500, 50);
        opt4.setFont(new Font("verdana",Font.BOLD,14));
        opt4.setBackground(null);
        add(opt4);
        
        
        
        
        groupoption = new ButtonGroup();
        groupoption.add(opt1);
        groupoption.add(opt2);
        groupoption.add(opt3);
        groupoption.add(opt4);
        
        
        next = new JButton("Next");
        next.setBackground(Color.darkGray);
        next.setForeground(Color.WHITE);
        next.setBounds(700, 580, 150, 50);
        next.setFont(new Font("verdana",Font.BOLD,18));
        next.addActionListener((ActionEvent e)->{
            repaint();
            ans_given = 1;
            if(groupoption.getSelection() == null){
                user_answers[count][0] = "";
            }else{
                user_answers[count][0] = groupoption.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                next.setVisible(false);

                submit.setVisible(true);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        });
        add(next);
        
   
        
        
        submit = new JButton("Submit");
        submit.setBackground(Color.darkGray);
        submit.setForeground(Color.WHITE);
        submit.setBounds(470, 580, 150, 50);
        submit.setFont(new Font("verdana",Font.BOLD,18));
        submit.addActionListener((ActionEvent e)->{
            ans_given = 1;
                if(groupoption.getSelection() == null){
                     user_answers[count][0] = "";
                }else{
                    user_answers[count][0] = groupoption.getSelection().getActionCommand();
                }
                  for(int j = 0; j < user_answers.length;j++){
                      if(user_answers[j][0].equals(answers[j][1])){
                          score += 10;
                      }else{
                          score += 0;
                      }
                  }
                  
                  
//                  new ScorePage(name,score);
                    MainPage.contentPane.removeAll();
                    ScorePage spanel = new ScorePage(name,score);
                    spanel.setBounds(0, 0, MainPage.contentPane.getWidth(), MainPage.contentPane.getHeight());
                    MainPage.contentPane.add(spanel);
                    MainPage.contentPane.repaint();
                    MainPage.contentPane.revalidate();
            
        });
        submit.setEnabled(false);
        submit.setVisible(false);
        add(submit);
        
     
        
        
        
        start(count);
        
        
        
        
//        setLocation(200,60);
//        setSize(1100,700);
    }
    
    
    public void start(int count){

        qno.setText(""+(count+1)+". ");
        question.setText(questions[count][0]);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        
        opt1.setText("<html>"+ questions[count][1] + "</html>");
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText("<html>" + questions[count][2] + "</html>");
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText("<html>" + questions[count][3] + "</html>");
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText("<html>" + questions[count][4] + "</html>");
        opt4.setActionCommand(questions[count][4]);
        
        groupoption.clearSelection();

    }
        
   
}
