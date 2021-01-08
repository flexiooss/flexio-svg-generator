package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;
import io.flexio.svg.generator.generator.tag.type.Point;
import io.flexio.svg.generator.generator.Attributes;

import java.math.BigDecimal;

public class Circle extends Attributes<Circle> implements Fillable<Circle>, Strokable<Circle>,
        StrokeWidthable<Circle>, Positionable<Circle> {

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