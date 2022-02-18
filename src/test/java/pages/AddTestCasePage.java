package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddTestCasePage {
    private final String titleFieldSelector = "#title";
    private final String estimateFieldSelector = "#estimate";
    private final String referencesFieldSelector = "#refs";
    private final String preconditionsFieldSelector = "#custom_preconds_display";
    private final String stepsFieldSelector = "#custom_steps_display";
    private final String expectedResultFieldSelector = "#custom_steps_display";
    private final String addTestCaseButtonSelector = "#accept";
    private final String addAndNextButtonSelector = "#accept_and_next";
    private final By cancelButtonSelector = By.xpath("//a[contains(@class, 'leave case-form-cancel')]");
    private final String sectionDropDownSelector = "#section_id_chzn";
    private final By typeOfSectionFieldSelector = By.xpath("//span[. = 'Test Cases']");
    private final String templateDropDownSelector = "#template_id_chzn";
    private final String typeOfTemplateFieldSelector = "//*[@id = 'template_id_chzn_o_replace']";
    private final String typeDropDownSelector = "#type_id_chzn";
    private final String typeFieldSelector = "//*[@id = 'type_id_chzn_o_replace']";
    private final String priorityDropDownSelector = "#priority_id_chzn";
    private final String priorityTypeFieldSelector = "//*[@id = 'priority_id_chzn_o_replace']";
    private final String automationTypeDropDownSelector = "#custom_automation_type_chzn";
    private final String automationTypeFieldSelector = "//*[@id = 'custom_automation_type_chzn_o_replace']";

    public SelenideElement getTitleField() {
        return $(titleFieldSelector);
    }

    public SelenideElement getEstimateField() {
        return $(estimateFieldSelector);
    }

    public SelenideElement getReferencesFieldSelector() {
        return $(referencesFieldSelector);
    }

    public SelenideElement getPreconditionsField() {
        return $(preconditionsFieldSelector);
    }

    public SelenideElement getStepsField() {
        return $(stepsFieldSelector);
    }

    public SelenideElement getExpectedResultField() {
        return $(expectedResultFieldSelector);
    }

    public SelenideElement getAddTestCaseButton() {
        return $(addTestCaseButtonSelector);
    }

    public SelenideElement getAddAndNextButton() {
        return $(addAndNextButtonSelector);
    }

    public SelenideElement getCancelButton() {
        return $(cancelButtonSelector);
    }

    public SelenideElement getSectionDropDown() {
        return $(sectionDropDownSelector);
    }

    public SelenideElement getTypeOfSectionField() {
        return $(typeOfSectionFieldSelector);
    }

    public SelenideElement getTemplateDropDown() {
        return $(templateDropDownSelector);
    }

    public SelenideElement getTypeOfTemplateField(int val) {
        return $(By.xpath(typeOfTemplateFieldSelector.replace("replace", String.valueOf(val))));
    }

    public SelenideElement getTypeDropDown() {
        return $(typeDropDownSelector);
    }

    public SelenideElement getTypeField(int val) {
        return $(By.xpath(typeFieldSelector.replace("replace", String.valueOf(val))));
    }

    public SelenideElement getPriorityDropDown() {
        return $(priorityDropDownSelector);
    }

    public SelenideElement getPriorityTypeField(int val) {
        return $(By.xpath(priorityTypeFieldSelector.replace("replace", String.valueOf(val))));
    }

    public SelenideElement getAutomationTypeDropDown() {
        return $(automationTypeDropDownSelector);
    }

    public SelenideElement getAutomationTypeField(int val) {
        return $(By.xpath(automationTypeFieldSelector.replace("replace", String.valueOf(val))));
    }
}
