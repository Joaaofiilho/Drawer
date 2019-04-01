package Elements.Properties;

public class ButtonProperties extends Properties {
    public ButtonProperties setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public ButtonProperties setSize(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }

    public ButtonProperties setBackgroundColor(int color) {
        this.backgroundColor = color;
        return this;
    }

    public ButtonProperties setForegroundColor(int color) {
        this.foregroundColor = color;
        return this;
    }

    public ButtonProperties hasBorder() {
        this.hasBorder = true;
        return this;
    }
}
