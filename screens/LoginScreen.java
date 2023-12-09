package screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LoginScreen extends JFrame{

    static int WIDTH = 800;
    static int HEIGHT = 600;

    JPanel imgPanel, loginPanel;
    JLabel title, userNameLabel;
    JButton start;

    
    public LoginScreen(){

        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        imgPanel = new JPanel();
        imgPanel.setPreferredSize(new Dimension(WIDTH/2,HEIGHT));
        imgPanel.setBackground(Color.BLACK);
        add(imgPanel,BorderLayout.WEST);

        loginPanel = new JPanel();
        loginPanel.setPreferredSize(new Dimension(WIDTH/2,HEIGHT));
        loginPanel.setBackground(Color.orange);
        loginPanel.setLayout(null);
        add(loginPanel,BorderLayout.EAST);


        title = new JLabel("NTA-NEET Preparation",SwingConstants.CENTER);
        title.setPreferredSize(new Dimension(WIDTH/2, HEIGHT/5));
        title.setOpaque(true);
        title.setBackground(Color.GREEN);
        title.setFont(new Font("Verdana",Font.BOLD,20));
        loginPanel.add(title);

        // start = new JButton("START");
        // start.setPreferredSize(new Dimension(200, HEIGHT/5));
        // start.setFocusPainted(false);
        // start.setBorderPainted(false);
        // start.setBorder(null);
        // start.setBackground(Color.green);
        // start.setFont(new Font("Verdana",Font.BOLD,18));
        // loginPanel.add(start,BorderLayout.SOUTH);
    }

}
