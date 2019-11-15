import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            new TRSGeneration().writeFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
