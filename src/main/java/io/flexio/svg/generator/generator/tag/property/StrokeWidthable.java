package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

public interface StrokeWidthable<C extends StrokeWidthable> extends Attribute {
    default C strokeWidth(String strokeWidth) {
        attributes("stroke-width", strokeWidth);
        return (C) this;
    }
}
