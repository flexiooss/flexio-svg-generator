package generator;

import java.util.HashMap;
import java.util.Map;

public interface Attribute {
    default Attribute attributes(String name, String value) {
        attributes().put(name, value);
        return this;
    }
    Map<String, String> attributes();
}
