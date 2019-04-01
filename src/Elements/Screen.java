package Elements;

import Elements.Properties.ScreenProperties;

import java.util.ArrayList;

public class Screen extends Element implements BasicElement {
    private Drawer drawer;
    private ArrayList<Element> elements;

    public Screen(ScreenProperties properties) {
        this(properties.getWidth(), properties.getHeight());
        this.properties = properties;
    }

    public Screen(int width, int height) {
        elements = new ArrayList<>();
        drawer = new Drawer();
        drawer.createCanvas(width, height);
    }

    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void mount(Drawer drawer) {
        for (Element element: elements) {
            element.mount(drawer);
        }
    }

    @Override
    public void display() {
        mount(drawer);
        drawer.display();
    }
}
