package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.math.BigDecimal;

public interface StrokeWidthable<C extends StrokeWidthable> extends Attribute {
    default C strokeWidth(String strokeWidth) {
        attributes("stroke-width", strokeWidth);
        return (C) this;
    }

    default C strokeWidth(double strokeWidth) {
        return this.strokeWidth(String.valueOf(strokeWidth));
    }

    default C strokeWidth(BigDecimal strokeWidth) {
        return this.strokeWidth(strokeWidth.toPlainString());
    }

    default C strokeWidthPercent(double strokeWidth) {
        return this.strokeWidth(String.valueOf(strokeWidth) + '%');
    }

    default C strokeWidthPercent(BigDecimal strokeWidth) {
        return this.strokeWidth(strokeWidth.toPlainString() + '%');
    }
}
