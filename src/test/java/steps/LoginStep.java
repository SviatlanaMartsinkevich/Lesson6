package steps;

import baseEntities.BaseStep;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginStep extends BaseStep {
    private LoginPage loginPage;

    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public void login(User user) {
        loginPage = new LoginPage(driver);
        loginPage.getEmailField().sendKeys(user.getEmail());
        loginPage.getPasswordField().sendKeys(user.getPassword());
        loginPage.getLoginButton().click();
    }
}
