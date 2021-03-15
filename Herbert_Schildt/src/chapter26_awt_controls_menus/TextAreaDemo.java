package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaDemo extends Frame{

    public TextAreaDemo() {

        setLayout(new FlowLayout());

        String val = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin malesuada ut \n" +
                "justo in scelerisque. Morbi at purus sed urna faucibus porta sit amet ac augue. \n" +
                "Integer pretium tortor at risus faucibus, at pellentesque tortor interdum. Suspendisse \n" +
                "id tortor sit amet tellus eleifend laoreet vitae quis mi. Etiam placerat nisl \n" +
                "sed tristique placerat. Praesent ut dui felis. Proin lobortis commodo sem a semper. \n" +
                "Vivamus eleifend odio quis nibh volutpat, quis porttitor sem eleifend. Curabitur non \n" +
                "justo libero. Maecenas pellentesque, ipsum et pellentesque volutpat, justo velit \n" +
                "scelerisque leo, eu tempor augue nisl ut ligula. Donec maximus mauris urna, eu \n" +
                "laoreet libero volutpat.";

        TextArea text = new TextArea(val, 10, 30);
        add(text);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        TextAreaDemo appwin = new TextAreaDemo();

        appwin.setSize(300, 220);
        appwin.setTitle("TextAreaDemo");
        appwin.setVisible(true);
    }

}
