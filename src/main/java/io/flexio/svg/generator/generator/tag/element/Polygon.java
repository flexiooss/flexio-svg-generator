package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.tag.property.*;
import io.flexio.svg.generator.generator.writer.ElementWriter;

import java.util.Locale;

public class Polygon extends SVGElementAttribute<Polygon> implements Element,
        Fillable<Polygon>, Strokable<Polygon>, StrokeWidthHolder<Polygon>, PathLengthHolder<Polygon>,
        ClipPathHolder<Polygon>, OpacityHolder<Polygon>
{
    private static final String polygon = "polygon";
    @Override
    public String name() {
        return polygon;
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Polygon points(String points) {
        attributes("points", points);
        return this;
    }

    public Polygon points(String format, Object... args) {
        return this.points(String.format(Locale.US, format, args));
    }

    public void autoClosed(ElementWriter writer) {
        writer.autoClosed(polygon);
    }
}
