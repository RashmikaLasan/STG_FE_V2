Feature: Do the Hotel search and complete the booking


  @Htlnopromo
  Scenario Outline: 1.1 Validate HTL Flow for 1 Adult without Promo Code for Refundable Product

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
      | FutureDateCount | supplierCode | City | ChoiceKey                                     | Pax     | childDob | Nights | currency | bookingProductType | ProductName                            |
      | 60              | EAN115066    | LON  | HTL__0__EAN115066__201589972~1~0~0~1~RO_RF__4 | 1-0-0-0 |          | 2      | GBP      | places-to-stay     | Four Seasons Hotel London at Park Lane |


#--------------------------------------------End-------------------------------------------------------------------------------------



  @Htlpromo1
  Scenario Outline: 1.2 Validate HTL Flow for 1 Adult with Promo Code for Refundable Product

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" Night Count as "<Nights>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When Checkout page should be loaded
    Then User Fill the Promo Code as "CTPromo"
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
      | FutureDateCount | supplierCode | City | ChoiceKey                                     | Pax     | childDob | Nights | currency | bookingProductType | ProductName                            |
      | 60              | EAN115066    | LON  | HTL__0__EAN115066__201589972~1~0~0~1~RO_RF__4 | 1-0-0-0 |          | 2      | GBP      | places-to-stay     | Four Seasons Hotel London at Park Lane |


    #-------------------------------------------End-------------------------------------------------------------------------------------



  @HtlAdultChild
  Scenario Outline: 1.2 Validate HTL Flow for 1 Adult and 1 Child with Promo Code for Refundable Product

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" Night Count as "<Nights>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When Checkout page should be loaded
    Then User Fill the Promo Code as "CTPromo"
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
      | FutureDateCount | supplierCode | City | ChoiceKey                                  | Pax     | childDob | Nights | currency | bookingProductType | ProductName                        |
      | 60              | EAN432739    | NYC  | HTL__0__EAN432739__TWN.GR~1~1~0~1~RO_RF__4 | 1-1-0-0 | 2015     | 2      | GBP      | places-to-stay     | Courtyard New York Manhattan/Times |


    #    -------------------------------------End-------------------------------------------------------------------------------------


  @Htlcancel
  Scenario Outline: 1.2 Validate HTL Flow for 1 Adult with Promo Code for Refundable Product

    Given user set the booking parameter checkIn date as "<FutureDateCount>" Supplier Code as "<supplierCode>" City as "<City>" ChoiceKey as "<ChoiceKey>" pax as "<Pax>" ChildDoB as "<childDob>" Night Count as "<Nights>" currency as "<currency>" bookingProductType as "<bookingProductType>"
    When Checkout page should be loaded
    Then User Fill the Promo Code as "CTPromo"
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

    Then Scroll Down the Screen
    When click Cancel Icon
    Then Cancel PopUp should display
    Then Click Cancel the Booking


    Examples:
      | FutureDateCount | supplierCode | City | ChoiceKey                                     | Pax     | childDob | Nights | currency | bookingProductType | ProductName                            |
      | 60              | EAN115066    | LON  | HTL__0__EAN115066__201589972~1~0~0~1~RO_RF__4 | 1-0-0-0 |          | 2      | GBP      | places-to-stay     | Four Seasons Hotel London at Park Lane |

