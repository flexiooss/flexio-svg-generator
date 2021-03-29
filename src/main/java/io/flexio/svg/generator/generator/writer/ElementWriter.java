package io.flexio.svg.generator.generator.writer;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Attributes;
import io.flexio.svg.generator.generator.Element;

public interface ElementWriter {
    void open(String name, Attribute attributes);
    default void open(String name) {
        this.open(name, Attributes.EMPTY);
    }
    default void open(Element element) {
        this.open(element.name(), element.attribute());
    }

    void autoClosed(String name, Attribute attributes);
    default void autoClosed(String name) {
        this.autoClosed(name, Attributes.EMPTY);
    }
    default void autoClosed(Element element) {
        this.autoClosed(element.name(), element.attribute());
    }

    void close(String name);
    void text(String text);
}
