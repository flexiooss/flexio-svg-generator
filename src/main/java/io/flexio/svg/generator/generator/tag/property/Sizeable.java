package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.math.BigDecimal;
import java.util.Locale;

public interface Sizeable<S extends Sizeable> extends Attribute {
    default S width(double width) {
        return this.width(String.format(Locale.US, "%.5f",width));
    }

    default S width(BigDecimal width) {
        return this.width(width.toPlainString());
    }

    default S width(String width) {
        attributes("width", width);
        return (S) this;
    }

    default S width(String format, Object... args) {
        return this.width(String.format(format, args));
    }


    default S height(double height) {
        return this.height(String.format(Locale.US, "%.5f",height));
    }

    default S height(BigDecimal height) {
        return this.height(height.toPlainString());
    }

    default S height(String height) {
        attributes("height", height);
        return (S) this;
    }

    default S height(String format, Object... args) {
        return this.height(String.format(format, args));
    }
}