package PageActions;

import PageLocators.QuestionLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class QuestionFillActions {

    public boolean present;
    QuestionLocators questionLocators;


    public QuestionFillActions() {

        this.questionLocators = new QuestionLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), questionLocators);

    }

    public void languageSelect() throws InterruptedException {

        try {

            questionLocators.language.isDisplayed();
            present = true;
            System.out.println("Tour/Activity Language Element is Visible");

            questionLocators.languageClick.click();
            System.out.println("Tour/Activity Language Drop down Click Success");
            Thread.sleep(500);
            questionLocators.languageSelect.click();
            System.out.println("Select France from the Drop Down");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void addPassportNumber() {

        SeleniumDriver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        try {

            questionLocators.passportNumber.isDisplayed();
            present = true;
            System.out.println("Passport tNumber Element is Visible");

            questionLocators.passportTextBox.sendKeys("N931400");
            System.out.println("Passport Number Entered");


        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void addPassportNationality() {

        try {

            questionLocators.passportNationality.isDisplayed();
            present = true;
            System.out.println("Passport Nationality Element is Visible");

            questionLocators.passportNationalityClick.click();
            System.out.println("Passport Nationality Drop Down Clicked");

            questionLocators.passportNationalitySelect.click();
            System.out.println("Passport Nationality Select as Anguilla from the Drop Down");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }


    public void addPassportExpiryDate() {

        try {

            questionLocators.passportExpiryDate.isDisplayed();
            present = true;
            System.out.println("Passport Expiry Date Element is Visible");

            questionLocators.passportExpiryDay.sendKeys("19");
            System.out.println("Passport Expiry Date Entered");

            questionLocators.passportExpiryMonth.sendKeys("05");
            System.out.println("Passport Expiry Month Entered");

            questionLocators.passportExpiryYear.sendKeys("2025");
            System.out.println("Passport Expiry Year Entered");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }


    public void addArrivalAirline() {

        try {

            questionLocators.arrivalAirline.isDisplayed();
            present = true;
            System.out.println("Arrival Airline Element is Visible");

            questionLocators.arrivalAirlineTextBox.sendKeys("Malaysian");
            System.out.println("Arrival Airline Entered");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }


    public void arrivalFlightNo() {

        try {

            questionLocators.arrivalFlightNo.isDisplayed();
            present = true;
            System.out.println("Arrival FlightNo Element is Visible");

            questionLocators.arrivalFlightNoTextBox.sendKeys("MH370");
            System.out.println("Arrival FlightNo Entered");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void dropOffLocation() {

        try {

            questionLocators.dropOffLocation.isDisplayed();
            present = true;
            System.out.println("Drop Off Location Element is Visible");

            questionLocators.dropOffLocationTextBox.sendKeys("Matara");
            System.out.println("Drop Off Location Entered");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }

    public void addBirthDate() throws InterruptedException {

        try {

            questionLocators.birthDateLabel.isDisplayed();

            System.out.println("Birth Day Element is Visible");
            questionLocators.birthDay.sendKeys("19");
            System.out.println("Birth Date Entered");

            questionLocators.birthMonth.sendKeys("05");
            System.out.println("Birth Month Entered");

            questionLocators.birthYear.sendKeys("1995");
            System.out.println("Birth Year Entered");
            Thread.sleep(100);
        } catch (NoSuchElementException e) {

            present = false;

        }

    }

}
