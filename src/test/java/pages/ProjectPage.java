package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProjectPage {
    private final String projectFind = "//*[text()='replace']";
    private final By returnToDashboardPageButtonSelector = By.id("navigation-dashboard");
    private final String projectLineFind = "//*[text()='replace']/../..";
    private final By deleteProjectButtonSelector = By.xpath("//*[@class='icon-small-delete']");
    private final By deleteCheckboxSelector = By.xpath("(//*[@class = 'dialog-confirm-busy']/..)//input");
    private final By agreeButtonSelector = By.xpath("//div[@id='deleteDialog']//a[contains(@class,'button button-ok')]");
    private final By cancelButtonSelector = By.xpath("//div[@id='deleteDialog']//a[contains(@class,'button button-cancel')]");
    private final By messageProjectDeletedSelector = By.xpath("//*[. = 'Successfully deleted the project.']");

    public SelenideElement getReturnToDashboardPageButton() {
        return $(returnToDashboardPageButtonSelector);
    }

    public SelenideElement getDeleteCheckbox() {
        return $(deleteCheckboxSelector);
    }

    public SelenideElement getAgreeButton() {
        return $(agreeButtonSelector);
    }

    public SelenideElement getCancelButton() {
        return $(cancelButtonSelector);
    }

    public SelenideElement getMessageProjectDeleted() {
        return $(messageProjectDeletedSelector);
    }

    public SelenideElement getDeleteProjectButton(String nameProject) {
        return $(getFindLineProject(nameProject).find(deleteProjectButtonSelector));
    }

    public SelenideElement getFindProject(String nameProject) {
        return $(By.xpath(projectFind.replace("replace", String.valueOf(nameProject))));
    }

    public SelenideElement getFindLineProject(String nameProject) {
        return $(By.xpath(projectLineFind.replace("replace", String.valueOf(nameProject))));
    }
}
