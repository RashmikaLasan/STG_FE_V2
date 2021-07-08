package PageActions;

import PageLocators.ConfirmPageLocators;
import Utilities.Log;
import Utilities.SeleniumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static PageActions.CheckOutPageActions.*;

public class ConfirmPageActions {

    public String confirmProductName;
    public String confirmDate;
    public String confirmGuest;
    public String confirmLocation;
    public String bookingId;
    public String paid;
    public boolean present;
    public String checkInDateConfirm;
    public String checkOutDateConfirm;
    public String confirmPaxHTL;
    public String confirmCity;
    ConfirmPageLocators confirmPageLocators;

    final Logger logger = Log.getLogData(Log.class.getName());

    public ConfirmPageActions() {

        this.confirmPageLocators = new ConfirmPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), confirmPageLocators);

    }

    public void bookingIdVisible() {

        logger.info("Waiting till Navigate to the Page");
        if (confirmPageLocators.bookingID != null) {

            logger.info("Navigated to the Confirmation Page");
            logger.info("Navigated URL is: " + SeleniumDriver.getDriver().getCurrentUrl());
            bookingId = confirmPageLocators.bookingID.getText();
            logger.info("BookingId is: " + bookingId);

        } else {
            logger.info("Not Navigated to the Confirmation Page");
        }

    }


    public void productNameAssertion() {

        confirmProductName = confirmPageLocators.productName.getText();
        Assert.assertEquals(confirmProductName, productTitle);
        logger.info("Confirm Product Name Assertion Success");

    }

    public void hotelNameAssertion() {

        confirmProductName = confirmPageLocators.productName.getText();
        Assert.assertEquals(confirmProductName, hotelTitle);
        logger.info("Confirm Hotel Name Assertion Success and Hotel Name is: " + confirmProductName);

    }

    public void checkInDateAssertion() {

        checkInDateConfirm = confirmPageLocators.checkInDate.getText();
        Assert.assertEquals(checkInDateConfirm, checkInDate);
        logger.info("CheckIn Date Assertion Success, CheckIn Date is: " + checkInDateConfirm);

    }

    public void checkOutDateAssertion() {

        checkOutDateConfirm = confirmPageLocators.checkOutDate.getText();
        Assert.assertEquals(checkOutDateConfirm, checkOutDate);
        logger.info("CheckOut Date Assertion Success and CheckOut Date is " + checkOutDateConfirm);

    }

    public void htlPaxAssertion() {

        String hTLPAX = confirmPageLocators.hTLPaxCount.getText();
        confirmPaxHTL = hTLPAX.split(":")[1];
        Assert.assertEquals(confirmPaxHTL, paxNo);
        logger.info("Confirm Guest Assertion Success for Hotels and Pax Combination is: " + confirmPaxHTL);

    }

    public void dateAssertion() {

        String dateAll = confirmPageLocators.date.getText();
        confirmDate = dateAll.split(":")[1];
        Assert.assertEquals(confirmDate, departureDate);
        logger.info("Departure Date Assertion Success");

    }

    public void guestAssertion() {

        String guest = confirmPageLocators.guests.getText();
        confirmGuest = guest.split(":")[1];
        Assert.assertEquals(confirmGuest, guestCount);
        logger.info("Confirm Guest Assertion Success");

    }

    public void locationAssertion() {

        String loc = confirmPageLocators.location.getText();
        confirmLocation = loc.split(":")[1];
        Assert.assertEquals(confirmLocation, location);
        logger.info("Location Assertion Assertion Success");

    }

    public void cityAssertionHTL() {

        String cityLoc = confirmPageLocators.hTLCity.getText();
        confirmCity = cityLoc.split(":")[1];
        Assert.assertEquals(confirmCity, hTLaddress);
        logger.info("Confirm City Assertion Success and Hotel Location is: " + confirmCity);

    }

    public void priceAssertion() throws InterruptedException {

        Thread.sleep(2000);
        String totPaid = confirmPageLocators.paid.getText();
        paid = totPaid.split("£")[1];
        Assert.assertEquals(paid, fullPrice);
        logger.info("Price Assertion Success and Paid Amount is: " + paid);

    }

    public void cancelIcon() throws InterruptedException {

        confirmPageLocators.cancelIcon.click();
        Thread.sleep(2000);
        logger.info("Click the Cancel Icon");

    }

    public void cancelPopUp() {

        try {

            confirmPageLocators.cancelPopUp.isDisplayed();
            present = true;
            logger.info("Cancel popup is Visible");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void clickCancelButton() throws InterruptedException {

        confirmPageLocators.cancelBooking.click();
        logger.info("Click the Booking Cancel Button");
        Thread.sleep(25000);

    }

}

