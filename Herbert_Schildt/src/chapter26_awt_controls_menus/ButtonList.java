package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonList extends Frame implements ActionListener {

    String msg = "";
    Button bList[] = new Button[3];

    public ButtonList() {
        setLayout(new FlowLayout());

        Button yes = new Button("Yes");
        Button no = new Button("No");
        Button maybe = new Button("Undecided");

        bList[0] = (Button) add(yes);
        bList[1] = (Button) add(no);
        bList[2] = (Button) add(maybe);

        for (int i = 0; i < 3; i++) {
            bList[i].addActionListener(this);
        }

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

        public void actionPerformed(ActionEvent ae){
            for (int i=0; i < 3; i++){
                if(ae.getSource() == bList[i]) {
                    msg = "You pressed " + bList[i].getLabel();
                }
            }
            repaint();
        }

        public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        }

    public static void main(String[] args) {

        ButtonList appwin = new ButtonList();

        appwin.setSize(new Dimension(250, 250));
        appwin.setTitle(("ButtonList"));
        appwin.setVisible(true);

    }

    }


