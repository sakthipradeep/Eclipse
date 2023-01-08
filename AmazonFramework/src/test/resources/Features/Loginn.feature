Feature: Check login and search Functionality

Scenario: Login with Correct username and password

Given Browser should be installed and Driver must configured
When open url
When click signin
When enter phonnumber
When click continue buton
When Enter password
When click login
Then hompage should be dipslaed. 