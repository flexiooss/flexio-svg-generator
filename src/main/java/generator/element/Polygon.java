package generator.element;

import generator.basics.Fillable;
import generator.basics.Strokable;
import generator.basics.StrokeWidthable;

import generator.Attributes;

public class Polygon extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Polygon points(String points) {
        attributes("points", points);
        return this;
    }
}
