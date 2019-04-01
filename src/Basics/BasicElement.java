package Basics;

import Utils.Color;

public abstract class BasicElement {
    protected int color;

    public BasicElement() {
        this.color = Color.BLACK;
    }

    public abstract void mount(Drawer drawer);

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }
}
