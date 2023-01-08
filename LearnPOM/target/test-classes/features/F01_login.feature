Feature: Leaftaps login functionality 

Scenario Outline: Test login functionality with positive credentials
//pre condition
Given open the chrome browser 
And load application
And Enter username as <username>
And enter password as <password>
When click login button
Then  homepageshould be displayed
When Click

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario Outline: Test login functionality with negative credentials
Given open the chrome browser 
And load application
And Enter username as <username>
And enter password as <password>
When click login button
But error is dipalyed
Examples:
|username|password|
|'kemoSalesManager'|'krmsfa'|
|'pemoCSR'|'crmsfa'|