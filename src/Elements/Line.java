package Elements;

import Basics.BasicElement;
import Basics.Drawer;
import Utils.Color;

public class Line extends BasicElement {
    private int startX;
    private int startY;
    private int finalX;
    private int finalY;
    private int color;

    public Line(int startX, int startY, int finalX, int finalY) {
        this.startX = startX;
        this.startY = startY;
        this.finalX = finalX;
        this.finalY = finalY;
        this.color = Color.BLACK;
    }

    public Line(int startX, int startY, int finalX, int finalY, int color) {
        this.startX = startX;
        this.startY = startY;
        this.finalX = finalX;
        this.finalY = finalY;
        this.color = color;
    }

    @Override
    public void mount(Drawer drawer) {
        drawer.drawLine(startX, startY, finalX, finalY, color);
    }
}
