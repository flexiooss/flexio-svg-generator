package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.tag.property.Identifiable;
import io.flexio.svg.generator.generator.writer.ElementWriter;

public class ClipPath extends SVGElementAttribute<ClipPath> implements Element, Identifiable<ClipPath> {
    private static final String clipPath = "clipPath";
    @Override
    public String name() {
        return clipPath;
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public ClipPath clipPathUnits(Unit unit) {
        if (unit != null) {
            attributes("clipPathUnits", unit.toString());
        }
        return this;
    }

    public enum Unit {
        USER_SPACE_ON_USE {
            @Override
            public String toString() {
                return "userSpaceOnUse";
            }
        },
        OBJECT_BOUNDING_BOX {
            @Override
            public String toString() {
                return "objectBoundingBox";
            }
        }
    }

    public void open(ElementWriter writer) {
        writer.open(this);
    }

    public static void close(ElementWriter writer) {
        writer.close(clipPath);
    }
}
