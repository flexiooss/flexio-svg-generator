package generator.tag.element;

import generator.tag.property.Fillable;
import generator.tag.property.Strokable;
import generator.tag.property.StrokeWidthable;
import generator.tag.type.Point;
import generator.tag.type.Radius;

import generator.Attributes;

public class Rectangle extends Attributes implements Fillable, Strokable, StrokeWidthable {
    public Rectangle width(long width) {
        return this.width(Long.toString(width));
    }

    public Rectangle width(String width) {
        attributes("width", String.valueOf(width));
        return this;
    }

    public Rectangle height(long height) {
        return this.height(Long.toString(height));
    }

    public Rectangle height(String height) {
        attributes("height", height);
        return this;
    }

    public Rectangle rounded(Radius radius) {
        attributes("rx", radius.x());
        attributes("ry", radius.y());
        return this;
    }

    public Rectangle position(Point position) {
        attributes("x", position.x());
        attributes("y", position.y());
        return this;
    }
}
