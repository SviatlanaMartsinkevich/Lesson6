package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProjectHeader {
    private final String projectOverviewPageSelector = "#navigation-projects";
    private final String projectTodoPageSelector = "#navigation-todos";
    private final String projectMilestonesPageSelector = "#navigation-milestones";
    private final String projectTestRunsPageSelector = "#navigation-runs";
    private final String projectTestCasesPageSelector = "#navigation-suites";
    private final String projectReportsPageSelector = "#navigation-reports";

    public SelenideElement getProjectOverviewPage() {
        return $(projectOverviewPageSelector);
    }

    public SelenideElement getProjectTodoPage() {
        return $(projectTodoPageSelector);
    }

    public SelenideElement getProjectMilestonesPage() {
        return $(projectMilestonesPageSelector);
    }

    public SelenideElement getProjectTestRunsPage() {
        return $(projectTestRunsPageSelector);
    }

    public SelenideElement getProjectTestCasesPage() {
        return $(projectTestCasesPageSelector);
    }

    public SelenideElement getProjectReportsPage() {
        return $(projectReportsPageSelector);
    }
}
