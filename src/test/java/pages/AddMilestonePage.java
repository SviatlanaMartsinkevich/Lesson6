package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class AddMilestonePage {
    private final By nameFieldSelector = By.id("name");
    private final By referencesFieldSelector = By.id("reference");
    private final By parentFieldSelector = By.className("chzn-single");
    private final By descriptionFieldSelector = By.id("description_display");
    private final By startDateFieldSelector = By.id("start_on");
    private final By endDateFieldSelector = By.id("due_on");
    private final By isCompletedCheckboxSelector = By.id("is_completed");
    private final By addMilestoneButtonSelector = By.id("accept");
    private final By cancelButtonSelector = By.xpath("//a[contains(@class, 'milestone-form-cancel')]");

    public SelenideElement getNameField() { return $(nameFieldSelector);}
    public SelenideElement getReferencesField() { return $(referencesFieldSelector);}
    public SelenideElement getParentField() { return $(parentFieldSelector);}
    public SelenideElement getDescriptionField() { return $(descriptionFieldSelector);}
    public SelenideElement getStartDateField() { return $(startDateFieldSelector);}
    public SelenideElement getEndDateField() { return $(endDateFieldSelector);}
    public SelenideElement getIsCompletedCheckbox() { return $(isCompletedCheckboxSelector);}
    public SelenideElement getAddMilestoneButton() { return $(addMilestoneButtonSelector);}
    public SelenideElement getCancelButton() { return $(cancelButtonSelector);}
}
