package generator.writer;

import generator.Attribute;
import generator.Attributes;

public interface ElementWriter {
    void open(String name, Attribute attributes);
    default void open(String name) {
        this.open(name, Attributes.EMPTY);
    }
    void autoClosed(String name, Attribute attributes);
    default void autoClosed(String name) {
        this.autoClosed(name, Attributes.EMPTY);
    }
    void close(String name);
    void text(String text);
}
