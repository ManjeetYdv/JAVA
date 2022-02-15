import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class toggle {
    public toggle() {

        // Set up the JFrame.
        JFrame jfrm = new JFrame("Toggle_Button");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(200, 100);

        JLabel jlab = new JLabel("Button is off.");

        JToggleButton jtbn = new JToggleButton("On/Off");

        jtbn.addItemListener(new ItemListener() {

            Random rand;

            public void itemStateChanged(ItemEvent ie) {
                if (jtbn.isSelected()) {
                    jtbn.setOpaque(true);
                    jlab.setText("Button is on.");
                    rand = new Random();
                    jtbn.setBackground(new Color(rand.nextInt(200), rand.nextInt(200), rand.nextInt(200)));
                } else {
                    jlab.setText("Button is off.");
                    rand = new Random();
                    jtbn.setBackground(new Color(rand.nextInt(200), rand.nextInt(200), rand.nextInt(200)));
                }

            }
        });
        jfrm.add(jtbn);
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new toggle();
            }
        });
    }
}
