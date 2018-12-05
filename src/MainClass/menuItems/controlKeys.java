/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass.menuItems;

import MainClass.GameMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;

/**
 *
 * @author Sagor Ahamed
 */
public class controlKeys{
    JFrame frame;
    JPanel panel;
    JButton backButton;
    
    Color menuBackgroundColor;
    Color buttonColor;
    JLabel controlMainImage, title, bg, banner, banner2, text;
    
    public controlKeys() {
        frame = new JFrame();
        panel=new JPanel();
        buttonColor=new Color(50,183,255);
        menuBackgroundColor=new Color(255,255,255);
        
        frame.setSize(1280, 720);
        frame.setResizable(false);
        
        panel.setLayout(null);
        panel.setBackground(menuBackgroundColor);
        
        title = new JLabel();
        title.setIcon(new ImageIcon("resources\\images\\background\\logo2.png"));
        title.setBounds(20, 40, 262, 200);
        
        bg = new JLabel();
        bg.setIcon(new ImageIcon("resources\\images\\background\\bg.png"));
        bg.setBounds(0, 0, 1280, 720);
        
        Font font1 = new Font("BatmanForeverAlternate", Font.BOLD, 60);

        banner = new JLabel();
        banner.setText("BANTUAN");
        banner.setForeground(Color.BLACK);
        banner.setFont(font1);
        banner.setBounds(500, 80, 300, 100);
        banner.setLayout(null);
        
        Font font2 = new Font("BatmanForeverAlternate", Font.BOLD, 36);

        banner2 = new JLabel();
        banner2.setText("\"Control Mouse & Keyboard\"");
        banner2.setForeground(Color.BLACK);
        banner2.setFont(font2);
        banner2.setBounds(405, 140, 600, 100);
        banner2.setLayout(null);
        
        text = new JLabel();
        text.setIcon(new ImageIcon("resources\\images\\menu\\t.kembali.png"));
        text.setBounds(1002, 590, 350, 100);
        
        backButton = new JButton();
        backButton.setBounds(1180, 600, 75, 75);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setIcon(new ImageIcon("resources\\images\\menu\\b.menu.png"));
        
        controlMainImage = new JLabel();
        controlMainImage.setIcon(new ImageIcon("resources\\images\\others\\key.png"));
        controlMainImage.setBounds(200,60,1000,600);

        backButton.addActionListener(new controlKeys.backListener());
        
        panel.add(banner2);
        panel.add(banner);
        panel.add(backButton);
        panel.add(controlMainImage);
        panel.add(text);
        panel.add(title);
        panel.add(bg);
        frame.add(panel);
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    
    private class backListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        GameMenu mn=new GameMenu();
        frame.setVisible(false);
        }
    }
    
    
}
