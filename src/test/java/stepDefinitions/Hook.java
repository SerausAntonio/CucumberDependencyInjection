package stepDefinitions;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hook extends BaseUtil {
    private WebDriver driver;
    BaseUtil baseUtil;
public Hook(BaseUtil baseUtil){
    this.baseUtil = baseUtil;
}
    @Before
    public void setUp(Scenario scenario){
        driver = baseUtil.initializeBrowser();
        System.out.println(scenario.getName());
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println(scenario.getStatus());
        if (scenario.isFailed()){
            System.out.println("screenshot");
        }
        if (driver != null) {
            System.out.println("driver not equal to zero");
            driver.quit();
        }
    }
}
