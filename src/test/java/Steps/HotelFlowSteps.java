package Steps;

import PageActions.CheckOutPageActions;
import PageActions.ConfirmPageActions;
import Utilities.SeleniumDriver;
import Utilities.TimeHandler;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

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
    public void checkTheHotelNameIsCorrectAs(String HTLname) throws Throwable {

        checkOutPageActions.HotelName(HTLname);

    }

    @And("^check the CheckIn Date is Correct$")
    public void checkTheCheckInDateIsCorrect() throws Throwable {

        checkOutPageActions.CheckInDate();

    }

    @And("^check the CheckOut Date is Correct$")
    public void checkTheCheckOutDateIsCorrect() throws Throwable {

        checkOutPageActions.CheckOutDate();

    }

    @And("^check the Travelling Address is Correct$")
    public void checkTheTravellingAddressIsCorrect() throws Throwable {

        checkOutPageActions.HTLAddress1();

    }

    @And("^check the Pax Count is Correct$")
    public void checkThePaxCountIsCorrect() throws Throwable {

        checkOutPageActions.PaxCount();

    }


    @And("^check the Room Type Basis is Correct$")
    public void checkTheRoomTypeBasisIsCorrect() throws Throwable {

        checkOutPageActions.RoomType();

    }
}
