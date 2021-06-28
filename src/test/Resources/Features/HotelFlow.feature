Feature: Do the Hotel search and complete the booking


  @Htlnopromo
  Scenario Outline: Validate Generic Flow for 1 Adult without Promo Code for Refundable Product

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" Night Count as "<Nights>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When Checkout page should be loaded
    And check the Hotel Name is Correct as "<ProductName>"
    And check the CheckIn Date is Correct
    And check the CheckOut Date is Correct
    And check the Travelling Address is Correct
    And check the Pax Count is Correct
    And check the Room Type Basis is Correct
    And check the Sub Price of the Booking
    And check the Total Price of the Booking

    Then User fill the Passenger Details where First Name as "Lasan" and Last Name as "Rashmika"
    Then User fill the email address "lasanrash@gmail.com"
    Then Scroll Down the Screen
    Then User fill the Mobile Number as "71551996777"

    Then User fill the payment details
    Then click Confirm


    Examples:
      | FutureDateCount | supplierCode | City | ChoiceKey                                     | Pax     | childDob | Nights | currency | bookingProductType | ProductName                            |
      | 60              | EAN115066    | LON  | HTL__0__EAN115066__201589972~1~0~0~1~RO_RF__4 | 1-0-0-0 |          | 2      | GBP      | places-to-stay     | Four Seasons Hotel London at Park Lane |
