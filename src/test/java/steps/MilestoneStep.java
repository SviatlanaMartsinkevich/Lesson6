package steps;

import models.Milestone;
import pages.AddMilestonePage;
import pages.MilestonePage;
import pages.MilestoneViewPage;
import pages.ProjectOverviewPage;

public class MilestoneStep {
    private ProjectOverviewPage projectOverviewPage;
    private AddMilestonePage addMilestonePage;
    private MilestonePage milestonePage;
    private MilestoneViewPage milestoneViewPage;

    public MilestonePage addMilestone(Milestone addMilestone) {
        projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getAddMilestoneNavigation().click();
        addMilestonePage = new AddMilestonePage();
        addMilestonePage.getNameField().val(addMilestone.getName());
        addMilestonePage.getReferencesField().val(addMilestone.getReferences());
        addMilestonePage.getDescriptionField().val(addMilestone.getDescription());
        addMilestonePage.getIsCompletedCheckbox().click();
        addMilestonePage.getAddMilestoneButton().click();
        milestonePage = new MilestonePage();
        return milestonePage;
    }

    public MilestoneViewPage updateMilestone(Milestone addMilestone, Milestone updateMilestone) {
        projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getViewAllMilestonesSidebar().click();
        milestonePage = new MilestonePage();
        milestonePage.getFindMilestone(addMilestone.getName()).click();
        milestoneViewPage = new MilestoneViewPage();
        milestoneViewPage.getEditButton().click();
        addMilestonePage = new AddMilestonePage();
        addMilestonePage.getNameField().val(updateMilestone.getName());
        addMilestonePage.getReferencesField().val(updateMilestone.getReferences());
        addMilestonePage.getDescriptionField().val(updateMilestone.getDescription());
        addMilestonePage.getIsCompletedCheckbox().click();
        addMilestonePage.getAddMilestoneButton().click();
        return milestoneViewPage;
    }

    public MilestonePage deleteMilestone(Milestone updateMilestone) {
        projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getViewAllMilestonesSidebar().click();
        milestonePage = new MilestonePage();
        milestonePage.getFindMilestone(updateMilestone.getName()).click();
        milestoneViewPage = new MilestoneViewPage();
        milestoneViewPage.getEditButton().click();
        milestonePage.getDeleteMilestoneButton().click();
        milestonePage.getDeleteCheckbox().click();
        milestonePage.getAgreeButton().click();
        return milestonePage;
    }
}
