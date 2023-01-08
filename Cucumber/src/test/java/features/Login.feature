Feature: flipkart login functionality

Scenario Outline: check login functionality
Given open th chromebrowser
Given load url
When login button
Given enter username as <username>
When continue button
Given enter password as <password>
When click signin
Then homepage should be displayed

Examples:
|username|password|
|'6382150895'|'sakthi555'|
|'6382150895'|'sakthi55'|