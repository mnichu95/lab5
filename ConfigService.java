package lab5;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigService {
    private Properties prop = new Properties();

    public ConfigService(String path) throws IOException {
        try (FileInputStream in = new FileInputStream(path)) {
            prop.load(in);
        }
    }

    public String getProp(String p) {
        return prop.getProperty(p, "");
    }
}
