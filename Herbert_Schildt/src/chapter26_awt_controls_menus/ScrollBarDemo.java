package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.*;
import java.io.DataOutput;

public class ScrollBarDemo extends Frame implements AdjustmentListener {

    String msg = "";
    Scrollbar vertSB, horzSB;

    public ScrollBarDemo() {

        setLayout(new FlowLayout());

        vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 200);
        vertSB.setPreferredSize(new Dimension(20, 100));
        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        horzSB.setPreferredSize(new Dimension(100, 20));

        add(vertSB);
        add(horzSB);

        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                vertSB.setValue(y);
                horzSB.setValue(x);
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void adjustmentValueChanged(AdjustmentEvent ae) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Vertical: " + vertSB.getValue();
        msg += ", Horizontal: " + horzSB.getValue();
        g.drawString(msg, 20, 160);

        g.drawString("*", horzSB.getValue(), vertSB.getValue());
    }

    public static void main(String[] args) {
        ScrollBarDemo appwin = new ScrollBarDemo();

        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("ScrollBarDemo");
        appwin.setVisible(true);
    }


}
