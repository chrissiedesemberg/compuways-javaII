package chapter24_event_handling;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;

public class KeyEventsDemo extends Frame implements KeyListener {
    
    String msg = "";
    String keyState = "";
    
    public KeyEventsDemo() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    
    public void keyPressed(KeyEvent ke) {
        keyState = "Key Down";
        int key = ke.getKeyCode();
        
        switch(key) {
            case KeyEvent.VK_F1:
                msg += "<F1>"; break; 
            case KeyEvent.VK_F2:
                msg += "<F2>"; break;
            case KeyEvent.VK_F3:
                msg += "<F3>"; break;
            case KeyEvent.VK_TAB:
                msg += "<TAB>"; break;
            case KeyEvent.VK_SPACE:
                msg += "<SPACE>"; break;
            case KeyEvent.VK_BACK_SPACE:
                msg += "<BACK_SPACE>"; break;
            case KeyEvent.VK_LEFT:
                msg += "<ARROW_LEFT>"; break;
            case KeyEvent.VK_RIGHT:
                msg += "<ARROW_RIGHT>"; break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        keyState = "Key Up";
        repaint();
    }

    public void keyTyped(KeyEvent e) {
        msg += e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }

    public static void main(String[] args) {

        KeyEventsDemo appwin = new KeyEventsDemo();

        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle(("KeyEventsDemo"));
        appwin.setVisible(true);
    }
    
}
