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
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Sagor Ahamed
 */
public class credits {

    JFrame frame;
    JPanel panel;
    //JButton optionsButton=new JButton("About");
    JButton backButton;

    Color menuBackgroundColor;
    Color buttonColor;
    JLabel title, bg, image1, image2, image3, image4,
            text, text1, text2, text3, text4, banner, Thanks, Thanks2, Thanks3, banner2;

    public credits() {
        frame = new JFrame();
        panel = new JPanel();
        Color buttonColor = new Color(255, 255, 255);

        menuBackgroundColor = new Color(255, 255, 255);

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
        banner.setText("TENTANG");
        banner.setForeground(Color.BLACK);
        banner.setFont(font1);
        banner.setBounds(470, 100, 300, 100);
        banner.setLayout(null);

        Font font2 = new Font("BatmanForeverAlternate", Font.BOLD, 36);

        banner2 = new JLabel();
        banner2.setText("\"TRPL F PROJECT\"");
        banner2.setForeground(Color.BLACK);
        banner2.setFont(font2);
        banner2.setBounds(445, 160, 600, 100);
        banner2.setLayout(null);

        Font font3 = new Font("BatmanForeverAlternate", Font.BOLD, 22);

        text1 = new JLabel();
        text1.setText("Ana Janatul Qomariah");
        text1.setFont(font3);
        text1.setForeground(Color.BLACK);
        text1.setBounds(50, 210, 350, 100);
        text1.setLayout(null);

        text2 = new JLabel();
        text2.setText("Muhammad Faisal");
        text2.setFont(font3);
        text2.setForeground(Color.BLACK);
        text2.setBounds(370, 210, 350, 100);
        text2.setLayout(null);

        text3 = new JLabel();
        text3.setText("Rizo Mahardhika M.");
        text3.setForeground(Color.BLACK);
        text3.setFont(font3);
        text3.setBounds(690, 210, 350, 100);
        text3.setLayout(null);

        text4 = new JLabel();
        text4.setText("Habibullah Dzaky M.");
        text4.setForeground(Color.BLACK);
        text4.setFont(font3);
        text4.setBounds(1010, 210, 350, 100);
        text4.setLayout(null);

        image1 = new JLabel();
        image1.setIcon(new ImageIcon("resources\\images\\profiles\\Developer_1.jpg"));
        image1.setBounds(50, 280, 300, 300);
        image1.setLayout(null);

        image2 = new JLabel();
        image2.setIcon(new ImageIcon("resources\\images\\profiles\\Developer_2.jpg"));
        image2.setBounds(349, 280, 300, 300);
        image2.setLayout(null);

        image3 = new JLabel();
        image3.setIcon(new ImageIcon("resources\\images\\profiles\\Developer_3.jpg"));
        image3.setBounds(676, 280, 300, 300);
        image3.setLayout(null);

        image4 = new JLabel();
        image4.setIcon(new ImageIcon("resources\\images\\profiles\\Developer_4.jpg"));
        image4.setBounds(999, 280, 300, 300);
        image4.setLayout(null);

        text = new JLabel();
        text.setIcon(new ImageIcon("resources\\images\\menu\\t.kembali.png"));
        text.setBounds(1002, 590, 350, 100);

        backButton = new JButton();
        backButton.setBounds(1180, 600, 75, 75);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setIcon(new ImageIcon("resources\\images\\menu\\b.menu.png"));

        backButton.addActionListener(new credits.backListener());
        panel.add(banner2);
        panel.add(image1);
        panel.add(image2);
        panel.add(image3);
        panel.add(image4);
        panel.add(banner);
        panel.add(text);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(text4);
        panel.add(backButton);
        panel.add(title);
        panel.add(bg);

        frame.add(panel);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private class backListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            GameMenu mn = new GameMenu();
            frame.setVisible(false);
        }
    }

}
