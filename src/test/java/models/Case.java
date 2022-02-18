package models;

public class Case {
    private String title;
    private String estimate;
    private String references;
    private String preconditions;
    private String steps;
    private String expectedResult;

    private String section;
    private int typeOfTemplate;
    private int type;
    private int typeOfPriority;
    private String automationType;

    public Case() {
    }

    public String getTitle() {
        return title;
    }

    public Case setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getEstimate() {
        return estimate;
    }

    public Case setEstimate(String estimate) {
        this.estimate = estimate;
        return this;
    }

    public String getReferences() {
        return references;
    }

    public Case setReferences(String references) {
        this.references = references;
        return this;
    }

    public String getPreconditions() {
        return preconditions;
    }

    public Case setPreconditions(String preconditions) {
        this.preconditions = preconditions;
        return this;
    }

    public String getSteps() {
        return steps;
    }

    public Case setSteps(String steps) {
        this.steps = steps;
        return this;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public Case setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
        return this;
    }

    public String getSection() {
        return section;
    }

    public Case setSection(String section) {
        this.section = section;
        return this;
    }

    public int getTypeOfTemplate() {
        return typeOfTemplate;
    }

    public Case setTypeOfTemplate(int typeOfTemplate) {
        this.typeOfTemplate = typeOfTemplate;
        return this;
    }

    public int getType() {
        return type;
    }

    public Case setType(int type) {
        this.type = type;
        return this;
    }

    public int getTypeOfPriority() {
        return typeOfPriority;
    }

    public Case setTypeOfPriority(int typeOfPriority) {
        this.typeOfPriority = typeOfPriority;
        return this;
    }

    public String getAutomationType() {
        return automationType;
    }

    public Case setAutomationType(String automationType) {
        this.automationType = automationType;
        return this;
    }
}
