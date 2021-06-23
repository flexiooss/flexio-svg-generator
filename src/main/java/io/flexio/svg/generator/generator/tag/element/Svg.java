package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.tag.property.ClipPathHolder;
import io.flexio.svg.generator.generator.tag.property.OpacityHolder;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.property.Sizeable;
import io.flexio.svg.generator.generator.writer.ElementWriter;

import java.util.Locale;

public class Svg extends SVGElementAttribute<Svg> implements Element,
        Sizeable<Svg>, Positionable<Svg>, ClipPathHolder<Svg>, OpacityHolder<Svg>
{
    private static final String svg = "svg";
    @Override
    public String name() {
        return svg;
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Svg() {
        this.attributes("xmlns", "http://www.w3.org/2000/svg");
    }

    public Svg lang(String lang) {
        attributes("xml:lang", lang);
        return this;
    }

    public Svg viewBox(String viewBox) {
        attributes("viewBox", viewBox);
        return this;
    }

    public Svg viewBox(String viewBoxFormat, Object... args) {
        return this.viewBox(String.format(Locale.US, viewBoxFormat, args));
    }

    public Svg viewBox(int minX, int minY, int width, int height) {
        return this.viewBox("%d %d %d %d", minX, minY, width, height);
    }

    public Svg viewBox(long minX, long minY, long width, long height) {
        return this.viewBox("%d %d %d %d", minX, minY, width, height);
    }

    public Svg viewBox(double minX, double minY, double width, double height) {
        return this.viewBox("%.5f %.5f %.5f %.5f", minX, minY, width, height);
    }

    public void open(ElementWriter writer) {
        writer.open(this);
    }

    public static void close(ElementWriter writer) {
        writer.close(svg);
    }
}