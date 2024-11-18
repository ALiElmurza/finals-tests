package finals.tests.pagecomponents;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductElements {

    private final WebDriver driver;

    private final By pageTitleBy = By.xpath("//div[@class='header_secondary_container']/span");
    private final By firstProductBy = By.xpath("//div[@class='inventory_item_name '][text()='Sauce Labs Backpack']");
    private final By secondProductBy = By.xpath("//div[@class='inventory_item_name '][text()='Sauce Labs Bolt T-Shirt']");
    private final By thirdProductBy = By.xpath("//div[@class='inventory_item_name '][text()='Sauce Labs Onesie']");
    private final By firstProductAddToCartButtonBy = By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']");
    private final By secondProductAddToCartButtonBy = By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    private final By thirdProductAddToCartButtonBy = By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']");
    private final By cartIconBy = By.xpath("//span[@class='shopping_cart_badge'][text()='3']");

    public ProductElements(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Получение заголовка страницы продуктов")
    public String getPageTitle() {
        return driver.findElement(pageTitleBy).getText();
    }

    @Step("Получение названия первого товара")
    public String getFirstProductName() {
        return driver.findElement(firstProductBy).getText();
    }

    @Step("Получение названия второго товара")
    public String getSecondProductName() {
        return driver.findElement(secondProductBy).getText();
    }

    @Step("Получение названия третьего товара")
    public String getThirdProductName() {
        return driver.findElement(thirdProductBy).getText();
    }

    @Step("Добавление в корзину первого товара")
    public void addFirstProductToCart() {
        driver.findElement(firstProductAddToCartButtonBy).click();
    }

    @Step("Добавление в корзину второго товара")
    public void addSecondProductToCart() {
        driver.findElement(secondProductAddToCartButtonBy).click();
    }

    @Step("Добавление в корзину третьего товара")
    public void addThirdProductToCart() {
        driver.findElement(thirdProductAddToCartButtonBy).click();
    }

    @Step("Переход в корзину через значок корзины")
    public void goToCart() {
        driver.findElement(cartIconBy).click();
    }
}
