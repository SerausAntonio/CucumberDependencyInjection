package stepDefinitions;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.sql.Timestamp;

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
    @AfterStep
    public void captureExceptionImage(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMilliseconds = Long.toString(timestamp.getTime());

            byte[] screenshot = ((TakesScreenshot)  driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png",timeMilliseconds);
        }
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println(scenario.getStatus());
        if (driver != null) {
            close_Browser();
        }
    }
}
