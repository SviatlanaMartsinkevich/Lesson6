package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CaseViewPage {
    private final By addedCaseMessageSelector = By.xpath("//*[contains(text(), 'Successfully added the new test case.')]");
    private final By updatedCaseMessageSelector = By.xpath("//*[. = 'Successfully updated the test case.']");
    private final By deletedCaseMessageSelector = By.xpath("//*[. = 'Successfully flagged the test case as deleted.']");

    public SelenideElement getAddedCaseMessage() {
        return $(addedCaseMessageSelector);
    }

    public SelenideElement getUpdatedCaseMessage() {
        return $(updatedCaseMessageSelector);
    }

    public SelenideElement getDeletedCaseMessage() {
        return $(deletedCaseMessageSelector);
    }

}
