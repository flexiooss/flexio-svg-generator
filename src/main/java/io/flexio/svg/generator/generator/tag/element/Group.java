package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;

public class Group extends SVGElementAttributes<Group> implements Element {
    @Override
    public String name() {
        return "g";
    }

    @Override
    public Attribute attribute() {
        return this;
    }
}
