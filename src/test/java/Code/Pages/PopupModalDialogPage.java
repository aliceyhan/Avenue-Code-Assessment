package Code.Pages;

import Code.Utils.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertNull;

public class PopupModalDialogPage extends CommonMethods {

    public PopupModalDialogPage(){
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//h4")
    private WebElement popupToDoText;

    public WebElement getPopupToDoText(){
        return popupToDoText;
    }
    public void verifyPopupModalDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getPopupToDoText()));
        Assert.assertTrue(getPopupToDoText().isDisplayed());
    }




    @FindBy(css = ".modal-title.ng-binding")
    private WebElement popupTaskId;

    public WebElement getPopupTaskId(){
        return popupTaskId;
    }
    public void verifyTaskIdReadonly() {
        assertNull(driver.findElement(By.cssSelector(".modal-title.ng-binding")).getAttribute("type"));
    }





    @FindBy(css = "textarea[id='edit_task']")
    private WebElement popupTaskDescription;

    public WebElement getPopupTaskDescription(){
        return popupTaskDescription;
    }
    public void verifySubTaskReadonly()  {
        assertNull(driver.findElement(By.cssSelector("textarea[id='edit_task']")).getAttribute("type"));
    }




    @FindBy(css = "#new_sub_task")
    private WebElement subTaskDescriptionBox;

    public WebElement getSubTaskDescriptionBox(){
        return subTaskDescriptionBox;
    }
    public void setSubTaskDescriptionBox(String str) {
        setWaitTime();
        subTaskDescriptionBox.click();
        subTaskDescriptionBox.sendKeys(str);
    }
    public void setSubTaskDescriptionBox250(int numberOfCharacter){
        setWaitTime();
        while (numberOfCharacter > 0){
            subTaskDescriptionBox.sendKeys("a");
            numberOfCharacter--;
        }
    }
    public void verifySubtaskBoxHas250(int numberOfCharacter){
        int actual =Integer.parseInt(getSubTaskDescriptionBox().getAttribute("maxlength"));
        assert actual == numberOfCharacter;
    }




    @FindBy(css = "#add-subtask")
    private WebElement subTaskAddButton;

    public WebElement getSubTaskAddButton(){
        return subTaskAddButton;
    }




    @FindBy(xpath = "(//a[@editable-text='sub_task.body'])[1]")
    private WebElement subTaskRow;

    public WebElement getSubTaskRow(){
        return subTaskRow;
    }
    public void verifySubTaskCreated(String str){
        if (subTaskRow.getText().contains(str)){
            Assert.assertEquals(subTaskRow.getText(),str);
        }
    }
    public void verifySubTaskNotCreated(String str){
        if (subTaskRow.getText().contains(str)){
            Assert.assertNotEquals(subTaskRow.getText(),str);
        }
    }




    @FindBy (css = "#dueDate")
    private WebElement dueDate;

    public WebElement getDueDate(){
        return dueDate;
    }
    public void clearDueDate(){
        setWaitTime();
        getDueDate().clear();
    }
    public void setDueDate(String string){
        setWaitTime();
        dueDate.click();
        dueDate.sendKeys(string);
    }




    @FindBy (xpath = "//button[.='Close']")
    private WebElement closeButton;

    public WebElement getCloseButton(){
        return closeButton;
    }









}
