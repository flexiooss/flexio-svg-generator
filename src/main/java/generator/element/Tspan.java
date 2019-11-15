package generator.element;

import generator.Attributes;
import generator.type.Point;


public class Tspan extends Attributes {
    public Tspan position(Point position) {
        attributes("x", position.x());
        attributes("y", position.y());
        return this;
    }

    public Tspan relativePosition(Point position) {
        attributes("dx", position.x());
        attributes("dy", position.y());
        return this;
    }
}
