package generator.element;

import generator.Attributes;
import generator.type.Point;

public class Text extends Attributes {
    public Text position(Point position) {
        attributes("x", position.x());
        attributes("y", position.y());
        return this;
    }

    public Text anchor(String anchor) {
        attributes("text-anchor", anchor);
        return this;
    }
}
