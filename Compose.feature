Feature: Compose mail and Send 

  Scenario Outline: Verify entering details in the compose page and sending mail
    Given User is on elearning website homepage
    And User logs in with creds "<username>" "<password>" and go to Homepage tab
    When User Clicks on My Course page
    And User clicks on Compose tab
    And User selects mail recepients "<recepient>"
    And User enters mail details "<subject>""<Description>"
    Then User clicks on Send message button
   
    Examples: 
      |username		|		password	   | recepient            | subject                      | Description                              |
      | zabn12    |  Navgold@123   | as12@gmail.com    		| Registration is successful   | You're registered, complete your profile |