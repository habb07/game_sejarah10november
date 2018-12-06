package MainClass.featuresList;

import MainClass.GamePanel;
import MainClass.Player;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class CanteenFood2 extends JPanel {

    private String answer;
    private JFrame frame;
    private JPanel panel;
    private JLabel BG, dialog, AvaialabeList, SelectedItem, coinAvailabe;
    private JLabel item1, item2, item3, item4, item5, priceUpdivider, totalSelected;
    private JButton BuyButton, BackButton, addButton1, addButton2, addButton3, addButton4, addButton5, removeButton1,
            removeButton2, removeButton3, removeButton4, removeButton5, showPrice;
    private JLabel dawetImage, rujakImage, lalapanmage, pecelImage, tahutekIamge;
    private ButtonGroup group;

    private int dawetCounter = 0, rujakCounter = 0, lalapanCounter = 0, pecelCounter = 0, tahutekCounter = 0, totalCounter = 0;
    private boolean itemselection = false;

    private final int dawet = 8, pecel = 15, tahutek = 25, rujak = 28, lalapan = 55;
    private Color panelColor, buttonColor;
    Player player;
    Image imageSelect;
    static int correctAnsCount = 0;

    public CanteenFood2() {

        frame = new JFrame("Lapar! Beli Makan/Minum dong");

        panel = new JPanel();

        panelColor = new Color(255, 205, 65);

        buttonColor = new Color(255, 255, 255);

        addButton1 = new JButton();

        BG = new JLabel();
        BG.setIcon(new ImageIcon("resources\\images\\background\\canteenBG.png"));
        BG.setBounds(0, 0, 1280, 720);

        addButton1.setIcon(new ImageIcon("resources\\images\\others\\plus_quantity.png"));
        addButton1.setBounds(50, 265, 50, 50);
        addButton1.setOpaque(false);
        addButton1.setContentAreaFilled(false);
        addButton1.setBorderPainted(false);
        addButton1.addActionListener(new showListener());
        addButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (dawetCounter == 5) {
                    dawetCounter = 5;
                } else {
                    dawetCounter++;
                    itemselection = true;
                }
            }
        });

        addButton2 = new JButton();
        addButton2.setBackground(buttonColor);
        addButton2.setIcon(new ImageIcon("resources\\images\\others\\plus_quantity.png"));
        addButton2.setBounds(280, 265, 50, 50);
        addButton2.setOpaque(false);
        addButton2.setContentAreaFilled(false);
        addButton2.setBorderPainted(false);
        addButton2.addActionListener(new showListener());
        addButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (pecelCounter == 5) {
                    pecelCounter = 5;
                } else {
                    pecelCounter++;
                    itemselection = true;
                }
            }
        });

        addButton3 = new JButton();
        addButton3.setBackground(buttonColor);
        addButton3.setIcon(new ImageIcon("resources\\images\\others\\plus_quantity.png"));
        addButton3.setBounds(510, 265, 50, 50);
        addButton3.setOpaque(false);
        addButton3.setContentAreaFilled(false);
        addButton3.setBorderPainted(false);
        addButton3.addActionListener(new showListener());
        addButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (tahutekCounter == 5) {
                    tahutekCounter = 5;
                } else {
                    tahutekCounter++;
                    itemselection = true;
                }
            }
        });

        addButton4 = new JButton();
        addButton4.setBackground(buttonColor);
        addButton4.setIcon(new ImageIcon("resources\\images\\others\\plus_quantity.png"));
        addButton4.setBounds(740, 265, 50, 50);
        addButton4.setOpaque(false);
        addButton4.setContentAreaFilled(false);
        addButton4.setBorderPainted(false);
        addButton4.addActionListener(new showListener());
        addButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (rujakCounter == 5) {
                    rujakCounter = 5;
                } else {
                    rujakCounter++;
                    itemselection = true;
                }
            }
        });

        addButton5 = new JButton();
        addButton5.setBackground(buttonColor);
        addButton5.setIcon(new ImageIcon("resources\\images\\others\\plus_quantity.png"));
        addButton5.setBounds(975, 265, 50, 50);
        addButton5.setOpaque(false);
        addButton5.setContentAreaFilled(false);
        addButton5.setBorderPainted(false);
        addButton5.addActionListener(new showListener());
        addButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (lalapanCounter == 5) {
                    lalapanCounter = 5;
                } else {
                    lalapanCounter++;
                    itemselection = true;
                }

            }
        });

        removeButton1 = new JButton();
        removeButton1.setBackground(buttonColor);
        removeButton1.setIcon(new ImageIcon("resources\\images\\others\\minus_quantity.png"));
        removeButton1.setBounds(210, 265, 50, 50);
        removeButton1.setOpaque(false);
        removeButton1.setContentAreaFilled(false);
        removeButton1.setBorderPainted(false);
        removeButton1.addActionListener(new showListener());
        removeButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (dawetCounter == 0) {
                    dawetCounter = 0;
                } else {
                    dawetCounter--;
                }
            }
        });

        removeButton2 = new JButton();
        removeButton2.setBackground(buttonColor);
        removeButton2.setIcon(new ImageIcon("resources\\images\\others\\minus_quantity.png"));
        removeButton2.setBounds(440, 265, 50, 50);
        removeButton2.setOpaque(false);
        removeButton2.setContentAreaFilled(false);
        removeButton2.setBorderPainted(false);
        removeButton2.addActionListener(new showListener());
        removeButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (pecelCounter == 0) {
                    pecelCounter = 0;
                } else {
                    pecelCounter--;
                }
            }
        });

        removeButton3 = new JButton();
        removeButton3.setBackground(buttonColor);
        removeButton3.setIcon(new ImageIcon("resources\\images\\others\\minus_quantity.png"));
        removeButton3.setBounds(670, 265, 50, 50);
        removeButton3.setOpaque(false);
        removeButton3.setContentAreaFilled(false);
        removeButton3.setBorderPainted(false);
        removeButton3.addActionListener(new showListener());
        removeButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (tahutekCounter == 0) {
                    tahutekCounter = 0;
                } else {
                    tahutekCounter--;
                }
            }
        });

        removeButton4 = new JButton();
        removeButton4.setBackground(buttonColor);
        removeButton4.setIcon(new ImageIcon("resources\\images\\others\\minus_quantity.png"));
        removeButton4.setBounds(900, 265, 50, 50);
        removeButton4.setOpaque(false);
        removeButton4.setContentAreaFilled(false);
        removeButton4.setBorderPainted(false);
        removeButton4.addActionListener(new showListener());
        removeButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (rujakCounter == 0) {
                    rujakCounter = 0;
                } else {
                    rujakCounter--;
                }

            }
        });

        removeButton5 = new JButton();
        removeButton5.setBackground(buttonColor);
        removeButton5.setIcon(new ImageIcon("resources\\images\\others\\minus_quantity.png"));
        removeButton5.setBounds(1130, 265, 50, 50);
        removeButton5.setOpaque(false);
        removeButton5.setContentAreaFilled(false);
        removeButton5.setBorderPainted(false);
        removeButton5.addActionListener(new showListener());
        removeButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (lalapanCounter == 0) {
                    lalapanCounter = 0;
                } else {
                    lalapanCounter--;
                }

            }
        });

        dawetImage = new JLabel();
        dawetImage.setIcon(new ImageIcon("resources\\images\\canteenFoods\\dawet.png"));
        dawetImage.setBounds(80, 120, 158, 180);
        panel.add(dawetImage);

        rujakImage = new JLabel();
        rujakImage.setIcon(new ImageIcon("resources\\images\\canteenFoods\\pecel.png"));
        rujakImage.setBounds(310, 120, 158, 180);
        panel.add(rujakImage);

        lalapanmage = new JLabel();
        lalapanmage.setIcon(new ImageIcon("resources\\images\\canteenFoods\\tahutek.png"));
        lalapanmage.setBounds(540, 120, 158, 180);
        panel.add(lalapanmage);

        pecelImage = new JLabel();
        pecelImage.setIcon(new ImageIcon("resources\\images\\canteenFoods\\rujak.png"));
        pecelImage.setBounds(770, 120, 158, 180);
        panel.add(pecelImage);

        tahutekIamge = new JLabel();
        tahutekIamge.setIcon(new ImageIcon("resources\\images\\canteenFoods\\lalapan.png"));
        tahutekIamge.setBounds(1000, 120, 158, 180);
        panel.add(tahutekIamge);

        BuyButton = new JButton();
        BuyButton.setBounds(1080, 600, 75, 75);
        BuyButton.setIcon(new ImageIcon("resources\\images\\others\\buy1.png"));
        BuyButton.addActionListener(new OKListener());
        BuyButton.setOpaque(false);
        BuyButton.setContentAreaFilled(false);
        BuyButton.setBorderPainted(false);

        BackButton = new JButton();
        BackButton.setBounds(1180, 600, 75, 75);
        BackButton.setIcon(new ImageIcon("resources\\images\\others\\back1.png"));
        BackButton.addActionListener(new CancelListener());
        BackButton.setOpaque(false);
        BackButton.setContentAreaFilled(false);
        BackButton.setBorderPainted(false);

        AvaialabeList = new JLabel();
        SelectedItem = new JLabel();
        coinAvailabe = new JLabel();

        item1 = new JLabel();
        item2 = new JLabel();
        item3 = new JLabel();
        item4 = new JLabel();
        item5 = new JLabel();

        totalSelected = new JLabel();
        priceUpdivider = new JLabel();

        //coinAvailabe2 = new JLabel();
        //dialog = new JLabel(Question[ChoiceIndex]);
        frame.setSize(1280, 720);

        frame.setResizable(false);

        panel.setLayout(null);
        panel.setBackground(panelColor);

        Font font1 = new Font("SansSerif", Font.BOLD, 25);

        item1.setBounds(80, 300, 300, 180);
        item1.setFont(font1);

        item2.setBounds(80, 350, 300, 180);
        item2.setFont(font1);

        item3.setBounds(80, 400, 300, 180);
        item3.setFont(font1);

        item4.setBounds(80, 450, 300, 180);
        item4.setFont(font1);

        item5.setBounds(80, 500, 300, 180);
        item5.setFont(font1);

        priceUpdivider.setBounds(70, 525, 280, 180);
        priceUpdivider.setFont(font1);

        totalSelected.setBounds(80, 550, 300, 180);
        totalSelected.setFont(font1);

        coinAvailabe.setBounds(550, 0, 500, 100);
        coinAvailabe.setAutoscrolls(true);
        coinAvailabe.setFont(font1);
        coinAvailabe.setForeground(Color.WHITE);
        coinAvailabe.setText("Coin kamu : " + GamePanel.point);
        panel.add(coinAvailabe);

        AvaialabeList.setBounds(40, 40, 700, 100);
        AvaialabeList.setFont(font1);
        AvaialabeList.setForeground(Color.WHITE);
        AvaialabeList.setText("#.Makanan dan minuman yang tersedia: ");
        panel.add(AvaialabeList);

        SelectedItem.setBounds(40, 300, 300, 100);
        SelectedItem.setFont(font1);
        SelectedItem.setForeground(Color.WHITE);
        SelectedItem.setText("#.Dipilih: ");
        panel.add(SelectedItem);

        panel.add(BuyButton);

        panel.add(BackButton);
        
        panel.add(priceUpdivider);
        panel.add(totalSelected);
        panel.add(item1);
        panel.add(item2);
        panel.add(item3);
        panel.add(item4);
        panel.add(item5);
        panel.add(addButton1);
        panel.add(addButton2);
        panel.add(addButton3);
        panel.add(addButton4);
        panel.add(addButton5);
        panel.add(removeButton1);
        panel.add(removeButton2);
        panel.add(removeButton3);
        panel.add(removeButton4);
        panel.add(removeButton5);
        panel.add(rujakImage);
        panel.add(dawetImage);
        panel.add(tahutekIamge);
        panel.add(pecelImage);
        panel.add(lalapanmage);
        group = new ButtonGroup();

        group.add(BuyButton);
        group.add(BackButton);
        panel.add(BG);
        //Selection

        /*
        dawetImage.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
           if (GamePanel.point>=dawet) {
                   answer = "a";
                  //  item.setIcon(new ImageIcon("resources\\images\\canteenFoods\\dawet1.jpg"));
                   // JOptionPane.showMessageDialog(null,"Item Selected");
               }else if (GamePanel.point!=dawet) {
                   JOptionPane.showMessageDialog(null,"You Don't Have enough coin to buy it. please collect coin");
               }
         }
     });
        
        rujakImage.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            if (GamePanel.point>=rujak) {
                   answer = "b";
                  //  item.setIcon(new ImageIcon("resources\\images\\canteenFoods\\rujak1.png"));
                   // JOptionPane.showMessageDialog(null,"Item Selected");
               }else if (GamePanel.point!=rujak) {
                   JOptionPane.showMessageDialog(null,"You Don't Have enough coin to buy it. please collect coin");
               }
         }
     });
        
        lalapanmage.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
              if (GamePanel.point>=rujak) {
                   answer = "c";
                    //item.setIcon(new ImageIcon("resources\\images\\canteenFoods\\lalapan1.png"));
         
               }else if (GamePanel.point!=rujak) {
                   JOptionPane.showMessageDialog(null,"You Don't Have enough coin to buy it. please collect coin");
               }
         }
     });
        
        pecelImage.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
           if (GamePanel.point>=pecel) {
                   answer = "d";
                  //  item.setIcon(new ImageIcon("resources\\images\\canteenFoods\\pecel.jpg"));
              
               }else if (GamePanel.point!=pecel) {
                   JOptionPane.showMessageDialog(null,"You Don't Have enough coin to buy it. please collect coin");
               }
         }
     });
        
        tahutekIamge.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            if (GamePanel.point>=tahutek) {
                    answer = "e";
                    //item.setIcon(new ImageIcon("resources\\images\\canteenFoods\\tahutek1.png"));
      
               }else if (GamePanel.point!=tahutek) {
                   JOptionPane.showMessageDialog(null,"You Don't Have enough coin to buy it. please collect coin");
               }
         }
     });
         */
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

        // frame.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(panel);
        //frame.setContentPane(new JLabel(new ImageIcon("resources\\images\\others\\bge.png")));

    }

    private class showListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (itemselection == false) {
                JOptionPane.showMessageDialog(null,
                        "Select An Item First",
                        "Warning!!!",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                item1.setText("Dawet   :           " + dawetCounter + " x " + dawet + "");
                item1.setForeground(Color.WHITE);
                item2.setText("Pecel    :           " + pecelCounter + " x " + pecel + "");
                item2.setForeground(Color.WHITE);
                item3.setText("Tahutek:           " + tahutekCounter + " x " + tahutek + "");
                item3.setForeground(Color.WHITE);
                item4.setText("Rujak    :           " + rujakCounter + " x " + rujak + "");
                item4.setForeground(Color.WHITE);
                item5.setText("Lalapan:           " + lalapanCounter + " x " + lalapan + "");
                item5.setForeground(Color.WHITE);
                totalCounter = (dawetCounter * dawet) + (rujakCounter * rujak)
                        + (lalapanCounter * lalapan) + (pecelCounter * pecel) + (tahutekCounter * tahutek);
                priceUpdivider.setText("----------------------------------");
                priceUpdivider.setForeground(Color.WHITE);
                totalSelected.setText("Jumlah Harga:    " + totalCounter);
                totalSelected.setForeground(Color.WHITE);
            }
        }
    }

    private class OKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (totalCounter>GamePanel.point) {
                JOptionPane.showMessageDialog(null, "Coin kamu tidak cukup!");
            }else{
            GamePanel.point -= totalCounter;
            if (player.energy != 100) {
                        if (player.energy < 100) {
                            player.energy += (float) (totalCounter*2.5);
                        }
                        if (player.energy >= 100) {
                            player.energy = 100;
                        }
                    }
            }
            
        }
    }

    private class CancelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            itemselection = false;
            rujakCounter = 0;
            tahutekCounter = 0;
            dawetCounter = 0;
            lalapanCounter = 0;
            pecelCounter = 0;
            GamePanel.time2.start();
            frame.setVisible(false);
        }
    }

}
