package finals.tests.pagecomponents;


import finals.tests.configuration.AppConfig;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static AppConfig config;
    private final WebDriver driver;
    private final LoginElementsHandler loginElements;

    public static void setUp() {
        config = new AppConfig();
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.loginElements = new LoginElementsHandler(driver);
    }

    @Step("Проверка наименования сайта")
    public String getTextHeader() {
        return loginElements.getTextPage();
    }

    @Step("Ввод стандартного логина")
    public void getLoginStandard() {
        loginElements.inputLogin(config.getProperty("STANDARD_USERNAME"));
    }

    @Step("Ввод логина для проверки ошибки")
    public void getLoginError() {
        loginElements.inputLogin(config.getProperty("LOCKED_OUT_USERNAME"));
    }

    @Step("Ввод пароля")
    public void getPassword() {
        loginElements.inputPassword(config.getProperty("PASSWORD"));
    }

    @Step("Ввод логина пользователя PERFORMANCE_USERNAME")
    public void getLoginUsernamePerformance() {
        loginElements.inputLogin(config.getProperty("PERFORMANCE_USERNAME"));
    }

    @Step("Нажатие на кнопку 'Login'")
    public void submitButtonLogin() {
        loginElements.submitButton();
    }

    @Step("Получение сообщения об ошибке при авторизации")
    public String getErrorMessage() {
        return loginElements.getErrorMessage();
    }
}
