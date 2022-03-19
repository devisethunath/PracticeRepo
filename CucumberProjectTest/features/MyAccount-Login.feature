Feature: MyAccount-Login Feature
Description: This feature will test   a login functionality

#Scenario: Log-In with valid username and password

#Given open browser
#When Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter Registered username and password
#And click on login button
#Then User must successfullylogin to the webpage

#Given open browser
#When Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter Registered username "sethunath.chandran@gmail.com" and password "Sethu@197519"
#And click on login button
#Then User must successfullylogin to the webpage


#Scenario Outline: Log-In with valid username and password
#Given open browser
#When Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter Registered username "<username>" and password "<password>"
#And click on login button
#Then User must successfullylogin to the webpage
#And Verify login

#Examples:

#| username | password |
#| sethunath.chandran@gmail.com | Sethu@197519 |
#| devisethunath@gmail.com | Sethu@1975 |







#Scenario: Log-In with valid username and password
#Given open browser
#When Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter Registered username  and password 
#| sethunath.chandran@gmail.com | Sethu@197519 |
#And click on login button
#Then User must successfullylogin to the webpage


Scenario: Log-In with valid username and password
Given open browser
When Enter the url "http://practice.automationtesting.in/"
And Click on My Account Menu
And Enter Registered username  and password 
| username | password |
| sethunath.chandran@gmail.com | Sethu@197519 |
And click on login button
Then User must successfullylogin to the webpage










