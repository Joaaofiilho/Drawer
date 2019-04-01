package Elements;

import Elements.Properties.LabelProperties;

public class Label extends Element {

    public Label(LabelProperties properties) {
        this.properties = properties;
    }

    @Override
    public void mount(Drawer drawer) {
        drawer.setColor(properties.getBackgroundColor());
        drawer.fillRectangle(properties.getX(), properties.getY(), properties.getWidth(), properties.getHeight());
    }
}
