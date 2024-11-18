package finals.tests.pagecontrollers;

import finals.tests.configuration.AppConfig;
import finals.tests.pagecomponents.UserInformationFormElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class UserInfoFormPageController {

    private final WebDriver driver;
    private static AppConfig config;

    public static void initializeConfig() {
        config = new AppConfig();
    }

    private final UserInformationFormElements userForm;

    public UserInfoFormPageController(WebDriver driver) {
        this.driver = driver;
        this.userForm = new UserInformationFormElements(driver);
    }

    @Step("Заполнение формы пользовательской информации")
    public void fillOutForm() {
        userForm.fillForm(config.getProperty("FIRST_NAME"), config.getProperty("LAST_NAME"), config.getProperty("POST_CODE"));
    }
}
