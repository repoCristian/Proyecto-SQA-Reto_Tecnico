#language:en
Feature: cart

  Background:
    Given that user has opened website

  Scenario Outline: Add 2 products to cart
    When  he wants add products
      | namesecondproduct   |
      | <namesecondproduct> |
    Then he should see products

    Examples:
      | namesecondproduct |
      | MDF 00010         |

  Scenario: Add and delete item to cart
    When he wants add product from todays deals and delete
    Then he shouldnt see item

