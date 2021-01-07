package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;

import io.flexio.svg.generator.generator.Attributes;

public class Polyline extends Attributes<Polyline> implements Fillable<Polyline>, Strokable<Polyline>, StrokeWidthable<Polyline> {
    public Polyline points(String points) {
        attributes("points", points);
        return this;
    }
}
