Feature:
  As a ToDo App user
  I should be able to create a subtask
  So I can break down my tasks into smaller pieces


  Background: The user wants to sign in Avenue Code website
    Given The user wants to go to Avenue Code website "Demo ToDo"
    When The user wants to click on Sign In button
    And The user wants to enter the user email
    And The user wants to enter th password
    Then The user wants to Sign in
    Then Verify that browser displayed message "Signed in successfully."
    When The user wants to see My Tasks link on the NavBar
    And The user wants to click on My Task link on the NavBar
    Then Verify that the user is redirected to the page including "To be Done" table



  @US#2 @smoke
  Scenario:Verify the Manage Subtask button's label and number
    And The user wants to type a new task name as "Create Subtask"
    When The user wants to hit enter
    When The user wants to see a task created as "MenageSubTask"
    Then Verify that the button labeled as "Manage Subtasks"
    Then Verify that the button has the number of created subtasks



  @US#2 @smoke
  Scenario: Verify the the modal dialog popup
    When The user wants to click on  Manage Subtask button
    Then Verify that dialog popup is displayed



   #This scenario will fail; The bug has beeen logged
   @US#2 @smoke
    Scenario: Verify that the popup has a read-only field with the task ID and the task description
      When The user wants to click on  Manage Subtask button
      And Verify that dialog popup is displayed
      Then Verify that the task ID is only read-only
      Then Verify that the task description is read-only



  #This scenario will fail; The bug has beeen logged
  @US#2 @smoke
  Scenario: Verify that the user is not able to enter the SubTask Description more than 250 characters
    When The user wants to click on  Manage Subtask button
    And Verify that dialog popup is displayed
    And The user wants to click on SubTask Description box
    And The user wants to type on SubTask Description box 250 characters
    Then Verify that the subtask description has no more than 250 characters



  @US#2 @smoke
  Scenario: Verify that the user is able to click on the add button to add a new Subtask
    When The user wants to click on  Manage Subtask button
    And Verify that dialog popup is displayed
    And The user wants to click on SubTask Description box
    And The user wants to type on SubTask Description box as "Add Button"
    And The user wants to click on the add button
    Then Verify that the new subtask is created as "Add Button"



  #This scenario will fail; The bug has beeen logged
  @US#2 @smoke
  Scenario: Verify that SubTask due date format is (MM/dd/yyyy)
    When The user wants to click on  Manage Subtask button
    And Verify that dialog popup is displayed
    And The user wants to click on SubTask Description box
    And The user wants to type on SubTask Description box as "Date Testing"
    When The user wants to click on Due Date
    And The user wants to clear default date
    And The user wants to type the wrong date of format as "23/06/2023"
    And The user wants to click on the add button
    Then Verify that date of format which user created is not created as "Date Testing"



    #This scenario will fail; The bug has beeen logged
  @US#2 @smoke
   Scenario: Verify that SubTask Description is required field
     When The user wants to click on  Manage Subtask button
     And Verify that dialog popup is displayed
     And The user wants to click on the add button
     Then Verify that a sub task is not created as "empty"



    #This scenario will fail; The bug has been logged
  @US#2 @smoke
   Scenario: Verify that Due Date is required field
     When The user wants to click on  Manage Subtask button
     And Verify that dialog popup is displayed
     And The user wants to click on SubTask Description box
     And The user wants to type on SubTask Description box as "is Due date required"
     When The user wants to click on Due Date
     And The user wants to clear default date
     And The user wants to click on the add button
     Then Verify that a sub task is not created as "is Due date required"



    @US#2 @smoke
    Scenario: Verify that Subtasks which were added is appended on the bottom part of the modal dialog
      When The user wants to click on  Manage Subtask button
      And Verify that dialog popup is displayed
      And The user wants to click on SubTask Description box
      And The user wants to type on SubTask Description box as "Should be appended"
      And The user wants to click on the add button
      Then Verify that the new subtask is created as "Should be appended"











