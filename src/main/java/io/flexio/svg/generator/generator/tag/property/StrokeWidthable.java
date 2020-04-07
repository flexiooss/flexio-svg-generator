package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

public interface StrokeWidthable extends Attribute {
    default StrokeWidthable strokeWidth(String strokeWidth) {
        attributes("stroke-width", strokeWidth);
        return this;
    }
}
