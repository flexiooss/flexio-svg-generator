package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;
import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;

public class Path extends SVGElementAttributes<Path> implements Element, Fillable<Path>, Strokable<Path>, StrokeWidthable<Path> {
    @Override
    public String name() {
        return "path";
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Path path(String d) {
        attributes("d", d);
        return this;
    }
}
