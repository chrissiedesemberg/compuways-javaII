package chapter26_awt_controls_menus;

import java.awt.*;
import java.awt.event.*;

public class DialogDemo extends Frame {
    String msg = "";
    CheckboxMenuItem debug, test;
    SampleDialog myDialog;

    public DialogDemo() {

        myDialog = new SampleDialog(this, "New Dialog Box");

        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);

        Menu file = new Menu("File");
        MenuItem item1, item2, item3, item4, item5;

        file.add(item1 = new MenuItem("New"));
        file.add(item2 = new MenuItem("Open"));
        file.add(item3 = new MenuItem("Close"));
        file.add(item4 = new MenuItem("-"));
        file.add(item5 = new MenuItem("Quit"));
        mbar.add(file);

        Menu edit = new Menu("Edit");
        MenuItem item6, item7, item8, item9;
        edit.add(item6 = new MenuItem("Cut"));
        edit.add(item7 = new MenuItem("Copy"));
        edit.add(item8 = new MenuItem("Paste"));
        edit.add(item9 = new MenuItem("-"));

        Menu sub = new Menu("Special");
        MenuItem item10, item11, item12;

        sub.add(item10 = new MenuItem("First"));
        sub.add(item11 = new MenuItem("Second"));
        sub.add(item12 = new MenuItem("Third"));
        edit.add(sub);

        debug = new CheckboxMenuItem("Debug");
        edit.add(debug);
        test = new CheckboxMenuItem("Test");
        edit.add(test);

        mbar.add(edit);

       DialogDemo.MyMenuHandler handler = new DialogDemo.MyMenuHandler();

        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
        item5.addActionListener(handler);
        item6.addActionListener(handler);
        item7.addActionListener(handler);
        item8.addActionListener(handler);
        item9.addActionListener(handler);
        item10.addActionListener(handler);
        item11.addActionListener(handler);
        item12.addActionListener(handler);

        item5.addActionListener((ae) -> System.exit(0));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){
        g.drawString(msg, 10, 220);

        if(debug.getState()){
            g.drawString("Debug is on.", 10, 240);
        }
        else {
            g.drawString("Debug is off.", 10, 240);
        }

        if(test.getState()) {
            g.drawString("Testing is on", 10, 260);
        }
        else {
            g.drawString("Testing is off.", 10, 260);
        }
    }

    public static void main(String[] args) {
        DialogDemo appwin = new DialogDemo();

        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("DialogDemo");
        appwin.setVisible(true);
    }


    class MyMenuHandler implements ActionListener, ItemListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            msg = "You selected: ";
            String arg = e.getActionCommand();

            if(arg.equals("New")) {
                msg += "New.";
                myDialog.setVisible(true);
            }
            else if (arg.equals("Close")){
                msg += "Close.";
            }
            else if (arg.equals("Edit")){
                msg += "Edit.";
            }
            else if (arg.equals("Cut")){
                msg += "Cut.";
            }
            else if (arg.equals("Copy")){
                msg += "Copy.";
            }
            else if (arg.equals("Paste")){
                msg += "Paste.";
            }
            else if (arg.equals("First")){
                msg += "First.";
            }
            else if (arg.equals("Second")){
                msg += "Second.";
            }
            else if (arg.equals("Third")){
                msg += "Third";
            }
            else if (arg.equals("Debug")){
                msg += "Debug.";
            }
            else if (arg.equals("Test")){
                msg += "Test.";
            }
            else if (arg.equals("Quit")){
                msg += "Quit.";
            }
            repaint();
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            repaint();
        }
    }

    class SampleDialog extends Dialog {


        SampleDialog(Frame parent, String title) {
            super(parent, title, false);
            setLayout(new FlowLayout());
            setSize(300, 200);

            add(new Label("Press this button:"));

            Button b;
            add(b = new Button("Cancel"));
            b.addActionListener((ae) -> dispose());

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });
        }

        public void paint(Graphics g){
            g.drawString("This is in the diablog box", 20, 80);
        }
    }

}
