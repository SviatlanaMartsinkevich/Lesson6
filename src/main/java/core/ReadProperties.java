package core;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static Properties properties = null;
    private static String fileName = "config.properties";

    static{
        properties = new Properties();
        try {
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() { return properties.getProperty("url"); }
    public static String getBrowserType() { return properties.getProperty("browserType"); }
    public static boolean getHeadless() { return properties.getProperty("headless").equalsIgnoreCase("true"); }
    public static String getUsername() { return properties.getProperty("username"); }
    public static String getPassword() { return properties.getProperty("password"); }
    public static String getProjectName() { return properties.getProperty("projectName"); }
    public static String getAnnouncement() { return properties.getProperty("announcement"); }
    public static String getName() {return  properties.getProperty("name");}
    public static int getTimeOut() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }


}
