Feature: Search functionality
  As a user I can check top menu tab options on homepage

  Background: I am on homepage

  @author_Smita @sanity @smoke @regression @a
  Scenario Outline: Search the buy car with model
    When I mouse hover on “buy+sell” tab
    And I click on "newPath" link
    Then I navigate to "New" Cars For Sale page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make | model | location | price |
      | Audi   | A1       | Queensland    | $70,000  |
      | Audi   | A1       | Queensland    | $70,000  |
      | Audi   | A1       | Queensland    | $70,000  |
      | Audi   | A1       | Queensland    | $70,000  |
      | Audi   | A1       | Queensland    | $70,000  |
      | Audi   | A1       | Queensland    | $70,000  |



  @author_Smita @smoke @regression @a
  Scenario Outline: Search the used car with model
    When I mouse hover on “buy+sell” tab
    And I click on "used" link
    Then I navigate to "Used" Cars For Sale page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Show used vehicles
    Then I should see the make "<make>" in results
    Examples:
      | make | model | location | price |
      | Audi | A1    | Queensland | $70,000  |
      | Audi | A1    | Queensland | $70,000  |
      | Audi | A1    | Queensland | $70,000  |
      | Audi | A1    | Queensland | $70,000  |
      | Audi | A1    | Queensland | $70,000  |
      | Audi | A1    | Queensland | $70,000  |



