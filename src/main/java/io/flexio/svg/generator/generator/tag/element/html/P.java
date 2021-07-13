package io.flexio.svg.generator.generator.tag.element.html;

import io.flexio.svg.generator.generator.ClosableElement;
import io.flexio.svg.generator.generator.tag.element.HTMLElement;

public final class P extends ClosableElement<P> implements HTMLElement<P> {
    @Override
    public String name() {
        return "p";
    }
}
