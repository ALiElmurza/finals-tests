package finals.tests.pagecomponents;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryElements {

    private final WebDriver driver;

    private final By pageTitleBy = By.xpath("//div[@class='header_secondary_container']");
    private final By firstItemNameBy = By.xpath("//div[@class='cart_item_label']//a//div[text()='Sauce Labs Backpack']");
    private final By secondItemNameBy = By.xpath("//div[@class='cart_item_label']//a//div[text()='Sauce Labs Bolt T-Shirt']");
    private final By thirdItemNameBy = By.xpath("//div[@class='cart_item_label']//a//div[text()='Sauce Labs Onesie']");
    private final By firstItemPriceBy = By.xpath("//div[@class='cart_item'][1]/div[@class='cart_item_label']/div/div");
    private final By secondItemPriceBy = By.xpath("//div[@class='cart_item'][2]/div[@class='cart_item_label']/div/div");
    private final By thirdItemPriceBy = By.xpath("//div[@class='cart_item'][3]/div[@class='cart_item_label']/div/div");
    private final By finishButtonBy = By.xpath("//button[@id='checkout']");

    public OrderSummaryElements(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Получение заголовка страницы")
    public String getPageTitle() {
        return driver.findElement(pageTitleBy).getText();
    }

    @Step("Получение названия первого товара")
    public String getFirstItemName() {
        return driver.findElement(firstItemNameBy).getText();
    }

    @Step("Получение названия второго товара")
    public String getSecondItemName() {
        return driver.findElement(secondItemNameBy).getText();
    }

    @Step("Получение названия третьего товара")
    public String getThirdItemName() {
        return driver.findElement(thirdItemNameBy).getText();
    }

    @Step("Получение цены первого товара")
    public String getFirstItemPrice() {
        return driver.findElement(firstItemPriceBy).getText();
    }

    @Step("Получение цены второго товара")
    public String getSecondItemPrice() {
        return driver.findElement(secondItemPriceBy).getText();
    }

    @Step("Получение цены третьего товара")
    public String getThirdItemPrice() {
        return driver.findElement(thirdItemPriceBy).getText();
    }

    @Step("Нажатие кнопки завершения")
    public void clickFinishButton() {
        driver.findElement(finishButtonBy).click();
    }
}
