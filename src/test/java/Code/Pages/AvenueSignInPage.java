package Code.Pages;


import Code.Utils.CommonMethods;
import Code.Utils.ConfigurationsReader;
import Code.Utils.Constants;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AvenueSignInPage extends CommonMethods {
    public AvenueSignInPage () {
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = ".text-center")
    private WebElement signPageText;

    public  String getSignPageText() {
        return signPageText.getText();
    }
    public void verifySignPageText(String str){
        Assert.assertTrue(avenueSignInPage.getSignPageText().contains(str));
    }


    @FindBy(xpath = "(//a[.='Sign In'])[1]")
    private  WebElement signPageSignButton;

    public  WebElement getSignPageSignButton() {
        return signPageSignButton;
    }


    @FindBy(css = "input[type='email']")
    private WebElement singPageEmailBox;

    public void setSingPageEmailBox() {
        setWaitTime();
        singPageEmailBox.sendKeys(ConfigurationsReader.getProperties("userName"));
    }


    @FindBy(css="input[type='password']")
    public WebElement singPagePasswordBox;

    public void setSingPagePasswordBox() {
        setWaitTime();
        singPagePasswordBox.sendKeys(ConfigurationsReader.getProperties("password"));
    }


    @FindBy(css = "input[type='submit']")
    public WebElement lastSignInButton;

    public WebElement getLastSignInButton() {
        return lastSignInButton;
    }





}
