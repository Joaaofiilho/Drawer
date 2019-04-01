import Elements.Button;
import Elements.Label;
import Elements.Properties.ButtonProperties;
import Elements.Properties.LabelProperties;
import Elements.Screen;
import Utils.Color;

public class Test {
    public static void main(String[] args) {
        Screen s1 = new Screen(350, 600);

        Button b = new Button(new ButtonProperties()
            .setPosition(100, 100)
            .setSize(100, 50)
            .setBackgroundColor(Color.RED));

        Label l = new Label(new LabelProperties()
            .setPosition(150, 125)
            .setSize(50, 50)
            .setBackgroundColor(Color.BLUE));

        s1.add(b);
        s1.add(l);
        s1.display();
    }
}
