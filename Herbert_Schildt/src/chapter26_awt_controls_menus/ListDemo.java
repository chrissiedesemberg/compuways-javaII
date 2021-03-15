package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListDemo extends Frame implements ActionListener {

    String msg = "";
    List os, browser;

    public ListDemo(){
        setLayout(new FlowLayout());

        os = new List(4, true);

        browser = new List(4);

        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("Mac OS");

        browser.add("Internet Explorer");
        browser.add("Google");
        browser.add("Firefox");

        browser.select(1);
        os.select(0);

        add(os);
        add(browser);

        os.addActionListener(this);
        browser.addActionListener(this);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae){
        repaint();
    }

    public void paint(Graphics g){
        int idx[];

        msg = "Current OS: ";
        idx = os.getSelectedIndexes();
        for(int i = 0; i < idx.length; i++) {
            msg += os.getItem(idx[i]) + " ";
        }
        g.drawString(msg, 6, 120);
        msg = "Current Browser: ";
        idx = browser.getSelectedIndexes();
        for(int i = 0; i < idx.length; i++) {
            msg += browser.getItem(idx[i]);
        }
        g.drawString(msg, 6, 140);
    }

    public static void main(String[] args) {

        ListDemo appwin = new ListDemo();
        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("ListDemo");
        appwin.setVisible(true);
    }
}
