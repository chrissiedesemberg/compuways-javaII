package chapter24_event_handling;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {

    AdapterDemo adapterDemo;

    public MyMouseAdapter(AdapterDemo adapterDemo) {
        this.adapterDemo = adapterDemo;
    }

    public void mouseClicked(MouseEvent e) {
       adapterDemo.msg = "Mouse Clicked" ;
       adapterDemo.repaint();
    }


    public void mouseDragged(MouseEvent e) {
        adapterDemo.msg = "Mouse Dragged" ;
        adapterDemo.repaint();
    }
}
