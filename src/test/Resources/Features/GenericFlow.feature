Feature: Do the Generic search and complete the booking


  @genpromono
  Scenario Outline: 1.1 Validate Generic Flow for 1 Adult without Promo Code for Refundable Product

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" seniorDob as "<seniorDob>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When Checkout page should be loaded
    And check the Product Name is Correct as "<ProductName>"
    And check the Travelling Date is Correct
    And check the Travelling Location is Correct
    And check the Guest Count is Correct
    And check the Sub Price of the Booking
    And check the Total Price of the Booking

    Then User fill the Passenger Details where First Name as "Lasan" and Last Name as "Rashmika"
    Then User fill the email address "lasanrash@gmail.com"
    Then Scroll Down the Screen
    Then User fill the Mobile Number as "71551996777"
    Then User fill the Booking Questions

    Then User fill the payment details
    Then click Confirm

    When user Navigate to the Confirmation Page Booking ID Should be displayed
    And Correct Product Name should be displayed
    And Correct Travelling Date should be displayed
    And Correct Guest Count should be displayed
    And Correct City Location should be displayed
    Then Scroll Down the Screen
    Then Scroll Down the Screen
    And Correct Price should be displayed




    Examples:
      | FutureDateCount | supplierCode | City | ChoiceKey                                    | Pax     | childDob | seniorDob | currency | bookingProductType | ProductName                                             |
      | 60              | VT5461P40    | LON  | GEN~0~DEFAULT~10:00~EVT-75~VT5461P40~5461P40 | 1-0-0-0 |          |           | GBP      | experiences        | Hop-on Hop-off London Bus Tour 1 day + FREE extra 1 day |



#    --------------------------------------------End----------------------------------------------------------------

  @genpromoyes
  Scenario Outline: 1.2 Validate Generic Flow for 1 Adult without Promo Code for Refundable Product

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" seniorDob as "<seniorDob>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When Checkout page should be loaded
    And check the Product Name is Correct as "<ProductName>"
    And check the Travelling Date is Correct
    And check the Travelling Location is Correct
    And check the Guest Count is Correct
    Then User Fill the Promo Code as "CTPromo"
    And check the Sub Price of the Booking
    And check the Total Price of the Booking

    Then User fill the Passenger Details where First Name as "Lasan" and Last Name as "Rashmika"
    Then User fill the email address "lasanrash@gmail.com"
    Then Scroll Down the Screen
    Then User fill the Mobile Number as "71551996777"
    Then User fill the Booking Questions

    Then User fill the payment details
    Then click Confirm
    When user Navigate to the Confirmation Page Booking ID Should be displayed
    And Correct Product Name should be displayed
    And Correct Travelling Date should be displayed
    And Correct Guest Count should be displayed
    And Correct City Location should be displayed
    Then Scroll Down the Screen
    Then Scroll Down the Screen
    And Correct Price should be displayed




    Examples:
      | FutureDateCount | supplierCode | City | ChoiceKey                                    | Pax     | childDob | seniorDob | currency | bookingProductType | ProductName                                             |
      | 60              | VT5461P40    | LON  | GEN~0~DEFAULT~10:00~EVT-75~VT5461P40~5461P40 | 1-0-0-0 |          |           | GBP      | experiences        | Hop-on Hop-off London Bus Tour 1 day + FREE extra 1 day |


#------------------------------------------------------------End--------------------------------------------------------------------------------


  @gencancel
  Scenario Outline: 1.3 Validate Generic Flow for 1 Adult without Promo Code for Refundable Product

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" seniorDob as "<seniorDob>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When Checkout page should be loaded
    And check the Product Name is Correct as "<ProductName>"
    And check the Travelling Date is Correct
    And check the Travelling Location is Correct
    And check the Guest Count is Correct
    And check the Sub Price of the Booking
    And check the Total Price of the Booking

    Then User fill the Passenger Details where First Name as "Lasan" and Last Name as "Rashmika"
    Then User fill the email address "lasanrash@gmail.com"
    Then Scroll Down the Screen
    Then User fill the Mobile Number as "71551996777"
    Then User fill the Booking Questions

    Then User fill the payment details
    Then click Confirm

    When user Navigate to the Confirmation Page Booking ID Should be displayed
    And Correct Product Name should be displayed
    And Correct Travelling Date should be displayed
    And Correct Guest Count should be displayed
    And Correct City Location should be displayed
    Then Scroll Down the Screen
    Then Scroll Down the Screen
    And Correct Price should be displayed

    Then Scroll Down the Screen
    When click Cancel Icon
    Then Cancel PopUp should display
    Then Click Cancel the Booking


    Examples:
      | FutureDateCount | supplierCode | City | ChoiceKey                                    | Pax     | childDob | seniorDob | currency | bookingProductType | ProductName                                             |
      | 60              | VT5461P40    | LON  | GEN~0~DEFAULT~10:00~EVT-75~VT5461P40~5461P40 | 1-0-0-0 |          |           | GBP      | experiences        | Hop-on Hop-off London Bus Tour 1 day + FREE extra 1 day |



    #------------------------------------------------------------End--------------------------------------------------------------------------------


  @genbookingques
  Scenario Outline: 1.3 Validate Generic Flow for 1 Adult without Promo Code for Refundable Product

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" seniorDob as "<seniorDob>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When Checkout page should be loaded
    And check the Product Name is Correct as "<ProductName>"
    And check the Travelling Date is Correct
    And check the Travelling Location is Correct
    And check the Guest Count is Correct
    And check the Sub Price of the Booking
    And check the Total Price of the Booking

    Then User fill the Passenger Details where First Name as "Lasan" and Last Name as "Rashmika"
    Then User fill the email address "lasanrash@gmail.com"
    Then Scroll Down the Screen
    Then User fill the Mobile Number as "71551996777"
    Then Scroll Down the Screen
    Then User fill the Booking Questions

    Then User fill the payment details
    Then click Confirm

    When user Navigate to the Confirmation Page Booking ID Should be displayed
    And Correct Product Name should be displayed
    And Correct Travelling Date should be displayed
    And Correct Guest Count should be displayed
    And Correct City Location should be displayed
    Then Scroll Down the Screen
    Then Scroll Down the Screen
    And Correct Price should be displayed


    Examples:
      | FutureDateCount | supplierCode | City | ChoiceKey                            | Pax     | childDob | seniorDob | currency | bookingProductType | ProductName                                                                    |
      | 60              | VT16052P827  | CMB  | GEN~0~TG1~VT35~VT16052P827~16052P827 | 1-0-0-0 |          |           | GBP      | experiences        | Colombo Airport (CMB) to Santani Wellness Resort & Spa, Kandy Private Transfer |

#      | FutureDateCount  | supplierCode | City | ChoiceKey                                | Pax     | childDob | seniorDob | currency | bookingProductType | ProductName                                              |
#      | 124              | VT10392P1    | PAR  | GEN~0~TG42__11:30~VT15~VT10392P1~10392P1 | 1-0-0-0 |          |           | GBP      | experiences        | Private Shopping Walking Tour for Teenage Girls in Paris |
