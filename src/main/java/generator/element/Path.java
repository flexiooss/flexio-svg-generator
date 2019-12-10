package generator.element;

import generator.Attributes;
import generator.basics.Fillable;
import generator.basics.Strokable;
import generator.basics.StrokeWidthable;

public class Path extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Path path(String d) {
        attributes("d", d);
        return this;
    }
}
