package io.flexio.svg.generator.generator.tag.element;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;

public class CircleTest {
    @Test
    public void Circle_5px() {
        Circle c = new Circle().radius("5");
    }
}