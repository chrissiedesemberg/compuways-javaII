package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;

public class ButtonDemo extends Frame implements ActionListener {

    String msg = "";
    Button yes, no, maybe;

    public ButtonDemo() {

        setLayout(new FlowLayout());

        yes = new Button("Yes");
        no = new Button("No");
        maybe = new Button("Undecided");

        add(yes);
        add(no);
        add(maybe);

        yes.addActionListener(this);
        /*
        * yes.addActionListener((ae) -> {
        * msg = "You pressed " + ae.getActionCommand();
        * repaint();
        * });
        *
        * */
        no.addActionListener(this);
        maybe.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("Yes")) {
            msg = "You pressed Yes.";
        } else if(str.equals("No")) {
            msg = "You pressed No.";
        } else {
            msg = "You pressed Undecided.";
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }

    public static void main(String[] args) {
        ButtonDemo appwin = new ButtonDemo();

        appwin.setSize(new Dimension(250, 250));
        appwin.setTitle("ButtonDemo");
        appwin.setVisible(true);
        appwin.setBackground(Color.YELLOW);
        appwin.setFont(new Font("Arial", BOLD , 14));
    }

}
