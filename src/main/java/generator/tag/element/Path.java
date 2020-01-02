package generator.tag.element;

import generator.Attributes;
import generator.tag.property.Fillable;
import generator.tag.property.Strokable;
import generator.tag.property.StrokeWidthable;

public class Path extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Path path(String d) {
        attributes("d", d);
        return this;
    }
}
