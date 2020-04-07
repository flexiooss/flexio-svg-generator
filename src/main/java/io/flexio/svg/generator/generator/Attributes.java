package io.flexio.svg.generator.generator;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Attributes implements Attribute {
    static public Attributes EMPTY = new Attributes() {};

    private Map<String, String> attributes = new LinkedHashMap<>();

    public Attribute attributes(String name, String value) {
        attributes.put(name, value);
        return this;
    }

    public Map<String, String> attributes() {
        return attributes;
    }

    public Attribute id(String id) {
        attributes("id", id);
        return this;
    }

    public Attribute classSelector(String classSelector) {
        attributes("class", classSelector);
        return this;
    }
}