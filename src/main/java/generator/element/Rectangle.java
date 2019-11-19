package generator.element;

import generator.basics.Fillable;
import generator.basics.Strokable;
import generator.basics.StrokeWidthable;
import generator.type.Point;
import generator.type.Rayon;

import generator.Attributes;

public class Rectangle extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Rectangle width(String width) {
        attributes("width", String.valueOf(width));
        return this;
    }

    public Rectangle height(String height) {
        attributes("height", height);
        return this;
    }

    public Rectangle rounded(Rayon rayon) {
        attributes("rx", rayon.x());
        attributes("ry", rayon.y());
        return this;
    }

    public Rectangle position(Point position) {
        attributes("x", position.x());
        attributes("y", position.y());
        return this;
    }
}
