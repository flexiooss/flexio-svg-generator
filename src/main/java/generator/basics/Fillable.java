package generator.basics;

import generator.Attribute;

public interface Fillable extends Attribute {
    default Fillable fill(String fill) {
        attributes("fill", fill);
        return this;
    }
}
