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
    private final By typeOfSectionFieldSelector = By.xpath("//span[. = 'Test Cases']");
    private final By typeOfTemplateFieldSelector = By.xpath("//span[. = 'Test Case (Text)']");
    private final By typeFieldSelector = By.xpath("//span[. = 'Other']");
    private final By priorityTypeFieldSelector = By.xpath("//span[. = 'Medium']");
    private final By automationTypeFieldSelector = By.xpath("//a[@class = 'chzn-single']//span[. = 'None']");

    public SelenideElement getTitleField() { return $(titleFieldSelector);}
    public SelenideElement getEstimateField() { return $(estimateFieldSelector);}
    public SelenideElement getReferencesFieldSelector() { return $(referencesFieldSelector);}
    public SelenideElement getPreconditionsField() { return $(preconditionsFieldSelector);}
    public SelenideElement getStepsField() { return $(stepsFieldSelector);}
    public SelenideElement getExpectedResultField() { return $(expectedResultFieldSelector);}
    public SelenideElement getAddTestCaseButton() { return $(addTestCaseButtonSelector);}
    public SelenideElement getAddAndNextButton() { return $(addAndNextButtonSelector);}
    public SelenideElement getCancelButton() { return $(cancelButtonSelector);}
    public SelenideElement getTypeOfSectionField() { return $(typeOfSectionFieldSelector);}
    public SelenideElement getTypeOfTemplateField() { return $(typeOfTemplateFieldSelector);}
    public SelenideElement getTypeField() { return $(typeFieldSelector);}
    public SelenideElement getPriorityTypeField() { return $(priorityTypeFieldSelector);}
    public SelenideElement getAutomationTypeField() { return $(automationTypeFieldSelector);}
}
