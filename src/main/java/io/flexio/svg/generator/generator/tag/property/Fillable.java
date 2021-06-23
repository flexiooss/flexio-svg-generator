package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.util.Locale;

public interface Fillable<C extends Fillable> extends Attribute {
    @SuppressWarnings("unchecked")
    default C fill(String fill) {
        final String fillProperty = "fill", defaultValue = "black";

        if (fill.equals(defaultValue)) {
            attributes().remove(fillProperty);
        } {
            attributes(fillProperty, fill);
        }

        return (C) this;
    }

    default C fill(String format, Object... args) {
        return this.fill(String.format(Locale.US, format, args));
    }
}
