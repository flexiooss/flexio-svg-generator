package ElementWriter;

import generator.Attribute;

import java.io.*;
import java.util.Map;

public class SvgWriter implements ElementWriter {
    private PrintWriter outputStream;

    public SvgWriter(PrintWriter outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void open(String name, Attribute attributes) {
        this.outputStream.write("<" + name + printAttributes(attributes) + ">");
    }

    @Override
    public void autoClosed(String name, Attribute attributes) {
        this.outputStream.write("<" + name +  printAttributes(attributes) + "/>");
    }

    @Override
    public void close(String name) {
        this.outputStream.write("</" + name + ">");
    }

    @Override
    public void text(String text) {
        this.outputStream.write(text);
    }

    private static String printAttributes(Attribute attributes) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : attributes.attributes().entrySet()) {
            stringBuilder.append(" ")
                    .append(entry.getKey())
                    .append("=\"")
                    .append(entry.getValue())
                    .append("\"");
        }
        return stringBuilder.toString();
    }
}
