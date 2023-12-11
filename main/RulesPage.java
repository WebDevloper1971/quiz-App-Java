package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RulesPage extends JPanel{
    
   JButton proceed, back;
   String name;
    
    RulesPage(String name){
        
        this.name = name;
        setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        
        
        JLabel player = new JLabel("Welcome "+ name +" to Quizzy !!",SwingConstants.CENTER);
        player.setBounds(0, 0, 1100, 100);
        player.setFont(new Font("verdana",Font.BOLD,18));
        add(player);
        
        JLabel rules = new JLabel();
        rules.setLayout(null);
        rules.setBounds(250, 50, 700, 550);
        rules.setFont(new Font("verdana",Font.PLAIN,14));
        rules.setText(
        "<html>" +
                 "1. You can get everything in life you want if you will just help enough other people get what they want.—Zig Ziglar"+"<br><br><br>"+
                 "2. Inspiration does exist, but it must find you working. —Pablo Picasso"+"<br><br><br>"+
                 "3. Don't settle for average. Bring your best to the moment. Then, whether it fails or succeeds, at least you know you gave all you had. —Angela Bassett"+"<br><br><br>"+
                 "4. Show up, show up, show up, and after a while the muse shows up, too. —Isabel Allende"+"<br><br><br>"+
                 "5. I have stood on a mountain of no’s for one yes. —Barbara Elaine Smith"+"<br><br><br>"+
                 "6. If you believe something needs to exist, if it's something you want to use yourself, don't let anyone ever stop you from doing it. —Tobias Lütke"+"<br><br><br>"+
                
                 
        "</html>"        
        );
        add(rules);
        
    
        
        proceed = new JButton("Proceed");
        proceed.setLayout(null);
        proceed.setBounds(350, 550, 100, 30);
        proceed.setBackground(new Color(110,235,107));
        proceed.setFont(new Font("Verdana",Font.BOLD,14));
        proceed.setForeground(Color.DARK_GRAY);
        proceed.addActionListener((ActionEvent e) -> {
            
              MainPage.contentPane.removeAll();
              QuizPage qpanel = new QuizPage(name);
              qpanel.setBounds(0, 0, MainPage.contentPane.getWidth(), MainPage.contentPane.getHeight());
              MainPage.contentPane.add(qpanel);
              MainPage.contentPane.repaint();
              MainPage.contentPane.revalidate();
            
            
        });  
        add(proceed);
        
        back = new JButton("Back");
        back.setLayout(null);
        back.setBounds(700, 550, 100, 30);
        back.setBackground(new Color(255,107,107));
        back.setFont(new Font("Verdana",Font.BOLD,14));
        back.setForeground(Color.DARK_GRAY);
        back.addActionListener((ActionEvent e)->{
            
            new MainPage();
        });
        add(back);
        
        
        
    }

}

