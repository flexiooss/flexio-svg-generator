package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

public interface Sizeable<C extends Sizeable> extends Attribute {
    default C width(long width) {
        return this.width(Long.toString(width));
    }

    default C width(String width) {
        attributes("width", String.valueOf(width));
        return (C) this;
    }

    default C height(long height) {
        return this.height(Long.toString(height));
    }

    default C height(String height) {
        attributes("height", height);
        return (C) this;
    }
}