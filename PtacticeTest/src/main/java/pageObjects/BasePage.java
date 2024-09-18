package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;
    public ShoppingCartLoginPage shoppingCartLoginPage;

    public static void launchBrowser() {
        String url = "https://demowebshop.tricentis.com/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
}
