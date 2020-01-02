package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;
import io.flexio.svg.generator.generator.tag.type.Point;
import io.flexio.svg.generator.generator.Attributes;

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
