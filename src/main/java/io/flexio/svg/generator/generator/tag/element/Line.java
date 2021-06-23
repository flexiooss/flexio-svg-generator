package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthHolder;
import io.flexio.svg.generator.generator.tag.type.Point;
import io.flexio.svg.generator.generator.writer.ElementWriter;

public class Line extends SVGElementAttribute<Line> implements Element, Fillable<Line>, Strokable<Line>, StrokeWidthHolder<Line> {
    private static final String line = "line";
    @Override
    public String name() {
        return line;
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Line positionStart(Point position) {
        attributes("x1", position.x());
        attributes("y1", position.y());
        return this;
    }

    public Line positionEnd(Point position) {
        attributes("x2", position.x());
        attributes("y2", position.y());
        return this;
    }

    public void autoClosed(ElementWriter writer) {
        writer.autoClosed(line);
    }
}
