package io.flexio.svg.generator.generator;

import java.util.Base64;
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
    public final Map<String, String> attributes() {
        return attributes;
    }

    @Override
    public final C embed(String property, String data) {
        if(property == null || property.trim().isEmpty() || data == null){
            return (C) this;
        }
        attributes().put(property, Attribute.encodeBase64(data));
        return (C) this;
    }

    public C id(String id) {
        attributes("id", id);
        return (C) this;
    }

    public C classSelector(String classSelector) {
        attributes("class", classSelector);
        return (C) this;
    }
}