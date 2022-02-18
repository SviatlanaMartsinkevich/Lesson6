package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final By emailSelector = By.id("name");
    private final By passwordSelector = By.id("password");
    private final By loginSelector = By.id("button_primary");

    public SelenideElement getEmailField() {
        return $(emailSelector);
    }

    public SelenideElement getPasswordField() {
        return $(passwordSelector);
    }

    public SelenideElement getLoginButton() {
        return $(loginSelector);
    }
}
