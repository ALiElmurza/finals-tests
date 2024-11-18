package finals.tests.pagecomponents;

import finals.tests.configuration.AppConfig;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElementsHandler {

    private static AppConfig config;
    private final By logoBy = By.xpath("//div[@class='login_logo']");
    private final By usernameBy = By.xpath("//input[@placeholder='Username']");
    private final By passwordBy = By.xpath("//input[@placeholder='Password']");
    private final By submitBy = By.xpath("//input[@type='submit']");
    private final By errorBy = By.xpath("//div[@class='error-message-container error']/h3");
    private final WebDriver driver;

    public LoginElementsHandler(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextPage() {
        return driver.findElement(logoBy).getText();
    }

    @Step("Ввод логина")
    public void inputLogin(String username) {
        driver.findElement(usernameBy).sendKeys(username);
    }

    @Step("Ввод пароля")
    public void inputPassword(String password) {
        driver.findElement(passwordBy).sendKeys(password);
    }

    @Step("Нажатие на кнопку 'Login'")
    public void submitButton() {
        driver.findElement(submitBy).click();
    }

    @Step("Получение текста ошибки")
    public String getErrorMessage() {
        return driver.findElement(errorBy).getText();
    }
}