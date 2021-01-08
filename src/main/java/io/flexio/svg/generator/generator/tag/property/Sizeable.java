package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.math.BigDecimal;

public interface Sizeable<C extends Sizeable> extends Attribute {
    default C width(double width) {
        return this.width(String.valueOf(width));
    }

    default C width(BigDecimal width) {
        return this.width(width.toPlainString());
    }

    default C width(String width) {
        attributes("width", width);
        return (C) this;
    }

    default C height(double height) {
        return this.height(String.valueOf(height));
    }

    default C height(BigDecimal height) {
        return this.height(height.toPlainString());
    }

    default C height(String height) {
        attributes("height", height);
        return (C) this;
    }
}