package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtil {
    private WebDriver driver;

    public WebDriver initializeBrowser(){
        return driver = new ChromeDriver();
    }
}
