/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;

import MainClass.GameMusic;
import MainClass.menuItems.UserName;
import MainClass.menuItems.UserName;
import MainClass.menuItems.UserName;
import MainClass.menuItems.credits;
import MainClass.menuItems.controlKeys;
import MainClass.menuItems.controlKeys;
import MainClass.menuItems.controlKeys;
import MainClass.menuItems.credits;
import MainClass.menuItems.credits;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Habibullah
 */
public class GameMenu {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton startButton;
    JButton controlsButton;
    JButton creditButton;
    JButton exitButton;
    Color menuBackgroundColor = new Color(255, 255, 255);
    Color buttonColor = new Color(242, 117, 0);
    JLabel title, bg, text1, text2, text3, text4, text5;
    JButton sound_on, sound_off;

    GameMusic menuMusic;

    public GameMenu() {
        menuMusic = new GameMusic("resources\\music\\menu3.wav");
        frame.setSize(1280, 720);
        frame.setResizable(false);

        panel.setLayout(null);
        panel.setBackground(menuBackgroundColor);

        menuMusic.loop();

        sound_on = new JButton();
        sound_on.setIcon(new ImageIcon("resources\\images\\others\\switch-on.png"));
        sound_on.setOpaque(false);
        sound_on.setContentAreaFilled(false);
        sound_on.setBorderPainted(false);
        sound_on.setBounds(20, 630, 64, 64);

        //Image gamePause = Toolkit.getDefaultToolkit().getImage("resources\\images\\background\\mainbg.png");
        title = new JLabel();
        title.setIcon(new ImageIcon("resources\\images\\background\\logo.png"));
        title.setBounds(300, 60, 625, 477);

        bg = new JLabel();
        bg.setIcon(new ImageIcon("resources\\images\\background\\bg.png"));
        bg.setBounds(0, 0, 1280, 720);

        text1 = new JLabel();
        text1.setIcon(new ImageIcon("resources\\images\\menu\\t.mulai.png"));
        text1.setBounds(578, 490, 350, 100);

        text2 = new JLabel();
        text2.setIcon(new ImageIcon("resources\\images\\menu\\t.bantuan.png"));
        text2.setBounds(960, 360, 350, 100);

        text3 = new JLabel();
        text3.setIcon(new ImageIcon("resources\\images\\menu\\t.tentang.png"));
        text3.setBounds(980, 460, 350, 100);

        text4 = new JLabel();
        text4.setIcon(new ImageIcon("resources\\images\\menu\\t.keluar.png"));
        text4.setBounds(1002, 560, 350, 100);

        startButton = new JButton();
        startButton.setBounds(590, 560, 100, 116);
        startButton.setContentAreaFilled(false);
        startButton.setBorderPainted(false);
        startButton.setIcon(new ImageIcon("resources\\images\\menu\\b.mulai.png"));

        controlsButton = new JButton();
        controlsButton.setBounds(1150, 370, 86, 86);
        controlsButton.setContentAreaFilled(false);
        controlsButton.setBorderPainted(false);
        controlsButton.setIcon(new ImageIcon("resources\\images\\menu\\b.bantuan.png"));

        creditButton = new JButton();
        creditButton.setBounds(1150, 470, 86, 87);
        creditButton.setContentAreaFilled(false);
        creditButton.setBorderPainted(false);
        creditButton.setIcon(new ImageIcon("resources\\images\\menu\\b.tentang.png"));

        exitButton = new JButton();
        exitButton.setBounds(1150, 570, 87, 87);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        exitButton.setIcon(new ImageIcon("resources\\images\\menu\\b.keluar.png"));

        //
        startButton.addActionListener(new startListener());
        controlsButton.addActionListener(new controlKeyListener());
        creditButton.addActionListener(new creditsListener());
        exitButton.addActionListener(new exitListener());

        sound_on.addActionListener(new onListener());

        panel.add(sound_on);
        panel.add(startButton);
        panel.add(controlsButton);
        panel.add(creditButton);
        panel.add(exitButton);
        panel.add(title);
        panel.add(sound_on);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(text4);
        panel.add(bg);
        frame.add(panel);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private class startListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (GameMusic.clip.isOpen()) {
                menuMusic.stop();
            }
            UserName userName = new UserName();

            frame.dispose();
        }

    }

    private class controlKeyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (GameMusic.clip.isOpen()) {
                menuMusic.stop();
            }
            controlKeys cKeys = new controlKeys();

            frame.dispose();
        }

    }

    private class creditsListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (GameMusic.clip.isOpen()) {
                menuMusic.stop();
            }
            credits c = new credits();

            frame.dispose();
        }

    }

    private class onListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (GameMusic.clip.isOpen()) {
                if (sound_on.isEnabled()) {
                    menuMusic.stop();

                    sound_on.setIcon(new ImageIcon("resources\\images\\others\\switch-off.png"));
                }

            }

        }

    }

    private class exitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        try {
            new GameMenu();
        } catch (Exception ex) {
            Logger.getLogger(GameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
