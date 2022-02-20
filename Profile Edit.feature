Feature: Edit Profile

  Scenario Outline: Verify Edit Profile 
    Given User is on elearning website homepage
    Then User clicks on Edit Profile link
    And attaches new image and selects language "Deutsch"
    And enters "Skype" details
    Then User clicks on Save Settings 
    
    Examples: 
      | username  | password    |
      | vabn12    |  Navgold.81 |