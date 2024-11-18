package finals.tests.pagecontrollers;

import finals.tests.pagecomponents.ShoppingCartElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPageController {

    private final WebDriver driver;
    private final ShoppingCartElements cartElements;

    public ShoppingCartPageController(WebDriver driver) {
        this.driver = driver;
        this.cartElements = new ShoppingCartElements(driver);
    }

    @Step("Получение названия первого товара в корзине")
    public String getFirstItemName() {
        return cartElements.getFirstItemName();
    }

    @Step("Получение названия второго товара в корзине")
    public String getSecondItemName() {
        return cartElements.getSecondItemName();
    }

    @Step("Получение названия третьего товара в корзине")
    public String getThirdItemName() {
        return cartElements.getThirdItemName();
    }

    @Step("Получение общей стоимости товаров")
    public String getTotalPrice() {
        return cartElements.getTotalPrice();
    }

    @Step("Нажатие на кнопку оформления заказа")
    public void clickCheckoutButton() {
        cartElements.clickCheckoutButton();
    }

    @Step("Получение текста завершения заказа")
    public String getCompletionText() {
        return cartElements.getCompletionText();
    }
}