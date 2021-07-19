package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.math.BigDecimal;
import java.util.Locale;

public interface OpacityHolder<O extends OpacityHolder<O>> extends Attribute {
    @SuppressWarnings("unchecked")
    default O opacity(String opacity) {
        final String opacityProperty = "opacity";
        attributes("stroke-width", opacity);
        return (O) this;
    }

    default O opacity(String format, Object... args) {
        return this.opacity(String.format(Locale.US, format, args));
    }

    @SuppressWarnings("unchecked")
    default O opacity(double opacity) {
        if (opacity == 1d) {
            this.attributesMap().remove("opacity");
            return (O) this;
        }

        return this.opacity("%.5f", opacity);
    }

    default O opacity(BigDecimal opacity) {
        return this.opacity(opacity.toPlainString());
    }
}
