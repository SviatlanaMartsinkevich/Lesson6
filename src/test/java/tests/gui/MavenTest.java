package tests.gui;

import org.testng.annotations.Test;

@Test
public class MavenTest {
    public  void parameterTest() {
        System.out.println(System.getProperty("testProp"));
    }
}
