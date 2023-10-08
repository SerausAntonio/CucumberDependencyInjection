package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseUtil {
    public static WebDriver driver;

    public WebDriver initializeBrowser(){

        return driver = new FirefoxDriver();
    }

    public void navigateToTheUrl(String url){
        driver.navigate().to(url);
    }
    public void waitForElementToBeClickable(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
    public void sendKeys(By by, String inputTXT){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(inputTXT);
    }
    public void sendKeys(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by)).clear();
    }

    public boolean getWebElement(By by){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       boolean status =  wait.until(ExpectedConditions.elementToBeSelected(by)).booleanValue();
       System.out.println("return " + status);
       return status;
    }
    public void close_Browser(){
        driver.quit();
    }
}
