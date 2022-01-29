package steps;

import baseEntities.BaseStep;
import models.Project;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;
import utils.Randomization;

public class ProjectSteps extends BaseStep {
    private AddProjectPage addProjectPage;

    public ProjectSteps(WebDriver driver) {
        super(driver);
    }

    public void addProject(Project project) {
        addProjectPage = new AddProjectPage();
        addProjectPage.getNameProjectField().sendKeys();
        addProjectPage.setName(Randomization.getRandomString(8));
        addProjectPage.setTypeOfProject(Randomization.getRandomType());

    }

    public void updateProject(Project currentProject, Project newProject) {

    }

    public void deleteProject(Project project) {

    }
}
