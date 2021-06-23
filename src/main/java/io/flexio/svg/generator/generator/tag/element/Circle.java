package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.tag.property.*;
import io.flexio.svg.generator.generator.tag.type.Point;
import io.flexio.svg.generator.generator.writer.ElementWriter;

import java.math.BigDecimal;
import java.util.Locale;

public class Circle extends SVGElementAttribute<Circle> implements Element,
        Fillable<Circle>, Strokable<Circle>, StrokeWidthHolder<Circle>, Positionable<Circle>, ClipPathHolder<Circle>,
        OpacityHolder<Circle>
{
    @Override
    public String name() {
        return "circle";
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Circle radius(String radius) {
        attributes("r", radius);
        return this;
    }

    public Circle radius(double radius) {
        return this.radius(String.format(Locale.US, "%.5f",radius));
    }

    public Circle radius(BigDecimal radius) {
        return this.radius(radius.toPlainString());
    }

    @Override
    public Circle position(Point position) {
        attributes("cx", position.x());
        attributes("cy", position.y());
        return this;
    }

    public void autoClosed(ElementWriter writer) {
        writer.autoClosed(this);
    }
}