package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.tag.property.*;
import io.flexio.svg.generator.generator.tag.type.Point;
import io.flexio.svg.generator.generator.tag.type.Radius;

import io.flexio.svg.generator.generator.Attributes;

public class Rectangle extends Attributes<Rectangle> implements Fillable<Rectangle>, Strokable<Rectangle>,
        StrokeWidthable<Rectangle>, Positionable<Rectangle>, Sizeable<Rectangle> {
    public Rectangle rounded(Radius radius) {
        attributes("rx", radius.x());
        attributes("ry", radius.y());
        return this;
    }
}