package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CasePage {
    private final String findCaseSelector = "//*[text()='replace']";
    private final String findCaseLineSelector = "//*[text()='replace']/../../..";
    private final By editLinkSelector = By.xpath("//a[@class = 'editLink']");
    private final By deleteLinkSelector = By.xpath("//a[@class = 'deleteLink']");
    private final By deletedButtonSelector = By.xpath("//*[@id = 'casesDeletionDialog']//a[contains(text(), 'Mark as Deleted')]");
    private final By deletedPermanentlyButtonSelector = By.xpath("//*[@id = 'casesDeletionDialog']//a[contains(text(), 'Delete Permanently')]");
    private final By cancelButtonSelector = By.xpath("//*[@id = 'casesDeletionDialog']//a[contains(text(), 'Cancel')]");

    public SelenideElement getFindCase(String caseName) {
        return $(By.xpath(findCaseSelector.replace("replace", String.valueOf(caseName))));
    }

    public SelenideElement getFindCaseField(String caseName) {
        return $(By.xpath(findCaseLineSelector.replace("replace", String.valueOf(caseName))));
    }

    public SelenideElement getEditLink(String caseName) {
        return $(getFindCaseField(caseName)
                .hover()
                .findElement(editLinkSelector));
    }

    public SelenideElement getDeleteLink(String caseName) {
        return $(getFindCaseField(caseName)
                .hover()
                .findElement(deleteLinkSelector));
    }

    public SelenideElement getDeletedButton() {
        return $(deletedButtonSelector);
    }

    public SelenideElement getDeletedPermanentlyButton() {
        return $(deletedPermanentlyButtonSelector);
    }

    public SelenideElement getCancelButton() {
        return $(cancelButtonSelector);
    }
}
