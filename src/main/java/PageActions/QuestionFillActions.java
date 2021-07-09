package PageActions;

import PageLocators.QuestionLocators;
import Utilities.Log;
import Utilities.SeleniumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class QuestionFillActions {

    public boolean present;
    QuestionLocators questionLocators;
    final Logger logger = Log.getLogData(Log.class.getName());


    public QuestionFillActions() {

        this.questionLocators = new QuestionLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), questionLocators);

    }

    public void languageSelect() throws InterruptedException {

        try {

            questionLocators.language.isDisplayed();
            present = true;
            logger.info("Tour/Activity Language Element is Visible");

            questionLocators.languageClick.click();
            logger.info("Tour/Activity Language Drop down Click Success");
            Thread.sleep(500);
            questionLocators.languageSelect.click();
            logger.info("Select France from the Drop Down");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }


    public void pickUpPointSelect() throws InterruptedException {

        try {

            questionLocators.hotelPickup.isDisplayed();
            present = true;
            logger.info("Hotel Pickup Element is Visible");

            questionLocators.hotelPickupClick.click();
            logger.info("Hotel Pickup Drop down Click Success");
            Thread.sleep(500);
            questionLocators.hotelPickupSelect.click();
            logger.info("Select Hotel Pickup from the Drop Down");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void addPassportNumber() {

        SeleniumDriver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        try {

            questionLocators.passportNumber.isDisplayed();
            present = true;
            logger.info("Passport tNumber Element is Visible");

            questionLocators.passportTextBox.sendKeys("N931400");
            logger.info("Passport Number Entered");


        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void addPassportNationality() {

        try {

            questionLocators.passportNationality.isDisplayed();
            present = true;
            logger.info("Passport Nationality Element is Visible");

            questionLocators.passportNationalityClick.click();
            logger.info("Passport Nationality Drop Down Clicked");

            questionLocators.passportNationalitySelect.click();
            logger.info("Passport Nationality Select as Anguilla from the Drop Down");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }


    public void addPassportExpiryDate() {

        try {

            questionLocators.passportExpiryDate.isDisplayed();
            present = true;
            logger.info("Passport Expiry Date Element is Visible");

            questionLocators.passportExpiryDay.sendKeys("19");
            logger.info("Passport Expiry Date Entered");

            questionLocators.passportExpiryMonth.sendKeys("05");
            logger.info("Passport Expiry Month Entered");

            questionLocators.passportExpiryYear.sendKeys("2025");
            logger.info("Passport Expiry Year Entered");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }


    public void addArrivalAirline() {

        try {

            questionLocators.arrivalAirline.isDisplayed();
            present = true;
            logger.info("Arrival Airline Element is Visible");

            questionLocators.arrivalAirlineTextBox.sendKeys("Malaysian");
            logger.info("Arrival Airline Entered");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }


    public void arrivalFlightNo() {

        try {

            questionLocators.arrivalFlightNo.isDisplayed();
            present = true;
            logger.info("Arrival FlightNo Element is Visible");

            questionLocators.arrivalFlightNoTextBox.sendKeys("MH370");
            logger.info("Arrival FlightNo Entered");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void dropOffLocation() {

        try {

            questionLocators.dropOffLocation.isDisplayed();
            present = true;
            logger.info("Drop Off Location Element is Visible");

            questionLocators.dropOffLocationTextBox.sendKeys("Matara");
            logger.info("Drop Off Location Entered");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void addBirthDate() throws InterruptedException {

        try {

            questionLocators.birthDateLabel.isDisplayed();

            logger.info("Birth Day Element is Visible");
            questionLocators.birthDay.sendKeys("19");
            logger.info("Birth Date Entered");

            questionLocators.birthMonth.sendKeys("05");
            logger.info("Birth Month Entered");

            questionLocators.birthYear.sendKeys("1995");
            logger.info("Birth Year Entered");
            Thread.sleep(100);
        } catch (NoSuchElementException e) {

            present = false;

        }

    }


    public void addSecondPassengerBirthDate() throws InterruptedException {

        try {

            questionLocators.birthDateLabel2.isDisplayed();

            logger.info("Birth Day Element is Visible");
            questionLocators.birthDay2.sendKeys("19");
            logger.info("Birth Date Entered");

            questionLocators.birthMonth2.sendKeys("05");
            logger.info("Birth Month Entered");

            questionLocators.birthYear2.sendKeys("2006");
            logger.info("Birth Year Entered");
            Thread.sleep(100);
        } catch (NoSuchElementException e) {

            present = false;

        }

    }

}
