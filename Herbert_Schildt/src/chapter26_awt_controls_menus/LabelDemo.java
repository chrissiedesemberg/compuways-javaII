package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class LabelDemo extends Frame {

    public LabelDemo() {
        setLayout(new FlowLayout());

        Button button1 = new Button("Click Me");
        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");

        String newButton1Label = "New Click me";
        button1.setLabel(newButton1Label);

        add(one);
        add(two);
        add(three);
        add(button1);



    addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {

        LabelDemo appwin = new LabelDemo();

        appwin.setSize(new Dimension(300, 100));
        appwin.setTitle("LabelDemo");
        appwin.setVisible(true);


    }

}

