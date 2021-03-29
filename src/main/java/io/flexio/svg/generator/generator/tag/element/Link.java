package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;

public class Link extends SVGElementAttributes<Link> implements Element {
    @Override
    public String name() {
        return "a";
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Link href(String href) {
        this.attributes("xlink:href", href);
        return this;
    }
}
