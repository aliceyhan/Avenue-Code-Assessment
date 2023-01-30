package Code.Pages;

import Code.Utils.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTaskPage extends CommonMethods {

    public MyTaskPage(){
        PageFactory.initElements(driver,this);
    }




    @FindBy(css = ".panel-heading")
    private WebElement toBeDoneTable;

    public void verifyToBeDone(String str){
        setWaitTime();
        Assert.assertEquals(str,toBeDoneTable.getText());
    }




    @FindBy (xpath = "//a[.='Welcome, Ali Ceyhan!']")
    private WebElement welcomeUserText;

    public String getWelcomeUserText(){
        return welcomeUserText.getText();
    }
    public void verifyWelcomeUserText(String str){
        setWaitTime();
        Assert.assertTrue(getWelcomeUserText().contains(str));
    }




    @FindBy(xpath = "//h1[.]")
    private WebElement message;

    public String getMessage(){
        return message.getText();
    }
    public void verifyMessage(String str){
        Assert.assertEquals(getMessage(),str);
    }




    @FindBy(id = "new_task")
    private WebElement taskBox;

    public WebElement getTaskBox(){
        return taskBox;
    }
    public void setTaskBox(String str) {
        setWaitTime();
        taskBox.click();
        taskBox.sendKeys(str);
    }
    public void setTaskBox250(int numberOfCharacter){
        setWaitTime();
        taskBox.click();
        while (numberOfCharacter > 0){
            taskBox.sendKeys("a");
            numberOfCharacter--;
        }
    }
    public void hitEnter(){
        myTaskPage.taskBox.sendKeys(Keys.ENTER);
    }
    public void verifyTaskBoxHas250(int numberOfCharacter){
        int actual =Integer.parseInt(getTaskBox().getAttribute("maxlength"));
        assert actual == numberOfCharacter;
    }




    @FindBy (xpath = "//tbody//tr[1]//following-sibling::td[2]")
    private WebElement taskRow;

    public void verifyTaskCreated(String str){
        if (taskRow.getText().contains(str)){
            Assert.assertEquals(taskRow.getText(),str);
        }
    }
    public void verifyTaskNotCreated(String string){
        Assert.assertNotEquals(taskRow.getText(),string);
    }





    @FindBy(css = "span[ng-click='addTask()']")
    private WebElement addTaskButton;

    public WebElement getAddTaskButton(){
        return addTaskButton;
    }




    @FindBy(css = ".btn.btn-xs.btn-primary.ng-binding")
    private WebElement manageSubTaskButton;

    public WebElement getManageSubTaskButton(){
        return manageSubTaskButton;
    }
    public void verifyManageSubTaskButton(String string){
        Assert.assertTrue(getManageSubTaskButton().getText().contains(string));
    }
    public void verifyNumberOfSubtask(){
        String text = getManageSubTaskButton().getText();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))){
                assert Character.isDigit(text.charAt(i));
            }
        }
    }


}
