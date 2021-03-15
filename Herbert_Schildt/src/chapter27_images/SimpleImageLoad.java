package chapter27_images;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class SimpleImageLoad extends Frame {

    Image img;

    public SimpleImageLoad() {

        try {
            File imageFile = new File("sample.jpg");
            img = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.out.println("Cannot load image");
            System.exit(0);
        }

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g){
        g.drawImage(img, getInsets().left, getInsets().top, null);
    }

    public static void main(String[] args) {
        SimpleImageLoad appwin = new SimpleImageLoad();
        appwin.setSize(new Dimension(1500, 800));
        appwin.setTitle("SimpleImageLoad");
        appwin.setVisible(true);
    }




}
