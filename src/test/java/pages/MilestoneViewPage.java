package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MilestoneViewPage {
    private final By editButtonSelector = By.xpath("//*[. ='Edit']");
    private final By messageMilestoneSelector = By.xpath("//*[. ='Successfully updated the milestone.']");

    public SelenideElement getEditButton() {
        return $(editButtonSelector);
    }

    public SelenideElement getMessageEditMilestone() {
        return $(messageMilestoneSelector);
    }
}
