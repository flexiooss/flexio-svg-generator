package generator.tag.element;


import generator.tag.property.Fillable;
import generator.tag.property.Strokable;
import generator.tag.property.StrokeWidthable;
import generator.tag.type.Point;
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
