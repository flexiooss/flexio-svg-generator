package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attributes;

public class Link extends Attributes {
    public Link href(String href) {
        this.attributes("xlink:href", href);
        return this;
    }
}
