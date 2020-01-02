package generator.tag.element;

import generator.tag.property.Fillable;
import generator.tag.property.Strokable;
import generator.tag.property.StrokeWidthable;
import generator.tag.type.Point;
import generator.Attributes;

public class Circle extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Circle radius(String radius) {
        attributes("r", radius);
        return this;
    }

    public Circle position(Point position) {
        attributes("cx", position.x());
        attributes("cy", position.y());
        return this;
    }
}
