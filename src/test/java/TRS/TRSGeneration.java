package TRS;

import ElementWriter.SvgWriter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import generator.element.Link;
import generator.element.Rectangle;
import generator.element.Svg;
import generator.type.Point;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.flexio.apis.dashboards.svg.embedded.Action;
import io.flexio.apis.dashboards.svg.embedded.Event;
import io.flexio.apis.dashboards.svg.embedded.EventsSpec;
import io.flexio.apis.dashboards.svg.embedded.Show;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Base64;


public class TRSGeneration {
    private int positionX;
    private PrintWriter outputStream;
    private SvgWriter writer;

    public TRSGeneration() throws FileNotFoundException {
        this.outputStream = new PrintWriter("src/test/java/TRS/test.svg");
        writer = new SvgWriter(outputStream);
        this.positionX = 0;
    }

    public void writeFile() {
        try {
            writer.open("svg", new Svg().height("100%").width("100%").lang("fr"));
            ArrayList<Data> list = new ArrayList<>();
            list.add(new Data(200, "yellow"));
            list.add(new Data(100, "Lime"));
            list.add(new Data(20, "red"));
            list.add(new Data(100, "Lime"));
            list.add(new Data(20, "red"));
            list.add(new Data(200, "Lime"));
            list.add(new Data(200, "yellow"));

            for (int i = 0; i < list.size(); i++) {
                this.setRange(list.get(i), i);
            }

            writer.close("svg");
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setRange(Data data, int i) throws IOException {
        String HEIGHT = "20";

        EventsSpec eventsSpec = EventsSpec.builder().events(
                Event.builder().eventType(Event.EventType.CLICK)
                        .action(Action.builder()
                                .show(Show.builder().description("recordId " + i + "; resourceId 123456; type record").build()).build()).build()
        ).build();

        String json = "";
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            json = mapper.writeValueAsString(eventsSpec);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        Rectangle rect = new Rectangle()
                .height(HEIGHT)
                .width(String.valueOf(data.width()))
                .position(new Point(String.valueOf(positionX), "0"));
        rect.fill(data.color());
        rect.id("rect" + i);
        rect.classSelector("zone");
        rect.attributes("data-data", new String(Base64.getEncoder().encode(json.getBytes())));



        writer.open("a", new Link().href("#"));
        writer.autoClosed("rect", rect);
        writer.close("a");

        positionX += data.width();
    }

    static class Data {
        private int width;
        private String color;

        public Data(int width, String color) {
            this.width = width;
            this.color = color;
        }

        public String color() {
            return color;
        }

        public int width() {
            return width;
        }
    }
}
