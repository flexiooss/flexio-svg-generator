package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.writer.ElementWriter;

public class Group extends SVGElementAttribute<Group> implements Element {
    private static final String group = "g";
    @Override
    public String name() {
        return group;
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public void open(ElementWriter writer) {
        writer.open(this);
    }

    public static void close(ElementWriter writer) {
        writer.close(group);
    }
}
