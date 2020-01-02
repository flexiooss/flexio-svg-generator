package generator.tag.element;

import generator.Attributes;

public class Link extends Attributes {
    public Link href(String href) {
        this.attributes("xlink:href", href);
        return this;
    }
}
