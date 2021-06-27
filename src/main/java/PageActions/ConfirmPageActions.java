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
    ConfirmPageLocators confirmPageLocators;

    public ConfirmPageActions() {

        this.confirmPageLocators = new ConfirmPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), confirmPageLocators);

    }

    public void BookingIdVisible() {
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

    public void DateAssertion() {

        String DateAll = confirmPageLocators.Date.getText();
        ConfirmDate = DateAll.split(":")[1];
        Assert.assertEquals(ConfirmDate, DepartureDate);
        System.out.println("Departure Date Assertion Success");

    }

    public void GuestAssertion() {

        String Guest = confirmPageLocators.Guests.getText();
        ConfirmGuest = Guest.split(":")[1];
        Assert.assertEquals(ConfirmGuest, GuessCount);
        System.out.println("Confirm Guest Assertion Success");

    }

    public void LocationAssertion() {

        String Loc = confirmPageLocators.Location.getText();
        ConfirmLocation = Loc.split(":")[1];
        Assert.assertEquals(ConfirmLocation, Location);
        System.out.println("Location Assertion Assertion Success");

    }


    public void PriceAssertion() {

        String TotPaid = confirmPageLocators.Paid.getText();
        Paid = TotPaid.split("£")[1];
        Assert.assertEquals(Paid, FullPrice);
        System.out.println("Price Assertion Success");

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

