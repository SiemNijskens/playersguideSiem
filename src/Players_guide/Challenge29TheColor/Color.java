package Players_guide.Challenge29TheColor;

/*The second pedestal asks you to create a Color class to represent a color. The pedestal includes an
etching of this diagram that illustrates its potential usage:
The color consists of three parts or channels: red, green, and blue, which indicate how much those
channels are lit up. Each channel can be from 0 to 255. 0 means completely off; 255 means completely
on.
The pedestal also includes some color names, with a set of numbers indicating their specific values for
each channel. These are commonly used colors: White (255, 255, 255), Black (0, 0, 0), Red (255, 0, 0),
Orange (255,165, 0), Yellow (255, 255, 0), Green (0, 128, 0), Blue (0, 0, 255), Purple (128, 0, 128).

Objectives:

-Define a new Color class with fields for its red, green, and blue channels.
-Add appropriate constructors that you feel make sense for creating new Color objects.
-Create final static fields to define the eight commonly used colors for easy access.
-In your main method, make two Color-typed variables. Use a constructor to create a color instance
 and use a static field for the other. Display each of their red, green, and blue channel values.*/

public class Color {
    private int red;
    private int green;
    private int blue;


    public Color (int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    final static Color WHITE = new Color (255,255,255);
    final static Color BLACK = new Color (0,0,0);
    final static Color RED = new Color(255, 0, 0);
    final static Color ORANGE = new Color (255,165,0);
    final static Color YELLOW = new Color (255,255,0);
    final static Color GREEN = new Color (0,128,0);
    final static Color BLUE = new Color (0,0,255);
    final static Color PURPLE = new Color (128,0,128);


    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
