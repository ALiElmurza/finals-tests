package finals.tests.pagecomponents;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartElements {

    private final WebDriver driver;

    private final By firstItemNameBy = By.xpath("//div[@class='cart_item_label']//a//div[text()='Sauce Labs Backpack']");
    private final By secondItemNameBy = By.xpath("//div[@class='cart_item_label']//a//div[text()='Sauce Labs Bolt T-Shirt']");
    private final By thirdItemNameBy = By.xpath("//div[@class='cart_item_label']//a//div[text()='Sauce Labs Onesie']");
    private final By totalPriceBy = By.xpath("//div[@class='summary_total_label']");
    private final By checkoutButtonBy = By.xpath("//button[@id='finish']");
    private final By completionHeaderBy = By.xpath("//h2");

    public ShoppingCartElements(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Получение названия первого товара в корзине")
    public String getFirstItemName() {
        return driver.findElement(firstItemNameBy).getText();
    }

    @Step("Получение названия второго товара в корзине")
    public String getSecondItemName() {
        return driver.findElement(secondItemNameBy).getText();
    }

    @Step("Получение названия третьего товара в корзине")
    public String getThirdItemName() {
        return driver.findElement(thirdItemNameBy).getText();
    }

    @Step("Получение общей стоимости товаров")
    public String getTotalPrice() {
        return driver.findElement(totalPriceBy).getText();
    }

    @Step("Нажатие кнопки оформления заказа")
    public void clickCheckoutButton() {
        driver.findElement(checkoutButtonBy).click();
    }

    @Step("Получение текста завершения заказа")
    public String getCompletionText() {
        return driver.findElement(completionHeaderBy).getText();
    }
}
