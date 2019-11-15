package generator;

import java.util.HashMap;
import java.util.Map;

public interface Attribute {
    Map<String, String> attributes = new HashMap<>();
    default Attribute attributes(String name, String value) {
        attributes.put(name, value);
        return this;
    }
    default Map<String, String> attributes() {
        return attributes;
    }
    default Attribute id(String id) {
        attributes("id", id);
        return this;
    }
    default Attribute classSelector(String classSelector) {
        attributes("class", classSelector);
        return this;
    }
}
