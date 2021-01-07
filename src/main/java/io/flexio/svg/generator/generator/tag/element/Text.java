package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attributes;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.type.Point;

public class Text extends Attributes<Text> implements Positionable<Text> {
    public enum Anchor {
        middle, end, start
    }

    public Text anchor(String anchor) {
        attributes("text-anchor", anchor);
        return this;
    }

    public Text fontFamily(String value) {
        attributes("font-family", value);
        return this;
    }

    public Text fontSize(String value) {
        attributes("font-size", value);
        return this;
    }

    public Text anchor(Anchor anchor) {
        return this.anchor(anchor.name());
    }
}