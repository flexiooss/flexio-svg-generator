package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.tag.property.*;
import io.flexio.svg.generator.generator.tag.type.Radius;
import io.flexio.svg.generator.generator.writer.ElementWriter;

public class Rectangle extends SVGElementAttribute<Rectangle> implements Element, Fillable<Rectangle>, Strokable<Rectangle>,
        StrokeWidthHolder<Rectangle>, PathLengthHolder<Rectangle>, Positionable<Rectangle>, Sizeable<Rectangle>
{
    private static final String rectangle = "rect";
    @Override
    public String name() {
        return rectangle;
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

    public void autoClosed(ElementWriter writer) {
        writer.autoClosed(this);
    }
}