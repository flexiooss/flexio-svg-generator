package TRS;

import ElementWriter.SvgWriter;
import generator.element.Link;
import generator.element.Rectangle;
import generator.element.Svg;
import generator.type.Point;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


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
        DataSet dataSet = DataSet.builder()
                .event("click")
                .recordId(String.valueOf(i))
                .resourceId("123456")
                .type("record")
                .build();

        Rectangle rect = new Rectangle()
                .height(HEIGHT)
                .width(String.valueOf(data.width()))
                .position(new Point(String.valueOf(positionX), "0"));
        rect.fill(data.color());
        rect.id("rect" + i);
        rect.classSelector("zone");
        dataSet.to(rect);


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
