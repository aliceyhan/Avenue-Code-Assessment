Feature:
  As a ToDo App user
  I should be able to create a task
  So I can manage my tasks

  Background: The user wants to sign in Avenue Code website
    Given The user wants to go to Avenue Code website "Demo ToDo"
    When The user wants to click on Sign In button
    And The user wants to enter the user email
    And The user wants to enter th password
    Then The user wants to Sign in
    Then Verify that browser displayed message "Signed in successfully."



   @US#1 @smoke
   Scenario: Verify My Task link on the NavBar
     When The user wants to see My Tasks link on the NavBar
     And The user wants to click on My Task link on the NavBar
     Then Verify that the user is redirected to the page including "To be Done" table



   #This scenario will fail; The bug has beeen logged
  @US#1 @smoke
  Scenario: Verify the message on the top part of the My Task page
     When The user wants to click on My Task link on the NavBar
     And  The user wants to see the user's name as "Ali Ceyhan" on the top
     Then Verify that if there is a message including user's name as "Hey Ali, this is your todo list for today:"



  @US#1 @smoke
  Scenario: Verify that the user is able to create a new task either using enter or add task button
     When The user wants to click on My Task link on the NavBar
     And The user wants to type a new task name as "Go to shopping"
     When The user wants to hit enter
     Then Verify that the new task is created as "Go to shopping"
     And The user wants to type another new task name as "Go to the library"
     When The user wants to click on add task button
     Then Verify that another task is created as "Go to the library"



   #This scenario will fail; The bug has beeen logged
  @US#1 @smoke
  Scenario: Verify that the user is required to pass at least three characters to crate a new task
     When The user wants to click on My Task link on the NavBar
     And The user wants to type at least three character as "tas"
     And The user wants to click on add task button
     Then Verify that the new task is created as "tas"
     But The user wants to type less than three character as "TK"
     And The user wants to click on add task button
     Then Verify that the new task is not created as "TK"



   #This scenario will fail; The bug has beeen logged
  @US#1 @smoke
  Scenario: Verify that the user is not able to pass more than 250 characters to crate a new task
     When The user wants to click on My Task link on the NavBar
     And The user wants to type 250 characters
     And The user wants to click on add task button
     Then Verify that the new task does not have 250 character



  @US#1 @smoke
  Scenario:Verify that a new created task is appended on the list of created task
    When The user wants to click on My Task link on the NavBar
    And The user wants to type a new task name as "Should be appended"
    When The user wants to hit enter
    Then Verify that the new task is appended on the list of created tasks as "Should be appended"





