package models;

import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public enum ProjectsType {

    SUITE_MODE_SINGLE_PROJECT("SuiteModeSingleProject"),
    SUITE_MODE_SINGLE_BASE_LINE_PROJECT("SuiteModelSingleBaseProject"),
    SUITE_MODEL_MULTI_PROJECT("SuiteModelMultiProject");

    String projectType;

    ProjectsType(String projectType) {
        this.projectType = projectType;
    }

    public String ProjectType() {
        return this.projectType;
    }

    public String getProjectType

    public String toString() {
        switch (this) {
            case SUITE_MODE_SINGLE_PROJECT:
                return "SuiteModeSingleProject";
            case SUITE_MODE_SINGLE_BASE_LINE_PROJECT:
                return "SuiteModelSingleBaseProject";
            case SUITE_MODEL_MULTI_PROJECT:
                return "SuiteModelMultiProject";
            default:
                throw new WebDriverManagerException("ProjectsType: " + this.name());
        }
    }
}
