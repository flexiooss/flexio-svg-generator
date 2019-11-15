package generator.element;


import generator.basics.Fillable;
import generator.basics.Strokable;
import generator.basics.StrokeWidthable;
import generator.type.Point;
import generator.Attributes;

public class Line extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Line positionStart(Point position) {
        attributes("x1", position.x());
        attributes("y1", position.y());
        return this;
    }

    public Line positionEnd(Point position) {
        attributes("x2", position.x());
        attributes("y2", position.y());
        return this;
    }
}
