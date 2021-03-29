package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.util.Locale;

public interface Classifiable<C extends Classifiable> extends Attribute {
    String CLASS = "class";

    default C classSelector(String... classSelectors) {
        if (classSelectors.length > 0) {
            if (! attributes().containsKey(CLASS)) {
                attributes(CLASS, String.join(" ", classSelectors));
            } else {
                attributes().computeIfPresent(CLASS, (k, v) -> v + ' ' + String.join(" ", classSelectors));
            }
        }
        return (C) this;
    }

    default C classSelector(String format, Object... args) {
        return this.classSelector(String.format(Locale.US, format, args));
    }
}
