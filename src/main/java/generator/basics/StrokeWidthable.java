package generator.basics;

import generator.Attribute;

public interface StrokeWidthable extends Attribute {
    default StrokeWidthable strokeWidth(String strokeWidth) {
        attributes("stroke-width", strokeWidth);
        return this;
    }
}
