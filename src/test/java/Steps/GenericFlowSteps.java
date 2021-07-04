package Steps;

import PageActions.CheckOutPageActions;
import PageActions.ConfirmPageActions;
import Utilities.SeleniumDriver;
import Utilities.TimeHandler;
import cucumber.api.java.en.*;

public class GenericFlowSteps {

    public static String StartDate;
    public String STGBase = "https://staging.theculturetrip.com/checkout/?";
    CheckOutPageActions checkOutPageActions = new CheckOutPageActions();
    ConfirmPageActions confirmPageActions = new ConfirmPageActions();

    @Given("^user set the booking parameter checkIn date as \"([^\"]*)\" Supplier Code as \"([^\"]*)\" City as \"([^\"]*)\" ChoiceKey as \"([^\"]*)\" pax as \"([^\"]*)\" ChildDoB as \"([^\"]*)\" seniorDob as \"([^\"]*)\" currency as \"([^\"]*)\" bookingProductType as \"([^\"]*)\"$")
    public void userSetTheBookingParameterCheckInDateAsSupplierCodeAsCityAsChoiceKeyAsPaxAsChildDoBAsSeniorDobAsCurrencyAsBookingProductTypeAs(int FutureDateCount, String supplierCode, String City, String ChoiceKey, String Pax, String childDob, String seniorDob, String currency, String bookingProductType) throws Throwable {

        StartDate = TimeHandler.TravelDate(FutureDateCount);
        String stgCheckOut = "startDate=" + StartDate + "&supplierCode=" + supplierCode + "&city=" + City + "&fc=" + ChoiceKey + "&pax=" + Pax + "&childDob=" + childDob + "&seniorDob=" + seniorDob + "&currency=" + currency + "&bookingProductType=" + bookingProductType;

        SeleniumDriver.openPage(STGBase + stgCheckOut);
        System.out.println(STGBase + stgCheckOut);
        Thread.sleep(5000);
    }


    @When("^Checkout page should be loaded$")
    public void checkoutPageShouldBeLoaded() {

        checkOutPageActions.LandedPage();


    }

    @And("^check the Product Name is Correct as \"([^\"]*)\"$")
    public void checkTheProductNameIsCorrectAs(String PName) {

        checkOutPageActions.ProductName(PName);

    }

    @And("^check the Travelling Date is Correct$")
    public void checkTheTravellingDateIsCorrect() {

        checkOutPageActions.DepartureDate();

    }

    @And("^check the Travelling Location is Correct$")
    public void checkTheTravellingLocationIsCorrect() {

        checkOutPageActions.Location();
    }

    @And("^check the Guest Count is Correct$")
    public void checkTheGuestCountIsCorrect() {

        checkOutPageActions.GuestCount();
    }

    @And("^check the Sub Price of the Booking$")
    public void checkTheSubPriceOfTheBooking() {

        checkOutPageActions.SubPrice();
    }

    @And("^check the Total Price of the Booking$")
    public void checkTheTotalPriceOfTheBooking() {

        checkOutPageActions.FullTotal();
    }

    @Then("^User fill the Passenger Details where First Name as \"([^\"]*)\" and Last Name as \"([^\"]*)\"$")
    public void userFillThePassengerDetailsWhereFirstNameAsAndLastNameAs(String FName, String LName) throws InterruptedException {

        checkOutPageActions.PassengerName(FName, LName);

    }

    @Then("^User fill the email address \"([^\"]*)\"$")
    public void userFillTheEmailAddress(String Email) throws Throwable {

        checkOutPageActions.PassengerEmail(Email);
    }

    @Then("^Scroll Down the Screen$")
    public void scrollDownTheScreen() throws Throwable {

        checkOutPageActions.ScrollDown();
    }


    @Then("^User fill the Mobile Number as \"([^\"]*)\"$")
    public void userFillTheMobileNumberAs(String PhoneNumber) throws Throwable {
        checkOutPageActions.PassengerPhone(PhoneNumber);
    }

    @Then("^User fill the Booking Questions$")
    public void userFillTheBookingQuestions() throws Throwable {

        checkOutPageActions.BookingQuestion();

    }

    @Then("^User fill the payment details$")
    public void userFillThePaymentDetails() throws Throwable {

//        checkOutPageActions.ScrollDown();
        checkOutPageActions.PaymentSection();
    }

    @Then("^click Confirm$")
    public void clickConfirm() throws Throwable {

        checkOutPageActions.ConfirmCart();

    }

    @When("^user Navigate to the Confirmation Page Booking ID Should be displayed$")
    public void userNavigateToTheConfirmationPageBookingIDShouldBeDisplayed() throws Throwable {

        confirmPageActions.bookingIdVisible();

    }

    @And("^Correct Product Name should be displayed$")
    public void correctProductNameShouldBeDisplayed() throws Throwable {

        confirmPageActions.productNameAssertion();
    }

    @And("^Correct Travelling Date should be displayed$")
    public void correctTravellingDateShouldBeDisplayed() throws Throwable {

        confirmPageActions.dateAssertion();
    }

    @And("^Correct Guest Count should be displayed$")
    public void correctGuestCountShouldBeDisplayed() throws Throwable {

        confirmPageActions.guestAssertion();
    }

    @And("^Correct City Location should be displayed$")
    public void correctCityLocationShouldBeDisplayed() throws Throwable {

        confirmPageActions.locationAssertion();
    }

    @Then("^Close the Browser$")
    public void closeTheBrowser() throws Throwable {

        SeleniumDriver.getDriver().quit();
    }

    @And("^Correct Price should be displayed$")
    public void correctPriceShouldBeDisplayed() throws Throwable {

        confirmPageActions.priceAssertion();
    }

    @Then("^User Fill the Promo Code as \"([^\"]*)\"$")
    public void userFillThePromoCodeAs(String Promo) throws Throwable {

        checkOutPageActions.PromoApply(Promo);

    }

    @When("^click Cancel Icon$")
    public void clickCancelIcon() throws Throwable {

        confirmPageActions.cancelIcon();

    }

    @Then("^Cancel PopUp should display$")
    public void cancelPopUpShouldDisplay() throws Throwable {

        confirmPageActions.cancelPopUp();

    }

    @Then("^Click Cancel the Booking$")
    public void clickCancelTheBooking() throws Throwable {

        confirmPageActions.clickCancelButton();

    }
}
