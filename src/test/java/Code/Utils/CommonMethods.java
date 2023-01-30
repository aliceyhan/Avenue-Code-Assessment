package Code.Utils;

import Code.StepDefinitions.PageInitializer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class CommonMethods extends PageInitializer {


    public static WebDriver driver;


    public static void openAndLaunchApplication(){

        ConfigurationsReader.getProperties(Constants.Configuration_FilePath);

        switch (ConfigurationsReader.getProperties("browser")){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigurationsReader.getProperties("URL"));
        setWaitTime();

        //this method is used to initialize all the objects of the pages
        initializePageObjects();

    }


    public static void setWaitTime(){
        driver.manage().timeouts().implicitlyWait(Constants.Implicit_Wait, TimeUnit.SECONDS);
    }


    public static void closeBrowser(){
        driver.quit();
    }



    public static byte[] takeScreenShot(String fileName) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        byte[] picBytes = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        File sourceFile =takesScreenshot.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File(Constants.ScreenShot_FilePath + fileName + " " + getTimeStamp("yyyy-MM-dd-HH-mm-ss")+".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return picBytes;

    }


    public static WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver,Constants.Explicit_wait);
        return wait;
    }



    public static void waitForClickable(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }



    public static void click(WebElement element){
        waitForClickable(element);
        element.click();
    }



    public static String getTimeStamp(String pattern){
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    public static void refreshThePage(){
        driver.navigate().refresh();
    }




}
