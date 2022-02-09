package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class AddProjectPage {
    private final By nameProjectSelector = By.id("name");
    private final By announcementSelector = By.id("announcement");
    private final By isShowAnnouncementSelector = By.id("show_announcement");
    private final By addProjectButtonSelector = By.id("accept");
    private final By cancelButtonSelector = By.xpath("//a[contains(text(),'Cancel')][1]");
    private static String typeRadioButtonSelector = "//*[@name = 'suite_mode' and @value='replace']";
    private final By isCompletedSelector = By.id("is_completed");


    public SelenideElement getNameProjectField() {
        return $(nameProjectSelector);
    }

    public SelenideElement getAnnouncementField() {
        return $(announcementSelector);
    }

    public SelenideElement getIsShowAnnouncementField() {
        return $(isShowAnnouncementSelector);
    }

    public SelenideElement getAddProjectButton() {
        return $(addProjectButtonSelector);
    }

    public SelenideElement getCancelButton() {
        return $(cancelButtonSelector);
    }

    public SelenideElement getIsCompletedField() {
        return $(isCompletedSelector);
    }

    public SelenideElement getType(int type) {
        return $(By.xpath(typeRadioButtonSelector.replace("replace", String.valueOf(type))));
    }
}


