Feature: check signin functionality

Scenario: check sign in with correct username and password

Given Browser should be installed and Driver must configured
When open url
When enter product
When tabsearchbar
When Selectproduct

When select color size
When add to cart
Then checkcarttotal 
When edit
When Update quantity
When enter product2
When select color size
When add to cart
When enter product3
When select color size
When add to cart
When checkcart 
When Fillingcredentials 
