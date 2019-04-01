package Elements.Properties;

public class LabelProperties extends Properties {
    private String text;

    public LabelProperties setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    //Vai ter o setSize so por agora, depois pretendo deixar automatico
    public LabelProperties setSize(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }

    public LabelProperties setText(String text) {
        this.text = text;
        return this;
    }

    public LabelProperties setBackgroundColor(int color) {
        this.backgroundColor = color;
        return this;
    }

    public String getText() {
        return text;
    }
}
