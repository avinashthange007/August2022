Feature: Login Functionality

Background: User successfully clicked on Initial Login window
When user open "chrome" browser with exe "E:\\Automation support\\chrome 104\\chromedriver.exe"
When user open url as "https://www.amazon.com/"

Scenario: Login functionality by using valid credentials
When user click on the Hello Sign In button
When user enter "7020712080" as username
When user enter as username then click on continue button 
When user enter "@Avit1492$" as password
When user Mark as Keep me Sign me
When user click on Login button
Then Application shows user profile to user
Then browser close
