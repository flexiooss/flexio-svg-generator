package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.math.BigDecimal;
import java.util.Locale;

public interface StrokeWidthable<S extends StrokeWidthable> extends Attribute {
    default S strokeWidth(String strokeWidth) {
        attributes("stroke-width", strokeWidth);
        return (S) this;
    }
    
    default S strokeWidth(String format, Object... args) {
        return this.strokeWidth(String.format(Locale.US, format, args));
    }

    default S strokeWidth(double strokeWidth) {
        return this.strokeWidth(String.format(Locale.US, "%.5f",strokeWidth));
    }

    default S strokeWidth(BigDecimal strokeWidth) {
        return this.strokeWidth(strokeWidth.toPlainString());
    }

    default S strokeWidthPercent(double strokeWidth) {
        return this.strokeWidth(String.format(Locale.US, "%.5f",strokeWidth) + '%');
    }

    default S strokeWidthPercent(BigDecimal strokeWidth) {
        return this.strokeWidth(strokeWidth.toPlainString() + '%');
    }
}
