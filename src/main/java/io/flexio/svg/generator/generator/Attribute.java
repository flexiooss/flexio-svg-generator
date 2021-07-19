package io.flexio.svg.generator.generator;

import java.util.LinkedHashMap;
import java.util.Map;

@FunctionalInterface
public interface Attribute {
    Map<String, String> attributesMap();

    default Attribute attributes(String name, String value) {
        attributesMap().put(name, value);
        return this;
    }

    Attribute EMPTY = LinkedHashMap::new;
}
