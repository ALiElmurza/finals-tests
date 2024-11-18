package finals.tests;

import finals.tests.configuration.AppConfig;
import finals.tests.configuration.BrowserSessionManager;
import finals.tests.configuration.WebDriverParameterResolver;
import finals.tests.pagecontrollers.*;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Тесты по сайту https://www.saucedemo.com/")
@ExtendWith(WebDriverParameterResolver.class)
@ExtendWith(BrowserSessionManager.class)
public class ECommerceTests {

    private static AppConfig settings;

    @BeforeAll
    public static void setUp() {
        settings = new AppConfig();
    }

    @Test
    @Epic("Тест-кейс положительная авторизация")
    public void authorizationStandardUser(HomeController homeController) {
        homeController.navigateToHome();
        LoginController loginController = homeController.getLoginController();
        assertEquals("Swag Labs", loginController.getLoginHeaderText());

        loginController.enterValidUsername();
        loginController.enterPassword();
        loginController.confirmLogin();

        ProductController productController = new ProductController(homeController.driver());
        assertEquals("Products", productController.getPageTitle());
    }

    @Test
    @Epic("Тест-кейс негативная авторизация")
    public void authorizationError(HomeController homeController) {
        homeController.navigateToHome();
        LoginController loginController = homeController.getLoginController();
        assertEquals("Swag Labs", loginController.getLoginHeaderText());

        loginController.enterBlockedUsername();
        loginController.enterPassword();
        loginController.confirmLogin();

        assertEquals("Epic sadface: Sorry, this user has been locked out.", loginController.getLoginErrorMessage());
    }


}