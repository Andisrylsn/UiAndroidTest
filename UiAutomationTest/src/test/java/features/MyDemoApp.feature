Feature: Checkout flow in MyDemoApp

  Scenario: Successful checkout with 2 items in cart
    When user adds Sauce Lab Back Packs to cart
    And user opens the cart
    Then cart should  display two items with correct details
    And user proceeds to checkout
    When user logs in with valid credentials
    And user fills shipping details
    And user fills payment details
    Then order summary should show correct item amount
