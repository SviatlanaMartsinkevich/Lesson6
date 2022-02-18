package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MilestonePage {
    private final By addedMilestoneMessageSelector = By.xpath("//*[. = 'Successfully added the new milestone.']");
    private final By deletedMilestoneMessageSelector = By.xpath("//*[. = 'Successfully deleted the milestone.']");
    private final String findMilestone = "//*[text()='replace']";
    private final String findMilestoneField = "//*[. ='replace']/../../..";
    private final By deleteMilestoneButtonSelector = By.xpath("//*[. = 'Delete this milestone']");
    private final By deleteCheckboxSelector = By.xpath("(//*[ @id = 'deleteDialog'])//input");
    private final By agreeButtonSelector = By.xpath("//*[@id = 'deleteDialog']//a[contains(@class, 'button button-ok')]");
    private final By cancelButtonSelector = By.xpath("//*[@id = 'deleteDialog']//a[contains(@class, 'button button-cancel')]");

    public SelenideElement getAddedMilestoneMessage() {
        return $(addedMilestoneMessageSelector);
    }

    public SelenideElement getDeletedMilestoneMessage() {
        return $(deletedMilestoneMessageSelector);
    }

    public SelenideElement getFindMilestone(String nameMilestone) {
        return $(By.xpath(findMilestone.replace("replace", String.valueOf(nameMilestone))));
    }

    public SelenideElement getFindMilestoneField(String nameMilestone) {
        return $(By.xpath(findMilestoneField.replace("replace", String.valueOf(nameMilestone))));
    }

    public SelenideElement getDeleteMilestoneButton() {
        return $(deleteMilestoneButtonSelector);
    }

    public SelenideElement getDeleteCheckbox() {
        return $(deleteCheckboxSelector);
    }

    public SelenideElement getCancelButton() {
        return $(cancelButtonSelector);
    }

    public SelenideElement getAgreeButton() {
        return $(agreeButtonSelector);
    }
}
