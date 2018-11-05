package control;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class c_char {


    private Image gambaremak;
    private Image gambarkunci;
    private Image gambarbdboy;  //variabel tampung gambar
    public int xchar = 0; //kooerdinat sumbu x gambar 
    int ychar = 0; // koordinat sumbu y gambar
    int xachar = 0; // penambahan sumbu x
    int yachar = 0; //penambahan sumbu y

    
    int xbendera = 100;
    int ybendera = 100;//penambahan sumbu y
    
    public RunningMakKosanYangRempongBetDah(){
        gambarbdboy = new ImageIcon(getClass().getResource("kids jaman now.png")).getImage();
        gambaremak = new ImageIcon(getClass().getResource("emak emak.png")).getImage();
        gambarkunci = new ImageIcon(getClass().getResource("kunci surga.png")).getImage();
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    xachar = -5;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    xachar = 5;
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    yachar = -5;
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    yachar = 5;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                xachar= 0;
                yachar = 0;
            }

        });
        setFocusable(true);
    
    }       //<---- jadi satu, gatau buat apa (lupa)
    public int getxrand() {
        Random rand = new Random();
        int min = 0;
        int max = 800;
        int ranges = max - min + 1;
        int xrand = rand.nextInt(ranges) + min;
        System.out.println("x = " + xrand);
        return xrand;
    }
    public int getyrand() {
        Random rand = new Random();
        int min = 0;
        int max = 600;
        int ranges = max - min + 1;
        int yrand = rand.nextInt(ranges) + min;
        System.out.println("y = " + yrand);
        return yrand;
    }
    public void paint(Graphics g) {
        super.paintComponent(g);          //anaknya paint component
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawImage(gambarbdboy, xchar, ychar, 100, 100, null);       //gambar bdboy, 75 (ukuran)
        g2d.drawImage(gambaremak, xemak, yemak, 100, 100, null);          //gambar emak, 75 (ukuran)
        g2d.drawImage(gambarkunci, xbendera, ybendera, 100, 100, null);          //gambar kunci, 75 (ukuran)
        g2d.dispose();
    }
    public void move() {
        //untuk berjalannya nanti tinggal menambahkan xa,ya
        if (xchar + xachar > 0 && xchar + xachar < this.getWidth() - 100) {
            xchar = xchar + xachar;
        }
        if (ychar + yachar > 0 && ychar + yachar < this.getHeight() - 100) {
            ychar = ychar + yachar;
        }
        if ((xchar > xbendera-10) && (xchar < xbendera +10) || (ychar > ybendera-10) && (ychar <ybendera +10)) {
            System.out.println("kids dapet kunci");
            xchar = getxrand();
            ybendera = getyrand();
        }
       

    }
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Kejar kunci, hindari emak emak");
        RunningMakKosanYangRempongBetDah game = new RunningMakKosanYangRempongBetDah();
        frame.add(game);
        frame.setSize(1024, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(10);
        }

    }

}