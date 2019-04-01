package Elements;

import Basics.BasicElement;
import Basics.Drawer;
import Utils.Color;

public class Rectangle extends BasicElement {

    @Override
    public void mount(Drawer drawer) {
        drawer.fillRectangle(10, 10, 200, 300, color);
    }
}
