package io.flexio.svg.generator.generator.tag.element.html;

import io.flexio.svg.generator.generator.ClosableElement;
import io.flexio.svg.generator.generator.tag.element.HTMLElement;

public final class Li extends ClosableElement<Li> implements HTMLElement<Li> {
    @Override
    public String name() {
        return "il";
    }
}
