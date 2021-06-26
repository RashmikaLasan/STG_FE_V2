Feature: Do the generic search and complete the booking which do not have the Promo Code

  @genpromono
  Scenario Outline: Validate Generic Flow for 1 Adult and 1 Infant V2

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" seniorDob as "<seniorDob>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When Checkout page should be loaded
    And check the Product Name is Correct as "<ProductName>"
    And check the Travelling Date is Correct
    And check the Travelling Location is Correct
    And check the Guest Count is Correct
    And check the Sub Price of the Booking
    And check the Total Price of the Booking
#
    Then User fill the Passenger Details where First Name as "Lasan" and Last Name as "Rashmika"
    Then User fill the email address "lasanrash@gmail.com"
    Then Scroll Down the Screen
    Then User fill the Mobile Number as "71551996777"
    Then User fill the Booking Questions

    Then User fill the payment details
    Then click Confirm
#    When user Navigate to the Confirmation Page
#    Then Booking ID Should be displayed
#    And Correct Product Name should be displayed
#    And Correct Travelling Date should be displayed
#
#    And Correct Guest Count should be displayed
#    And Correct City Location should be displayed
#    And Correct Price should be displayed




    Examples:
      | FutureDateCount | supplierCode | City | ChoiceKey                                    | Pax     | childDob | seniorDob | currency | bookingProductType | ProductName                                             |
      | 60              | VT5461P40    | LON  | GEN~0~DEFAULT~10:00~EVT-75~VT5461P40~5461P40 | 1-0-0-0 |          |           | GBP      | experiences        | Hop-on Hop-off London Bus Tour 1 day + FREE extra 1 day |

