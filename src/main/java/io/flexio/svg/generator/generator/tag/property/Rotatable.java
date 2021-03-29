package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.util.Locale;

public interface Rotatable<R extends Rotatable> extends Attribute {
    default R rotate(String mode) {
        this.attributes("rotate", mode);
        return (R) this;
    }

    default R rotate(double alpha) {
        return this.rotate(String.format(Locale.US, "%.5f", alpha));
    }

    default R rotate(Mode mode) {
        return this.rotate(mode.toString());
    }

    enum Mode {
        auto{
            @Override
            public String toString() {
                return "auto";
            }
        }, reverse{
            @Override
            public String toString() {
                return "auto-reverse";
            }
        }
    }
}
