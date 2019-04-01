import Basics.Screen;
import Elements.Line;
import Elements.Rectangle;
import Utils.Color;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Screen s1 = new Screen(600, 400);
        Line l1 = new Line(0, 0, 100, 100);
        Line l2 = new Line(0, 70, 50, 70, Color.getRGBA(0, 255, 0, 255));
        Rectangle r = new Rectangle();
        s1.add(r);
        s1.add(l1);
        s1.add(l2);
        s1.display();
//        BufferedImage image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_ARGB);
//        //get alpha
//        int a = 0xff;
//
//        //get red
//        int r = 0xff;
//
//        //get green
//        int g = 0;
//
//        //get blue
//        int b = 0;
//
//        int p = (a<<24) | (r<<16) | (g<<8) | b;
//
//        for(int i = 10; i < 30; i++) {
//            for (int j = 10; j < 30; j++) {
//                image.setRGB(i, j, p);
//            }
//        }
//        JFrame frame = new JFrame();
//        ImageIcon icon = new ImageIcon(image);
//        JLabel label = new JLabel(icon);
//        frame.add(label);
//        frame.setDefaultCloseOperation
//                (JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
    }
}
