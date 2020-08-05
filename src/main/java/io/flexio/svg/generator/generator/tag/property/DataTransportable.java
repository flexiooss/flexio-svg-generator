package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;

import java.util.Base64;

public interface DataTransportable extends Attribute {
    default DataTransportable embed(String property, String data){
        if(property == null || property.trim().isEmpty() || data == null){
            return this;
        }
        attributes(property, encodeBase64(data));
        return this;
    }

    static String  encodeBase64(String data){
        return new String(Base64.getEncoder().encode(data.getBytes()));
    }
}
