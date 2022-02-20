package tests.gui;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import pages.*;
import steps.LoginStep;
import steps.MilestoneStep;
import steps.ProjectStep;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class MilestoneTest extends BaseTest {
    @Test
    public void addMilestoneTest() {
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

        MilestoneStep milestoneStep = new MilestoneStep();
        milestoneStep.addMilestone(addMilestone);

        MilestonePage milestonePage = new MilestonePage();
        milestonePage.getAddedMilestoneMessage().shouldBe(visible);

        ProjectOverviewPage projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getReturnToDashboardLink().click();
    }

    @Test(dependsOnMethods = "addMilestoneTest")
    public void updateMilestoneTest() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getFindProject(addProject.getName()).click();

        MilestoneStep milestoneStep = new MilestoneStep();
        milestoneStep.updateMilestone(addMilestone, updateMilestone);

        MilestoneViewPage milestoneViewPage = new MilestoneViewPage();
        milestoneViewPage.getMessageEditMilestone().shouldBe(visible);

        ProjectOverviewPage projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getReturnToDashboardLink().click();
    }

    @Test(dependsOnMethods = "updateMilestoneTest")
    public void deleteMilestoneTest() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getFindProject(addProject.getName()).click();

        MilestoneStep milestoneStep = new MilestoneStep();
        milestoneStep.deleteMilestone(updateMilestone);

        MilestonePage milestonePage = new MilestonePage();
        milestonePage.getDeletedMilestoneMessage().shouldBe(visible);

        ProjectOverviewPage projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getReturnToDashboardLink().click();
    }
}