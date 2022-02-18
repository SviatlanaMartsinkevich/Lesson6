package models;

public class Milestone {
    private String name;
    private String references;
    private String parent;
    private String description;
    private int startDate;
    private int endDate;
    private boolean isCompleted;

    public Milestone() {
    }

    public String getName() {
        return name;
    }

    public Milestone setName(String name) {
        this.name = name;
        return this;
    }

    public String getReferences() {
        return references;
    }

    public Milestone setReferences(String references) {
        this.references = references;
        return this;
    }

    public String getParent() {
        return parent;
    }

    public Milestone setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Milestone setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getStartDate() {
        return startDate;
    }

    public Milestone setStartDate(int startDate) {
        this.startDate = startDate;
        return this;
    }

    public int getEndDate() {
        return endDate;
    }

    public Milestone setEndDate(int endDate) {
        this.endDate = endDate;
        return this;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public Milestone setCompleted(boolean completed) {
        isCompleted = completed;
        return this;
    }
}
