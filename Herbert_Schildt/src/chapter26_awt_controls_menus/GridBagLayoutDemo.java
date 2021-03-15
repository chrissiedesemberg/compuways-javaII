package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.*;

public class GridBagLayoutDemo extends Frame implements ItemListener {

    String msg = "";
    Checkbox windows, android, solaris, mac;

    public GridBagLayoutDemo() {

        GridBagLayout gbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbag);

        windows = new Checkbox("Windows ", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        gbc.weightx = 1.0;
        gbc.ipadx = 200;
        gbc.insets = new Insets(0, 6, 0, 0);

        gbc.anchor = GridBagConstraints.NORTHEAST;

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(windows, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(android, gbc);

        gbc.weighty = 1.0;

        gbc.gridwidth = GridBagConstraints.RELATIVE;
        gbag.setConstraints(solaris, gbc);

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbag.setConstraints(mac, gbc);

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

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Current state: ";
        g.drawString(msg, 20, 100);
        msg = "\tWindows: " + windows.getState();
        g.drawString(msg, 30, 120);
        msg = "\tAndroid: " + android.getState();
        g.drawString(msg, 30, 140);
        msg = "\tSolaris: " + solaris.getState();
        g.drawString(msg, 30, 160);
        msg = "\tMac OS: " + mac.getState();
        g.drawString(msg, 30, 180);
    }

    public static void main(String[] args) {
        GridBagLayoutDemo appwin = new GridBagLayoutDemo();

        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("GridBagLayoutDemo");
        appwin.setVisible(true);


    }


}
