package Code.StepDefinitions;

import Code.Utils.CommonMethods;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateTaskSteps extends CommonMethods {


    @Given("The user wants to go to Avenue Code website {string}")
    public void the_user_wants_to_go_to_avenue_code_website(String actualText) {
        avenueSignInPage.verifySignPageText(actualText);
    }

    @When("The user wants to click on Sign In button")
    public void the_user_wants_to_click_on_sign_in_button() {
        click(avenueSignInPage.getSignPageSignButton());
    }

    @When("The user wants to enter the user email")
    public void the_user_wants_to_enter_the_user_email() {
        avenueSignInPage.setSingPageEmailBox();
    }

    @When("The user wants to enter th password")
    public void the_user_wants_to_enter_th_password() {
        avenueSignInPage.setSingPagePasswordBox();
    }

    @Then("The user wants to Sign in")
    public void the_user_wants_to_sign_in() {
        click(avenueSignInPage.getLastSignInButton());
    }

    @Then("Verify that browser displayed message {string}")
    public void verify_that_browser_displayed_message(String actualMessage) {
        avenueMainPage.verifySuccessMessage(actualMessage);
    }

    @When("The user wants to see My Tasks link on the NavBar")
    public void the_user_wants_to_see_my_tasks_link_on_the_nav_bar() {
       avenueMainPage.verifyMyTaskDisplayed();
    }

    @When("The user wants to click on My Task link on the NavBar")
    public void the_user_wants_to_click_on_my_task_link_on_the_nav_bar() {
        click(avenueMainPage.getMyTaskLink());
    }

    @Then("Verify that the user is redirected to the page including {string} table")
    public void verify_that_the_user_is_redirected_to_the_page_including_To_be_Done_table(String str) {
        myTaskPage.verifyToBeDone(str);
    }

    @When("The user wants to see the user's name as {string} on the top")
    public void the_user_wants_to_see_the_user_s_name_as_on_the_top(String name) {
        myTaskPage.verifyWelcomeUserText(name);
    }

    @Then("Verify that if there is a message including user's name as {string}")
    public void verify_that_if_there_is_a_message_including_user_s_name_as(String message) {
        myTaskPage.verifyMessage(message);
    }

    @When("The user wants to type a new task name as {string}")
    public void the_user_wants_to_type_a_new_task_name_as(String string)  {
        myTaskPage.setTaskBox(string);
    }

    @When("The user wants to hit enter")
    public void the_user_wants_to_hit_enter() {
        myTaskPage.hitEnter();
    }

    @Then("Verify that the new task is created as {string}")
    public void verify_that_the_new_task_is_created_as(String string) {
        myTaskPage.verifyTaskCreated(string);
    }

    @Then("The user wants to type another new task name as {string}")
    public void the_user_wants_to_type_another_new_task_name_as(String string)  {
        myTaskPage.setTaskBox(string);
    }

    @When("The user wants to click on add task button")
    public void the_user_wants_to_click_on_add_task_button() {
        click(myTaskPage.getAddTaskButton());
    }

    @Then("Verify that another task is created as {string}")
    public void verify_that_another_task_is_created_as(String string) {
        myTaskPage.verifyTaskCreated(string);
    }

    @When("The user wants to type at least three character as {string}")
    public void the_user_wants_to_type_at_least_three_character_as(String string) {
       myTaskPage.setTaskBox(string);
    }


    @But("The user wants to type less than three character as {string}")
    public void the_user_wants_to_type_less_than_three_character_as(String string) {
        myTaskPage.setTaskBox(string);
    }

    @Then("Verify that the new task is not created as {string}")
    public void verify_that_the_new_task_is_not_created_as(String string) {
        myTaskPage.verifyTaskNotCreated(string);
    }

    @When("The user wants to type {int} characters")
    public void the_user_wants_to_type_characters(Integer int1) {
        myTaskPage.setTaskBox250(int1);
    }

    @Then("Verify that the new task does not have {int} character")
    public void verify_that_the_new_task_does_not_have_created(Integer int1) {
        myTaskPage.verifyTaskBoxHas250(int1);
    }

    @Then("Verify that the new task is appended on the list of created tasks as {string}")
    public void verify_that_the_new_task_is_appended_on_the_list_of_created_tasks_as(String string) {
        myTaskPage.verifyTaskCreated(string);
    }



}
