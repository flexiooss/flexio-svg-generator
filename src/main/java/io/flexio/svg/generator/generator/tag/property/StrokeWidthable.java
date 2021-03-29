package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.math.BigDecimal;

public interface StrokeWidthable<S extends StrokeWidthable> extends Attribute {
    default S strokeWidth(String strokeWidth) {
        attributes("stroke-width", strokeWidth);
        return (S) this;
    }
    
    default S strokeWidth(String format, Object... args) {
        return this.strokeWidth(String.format(format, args));
    }

    default S strokeWidth(double strokeWidth) {
        return this.strokeWidth(String.valueOf(strokeWidth));
    }

    default S strokeWidth(BigDecimal strokeWidth) {
        return this.strokeWidth(strokeWidth.toPlainString());
    }

    default S strokeWidthPercent(double strokeWidth) {
        return this.strokeWidth(String.valueOf(strokeWidth) + '%');
    }

    default S strokeWidthPercent(BigDecimal strokeWidth) {
        return this.strokeWidth(strokeWidth.toPlainString() + '%');
    }
}
