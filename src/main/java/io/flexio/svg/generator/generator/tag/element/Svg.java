package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.property.Sizeable;

public class Svg extends SVGElementAttributes<Svg> implements Element, Sizeable<Svg>, Positionable<Svg> {
    @Override
    public String name() {
        return "svg";
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Svg() {
        this.attributes("xmlns", "http://www.w3.org/2000/svg");
        this.attributes("xmlns:xlink", "http://www.w3.org/1999/xlink");
    }

    public Svg lang(String lang) {
        attributes("xml:lang", lang);
        return this;
    }

    public Svg viewBox(String viewBox) {
        attributes("viewBox", viewBox);
        return this;
    }

    public Svg viewBox(String format, Object... args) {
        return this.viewBox(String.format(format, args));
    }
}