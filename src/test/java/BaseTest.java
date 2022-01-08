import org.testng.annotations.*;

@Listeners(Listener.class)
public class BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println();
        System.out.println("Method started");
        System.out.println();

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println();
        System.out.println("Method finished");
        System.out.println();
    }
}
