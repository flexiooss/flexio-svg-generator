package io.flexio.svg.generator.generator;

import java.util.Map;

public interface Attribute {
    default Attribute attributes(String name, String value) {
        attributes().put(name, value);
        return this;
    }
    Map<String, String> attributes();
}
