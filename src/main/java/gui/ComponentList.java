package gui;

import javax.swing.JComponent;
import java.util.ArrayList;
import java.awt.Rectangle;

/**
 * Created by Olusegun on 9/27/2016.
 */
public class ComponentList extends ArrayList<KComponent> {

    public void add(JComponent jC, Rectangle r) {
        super.add(new KComponent(jC, r));
    }
}
