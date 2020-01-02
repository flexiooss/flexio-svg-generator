package generator.tag.element;

import generator.tag.property.Fillable;
import generator.tag.property.Strokable;
import generator.tag.property.StrokeWidthable;

import generator.Attributes;

public class Polygon extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Polygon points(String points) {
        attributes("points", points);
        return this;
    }
}
