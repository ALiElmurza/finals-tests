package finals.tests.pagecontrollers;

import finals.tests.pagecomponents.LoginPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginController {

    private final WebDriver driver;
    private final LoginPage loginPage;
    private final By headerBy = By.xpath("//div[@class='login_logo']");

    public LoginController(WebDriver driver, LoginPage loginPage) {
        this.driver = driver;
        this.loginPage = loginPage;
    }

    @Step("Получение заголовка страницы авторизации")
    public String getLoginHeaderText() {
        return driver.findElement(headerBy).getText();
    }

    @Step("Ввод стандартного имени пользователя")
    public void enterValidUsername() {
        loginPage.getLoginStandard();
    }

    @Step("Ввод заблокированного имени пользователя")
    public void enterBlockedUsername() {
        loginPage.getLoginError();
    }

    @Step("Ввод пароля")
    public void enterPassword() {
        loginPage.getPassword();
    }

    @Step("Подтверждение входа")
    public void confirmLogin() {
        loginPage.submitButtonLogin();
    }

    @Step("Получение сообщения об ошибке авторизации")
    public String getLoginErrorMessage() {
        return loginPage.getErrorMessage();
    }
}