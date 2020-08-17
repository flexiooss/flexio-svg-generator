package io.flexio.svg.generator.generator;

import java.util.Base64;
import java.util.Map;

public interface Attribute {
    default Attribute attributes(String name, String value) {
        attributes().put(name, value);
        return this;
    }
    Map<String, String> attributes();

    default Attribute embed(String property, String data){
        if(property == null || property.trim().isEmpty() || data == null){
            return this;
        }
        attributes().put(property, encodeBase64(data));
        return this;
    }

    static String encodeBase64(String data){
        return new String(Base64.getEncoder().encode(data.getBytes()));
    }
}
