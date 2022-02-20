Feature: New Users sign up in the Upskill Portal

  Scenario Outline: Verify New User Registration
    Given User is on elearning website homepage
    When User clicks on Sign up button
    And enters details "<firstname>""<lastname>""<email>""<username>""<password>""<conmf_password>"
    Then User clicks on Register button
    And User verifies successful registration

    Examples: 
      | firstname | lastname | email     | username   |  password | conf_password   |
      | abc 		| panda  | abc@gmail.com | zabn12   |  Navgold.81 |    Navgold.81 |
      | def		  | panda  | def@gmail.com | vabn12   |  Navgold.81 |    Navgold.81 |
      | ghj		  | panda  | dfg@gmail.com | ppbn12   |  Navgold.81 |    Navgold.81 |
      | powe	  | panda  | ljc@gmail.com | abffn12  |  Navgold.81 |    Navgold.81 |
      | woe		  | panda  | aas@gmail.com | affan12  |  Navgold.81 |     Navgold.81 |
      | sksd	  | panda  | ah5@gmail.com | abgn12   | Navgold.81  |    Navgold.81 |
      | mxz		  | panda  | aiw@gmail.com | gggabn12 | Navgold.81  |     Navgold.81 |
      | mzx		  | panda | nwe@gmail.com | abn122   |  Navgold.81 |    Navgold.81  |
      | zmx		  |panda | ask@yahoo.com  |arbn12  |  Navgold.81 |     Navgold.81 |
      | xyz		  | panda  | xyz@gmzil.com | adbn12   |  Navgold.81 |    Navgold.81 |
      