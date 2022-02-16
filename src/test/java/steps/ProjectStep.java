package steps;

import models.Project;
import pages.AddProjectPage;
import pages.ProjectPage;

public class ProjectStep {
    private AddProjectPage addProjectPage;
    private ProjectPage projectPage;

    public ProjectPage addNewProject(Project addProject) {
        addProjectPage = new AddProjectPage();
        addProjectPage.getNameProjectField().val(addProject.getName());
        addProjectPage.getAnnouncementField().val(addProject.getAnnouncement());
        addProjectPage.getIsShowAnnouncementField().click();
        addProjectPage.getType(addProject.getTypeOfProject()).click();
        addProjectPage.getAddProjectButton().click();
        projectPage = new ProjectPage();
        return projectPage;
    }
}
