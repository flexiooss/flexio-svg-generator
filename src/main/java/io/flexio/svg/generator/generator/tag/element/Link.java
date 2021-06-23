package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.writer.ElementWriter;

public class Link extends SVGElementAttribute<Link> implements Element {
    private static final String link = "a";
    @Override
    public String name() {
        return link;
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Link href(String href) {
        this.attributes("href", href);
        return this;
    }

    public void open(ElementWriter writer) {
        writer.open(this);
    }

    public static void close(ElementWriter writer) {
        writer.close(link);
    }
}
