package io.flexio.svg.generator.generator;

public interface Element {
    String name();
    Attribute attribute();

    static Element withoutAttribute(String name) {
        return new Element() {
            @Override
            public String name() {
                return name;
            }

            @Override
            public Attribute attribute() {
                return Attributes.EMPTY;
            }
        };
    }
}
