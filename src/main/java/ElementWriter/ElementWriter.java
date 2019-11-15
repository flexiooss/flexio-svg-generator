package ElementWriter;

import generator.Attribute;

import java.io.IOException;
import java.util.function.Supplier;

public interface ElementWriter {
    public void open(String name, Attribute attributes);
    public void autoClosed(String name, Attribute attributes);
    public void close(String name);
    public void text(String text);
}
