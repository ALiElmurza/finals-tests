package finals.tests.pagecontrollers;

import finals.tests.pagecomponents.ProductElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ProductController {
    private final WebDriver driver;
    private final ProductElements productElements;

    public ProductController(WebDriver driver) {
        this.driver = driver;
        this.productElements = new ProductElements(driver);
    }

    @Step("Получение заголовка страницы продуктов")
    public String getPageTitle() {
        return productElements.getPageTitle();
    }

    @Step("Добавление товара Sauce Labs Backpack в корзину")
    public void addToCartFirstProduct() {
        productElements.addFirstProductToCart();
    }

    @Step("Добавление товара Sauce Labs Bolt T-Shirt в корзину")
    public void addToCartSecondProduct() {
        productElements.addSecondProductToCart();
    }

    @Step("Добавление товара Sauce Labs Onesie в корзину")
    public void addToCartThirdProduct() {
        productElements.addThirdProductToCart();
    }

    @Step("Переход в корзину через значок корзины")
    public void goToCart() {
        productElements.goToCart();
    }
}
