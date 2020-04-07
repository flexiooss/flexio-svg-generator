package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

public interface Strokable extends Attribute {
    default Strokable stroke(String stroke) {
        attributes("stroke", stroke);
        return this;
    }
}
