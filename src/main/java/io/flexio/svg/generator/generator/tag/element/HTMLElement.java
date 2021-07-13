package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;

public interface HTMLElement<H extends HTMLElement> extends Attribute {
    @SuppressWarnings("unchecked")
    default H namespaced() {
        attributes("xmlns", "http://www.w3.org/1999/xhtml");
        return (H) this;
    }
}
