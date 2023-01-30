package Code.StepDefinitions;

import Code.Utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateSubTaskSteps extends CommonMethods {


    @When("The user wants to see a task created as {string}")
    public void the_user_wants_to_see_a_task_created_as(String string ) {
        myTaskPage.setTaskBox(string);
    }

    @Then("Verify that the button labeled as {string}")
    public void verify_that_the_button_labeled_as(String string) {
        myTaskPage.verifyManageSubTaskButton(string);
    }

    @Then("Verify that the button has the number of created subtasks")
    public void verify_that_the_button_has_the_number_of_created_subtasks() {
        myTaskPage.verifyNumberOfSubtask();
    }

    @When("The user wants to click on  Manage Subtask button")
    public void the_user_wants_to_click_on_manage_subtask_button() {
        click(myTaskPage.getManageSubTaskButton());
    }

    @Then("Verify that dialog popup is displayed")
    public void verify_that_dialog_popup_is_displayed() {
        popupModalDialogPage.verifyPopupModalDisplayed();
    }

    @Then("Verify that the task ID is only read-only")
    public void verify_that_the_task_id_is_only_read_only() {
        popupModalDialogPage.verifyTaskIdReadonly();
    }

    @Then("Verify that the task description is read-only")
    public void verify_that_the_task_description_is_read_only() throws InterruptedException {
        popupModalDialogPage.verifySubTaskReadonly();
    }

    @When("The user wants to click on SubTask Description box")
    public void the_user_wants_to_click_on_sub_task_description_box() {
        click(popupModalDialogPage.getSubTaskDescriptionBox());
    }

    @When("The user wants to type on SubTask Description box {int} characters")
    public void the_user_wants_to_type_on_sub_task_description_box_characters(Integer int1) {
        popupModalDialogPage.setSubTaskDescriptionBox250(int1);
    }

    @Then("Verify that the subtask description has no more than {int} characters")
    public void verify_that_the_subtask_description_has_no_more_than_characters(Integer int1) {
        popupModalDialogPage.verifySubtaskBoxHas250(int1);
    }

    @When("The user wants to type on SubTask Description box as {string}")
    public void the_user_wants_to_type_on_sub_task_description_box_as(String string) {
        popupModalDialogPage.setSubTaskDescriptionBox(string);
    }

    @When("The user wants to click on the add button")
    public void the_user_wants_to_click_on_the_add_button() {
        click(popupModalDialogPage.getSubTaskAddButton());
    }

    @Then("Verify that the new subtask is created as {string}")
    public void verify_that_the_new_subtask_is_created_as(String string) {
        popupModalDialogPage.verifySubTaskCreated(string);
    }

    @When("The user wants to click on Due Date")
    public void the_user_wants_to_click_on_due_date() {
        click(popupModalDialogPage.getDueDate());
    }

    @When("The user wants to clear default date")
    public void the_user_wants_to_clear_default_date() {
        popupModalDialogPage.clearDueDate();
    }

    @When("The user wants to type the wrong date of format as {string}")
    public void the_user_wants_to_type_the_wrong_date_of_format_as(String string) {
        popupModalDialogPage.setDueDate(string);
    }

    @Then("Verify that date of format which user created is not created as {string}")
    public void verify_that_date_of_format_which_user_created_is_not_created_as(String string) {
        popupModalDialogPage.verifySubTaskNotCreated(string);
    }

    @Then("Verify that a sub task is not created as {string}")
    public void verify_that_a_sub_task_is_not_created_as(String string) {
        popupModalDialogPage.verifySubTaskNotCreated(string);
    }



}
