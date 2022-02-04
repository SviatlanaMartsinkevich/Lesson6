package baseEntities;

import core.BrowsersService;
import core.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import steps.LoginStep;
import steps.ProjectSteps;
import utils.Listener;
import utils.Waits;

@Listeners(Listener.class)
public class BaseTest {
    protected WebDriver driver;
    protected BrowsersService browsersService;
    protected Waits waits;
    protected ProjectSteps projectSteps;
    protected LoginStep loginStep;

    @BeforeMethod
    public void setUp() {
        browsersService = new BrowsersService();
        driver = browsersService.getDriver();
        waits = new Waits(driver);
        projectSteps = new ProjectSteps(driver);
        loginStep = new LoginStep(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void closePage() {
        driver.quit();
    }
}
