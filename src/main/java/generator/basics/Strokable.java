package generator.basics;

import generator.Attribute;

public interface Strokable extends Attribute {
    default Strokable stroke(String stroke) {
        attributes("stroke", stroke);
        return this;
    }
}
