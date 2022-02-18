package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import pages.*;
import steps.CaseStep;
import steps.LoginStep;
import steps.ProjectStep;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class CaseTest extends BaseTest {

    @Test
    public void addCaseTest() {
        open("/");

        LoginStep loginStep = new LoginStep();
        loginStep.login(user);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getAddProjectButton().click();

        ProjectStep projectStep = new ProjectStep();
        projectStep.addNewProject(addProject);

        ProjectPage projectPage = new ProjectPage();
        projectPage.getReturnToDashboardPageButton().click();

        dashboardPage.getFindProject(addProject.getName()).click();

        CaseStep caseStep = new CaseStep();
        caseStep.addCase(addCase);

        CaseViewPage caseViewPage = new CaseViewPage();
        caseViewPage.getAddedCaseMessage().shouldBe(visible);

        ProjectOverviewPage projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getReturnToDashboardLink().click();
    }

    @Test(dependsOnMethods = "addCaseTest")
    public void updateCaseTest() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getFindProject(addProject.getName()).click();

        CaseStep caseStep = new CaseStep();
        caseStep.updateCase(addCase, updateCase);

        CaseViewPage caseViewPage = new CaseViewPage();
        caseViewPage.getUpdatedCaseMessage().shouldBe(visible);

        ProjectOverviewPage projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getReturnToDashboardLink().click();
    }

    @Test(dependsOnMethods = "updateCaseTest")
    public void deleteCaseTest() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getFindProject(addProject.getName()).click();

        CaseStep caseStep = new CaseStep();
        caseStep.deleteCase(updateCase);

        CasePage casePage = new CasePage();
        casePage.getFindCase(updateCase.getTitle()).shouldNotBe(visible);

        ProjectOverviewPage projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getReturnToDashboardLink().click();
    }
}
