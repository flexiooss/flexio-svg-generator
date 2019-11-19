package ElementWriter;

import generator.Attribute;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class SvgWriterTest {

    private SvgWriter writer;
    private Attribute attributes;
    private PrintWriter printer;
    private StringWriter stringWriter;

    @Before
    public void setup() throws FileNotFoundException {
        attributes = new Attribute() {
            @Override
            public Map<String, String> attributes() {
                HashMap map =  new HashMap<>();
                map.put("attribute", "value");
                return map;
            }
        };
        stringWriter = new StringWriter();
        printer = new PrintWriter(stringWriter);
        writer = new SvgWriter(printer);
    }

    @Test
    public void writerOpenTest() throws FileNotFoundException {
        writer.open("tag", attributes);
        Assert.assertEquals(stringWriter.toString(), "<tag attribute=\"value\">");
    }

    @Test
    public void writerOpenWithoutAttributesTest() throws FileNotFoundException {
        writer.open("tag", null);
        Assert.assertEquals(stringWriter.toString(), "<tag>");
    }

    @Test
    public void writerAutoCloseTest() throws FileNotFoundException {
        writer.autoClosed("tag", attributes);
        Assert.assertEquals(stringWriter.toString(), "<tag attribute=\"value\"/>");
    }

    @Test
    public void writerCloseTest() throws FileNotFoundException {
        writer.close("tag");
        Assert.assertEquals(stringWriter.toString(), "</tag>");
    }
}
