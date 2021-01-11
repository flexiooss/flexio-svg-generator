package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attributes;
import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;

import java.math.BigDecimal;

public class Text extends Attributes<Text> implements Positionable<Text>, Fillable<Text>, Strokable<Text>, StrokeWidthable<Text> {
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

    public Text fontSize(double value) {
        return this.fontSize(String.valueOf(value));
    }

    public Text fontSize(BigDecimal value) {
        return this.fontSize(value.toPlainString());
    }

    public Text fontWeight(String weight) {
        attributes("font-weight", weight);
        return this;
    }

    public Text anchor(Anchor anchor) {
        return this.anchor(anchor.name());
    }
}