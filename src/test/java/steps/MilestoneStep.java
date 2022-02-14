package steps;

import models.Milestone;
import pages.AddMilestonePage;
import pages.AddProjectPage;
import pages.OverviewPage;

public class MilestoneStep {
    private OverviewPage overviewPage;
    private AddMilestonePage addMilestonePage;

    public void addMilestone(Milestone addMilestone) {
        overviewPage =new OverviewPage();
        overviewPage.getAddMilestoneNavigation().click();
        addMilestonePage = new AddMilestonePage();
        addMilestonePage.getNameField().val(addMilestone.getName());
        addMilestonePage.getReferencesField().val(addMilestone.getReferences());
        addMilestonePage.getDescriptionField().val(addMilestone.getDescription());
        addMilestonePage.getIsCompletedCheckbox().click();
        addMilestonePage.getAddMilestoneButton().click();
    }

    public void updateMilestone(Milestone addMilestone, Milestone updateMilestone) {
        overviewPage =new OverviewPage();
        overviewPage.getViewAllMilestonesSidebar().click();

    }
}
