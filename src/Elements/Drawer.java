package Elements;

public class Drawer {
    private int color;
    private Canvas canvas;

    void createCanvas(int width, int height) {
        canvas = new Canvas(width, height);
    }

    private void drawPoint(int x, int y, int color) {
        if(x > -1 && x < canvas.getWidth() && y > -1 && y < canvas.getHeight())
            canvas.setPixel(x, y, color);
    }

    private void drawLine(int startX, int startY, int finalX, int finalY) {
        // Iterators, counters required by algorithm
        int x, y, dx, dy, dx1, dy1, px, py, xe, ye;
        // Calculate line deltas
        dx = finalX - startX;
        dy = finalY - startY;
        // Create a positive copy of deltas (makes iterating easier)
        dx1 = Math.abs(dx);
        dy1 = Math.abs(dy);
        // Calculate error intervals for both axis
        px = 2 * dy1 - dx1;
        py = 2 * dx1 - dy1;
        // The line is X-axis dominant
        if (dy1 <= dx1) {
            // Line is drawn left to right
            if (dx >= 0) {
                x = startX; y = startY; xe = finalX;
            } else { // Line is drawn right to left (swap ends)
                x = finalX; y = finalY; xe = startX;
            }
            if(x > -1 && x < canvas.getWidth() && y > -1 && y < canvas.getHeight())
                canvas.setPixel(x, y, color); // Draw first pixel
            // Rasterize the line
            while(x < xe) {
                x = x + 1;
                // Deal with octants...
                if (px < 0) {
                    px = px + 2 * dy1;
                } else {
                    if ((dx < 0 && dy < 0) || (dx > 0 && dy > 0)) {
                        y = y + 1;
                    } else {
                        y = y - 1;
                    }
                    px = px + 2 * (dy1 - dx1);
                }
                // Draw pixel from line span at
                // currently rasterized position
                if(x > -1 && x < canvas.getWidth() && y > -1 && y < canvas.getHeight())
                    canvas.setPixel(x, y, color);
            }
        } else { // The line is Y-axis dominant
            // Line is drawn bottom to top
            if (dy >= 0) {
                x = startX; y = startY; ye = finalY;
            } else { // Line is drawn top to bottom
                x = finalX; y = finalY; ye = startY;
            }
            canvas.setPixel(x, y, color); // Draw first pixel
            // Rasterize the line
            while(y < ye) {
                y = y + 1;
                // Deal with octants...
                if (py <= 0) {
                    py = py + 2 * dx1;
                } else {
                    if ((dx < 0 && dy<0) || (dx > 0 && dy > 0)) {
                        x = x + 1;
                    } else {
                        x = x - 1;
                    }
                    py = py + 2 * (dx1 - dy1);
                }
                // Draw pixel from line span at
                // currently rasterized position
                if(x > -1 && x < canvas.getWidth() && y > -1 && y < canvas.getHeight())
                    canvas.setPixel(x, y, color);
            }
        }
    }

    public void drawRectangle(int x, int y, int width, int height) {
        if ((width < 0) || (height < 0)) {
            return;
        }

        if (height == 0 || width == 0) {
            drawLine(x, y, x + width, y + height);
        } else {
            drawLine(x, y, x + width - 1, y);
            drawLine(x + width, y, x + width, y + height - 1);
            drawLine(x + width, y + height, x + 1, y + height);
            drawLine(x, y + height, x, y + 1);
        }
    }

    public void fillRectangle(int x, int y, int width, int height) {
        if(y < height)
            for (; height > 0; y++, height--)
                drawLine(x, y, x + width, y);
        else
            for (; height > 0; y--, height--)
                drawLine(x, y, x + width, y);

    }

    public void drawCircle(int x, int y, int radius) {
        for(double i = 0; i < 2*Math.PI; i += 0.0005*Math.PI) {
            double nx = x + radius * Math.cos(i);
            double ny = y + radius * Math.sin(i);
            drawPoint((int)(nx), (int)ny, color);
        }
    }

    public void fillCircle(int x, int y, int radius) {
        for(; radius > 0; radius--)
            drawCircle(x, y, radius);
    }

    void display() {
        canvas.display();
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }
}
