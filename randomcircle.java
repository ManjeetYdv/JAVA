import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class randomcircle extends JPanel {

    Insets ins;
    Random rand;

    randomcircle() {
        rand = new Random();
        setBorder(
                BorderFactory.createLineBorder(new Color(rand.nextInt(200), rand.nextInt(200), rand.nextInt(200)), 5));

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x, y;
        int h = getHeight();
        int w = getWidth();

        ins = getInsets();

        for (int i = 0; i < 200; i++) {
            x = rand.nextInt(w - ins.left);
            y = rand.nextInt(h - ins.bottom);
            rand = new Random();
            int radius = rand.nextInt(50);
            g.setColor(new Color(rand.nextInt(200), rand.nextInt(200), rand.nextInt(200)));
            g.fillOval(x, y, radius,radius);
        }
    }

}

class polkaDemo {
    JLabel j;
    randomcircle p;

    polkaDemo() {
        JFrame jf = new JFrame(" POLKA DOTS");
        jf.setSize(300, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p = new randomcircle();
        jf.add(p);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        polkaDemo s = new polkaDemo();
    }
}
