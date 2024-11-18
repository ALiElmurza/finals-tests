package finals.tests.pagecomponents;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserInformationFormElements {

    private final WebDriver driver;

    private final By firstNameFieldBy = By.xpath("//div[@class='form_group']//*[@id='first-name']");
    private final By lastNameFieldBy = By.xpath("//div[@class='form_group']//*[@id='last-name']");
    private final By postalCodeFieldBy = By.xpath("//div[@class='form_group']//*[@id='postal-code']");
    private final By continueButtonBy = By.xpath("//input[@id='continue']");

    public UserInformationFormElements(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Заполнение формы с именем, фамилией и индексом")
    public void fillForm(String firstName, String lastName, String postalCode) {
        driver.findElement(firstNameFieldBy).sendKeys(firstName);
        driver.findElement(lastNameFieldBy).sendKeys(lastName);
        driver.findElement(postalCodeFieldBy).sendKeys(postalCode);
        driver.findElement(continueButtonBy).click();
    }
}
