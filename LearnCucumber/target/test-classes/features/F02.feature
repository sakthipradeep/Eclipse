Feature: check  CreateLead page



Background:
Given open Browser
And load url
And Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
And Click button
Then User page should be dispayed
When Click lead button
When click on create link 
Given Enter companyname as 'srs tech'
And Enter first name as 'sakthi'
And Enter last name as 's'
And Enter number as '1234'



Scenario: test to check create lead 
When clicks the button