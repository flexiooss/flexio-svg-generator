package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;
import io.flexio.svg.generator.generator.tag.property.*;

import java.math.BigDecimal;
import java.util.Locale;

public class Text extends SVGElementAttributes<Text> implements Element, Positionable<Text>, Fillable<Text>, Strokable<Text>, StrokeWidthable<Text>, Rotatable<Text> {
    @Override
    public String name() {
        return "text";
    }

    @Override
    public Attribute attribute() {
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

    public Text fontSize(double value) {
        return this.fontSize(String.format(Locale.US, "%.5f", value));
    }

    public Text fontSize(BigDecimal value) {
        return this.fontSize(value.toPlainString());
    }

    public Text fontWeight(String weight) {
        attributes("font-weight", weight);
        return this;
    }

    public enum Anchor {
        middle, end, start
    }

    public Text anchor(String anchor) {
        attributes("text-anchor", anchor);
        return this;
    }

    public Text anchor(Anchor anchor) {
        return this.anchor(anchor.name());
    }
}