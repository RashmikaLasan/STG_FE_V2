package Steps;

import PageActions.CheckOutPageActions;
import PageActions.ConfirmPageActions;
import Utilities.SeleniumDriver;
import Utilities.TimeHandler;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HotelFlowSteps {

    public static String StartDate;
    public String STGBase = "https://staging.theculturetrip.com/checkout/?";
    CheckOutPageActions checkOutPageActions = new CheckOutPageActions();
    ConfirmPageActions confirmPageActions = new ConfirmPageActions();


    @Given("^user set the booking parameter checkIn date as \"([^\"]*)\" Supplier Code as \"([^\"]*)\" City as \"([^\"]*)\" ChoiceKey as \"([^\"]*)\" pax as \"([^\"]*)\" ChildDoB as \"([^\"]*)\" Night Count as \"([^\"]*)\" currency as \"([^\"]*)\" bookingProductType as \"([^\"]*)\"$")
    public void userSetTheBookingParameterCheckInDateAsSupplierCodeAsCityAsChoiceKeyAsPaxAsChildDoBAsNightCountAsCurrencyAsBookingProductTypeAs(int FutureDateCount, String supplierCode, String City, String ChoiceKey, String Pax, String childDob, String Nights, String currency, String bookingProductType) throws Throwable {

        StartDate = TimeHandler.TravelDate(FutureDateCount);
        String stgCheckOut = "startDate=" + StartDate + "&supplierCode=" + supplierCode + "&city=" + City + "&fc=" + ChoiceKey + "&pax=" + Pax + "&childDob=" + childDob + "&nights=" + Nights + "&currency=" + currency + "&bookingProductType=" + bookingProductType;

        SeleniumDriver.openPage(STGBase + stgCheckOut);
        System.out.println(STGBase + stgCheckOut);
        Thread.sleep(5000);

    }

    @And("^check the Hotel Name is Correct as \"([^\"]*)\"$")
    public void checkTheHotelNameIsCorrectAs(String hTLname) {

        checkOutPageActions.hotelName(hTLname);

    }

    @And("^check the CheckIn Date is Correct$")
    public void checkTheCheckInDateIsCorrect() throws Throwable {

        checkOutPageActions.checkInDate();

    }

    @And("^check the CheckOut Date is Correct$")
    public void checkTheCheckOutDateIsCorrect() {

        checkOutPageActions.checkOutDate();

    }

    @And("^check the Travelling Address is Correct$")
    public void checkTheTravellingAddressIsCorrect() {

        checkOutPageActions.hTLAddress1();

    }

    @And("^check the Pax Count is Correct$")
    public void checkThePaxCountIsCorrect() {

        checkOutPageActions.paxCount();

    }


    @And("^check the Room Type Basis is Correct$")
    public void checkTheRoomTypeBasisIsCorrect() {

        checkOutPageActions.roomType();

    }

    @And("^Correct Hotel Name should be displayed$")
    public void correctHotelNameShouldBeDisplayed() {

        confirmPageActions.hotelNameAssertion();

    }

    @And("^Correct CheckIn Date should be displayed$")
    public void correctCheckInDateShouldBeDisplayed() throws Throwable {

        confirmPageActions.checkInDateAssertion();

    }

    @And("^Correct CheckOut Date should be displayed$")
    public void correctCheckOutDateShouldBeDisplayed() throws Throwable {

        confirmPageActions.checkOutDateAssertion();

    }

    @And("^Correct Guest Count should be displayed for HotelBooking$")
    public void correctGuestCountShouldBeDisplayedForHotelBooking() throws Throwable {

        confirmPageActions.htlPaxAssertion();

    }

    @And("^Correct City should be displayed$")
    public void correctCityShouldBeDisplayed() throws Throwable {

        confirmPageActions.cityAssertionHTL();

    }

    @Then("^User fill the Second Room Passenger Details where First Name as \"([^\"]*)\" and Last Name as \"([^\"]*)\"$")
    public void userFillTheSecondRoomPassengerDetailsWhereFirstNameAsAndLastNameAs(String firstName, String secondName) throws Throwable {

        checkOutPageActions.secondRoomPaxName(firstName, secondName);

    }
}
