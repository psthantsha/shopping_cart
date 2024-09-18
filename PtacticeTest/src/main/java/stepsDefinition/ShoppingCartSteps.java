package stepsDefinition;

import io.cucumber.java.en.*;
import pageObjects.BasePage;
import pageObjects.ShoppingCartLoginPage;

public class ShoppingCartSteps extends BasePage {

    @Given("Login into the shopping cart {string} {string}")
    public void login_into_the_shopping_cart(String username, String password) {
        BasePage.launchBrowser();
        shoppingCartLoginPage = new ShoppingCartLoginPage(driver);
        shoppingCartLoginPage.clickLoginLink();
        shoppingCartLoginPage.enterUsername(username);
        shoppingCartLoginPage.enterPassword(password);
        shoppingCartLoginPage.clickLoginButton();

    }
    @Then("Go to computers menu and select desktops")
    public void go_to_computers_menu_and_select_desktops() {
    }
    @Then("Choose your own cheap computer")
    public void choose_your_own_cheap_computer() {
    }
    @Then("Add it to cart")
    public void add_it_to_cart() {
    }
    @Then("Accept Ts and Cs then checkout")
    public void accept_ts_and_cs_then_checkout() {
    }
}
