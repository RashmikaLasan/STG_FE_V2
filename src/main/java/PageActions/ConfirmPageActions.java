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
    public String bookingId;
    public String Paid;
    public boolean present;
    public String CheckInDateConfirm;
    public String CheckOutDateConfirm;
    public String ConfirmPaxHTL;
    public String confirmCity;
    ConfirmPageLocators confirmPageLocators;

    public ConfirmPageActions() {

        this.confirmPageLocators = new ConfirmPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), confirmPageLocators);

    }

    public void bookingIdVisible() {

        System.out.println("Waiting till Navigate to the Page");
        if (confirmPageLocators.bookingID != null) {

            System.out.println("Navigated to the Confirmation Page");
            System.out.println("Navigated URL is: " + SeleniumDriver.getDriver().getCurrentUrl());
            bookingId = confirmPageLocators.bookingID.getText();
            System.out.println("BookingId is: " + bookingId);

        } else {
            System.out.println("Not Navigated to the Confirmation Page");
        }

    }


    public void productNameAssertion() {

        ConfirmProductName = confirmPageLocators.productName.getText();
        Assert.assertEquals(ConfirmProductName, ProductTitle);
        System.out.println("Confirm Product Name Assertion Success");

    }

    public void hotelNameAssertion() {

        ConfirmProductName = confirmPageLocators.productName.getText();
        Assert.assertEquals(ConfirmProductName, HotelTitle);
        System.out.println("Confirm Hotel Name Assertion Success and Hotel Name is: " + ConfirmProductName);

    }

    public void checkInDateAssertion() {

        CheckInDateConfirm = confirmPageLocators.checkInDate.getText();
        Assert.assertEquals(CheckInDateConfirm, checkInDate);
        System.out.println("CheckIn Date Assertion Success, CheckIn Date is: " + CheckInDateConfirm);

    }

    public void checkOutDateAssertion() {

        CheckOutDateConfirm = confirmPageLocators.checkOutDate.getText();
        Assert.assertEquals(CheckOutDateConfirm, checkOutDate);
        System.out.println("CheckOut Date Assertion Success and CheckOut Date is " + CheckOutDateConfirm);

    }

    public void htlPaxAssertion() {

        String hTLPAX = confirmPageLocators.hTLPaxCount.getText();
        ConfirmPaxHTL = hTLPAX.split(":")[1];
        Assert.assertEquals(ConfirmPaxHTL, paxNo);
        System.out.println("Confirm Guest Assertion Success for Hotels and Pax Combination is: " + ConfirmPaxHTL);

    }

    public void dateAssertion() {

        String dateAll = confirmPageLocators.date.getText();
        ConfirmDate = dateAll.split(":")[1];
        Assert.assertEquals(ConfirmDate, DepartureDate);
        System.out.println("Departure Date Assertion Success");

    }

    public void guestAssertion() {

        String guest = confirmPageLocators.guests.getText();
        ConfirmGuest = guest.split(":")[1];
        Assert.assertEquals(ConfirmGuest, GuestCount);
        System.out.println("Confirm Guest Assertion Success");

    }

    public void locationAssertion() {

        String loc = confirmPageLocators.location.getText();
        ConfirmLocation = loc.split(":")[1];
        Assert.assertEquals(ConfirmLocation, Location);
        System.out.println("Location Assertion Assertion Success");

    }

    public void cityAssertionHTL() {

        String cityLoc = confirmPageLocators.hTLCity.getText();
        confirmCity = cityLoc.split(":")[1];
        Assert.assertEquals(confirmCity, hTLaddress);
        System.out.println("Confirm City Assertion Success and Hotel Location is: " + confirmCity);

    }

    public void priceAssertion() throws InterruptedException {

        Thread.sleep(2000);
        String totPaid = confirmPageLocators.paid.getText();
        Paid = totPaid.split("£")[1];
        Assert.assertEquals(Paid, FullPrice);
        System.out.println("Price Assertion Success and Paid Amount is: " + Paid);

    }

    public void cancelIcon() throws InterruptedException {

        confirmPageLocators.cancelIcon.click();
        Thread.sleep(2000);
        System.out.println("Click the Cancel Icon");

    }

    public void cancelPopUp() {

        try {

            confirmPageLocators.cancelPopUp.isDisplayed();
            present = true;
            System.out.println("Cancel popup is Visible");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void clickCancelButton() throws InterruptedException {

        confirmPageLocators.cancelBooking.click();
        System.out.println("Click the Booking Cancel Button");
        Thread.sleep(25000);

    }

}

