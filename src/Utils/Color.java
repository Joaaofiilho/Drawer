package Utils;

public class Color {
    public static final int BLACK = 0xFF000000;
    public static final int WHITE = 0xFFFFFFFF;
    public static final int RED = 0xFFFF0000;
    public static final int GREEN = 0xFF00FF00;
    public static final int BLUE = 0xFF0000FF;

    public static int getRGBA(int r, int g, int b, int a) {
        return (a<<24) | (r<<16) | (g<<8) | b;
    }
}
