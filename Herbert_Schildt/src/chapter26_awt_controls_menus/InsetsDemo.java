package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InsetsDemo extends Frame {

    public InsetsDemo(){
        setBackground(Color.cyan);

        setLayout(new BorderLayout());

        add(new Button("This is across the top"), BorderLayout.NORTH);
        add(new Label("The footer message goes here"), BorderLayout.SOUTH);
        add(new Button("Right"), BorderLayout.EAST);
        add(new Button("Left"), BorderLayout.WEST);

        String msg = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. \n" +
                "Proin malesuada ut justo in scelerisque. Morbi at purus sed urna \n" +
                "aucibus porta sit amet ac augue. Integer pretium tortor at risus \n" +
                "faucibus, at pellentesque tortor interdum. Suspendisse id tortor sit \n" +
                "amet tellus eleifend laoreet vitae quis mi. Etiam placerat nisl sed tristique \n" +
                "placerat. Praesent ut dui felis. Proin lobortis commodo sem a semper. \n" +
                "Vivamus eleifend odio quis nibh volutpat, quis porttitor sem eleifend. \n" +
                "Curabitur non justo libero. Maecenas pellentesque, ipsum et pellentesque \n" +
                "volutpat, justo velit scelerisque leo, eu tempor augue nisl ut ligula. \n" +
                "Donec maximus mauris urna, eu laoreet libero volutpat.";

        add(new TextArea(msg), BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public Insets getInsets(){
        return new Insets(40, 20, 10, 20);
    }

    public static void main(String[] args) {

        InsetsDemo appwin = new InsetsDemo();

        appwin.setSize(new Dimension(300, 200));
        appwin.setTitle("InsetsDemo");
        appwin.setVisible(true);

    }

}
