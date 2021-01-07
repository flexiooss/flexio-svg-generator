package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attributes;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.property.Sizeable;
import io.flexio.svg.generator.generator.tag.type.Point;

public class Svg extends Attributes<Svg> implements Sizeable<Svg>, Positionable<Svg> {
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
}