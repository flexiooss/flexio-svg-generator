package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.math.BigDecimal;
import java.util.Locale;

public interface PathLengthHolder<P extends PathLengthHolder> extends Attribute {
    @SuppressWarnings("unchecked")
    default P pathLength(String lengthFormat, Object... args) {
        attributes("pathLength", String.format(Locale.US, lengthFormat, args));
        return (P) this;
    }

    default P pathLength(String length) {
        return this.pathLength(length);
    }

    default P pathLength(double length) {
        return this.pathLength("%.5f", length);
    }

    default P pathLength(BigDecimal length) {
        return this.pathLength(length.toPlainString());
    }
}
