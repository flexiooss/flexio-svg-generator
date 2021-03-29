package io.flexio.svg.generator.generator;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Attributes<C extends Attribute> implements Attribute {
    static public Attributes EMPTY = new Attributes() {};

    private final Map<String, String> attributes = new LinkedHashMap<>();

    @Override
    public final C attributes(String name, String value) {
        attributes().put(name, value);
        return (C) this;
    }

    @Override
    public Map<String, String> attributes() {
        return attributes;
    }
}