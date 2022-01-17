package models;

import core.ReadProperties;
import org.openqa.selenium.WebDriver;

import java.util.Locale;


public class Projects {

    private String name;
    private String comment;
    private String suiteModeSingleProject;
    private String suiteModelSingleBaseProject;
    private String suiteModelMultiProject;
    private String projectsType;

    public Projects() {
    }

    public String getName() {
        return name;
    }

    public Projects setName(String name) {
        this.name = name;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Projects setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getSuiteModeSingleProject() {
        return suiteModeSingleProject;
    }

    public Projects setSuiteModeSingleProject(String suiteModeSingleProject) {
        this.suiteModeSingleProject = suiteModeSingleProject;
        return this;
    }

    public String getSuiteModelSingleBaseProject() {
        return suiteModelSingleBaseProject;
    }

    public Projects setSuiteModelSingleBaseProject(String suiteModelSingleBaseProject) {
        this.suiteModelSingleBaseProject = suiteModelSingleBaseProject;
        return this;
    }

    public String getSuiteModelMultiProject() {
        return suiteModelMultiProject;
    }

    public Projects setSuiteModelMultiProject(String suiteModelMultiProject) {
        this.suiteModelMultiProject = suiteModelMultiProject;
        return this;
    }

    public String getProjectsType() {
        return projectsType;
    }

    public Projects setProjectsType(String projectsType) {
        this.projectsType = projectsType;
        return this;
    }

    /*public Projects(String projectTypeName) {
        switch (projectTypeName.toLowerCase(Locale.ROOT)) {
            case "SuiteModeSingleProject":
                projectsType = ProjectsType.SUITE_MODE_SINGLE_PROJECT;
                break;
            case "SuiteModelSingleBaseProject":
                projectsType = ProjectsType.SUITE_MODE_SINGLE_BASE_LINE_PROJECT;
                break;
            case "SuiteModelMultiProject":
                projectsType = ProjectsType.SUITE_MODEL_MULTI_PROJECT;
                break;
        }
    }
    */
}
