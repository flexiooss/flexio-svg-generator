package io.flexio.svg.generator.generator;

import io.flexio.svg.generator.generator.tag.property.Classifiable;
import io.flexio.svg.generator.generator.tag.property.Identifiable;
import io.flexio.svg.generator.generator.tag.property.Stylable;

import java.util.Base64;

public abstract class SVGElementAttributes<A extends SVGElementAttributes> extends Attributes<A> implements Identifiable<A>, Classifiable<A>, Stylable<A> {
    public final Attribute embed(String property, String data) {
        if (property == null || property.trim().isEmpty() || data == null) {
            return this;
        }
        attributes().put(property, encodeBase64(data));
        return this;
    }

    private String encodeBase64(String data){
        return new String(Base64.getEncoder().encode(data.getBytes()));
    }
}
