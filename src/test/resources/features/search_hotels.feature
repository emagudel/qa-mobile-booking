Feature: Accommodation Service
  I as a Booking user
  I want to select an accommodation in the application
  To make a reservation

  Scenario: Booking in the same month an accommodation for two adults and a 5 year old infant with destination to cusco
    Given que "Erik" opens the booking app to navigate and enters the destination city "Cusco"
    And select the stay date is from "10 August 2023" to "20 August 2023"
    And selecting "1" room or rooms "2" adult or adults and "1" child or children "5 years old"
    When choose your room and make your reservation
    Then the user should be able to make the reservation successfully


  Scenario: Booking in the same month an accommodation for two adults and a 5 year old infant with destination to namekusein
    Given que "Erik" opens the booking app to navigate and enters the destination city "Planeta namekusein"
    Then the user should NO be able to make the reservation