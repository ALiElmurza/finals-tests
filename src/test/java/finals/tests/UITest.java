package finals.tests;

import finals.tests.configuration.AppConfig;
import finals.tests.pagecomponents.LoginPage;
import finals.tests.pagecontrollers.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class UITest {
    protected WebDriver driver;

    protected ProductController productController;
    protected HomeController homeController;
    protected ShoppingCartPageController cartController;
    protected OrderSummaryPageController summaryController;
    protected UserInfoFormPageController userDetailsController;
    protected LoginController loginController;
    protected LoginPage loginPage;
    public static AppConfig settings;

    @BeforeEach
    public void initialize() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        productController = new ProductController(driver);
        homeController = new HomeController(driver);
        cartController = new ShoppingCartPageController(driver);
        summaryController = new OrderSummaryPageController(driver);
        userDetailsController = new UserInfoFormPageController(driver);
        loginPage = new LoginPage(driver);
        loginController = new LoginController(driver, loginPage);
    }

    @BeforeAll
    public static void configure() {
        settings = new AppConfig();
    }

    @AfterEach
    public void cleanup() {
        if (driver != null) {
            driver.quit();
        }
    }
}
