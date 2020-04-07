package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attributes;
import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;

public class Path extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Path path(String d) {
        attributes("d", d);
        return this;
    }
}
