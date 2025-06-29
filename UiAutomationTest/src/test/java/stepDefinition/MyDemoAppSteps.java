package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import PageObject.IdentifierMyDemoApp;

import static org.junit.Assert.assertEquals;

public class MyDemoAppSteps {

  IdentifierMyDemoApp page = new IdentifierMyDemoApp();

  @When("user adds Sauce Lab Back Packs to cart")
  public void addBackpackToCart() {
    page.itemSauceBackpack.click();
    page.colorBlue.click();
    page.incrementBtn.click();
    Assertions.assertEquals("2", page.quantityText.getText());
  }

  @And("user opens the cart")
  public void openCart() {
    page.cartButton.click();
  }

  @Then("cart should  display two items with correct details")
  public void cartShouldDisplayTwoItemsWithCorrectDetails() {
    Assertions.assertEquals("2", page.quantityText.getText());
  }

  @And("user proceeds to checkout")
  public void proceedToCheckout() {
    page.cartIcon.click();
    if (page.nominal.isDisplayed()) {
      page.cartButton.click();
    }
  }

  @When("user logs in with valid credentials")
  public void login() {
    page.nameField.sendKeys("bod@example.com");
    page.passwordField.sendKeys("10203040");
    page.loginBtn.click();
  }

  @And("user fills shipping details")
  public void fillShippingDetails() {
    page.fullName.sendKeys("John Doe");
    page.address1.sendKeys("Street 123");
    page.address2.sendKeys("Apt 456");
    page.city.sendKeys("Jakarta");
    page.state.sendKeys("DKI");
    page.zip.sendKeys("12345");
    page.country.sendKeys("Indonesia");
    page.paymentButton.click();
  }

  @And("user fills payment details")
  public void fillPaymentDetails() {
    page.nameField.sendKeys("John Doe");
    page.cardNumber.sendKeys("4111111111111111");
    page.expirationDate.sendKeys("12/30");
    page.securityCode.sendKeys("123");
    page.paymentButton.click();
  }

  @Then("order summary should show correct item amount")
  public void verifySummary() {
    assertEquals("2 Items", page.summaryItemNumber.getText());
    page.paymentButton.click();
    assertEquals("Checkout Complete", page.completeText.getText());
  }
}
