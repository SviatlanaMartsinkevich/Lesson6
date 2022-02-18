package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import core.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import models.Case;
import models.Milestone;
import models.Project;
import models.User;
import org.testng.annotations.*;
import pages.DashboardPage;
import pages.ProjectPage;
import steps.LoginStep;
import steps.ProjectStep;
import utils.Randomization;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected Project addProject;
    protected User user;
    protected Milestone addMilestone;
    protected Milestone updateMilestone;
    protected Case addCase;
    protected Case updateCase;

    @BeforeSuite
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
    }

    @BeforeClass
    public void openPage() {
        org.apache.log4j.BasicConfigurator.configure();

        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.browser = ReadProperties.getBrowserName();
        Configuration.startMaximized = true;
        Configuration.fastSetValue = true;
        Configuration.timeout = 15000;
    }

    @BeforeTest
    public void setUpData() {
        user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        addProject = new Project()
                .setName(Randomization.getRandomString(8))
                .setAnnouncement(Randomization.getRandomString(12))
                .setTypeOfProject(1);

        addMilestone = new Milestone()
                .setName(Randomization.getRandomString(8))
                .setReferences(Randomization.getRandomString(12))
                .setDescription(Randomization.getRandomString(10));

        updateMilestone = new Milestone()
                .setName(Randomization.getRandomString(8))
                .setReferences(Randomization.getRandomString(12))
                .setDescription(Randomization.getRandomString(10));

        addCase = new Case()
                .setTitle(Randomization.getRandomString(8))
                .setTypeOfTemplate(1)
                .setType(2)
                .setTypeOfPriority(0);


        updateCase = new Case()
                .setTitle(Randomization.getRandomString(8))
                .setTypeOfPriority(1);
    }
}
