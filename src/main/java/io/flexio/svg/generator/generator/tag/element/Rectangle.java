package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;
import io.flexio.svg.generator.generator.tag.property.*;
import io.flexio.svg.generator.generator.tag.type.Radius;

public class Rectangle extends SVGElementAttributes<Rectangle> implements Element, Fillable<Rectangle>, Strokable<Rectangle>,
        StrokeWidthable<Rectangle>, Positionable<Rectangle>, Sizeable<Rectangle> {
    @Override
    public String name() {
        return "rect";
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Rectangle rounded(Radius radius) {
        attributes("rx", radius.x());
        attributes("ry", radius.y());
        return this;
    }
}