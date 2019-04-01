package Elements;

import Elements.Drawer;
import Elements.Element;
import Elements.Properties.ButtonProperties;

public class Button extends Element {
    public Button(ButtonProperties properties) {
        this.properties = properties;
    }

    @Override
    public void mount(Drawer drawer) {
        drawer.setColor(properties.getBackgroundColor());
        drawer.fillRectangle(properties.getX(), properties.getY(), properties.getWidth(), properties.getHeight());
    }
}
