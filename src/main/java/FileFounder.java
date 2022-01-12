import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class FileFounder {
    public static void main(String[] args) throws URISyntaxException {
        FileFounder.getAbsolutePath();
    }

    public static void getAbsolutePath() throws URISyntaxException {
//        File file = new File("chromedriver.exe");//full file path URL
//        String absolutePath = file.getAbsolutePath();
//        System.out.println(absolutePath);

//        ClassLoader classLoader = FileFounder.class.getClassLoader();
//        String path = classLoader.getResource("chromedriver.exe").getPath();
//        System.out.println(path);

        URL resource = FileFounder.class.getResource("target/pom.xml");
        System.out.println( Paths.get(resource.toURI()).toFile());
    }
}