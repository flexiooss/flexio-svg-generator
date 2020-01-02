package generator.tag.element;

import generator.tag.property.Fillable;
import generator.tag.property.Strokable;
import generator.tag.property.StrokeWidthable;

import generator.Attributes;

public class Polyline extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Polyline points(String points) {
        attributes("points", points);
        return this;
    }
}
