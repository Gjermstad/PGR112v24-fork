import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main
{
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src/main/resources/database.properties"));
        } catch (IOException e) {
            System.out.println("Finner ikke filen");
        }

        System.out.println(properties.getProperty("username"));
    }
}
