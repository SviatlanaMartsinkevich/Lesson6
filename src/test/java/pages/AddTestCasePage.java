package pages;

import org.openqa.selenium.By;

public class AddTestCasePage {
    protected By titleFieldSelector = By.id("title");
    protected By estimateFieldSelector = By.id("estimate");
    protected By referencesFieldSelector = By.id("refs");
    protected By preconditionsFieldSelector = By.id("custom_preconds_display");
    protected By stepsFieldSelector = By.id("custom_steps_display");
    protected By expectedResultFieldSelector = By.id("custom_steps_display");
    protected By addTestCaseButtonSelector = By.id("accept");
    protected By addAndNextButtonSelector = By.id("accept_and_next");
    protected By cancelButtonSelector = By.xpath("//a[contains(@class, 'leave case-form-cancel')]");
    protected By typeOfSectionFieldSelector = By.xpath("//span[. = 'Test Cases']");
    protected By typeOfTemplateFieldSelector = By.xpath("//span[. = 'Test Case (Text)']");
    protected By typeFieldSelector = By.xpath("//span[. = 'Other']");
    protected By priorityTypeFieldSelector = By.xpath("//span[. = 'Medium']");
    protected By automationTypeFieldSelector = By.xpath("//a[@class = 'chzn-single']//span[. = 'None']");

}
