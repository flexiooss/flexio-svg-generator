package io.flexio.svg.generator.generator.tag.element.html;

import io.flexio.svg.generator.generator.ClosableElement;
import io.flexio.svg.generator.generator.tag.element.HTMLElement;

public final class Div extends ClosableElement<Div> implements HTMLElement<Div> {
    @Override
    public String name() {
        return "div";
    }
}
