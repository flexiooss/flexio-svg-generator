package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

public interface Strokable<C extends Strokable> extends Attribute {
    default C stroke(String stroke) {
        attributes("stroke", stroke);
        return (C) this;
    }
}
