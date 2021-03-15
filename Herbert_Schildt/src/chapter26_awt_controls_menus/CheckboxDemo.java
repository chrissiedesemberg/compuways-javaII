package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo extends Frame implements ItemListener {

    String msg = "";
    Checkbox windows, android, solaris, mac;

    public CheckboxDemo(){

        setLayout(new FlowLayout());

        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        add(windows);
        add(android);
        add(solaris);
        add(mac);

        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Current state: ";
        g.drawString(msg, 20, 120);
        msg = "\tWindows: " + windows.getState();
        g.drawString(msg, 20, 140);
        msg = "\tAndroid: " + android.getState();
        g.drawString(msg, 20, 160);
        msg = "\tSolaris: " + solaris.getState();
        g.drawString(msg, 20, 180);
        msg = "\tMac OS: " + mac.getState();
        g.drawString(msg, 20, 200);
    }

    public static void main(String[] args) {

        CheckboxDemo appwin= new CheckboxDemo();

        appwin.setSize(new Dimension(250, 250));
        appwin.setTitle("CheckboxDemo");
        appwin.setVisible(true);

    }
}
