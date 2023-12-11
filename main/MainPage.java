package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class MainPage {
    
    JTextField uname ;
    static JFrame mainFrame;
    static JPanel contentPane;
    JButton Start , Close;
    private Image iconimg , bgimg;
    
    MainPage(){
        
        mainFrame = new JFrame();


        try {
            iconimg  = ImageIO.read(new File("C:\\Users\\ASUS\\Vedant\\Desktop\\Portfolio\\human-body-gf12f8be08_1280.png"));
            iconimg = iconimg.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		mainFrame.setIconImage(iconimg);
        
        contentPane = new JPanel();
        mainFrame.setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);
        
        
       

        try {
            bgimg  = ImageIO.read(new File("C:\\Users\\ASUS\\Vedant\\Desktop\\Portfolio\\human-body-gf12f8be08_1280.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image newimg = bgimg.getScaledInstance(220, 550,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(newimg);
        
        JLabel image = new JLabel(imageIcon);
        image.setLayout(null);
        image.setBounds(0, 0, 600, 700);
        contentPane.add(image);
        
        
        JLabel title = new JLabel("NTA-NEET Preparation",SwingConstants.CENTER);
        title.setBounds(700, 50, 385, 100);
        title.setFont(new Font("Monospace",Font.BOLD,20));
        contentPane.add(title);
        
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(750, 300, 385-100, 50);
        name.setFont(new Font("Monospace",Font.BOLD,18));
        contentPane.add(name);
        
        
        uname = new JTextField();
        uname.setBounds(750, 350, 385-100, 50);
        uname.setFont(new Font("Verdana",Font.BOLD,16));
        contentPane.add(uname);
        
        
        Start = new JButton("Start");
        Start.setBounds(750, 500, 385-100, 50);
        Start.setBackground(new Color(110,235,107));
        Start.setFont(new Font("Verdana",Font.BOLD,16));
        Start.setForeground(Color.DARK_GRAY);
        Start.addActionListener((ActionEvent e) -> {
            
            String player = uname.getText();
            contentPane.removeAll();
            RulesPage rpanel = new RulesPage(player);
            rpanel.setBounds(0, 0, contentPane.getWidth(), contentPane.getHeight());
            contentPane.add(rpanel);
            contentPane.repaint();
            contentPane.revalidate();
            
            
        });  
        contentPane.add(Start);

        Close = new JButton("Close");
        Close.setBounds(750, 570, 385-100, 50);
        Close.setBackground(Color.decode("#FF474C"));
        Close.setFont(new Font("Verdana",Font.BOLD,16));
        Close.setForeground(Color.white);
        Close.addActionListener((ActionEvent e) -> {
            
            System.exit(0);
            
            
        });  
        contentPane.add(Close);
        
        mainFrame.setLocation(200,60);
        mainFrame.setSize(1100,700);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        
        
    }
    
     public static void main(String[] args) {
        new MainPage();
    }
    
}
