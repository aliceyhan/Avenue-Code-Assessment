package Code.Pages;

import Code.Utils.CommonMethods;
import org.bouncycastle.operator.AADProcessor;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AvenueMainPage extends CommonMethods {
    public AvenueMainPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".alert.alert-info")
    private WebElement successMessage;

    public String getSuccessMessage(){
        return successMessage.getText();
    }
    public void verifySuccessMessage(String str){
        setWaitTime();
        Assert.assertEquals(avenueMainPage.getSuccessMessage(),str);
    }




    @FindBy (css = "#my_task")
    private WebElement myTaskLink;

    public WebElement getMyTaskLink(){
        return myTaskLink;
    }
    public void verifyMyTaskDisplayed(){
        waitForClickable(avenueMainPage.getMyTaskLink());
        Assert.assertTrue(avenueMainPage.getMyTaskLink().isDisplayed());
    }





}
