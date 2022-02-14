package steps;

import models.Project;
import pages.AddProjectPage;

public class ProjectStep {
    private AddProjectPage addProjectPage;

    public void addNewProject(Project addProject) {
        addProjectPage = new AddProjectPage();
        addProjectPage.getNameProjectField().val(addProject.getName());
        addProjectPage.getAnnouncementField().val(addProject.getAnnouncement());
        addProjectPage.getIsShowAnnouncementField().click();
        addProjectPage.getType(addProject.getTypeOfProject()).click();
        addProjectPage.getAddProjectButton().click();
    }
}
