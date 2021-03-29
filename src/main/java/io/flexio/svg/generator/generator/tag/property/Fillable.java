package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.util.Locale;

public interface Fillable<C extends Fillable> extends Attribute {
    default C fill(String fill) {
        attributes("fill", fill);
        return (C) this;
    }

    default C fill(String format, Object... args) {
        return this.fill(String.format(Locale.US, format, args));
    }
}
