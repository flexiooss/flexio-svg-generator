package generator;

import java.util.HashMap;
import java.util.Map;

public abstract class Attributes implements Attribute {
    private Map<String, String> attributes;

    public Attributes() {
        attributes = new HashMap<>();
    }


    public Attributes attributes(String name, String value) {
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
