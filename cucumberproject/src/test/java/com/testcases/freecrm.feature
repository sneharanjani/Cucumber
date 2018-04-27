Feature: FreeCRM login
  
    Scenario Outline: FreeCrm login
    Given I open "<browser>" browser
    When I navigate to the "<url>" url
    Then I enter "<username>" and "<password>" 
    And I click on "<loginbutton>"
    
    Examples: 
      | browser | url                           | username|password|
      | firefox |https://accounts.zoho.eu/signin| sneha   |sne123  |
      
