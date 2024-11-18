package finals.tests.pagecontrollers;

import finals.tests.configuration.AppConfig;
import finals.tests.pagecomponents.LoginPage;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public record HomeController(WebDriver driver) {
    private static AppConfig appConfig;

    @Step("Навигация на главную страницу")
    public void navigateToHome() {
        driver.get(appConfig.getProperty("BASE_URL"));
    }

    @Step("Получение LoginController для доступа к странице авторизации")
    public LoginController getLoginController() {
        return new LoginController(driver, new LoginPage(driver));
    }
}
