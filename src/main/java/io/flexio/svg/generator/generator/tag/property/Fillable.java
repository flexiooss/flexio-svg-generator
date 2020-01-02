package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

public interface Fillable extends Attribute {
    default Fillable fill(String fill) {
        attributes("fill", fill);
        return this;
    }
}
