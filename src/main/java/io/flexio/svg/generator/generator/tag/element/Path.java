package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.tag.property.*;
import io.flexio.svg.generator.generator.writer.ElementWriter;

public class Path extends SVGElementAttribute<Path> implements Element,
        Fillable<Path>, Strokable<Path>, StrokeWidthHolder<Path>, PathLengthHolder<Path> , ClipPathHolder<Path>,
        OpacityHolder<Path>
{
    private static final String path = "path";
    @Override
    public String name() {
        return path;
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Path path(String d) {
        attributes("d", d);
        return this;
    }

    public void autoClosed(ElementWriter writer) {
        writer.autoClosed(this);
    }
}
