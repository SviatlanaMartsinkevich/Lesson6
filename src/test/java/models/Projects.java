package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Projects  {

    private String name;
    private String comment;

    public Projects() {
    }

    public String getName() {
        return name;
    }

    public Projects setName(String name) {
        this.name = name;
        return this
    }

    public String getComment() {
        return comment;
    }

    public Projects setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /*   private List<Projects> projectsType = new ArrayList<>();
    private String suiteModeSingleProject;
    private String suiteModelSingleBaseProject;
    private String suiteModelMultiProject;

    public Projects(String suiteModeSingleProject, String suiteModelSingleBaseProject, String suiteModelMultiProject) {
        this.suiteModeSingleProject = suiteModeSingleProject;
        this.suiteModelSingleBaseProject = suiteModelSingleBaseProject;
        this.suiteModelMultiProject = suiteModelMultiProject;
    }

    public List<Projects> getProjectsType() {
        return projectsType;
    }

    public void setProjectsType(List<Projects> projectsType) {
        this.projectsType = projectsType;
    }

    public String getSuiteModeSingleProject() {
        return suiteModeSingleProject;
    }

    public void setSuiteModeSingleProject(String suiteModeSingleProject) {
        this.suiteModeSingleProject = suiteModeSingleProject;
    }

    public String getSuiteModelSingleBaseProject() {
        return suiteModelSingleBaseProject;
    }

    public void setSuiteModelSingleBaseProject(String suiteModelSingleBaseProject) {
        this.suiteModelSingleBaseProject = suiteModelSingleBaseProject;
    }

    public String getSuiteModelMultiProject() {
        return suiteModelMultiProject;
    }

    public void setSuiteModelMultiProject(String suiteModelMultiProject) {
        this.suiteModelMultiProject = suiteModelMultiProject;
    }
*/

   /* Random random = new Random();
    int number = random.nextInt(2);

    public Projects() {
    }

    public Projects(int number) {
        switch (0) {
            case "SuiteModeSingleProject":
                projectsType = ProjectsType.SUITE_MODE_SINGLE_PROJECT;
                break;
        }
        switch (1) {
            case "SuiteModelSingleBaseProject":
                projectsType = ProjectsType.SUITE_MODE_SINGLE_BASE_LINE_PROJECT;
                break;
        }
        switch (2) {
            case "SuiteModelMultiProject":
                projectsType = ProjectsType.SUITE_MODEL_MULTI_PROJECT;
                break;
        }
    }
    */



}
