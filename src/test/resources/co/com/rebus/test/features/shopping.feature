#Language: en
#Author: Brayant Gamboa Betancur


@RegressionTest
Feature: shopping with user in website

  @MenuSpecialOffer
  Scenario: The user enters the special offers option
    Given the user enters the page advantage
    When a user clicks on the special offer option
    Then validate the item that is on special offer

  @MenuPopularItems
  Scenario: The user enters the popular items option
    Given the user enters the page advantage
    When a user clicks on the popular items option
    Then validate the item that is on popular items

  @MenuContactUs
  Scenario: The user enters the contact us option
    Given the user enters the page advantage
    When a user clicks on the contact us option
    Then validate the item that is on contact us

  @SelectPopularItem
  Scenario: The user select a popular items
    Given the user enters the page advantage
    When you find a popular item
    Then a popular item is validated

  @FormContactUs
  Scenario Outline: The user fills out the contact
    Given the user enters the page advantage
    When the user fills out the contact form <IdPrueba>
    Then the system validates that the information has been sent
    Examples:
      | IdPrueba |
      | 1        |