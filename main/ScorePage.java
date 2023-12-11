package main;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class ScorePage extends JPanel{
    
    JLabel title, player, player_score, image;
    JButton play_again;
    Image bgimg;
    
    ScorePage(String name,int score){
        
        setBackground(Color.WHITE);
        setLayout(null);
        
        
        title = new JLabel("SCOREBOARD !! ",SwingConstants.CENTER);
        title.setLayout(null);
        title.setBounds(0, 50, 1100, 100);
        title.setFont(new Font("Monospace",Font.BOLD,25));
        title.setForeground(Color.black);
        add(title);
        
        player = new JLabel("THANK YOU "+ name.toUpperCase() +" FOR PLAYING QUIZZY.",SwingConstants.CENTER);
        player.setLayout(null);
        player.setBounds(0, 200, 1100, 100);
        player.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        player.setForeground(Color.black);
        add(player);
        
        
        player_score = new JLabel("YOUR SCORE IS : "+ score + " !! ",SwingConstants.CENTER);
        player_score.setLayout(null);
        player_score.setBounds(0, 300, 1100, 100);
        player_score.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        player_score.setForeground(Color.black);
        add(player_score);
        
        play_again = new JButton("Play Again");
        play_again.setLayout(null);
        play_again.setBounds(1100/2 - 200/2, 550, 200, 50);
        play_again.setFont(new Font("Tahoma",Font.BOLD,18));
        play_again.setBackground(Color.WHITE);
        play_again.setForeground(Color.DARK_GRAY);
        play_again.addActionListener((ActionEvent e)->{
            MainPage.mainFrame.dispose();
            new MainPage();
        });
        add(play_again);
        

          try {
            bgimg  = ImageIO.read(new File("C:\\Users\\ASUS\\Vedant\\Desktop\\Portfolio\\bgpink.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Image newimg = bgimg.getScaledInstance(1100, 700,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(newimg);

        image = new JLabel(imageIcon);
        image.setLayout(null);
        image.setBounds(0, 0, 1100, 700);
        image.setFont(new Font("verdana",Font.BOLD,18));
        add(image);
      
            
        
        
    }
    
   
}
