package ThePajitnovExperience;

import ThePajitnovExperience.Shape;
import processing.core.PApplet;

public class Color {
    public int none, coloro1, colori2, colori3, colorv3;
    public int colorz4, colors4, colort4, colorl4, colorj4, colori4, coloro4;
    public int[] colors;

    Color(PApplet p5) {
        none = p5.color(255);
        coloro1 = p5.color(0);
        colori2 = p5.color(63);
        colori3 = p5.color(127);
        colorv3 = p5.color(191);


        colorz4 = p5.color(255, 0, 0);
        colors4 = p5.color(0, 255, 0);
        colort4 = p5.color(255, 0, 255);
        colorl4 = p5.color(255, 165, 0);
        colorj4 = p5.color(0, 0, 255);
        colori4 = p5.color(0, 255, 255);
        coloro4 = p5.color(255, 255, 0);

        colors = new int[Shape.SHAPE_TYPE.values().length];
        colors[Shape.SHAPE_TYPE.MT.ordinal()] = none;
        colors[Shape.SHAPE_TYPE.O1.ordinal()] = coloro1;
        colors[Shape.SHAPE_TYPE.I2.ordinal()] = colori2;
        colors[Shape.SHAPE_TYPE.I3.ordinal()] = colori3;
        colors[Shape.SHAPE_TYPE.V3.ordinal()] = colorv3;
        colors[Shape.SHAPE_TYPE.Z4.ordinal()] = colorz4;
        colors[Shape.SHAPE_TYPE.S4.ordinal()] = colors4;
        colors[Shape.SHAPE_TYPE.T4.ordinal()] = colort4;
        colors[Shape.SHAPE_TYPE.L4.ordinal()] = colorl4;
        colors[Shape.SHAPE_TYPE.J4.ordinal()] = colorj4;
        colors[Shape.SHAPE_TYPE.I4.ordinal()] = colori4;
        colors[Shape.SHAPE_TYPE.O4.ordinal()] = coloro4;
    }
}
