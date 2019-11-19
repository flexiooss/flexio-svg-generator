package generator.element;

import generator.Attribute;
import generator.basics.Fillable;
import generator.basics.Strokable;
import generator.basics.StrokeWidthable;
import generator.type.Point;
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
