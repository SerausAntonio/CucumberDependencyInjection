package stepDefinitions;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps extends BaseUtil {
    private BaseUtil baseUtil;
    public static WebDriver driver;

    public LoginSteps(BaseUtil baseUtil){
        this.baseUtil = baseUtil;
    }
    @Given("I open the browser")
    public void iOpenTheBrowser() {

        driver = baseUtil.initializeBrowser();
    }

    @When("I Enter the URL {string}")
    public void iEnterTheURL(String url) {
        navigateToTheUrl(url);
    }

    @And("I Click on my account menu")
    public void iClickOnMyAccountMenu() {
        boolean status = driver.findElement(By.xpath("//*[@class='page-title']/h1")).isDisplayed();
        Assert.assertTrue(status);

    }

    @And("I Enter registred {string} and {string}")
    public void iEnterRegistredAnd(String username, String password) {
        sendKeys(By.id("Email"));
        sendKeys(By.id("Email"),username);
        sendKeys(By.id("Password"));
        sendKeys(By.id("Password"),password);

    }

    @And("I Click on the login button")
    public void iClickOnTheLoginButton() {
        waitForElementToBeClickable(By.cssSelector(".login-button"));

    }

    @Then("User must successfully login to the web page")
    public void userMustSuccessfullyLoginToTheWebPage() {
        String title = driver.findElement(By.xpath("//*[@class='content-header']")).getText();
        Assert.assertEquals("Dashboard",title);
        Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
        //Assert.assertTrue(getWebElement(By.linkText("Logout")));

    }
}
