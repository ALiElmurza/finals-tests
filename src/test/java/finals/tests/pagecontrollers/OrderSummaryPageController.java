package finals.tests.pagecontrollers;

import finals.tests.pagecomponents.OrderSummaryElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPageController {

    private final WebDriver driver;
    private final OrderSummaryElements orderSummary;

    public OrderSummaryPageController(WebDriver driver) {
        this.driver = driver;
        this.orderSummary = new OrderSummaryElements(driver);
    }

    @Step("Получение заголовка страницы заказа")
    public String getPageTitle() {
        return orderSummary.getPageTitle();
    }

    @Step("Получение названия первого товара")
    public String getFirstItemName() {
        return orderSummary.getFirstItemName();
    }

    @Step("Получение названия второго товара")
    public String getSecondItemName() {
        return orderSummary.getSecondItemName();
    }

    @Step("Получение названия третьего товара")
    public String getThirdItemName() {
        return orderSummary.getThirdItemName();
    }

    @Step("Получение цены первого товара")
    public String getFirstItemPrice() {
        return orderSummary.getFirstItemPrice();
    }

    @Step("Получение цены второго товара")
    public String getSecondItemPrice() {
        return orderSummary.getSecondItemPrice();
    }

    @Step("Получение цены третьего товара")
    public String getThirdItemPrice() {
        return orderSummary.getThirdItemPrice();
    }

    @Step("Нажатие на кнопку завершения заказа")
    public void clickFinishButton() {
        orderSummary.clickFinishButton();
    }
}
