package stepDefinitions;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.dom.model.BackendNode;

public class LoginSteps extends BaseUtil {
    private BaseUtil baseUtil;
    WebDriver driver;
    public LoginSteps(BaseUtil baseUtil){
        this.baseUtil = baseUtil;
    }
    @Given("I open the browser")
    public void iOpenTheBrowser() {

        driver = baseUtil.initializeBrowser();
        System.out.println("iOpenTheBrowser");

    }

    @When("I Enter the URL {string}")
    public void iEnterTheURL(String url) {
        System.out.println("iEnterTheURL");
        driver.navigate().to(url);
    }

    @And("I Click on my account menu")
    public void iClickOnMyAccountMenu() {
        System.out.println("iClickOnMyAccountMenu");
    }

    @And("I Enter registred {string} and {string}")
    public void iEnterRegistredAnd(String arg0, String arg1) {
        System.out.println("iEnterRegistredAnd");
    }

    @And("I Click on the login button")
    public void iClickOnTheLoginButton() {
        System.out.println("iClickOnTheLoginButton");
    }

    @Then("User must successfully login to the web page")
    public void userMustSuccessfullyLoginToTheWebPage() {
        System.out.println("userMustSuccessfullyLoginToTheWebPage");
    }
}