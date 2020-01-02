package generator.tag.property;

import generator.Attribute;

public interface Strokable extends Attribute {
    default Strokable stroke(String stroke) {
        attributes("stroke", stroke);
        return this;
    }
}
