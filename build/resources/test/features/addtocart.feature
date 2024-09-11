#language:en
Feature: cart

  Background:
    Given that user has opened website



  Scenario: Add and delete item to cart
    When he wants add product from todays deals and delete
    Then he shouldnt see item

