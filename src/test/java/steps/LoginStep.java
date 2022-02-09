package steps;

import baseEntities.BaseStep;
import models.User;
import pages.LoginPage;

public class LoginStep extends BaseStep {
    private LoginPage loginPage;

    public void login(User user) {
        loginPage = new LoginPage();
        loginPage.getEmailField().val(user.getEmail());
        loginPage.getPasswordField().val(user.getPassword());
        loginPage.getLoginButton().click();
    }
}
