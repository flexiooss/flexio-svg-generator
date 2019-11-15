package generator.element;

import generator.basics.Fillable;
import generator.basics.Strokable;
import generator.basics.StrokeWidthable;

import generator.Attributes;

public class Polyline extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Polyline points(String points) {
        attributes("points", points);
        return this;
    }
}
