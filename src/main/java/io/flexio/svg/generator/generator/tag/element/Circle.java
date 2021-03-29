package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;
import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;
import io.flexio.svg.generator.generator.tag.type.Point;

import java.math.BigDecimal;

public class Circle extends SVGElementAttributes<Circle> implements Element, Fillable<Circle>, Strokable<Circle>,
        StrokeWidthable<Circle>, Positionable<Circle> {
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
        return this.radius(String.valueOf(radius));
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
}