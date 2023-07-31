Feature: Use Shopping Cart

  Scenario: Buying products at  using Questions
    Given that Danny signed-in Booking app
    When He puts in the cart the "Room Family"
    Then He should see that he has 1 product on the cart

  Scenario: Buying products at Booking using Serenity Ensure
    Given that Danny signed-in Booking app
    When He puts in the cart the "Room Single"
    Then He ensure that there is 1 product on the cart