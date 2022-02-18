package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private final By addProjectButtonSelector = By.id("sidebar-projects-add");
    private final By administratorButtonSelector = By.id("navigation-admin");
    private final String projectFind = "//*[@style='padding-left: 25px' and text()='replace']";

    public SelenideElement getAddProjectButton() {
        return $(addProjectButtonSelector);
    }

    public SelenideElement getAdministratorButton() {
        return $(administratorButtonSelector);
    }

    public SelenideElement getFindProject(String nameProject) {
        return $(By.xpath(projectFind.replace("replace", String.valueOf(nameProject))));
    }
}
