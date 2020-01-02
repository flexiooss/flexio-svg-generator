package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;

import io.flexio.svg.generator.generator.Attributes;

public class Polygon extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Polygon points(String points) {
        attributes("points", points);
        return this;
    }
}
