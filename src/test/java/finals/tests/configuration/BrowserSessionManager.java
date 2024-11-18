package finals.tests.configuration;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.WebDriver;

public class BrowserSessionManager implements AfterEachCallback {

    public static final ExtensionContext.Namespace BROWSER_NAMESPACE = ExtensionContext.Namespace.create("session_store");
    public static final String DRIVER_KEY = "web_driver";

    @Override
    public void afterEach(ExtensionContext context) {
        WebDriver driver = context.getStore(BROWSER_NAMESPACE).get(DRIVER_KEY, WebDriver.class);

        if (driver != null) {
            driver.quit();
            context.getStore(BROWSER_NAMESPACE).remove(DRIVER_KEY);
        }
    }
}
