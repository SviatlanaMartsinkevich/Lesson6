package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddMilestonePage {
    protected By nameFieldSelector = By.id("name");
    protected By referencesFieldSelector = By.id("reference");
    protected By parentFieldSelector = By.className("chzn-single");
    protected By descriptionFieldSelector = By.id("description_display");
    protected By startDateFieldSelector = By.id("start_on");
    protected By endDateFieldSelector = By.id("due_on");
    protected By isCompletedCheckboxSelector = By.id("is_completed");
    protected By addMilestoneButtonSelector = By.id("accept");
    protected By cancelButtonSelector = By.xpath("//a[contains(@class, 'milestone-form-cancel')]");

    public WebElement

}
