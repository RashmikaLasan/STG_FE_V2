package PageActions;

import PageLocators.ConfirmPageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static PageActions.CheckOutPageActions.*;

public class ConfirmPageActions {

    public String ConfirmProductName;
    public String ConfirmDate;
    public String ConfirmGuest;
    public String ConfirmLocation;
    public String BookingId;
    public String Paid;
    public boolean present;
    public String CheckInDateConfirm;
    public String CheckOutDateConfirm;
    public String ConfirmPaxHTL;
    public String ConfirmCity;
    ConfirmPageLocators confirmPageLocators;

    public ConfirmPageActions() {

        this.confirmPageLocators = new ConfirmPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), confirmPageLocators);

    }

    public void BookingIdVisible() {

        System.out.println("Waiting till Navigate to the Page");
        if (confirmPageLocators.BookingID != null) {

            System.out.println("Navigated to the Confirmation Page");
            System.out.println("Navigated URL is: " + SeleniumDriver.getDriver().getCurrentUrl());
            BookingId = confirmPageLocators.BookingID.getText();
            System.out.println("BookingId is: " + BookingId);

        } else {
            System.out.println("Not Navigated to the Confirmation Page");
        }

    }


    public void ProductNameAssertion() {

        ConfirmProductName = confirmPageLocators.ProductName.getText();
        Assert.assertEquals(ConfirmProductName, ProductTitle);
        System.out.println("Confirm Product Name Assertion Success");

    }

    public void HotelNameAssertion() {

        ConfirmProductName = confirmPageLocators.ProductName.getText();
        Assert.assertEquals(ConfirmProductName, HotelTitle);
        System.out.println("Confirm Hotel Name Assertion Success and Hotel Name is: " + ConfirmProductName);

    }

    public void CheckInDateAssertion() {

        CheckInDateConfirm = confirmPageLocators.CheckInDate.getText();
        Assert.assertEquals(CheckInDateConfirm, CheckInDate);
        System.out.println("CheckIn Date Assertion Success, CheckIn Date is: " + CheckInDateConfirm);

    }

    public void CheckOutDateAssertion() {

        CheckOutDateConfirm = confirmPageLocators.CheckOutDate.getText();
        Assert.assertEquals(CheckOutDateConfirm, CheckOutDate);
        System.out.println("CheckOut Date Assertion Success and CheckOut Date is " + CheckOutDateConfirm);

    }

    public void HTLPaxAssertion() {

        String HTLPAX = confirmPageLocators.HTLPaxCount.getText();
        ConfirmPaxHTL = HTLPAX.split(":")[1];
        Assert.assertEquals(ConfirmPaxHTL, PaxNo);
        System.out.println("Confirm Guest Assertion Success for Hotels and Pax Combination is: " + ConfirmPaxHTL);

    }

    public void DateAssertion() {

        String DateAll = confirmPageLocators.Date.getText();
        ConfirmDate = DateAll.split(":")[1];
        Assert.assertEquals(ConfirmDate, DepartureDate);
        System.out.println("Departure Date Assertion Success");

    }

    public void GuestAssertion() {

        String Guest = confirmPageLocators.Guests.getText();
        ConfirmGuest = Guest.split(":")[1];
        Assert.assertEquals(ConfirmGuest, GuestCount);
        System.out.println("Confirm Guest Assertion Success");

    }

    public void LocationAssertion() {

        String Loc = confirmPageLocators.Location.getText();
        ConfirmLocation = Loc.split(":")[1];
        Assert.assertEquals(ConfirmLocation, Location);
        System.out.println("Location Assertion Assertion Success");

    }

    public void CityAssertionHTL() {

        String CityLoc = confirmPageLocators.HTLCity.getText();
        ConfirmCity = CityLoc.split(":")[1];
        Assert.assertEquals(ConfirmCity, HTLaddress);
        System.out.println("Confirm City Assertion Success and Hotel Location is: " + ConfirmCity);

    }

    public void PriceAssertion() throws InterruptedException {

        Thread.sleep(2000);
        String TotPaid = confirmPageLocators.Paid.getText();
        Paid = TotPaid.split("£")[1];
        Assert.assertEquals(Paid, FullPrice);
        System.out.println("Price Assertion Success and Paid Amount is: " + Paid);

    }

    public void CancelIcon() throws InterruptedException {

        confirmPageLocators.CancelIcon.click();
        Thread.sleep(2000);
        System.out.println("Click the Cancel Icon");

    }

    public void CancelPopUp() {

        try {

            confirmPageLocators.CancelPopUp.isDisplayed();
            present = true;
            System.out.println("Cancel popup is Visible");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void ClickCancelButton() throws InterruptedException {

        confirmPageLocators.CancelBooking.click();
        System.out.println("Click the Booking Cancel Button");
        Thread.sleep(25000);

    }

}

