package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.tag.property.*;
import io.flexio.svg.generator.generator.writer.ElementWriter;

import java.util.Locale;

public class Polyline extends SVGElementAttribute<Polyline> implements Element,
        Fillable<Polyline>, Strokable<Polyline>, StrokeWidthHolder<Polyline>, ClipPathHolder<Polyline>,
        OpacityHolder<Polyline>
{
    private static final String polyline = "polyline";
    @Override
    public String name() {
        return polyline;
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Polyline points(String points) {
        attributes("points", points);
        return this;
    }

    public Polyline points(String format, Object... args) {
        return this.points(String.format(Locale.US, format, args));
    }

    public void autoClosed(ElementWriter writer) {
        writer.autoClosed(this);
    }
}
