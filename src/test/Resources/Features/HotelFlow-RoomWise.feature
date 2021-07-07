Feature: Do the Multi Room Hotel search and complete the booking


  @Htlmulti
  Scenario Outline: 1.1 Validate Multi Room HTL Flow for 4 Adults 1 Child without Promo Code for Refundable Hotels

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

    Then User fill the Second Room Passenger Details where First Name as "Rashmika" and Last Name as "Lasan"

    Then User fill the payment details
    Then click Confirm


    When user Navigate to the Confirmation Page Booking ID Should be displayed
    And Correct Hotel Name should be displayed
    Then Scroll Down the Screen
    And Correct CheckIn Date should be displayed
    And Correct CheckOut Date should be displayed
    And Correct City should be displayed
    Then Scroll Down the Screen
    Then Scroll Down the Screen
    And Correct Guest Count should be displayed for HotelBooking
    And Correct Price should be displayed


    Examples:
      | FutureDateCount | supplierCode | City | ChoiceKey                                                              | Pax             | childDob | Nights | currency | bookingProductType | ProductName        |
      | 41              | EAN948105    | LON  | HTL__0__EAN948105__217814143~2~1~0~1~FK_NR~~217814143~2~0~0~1~FK_NR__4 | 2-1-0-0,2-0-0-0 | 2016     | 3      | GBP      | places-to-stay     | Glenlyn Apartments |


#--------------------------------------------End-------------------------------------------------------------------------------------
