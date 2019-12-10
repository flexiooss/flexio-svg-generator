package generator.element;

import generator.Attributes;
import generator.type.Point;

public class Svg extends Attributes {
    public Svg() {
        this.attributes("xmlns", "http://www.w3.org/2000/svg");
        this.attributes("xmlns:xlink", "http://www.w3.org/1999/xlink");
    }

    public Svg width(String width) {
        attributes("width", String.valueOf(width));
        return this;
    }

    public Svg height(String height) {
        attributes("height", String.valueOf(height));
        return this;
    }

    public Svg lang(String lang) {
        attributes("xml:lang", lang);
        return this;
    }

    public Svg position(Point position) {
        attributes("x", position.x());
        attributes("y", position.y());
        return this;
    }

    public Svg viewBox(String viewBox) {
        attributes("viewBox", viewBox);
        return this;
    }
}
