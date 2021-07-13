package io.flexio.svg.generator.generator.tag.element.html;

import io.flexio.svg.generator.generator.ClosableElement;
import io.flexio.svg.generator.generator.tag.element.HTMLElement;

public final class Ol extends ClosableElement<Ol> implements HTMLElement<Ol> {
    @Override
    public String name() {
        return "ol";
    }
}
