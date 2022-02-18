package steps;

import models.Case;
import pages.AddTestCasePage;
import pages.CasePage;
import pages.CaseViewPage;
import pages.ProjectOverviewPage;

public class CaseStep {
    private ProjectOverviewPage projectOverviewPage;
    private AddTestCasePage addTestCasePage;
    private CaseViewPage caseViewPage;
    private CasePage casePage;

    public CaseViewPage addCase(Case addCase) {
        projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getAddTestCasesSidebar().click();
        addTestCasePage = new AddTestCasePage();
        addTestCasePage.getTitleField().val(addCase.getTitle());
        addTestCasePage.getTemplateDropDown().click();
        addTestCasePage.getTypeOfTemplateField(addCase.getTypeOfTemplate()).click();
        addTestCasePage.getTypeDropDown().click();
        addTestCasePage.getTypeField(addCase.getType()).click();
        addTestCasePage.getPriorityDropDown().click();
        addTestCasePage.getPriorityTypeField(addCase.getTypeOfPriority()).click();
        addTestCasePage.getAddTestCaseButton().click();
        caseViewPage = new CaseViewPage();
        return caseViewPage;
    }

    public CaseViewPage updateCase(Case addCase, Case updateCase) {
        projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getViewAllTestCasesSidebar().click();
        casePage = new CasePage();
        casePage.getEditLink(addCase.getTitle()).click();
        addTestCasePage = new AddTestCasePage();
        addTestCasePage.getTitleField().val(updateCase.getTitle());
        addTestCasePage.getPriorityDropDown().click();
        addTestCasePage.getPriorityTypeField(updateCase.getTypeOfPriority()).click();
        addTestCasePage.getAddTestCaseButton().click();
        caseViewPage = new CaseViewPage();
        return caseViewPage;
    }

    public CaseViewPage deleteCase(Case updateCase) {
        projectOverviewPage = new ProjectOverviewPage();
        projectOverviewPage.getViewAllTestCasesSidebar().click();
        casePage = new CasePage();
        casePage.getDeleteLink(updateCase.getTitle()).click();
        casePage.getDeletedButton().click();
        caseViewPage = new CaseViewPage();
        return caseViewPage;
    }
}
