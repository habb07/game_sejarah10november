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
    public int xbdboy = 0; //kooerdinat sumbu x gambar 
    int ybdboy = 0; // koordinat sumbu y gambar
    int xabdboy = 0; // penambahan sumbu x
    int yabdboy = 0; //penambahan sumbu y

    public int xemak = 200; //kooerdinat sumbu x gambar 
    int yemak = 200; // koordinat sumbu y gambar
    int xaemak = 0; // penambahan sumbu x
    int yaemak = 0;

    int xkunci = 100;
    int ykunci = 100;//penambahan sumbu y
    
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
                    xabdboy = -5;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    xabdboy = 5;
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    yabdboy = -5;
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    yabdboy = 5;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                xabdboy = 0;
                yabdboy = 0;
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
        g2d.drawImage(gambarbdboy, xbdboy, ybdboy, 100, 100, null);       //gambar bdboy, 75 (ukuran)
        g2d.drawImage(gambaremak, xemak, yemak, 100, 100, null);          //gambar emak, 75 (ukuran)
        g2d.drawImage(gambarkunci, xkunci, ykunci, 100, 100, null);          //gambar kunci, 75 (ukuran)
        g2d.dispose();
    }
    public void move() {
        //untuk berjalannya nanti tinggal menambahkan xa,ya
        if (xbdboy + xabdboy > 0 && xbdboy + xabdboy < this.getWidth() - 100) {
            xbdboy = xbdboy + xabdboy;
        }
        if (ybdboy + yabdboy > 0 && ybdboy + yabdboy < this.getHeight() - 100) {
            ybdboy = ybdboy + yabdboy;
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
