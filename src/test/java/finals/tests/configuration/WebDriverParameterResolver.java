package finals.tests.configuration;

import finals.tests.pagecontrollers.HomeController;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static finals.tests.configuration.BrowserSessionManager.BROWSER_NAMESPACE;

public class WebDriverParameterResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType().equals(HomeController.class);
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        WebDriver driver = extensionContext
                .getStore(BROWSER_NAMESPACE)
                .getOrComputeIfAbsent(BrowserSessionManager.DRIVER_KEY, key -> new ChromeDriver(), WebDriver.class);

        return new HomeController(driver);
    }
}
