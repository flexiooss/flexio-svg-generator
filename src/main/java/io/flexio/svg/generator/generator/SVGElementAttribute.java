package io.flexio.svg.generator.generator;

import io.flexio.svg.generator.generator.tag.property.Classifiable;
import io.flexio.svg.generator.generator.tag.property.ClipPathHolder;
import io.flexio.svg.generator.generator.tag.property.Identifiable;
import io.flexio.svg.generator.generator.tag.property.Stylable;

import java.util.Base64;

public abstract class SVGElementAttribute<A extends SVGElementAttribute> extends Attributes<A> implements
        Identifiable<A>, Classifiable<A>, Stylable<A>, ClipPathHolder<A>
{
    @SuppressWarnings("unchecked")
    public final A embed(String property, String data) {
        if (property != null && ! property.trim().isEmpty() && data != null) {
            attributes().put(property, encodeBase64(data));
        }
        return (A) this;
    }

    private String encodeBase64(String data){
        return new String(Base64.getEncoder().encode(data.getBytes()));
    }
}
