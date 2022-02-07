package models;

public class Case {
   private String title;
   private String estimate;
   private String references;
   private String preconditions;
   private String steps;
   private String expectedResult;

   private String section;
   private String typeOfTemplate;
   private String type;
   private String typeOfPriority;
   private String automationType;

    public Case() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public String getPreconditions() {
        return preconditions;
    }

    public void setPreconditions(String preconditions) {
        this.preconditions = preconditions;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTypeOfTemplate() {
        return typeOfTemplate;
    }

    public void setTypeOfTemplate(String typeOfTemplate) {
        this.typeOfTemplate = typeOfTemplate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeOfPriority() {
        return typeOfPriority;
    }

    public void setTypeOfPriority(String typeOfPriority) {
        this.typeOfPriority = typeOfPriority;
    }

    public String getAutomationType() {
        return automationType;
    }

    public void setAutomationType(String automationType) {
        this.automationType = automationType;
    }
}
