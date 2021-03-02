Feature: Testing Amazon POC

  @AddToCart
  Scenario Outline: Testing Amazon POC
    When I enter <Product> in search box
    And I click on submit
    Then Page showing product type <Product> is opened
    When I click first product in list
    And I click add to cart
    Then Product should get added to cart

    Examples: 
      | Product |
      | Laptop  |
