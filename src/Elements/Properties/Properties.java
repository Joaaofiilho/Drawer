package Elements.Properties;

import Utils.Color;

public abstract class Properties {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected int backgroundColor;
    protected int foregroundColor;
    protected boolean hasBorder;

    public Properties() {
        this.backgroundColor = Color.BLACK;
        this.foregroundColor = Color.WHITE;
        this.hasBorder = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public int getForegroundColor() {
        return foregroundColor;
    }

    public boolean isHasBorder() {
        return hasBorder;
    }
}
