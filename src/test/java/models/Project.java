package models;


public class Project {

    private String name;
    private String announcement;
    private boolean isShowAnnouncement;
    private int typeOfProject;
    private boolean isCompleted;

    public Project() {
    }

    public String getName() {
        return name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public Project setAnnouncement(String announcement) {
        this.announcement = announcement;
        return this;
    }

    public boolean isShowAnnouncement() {
        return isShowAnnouncement;
    }

    public Project setShowAnnouncement(boolean showAnnouncement) {
        isShowAnnouncement = showAnnouncement;
        return this;
    }

    public int getTypeOfProject() {
        return typeOfProject;
    }

    public Project setTypeOfProject(int typeOfProject) {
        this.typeOfProject = typeOfProject;
        return this;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public Project setCompleted(boolean completed) {
        isCompleted = completed;
        return this;
    }
}
