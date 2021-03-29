package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.util.Locale;

public interface Stylable<C extends Stylable> extends Attribute {
    default C style(String style) {
        attributes("style", style);
        return (C) this;
    }

    default C style(String format, Object... args) {
        return this.style(String.format(Locale.US, format, args));
    }
}
