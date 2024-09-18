package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartLoginPage extends BasePage {

    public WebDriver driver;

    public ShoppingCartLoginPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    @CacheLookup
    WebElement lnkLogin;

    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//*[@value='Log in']")
    @CacheLookup
    WebElement btnLogin;

    public void clickLoginLink(){
        lnkLogin.click();
    }

    public void enterUsername(String email){
        txtEmail.click();
        txtEmail.sendKeys(email);
    }

    public void enterPassword(String pass){
        txtPassword.click();
        txtPassword.sendKeys(pass);
    }

    public void clickLoginButton(){
        btnLogin.click();
    }
}
