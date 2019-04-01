package Basics;

import Basics.BasicElement;
import Basics.Drawer;
import Elements.Element;

import java.util.ArrayList;

public class Screen extends Element {
    private ArrayList<BasicElement> elements;

    public Screen(int width, int height) {
        elements = new ArrayList<>();
        drawer = new Drawer();
        drawer.createCanvas(width, height);
    }

    public void add(BasicElement element) {
        elements.add(element);
    }

    @Override
    public void display() {
        for (BasicElement element: elements) {
            element.mount(drawer);
        }
        drawer.display();
    }
}
