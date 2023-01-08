Feature: Login Leaftaps

Scenario Outline: Check the login functinality
Given open Browser
And load url
And Enter username as <username>
And Enter password as <password>
When Click button
Then User page should be dispayed
When Click lead button
When click on create link 
Given Enter companyname as <createLeadForm_companyName>
And Enter first name as <createLeadForm_firstName>
And Enter last name as <createLeadForm_lastName>
And Enter number as <createLeadForm_primaryPhoneNumber>
When clicks the button
Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
Scenario Outline: Check the login functinality
Given open Browser
And load url
And Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
When Click button
Then User page should be dispayed
When Click lead button
When click on create link 
Given Enter companyname as <createLeadForm_companyName>
And Enter first name as <createLeadForm_firstName>
And Enter last name as <createLeadForm_lastName>
And Enter number as <createLeadForm_primaryPhoneNumber>
When clicks the button
Examples:
|createLeadForm_companyName|createLeadForm_firstName|createLeadForm_lastName|createLeadForm_primaryPhoneNumber|
|'sjfjd'|'sakthi'|'s'|'8956'|
