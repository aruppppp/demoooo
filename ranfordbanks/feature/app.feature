Feature: login
Scenario: validate the title of the homepage
Given     launch the site
When      check the title with "KEXIM BANK" data
Then      username field should displayed
And       close


Scenario: validate the userid and password
Given     launch the site
When      enter the userid with "Admin" data and enter the password with "Admin" data
Then      braches button should displayed
And       close the site


Scenario Outline: validate the branch creation with excel dataset
Given 		launch the site
When      enter the userid with "Admin" data and pasword with "Admin" data and click on login btn
Then      click on branches btn and newbranch btn should be displayed 
Then      click on newbranch btn and enter the branch creation with "<row_index>" data set

Examples: 
         |row_index|
         |2|
         |3|
         |4|



















