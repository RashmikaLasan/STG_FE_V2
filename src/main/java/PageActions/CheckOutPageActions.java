package PageActions;

import PageLocators.CheckOutPageLocators;
import Utilities.Log;
import Utilities.SeleniumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;

public class CheckOutPageActions {

    CheckOutPageLocators checkOutPageLocators;
    public boolean present;
    public static String productTitle;
    public static String departureDate;
    public static String guestCount;
    public static String location;
    public static String subPrice;
    public static String fullPrice;
    public static String hotelTitle;
    public static String checkInDate;
    public static String checkOutDate;
    public static String hTLaddress;
    public static String roomtype;
    public static String paxNo;
    public static String hTLCityLocation;
    //    QuestionFillActions fillQuest = new QuestionFillActions();
    QuestionFillActions questionFillActions = new QuestionFillActions();

    final Logger logger = Log.getLogData(Log.class.getName());


    public CheckOutPageActions() {

        this.checkOutPageLocators = new CheckOutPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), checkOutPageLocators);

    }


    public void landedPage() {

        try {

            checkOutPageLocators.yourDetails.isDisplayed();
            present = true;
            logger.info("Your Detail Element is Visible");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }


    public void productName(String pName) {

        productTitle = checkOutPageLocators.productName1.getText();
        assertTrue(productTitle.contains(pName));
        logger.info("Product Title is :" + productTitle);
        logger.info("Product Title Assertion Success");

    }

    public void departureDate() {

        String fullDate = checkOutPageLocators.date1.getText();
        departureDate = fullDate.split(":")[1];
        logger.info("Departure Date is: " + departureDate);

    }

    public void location() {

        String fullLocation = checkOutPageLocators.location1.getText();
        location = fullLocation.split(":")[1];
        logger.info("Location is: " + location);

    }

    public void guestCount() {

        String fullGuestCount = checkOutPageLocators.guests1.getText();
        guestCount = fullGuestCount.split(":")[1];
        logger.info("Guest Count is: " + guestCount);

    }

    public void subPrice() {

        String subTot = checkOutPageLocators.subPrice1.getText();
        subPrice = subTot.split("£")[1];
        logger.info("Sub Total is: " + subPrice);

    }

    public void fullTotal() {

        String fullTot = checkOutPageLocators.totalPrice1.getText();
        fullPrice = fullTot.split("£")[1];
        logger.info("Full Total is: " + fullPrice);

    }

    public void passengerName(String firstName, String lastName) throws InterruptedException {

        Thread.sleep(1000);
        checkOutPageLocators.title1.click();
        Thread.sleep(3000);
        checkOutPageLocators.titleSelect1.click();
        logger.info("Passenger Title Select");

        checkOutPageLocators.fName1.sendKeys(firstName);
        Thread.sleep(1500);
        logger.info("First Name Entered");
        checkOutPageLocators.lName1.click();
        checkOutPageLocators.lName1.sendKeys(lastName);
        logger.info("Last Name Entered");
        Thread.sleep(2000);

    }

    public void secondRoomPaxName(String firstName, String lastName) throws InterruptedException {

        Thread.sleep(3000);
        checkOutPageLocators.title2.click();
        Thread.sleep(4000);
        checkOutPageLocators.titleSelect2.click();
        logger.info("Passenger Title Select for Second Room Passenger");

        checkOutPageLocators.fName2.sendKeys(firstName);
        Thread.sleep(1500);
        logger.info("First Name Entered for Second Room Passenger");
        checkOutPageLocators.lName2.click();
        checkOutPageLocators.lName2.sendKeys(lastName);
        logger.info("Last Name Entered for Second Room Passenger");
        Thread.sleep(2000);

    }

    public void passengerEmail(String emailAddress) {

        checkOutPageLocators.email1.click();
        checkOutPageLocators.email1.sendKeys(emailAddress);
        logger.info("Email1 Entered");

    }

    public void scrollDown() {

        JavascriptExecutor jsx = (JavascriptExecutor) SeleniumDriver.getDriver();
        jsx.executeScript("window.scrollBy(0,250)", "");
        logger.info("Scroll Down");
        checkOutPageLocators.someWhere.click();

    }

    public void passengerPhone(String phone) throws InterruptedException {

        checkOutPageLocators.countryCode1.click();
        Thread.sleep(3000);
        logger.info("Country Code Drop down Click Success");
        checkOutPageLocators.countryCodeSelect1.click();
        logger.info("Country Selected Success");

        checkOutPageLocators.mobileNumber1.sendKeys(String.valueOf(phone));
        Thread.sleep(3000);
        checkOutPageLocators.someWhere.click();

    }

    public void bookingQuestion() throws InterruptedException {

        questionFillActions.addPassportNumber();
        questionFillActions.languageSelect();
        questionFillActions.pickUpPointSelect();
        questionFillActions.addBirthDate();
        questionFillActions.addPassportNationality();
        questionFillActions.addPassportExpiryDate();
        questionFillActions.addArrivalAirline();
        questionFillActions.arrivalFlightNo();
        questionFillActions.dropOffLocation();

    }

    public void secondPassengerBookingQuestion() throws InterruptedException {

        questionFillActions.addSecondPassengerBirthDate();


    }

    public void paymentSection() throws InterruptedException {


        JavascriptExecutor jsx = (JavascriptExecutor) SeleniumDriver.getDriver();
        jsx.executeScript("window.scrollBy(0,250)", "");
        SeleniumDriver.getDriver().switchTo().frame(0);
        Thread.sleep(2500);

        checkOutPageLocators.cardNumber.sendKeys("555555555555444425255555555");

        SeleniumDriver.getDriver().switchTo().defaultContent();
        Thread.sleep(2500);
        checkOutPageLocators.cardName.sendKeys("LasanRash");
        jsx.executeScript("window.scrollBy(0,150)", "");


    }

    public void confirmCart() throws InterruptedException {

        checkOutPageLocators.tick.click();
        logger.info("Tick the Box");
        checkOutPageLocators.confirm.click();
        logger.info("Click Confirm Button");
        Thread.sleep(25000);
    }

    public void promoApply(String promo) throws InterruptedException {

        Thread.sleep(2000);
        checkOutPageLocators.promoCodeBox.sendKeys(promo);
        checkOutPageLocators.promoCodeApply.click();
        logger.info("Promo Code applied");
        Thread.sleep(2000);

    }


    public void hotelName(String hName) {

        hotelTitle = checkOutPageLocators.hotelName1.getText();
        assertTrue(hotelTitle.contains(hName));
        logger.info("Hotel Name is :" + hotelTitle);
        logger.info("Hotel Name Assertion Success");

    }

    public void hTLAddress1() {

        String htkAddress = checkOutPageLocators.hTLAddress1.getText();
        hTLaddress = htkAddress.split(":")[1];
        logger.info("HTL Address is: " + hTLaddress);

    }

    public void roomType() {

        String roomType = checkOutPageLocators.roomType1.getText();
        roomtype = roomType.split(":")[1];
        logger.info("Room Type is: " + roomtype);

    }


    public void paxCount() {

        String paxCount = checkOutPageLocators.paxCount1.getText();
        paxNo = paxCount.split(":")[1];
        logger.info("Pax Count is: " + paxNo);

    }

//    public void HTLCity() {
//
//        String HTL_City = checkOutPageLocators.PaxCount1.getText();
//        HTLCityLocation = HTL_City.split(":")[1];
//        System.out.println("HTL City is: " + HTLCityLocation);
//
//    }


    public void checkInDate() {

        checkInDate = checkOutPageLocators.checkIn1.getText();
        System.out.println("CheckIn Date is: " + checkInDate);

    }


    public void checkOutDate() {

        checkOutDate = checkOutPageLocators.checkOut1.getText();
        logger.info("CheckOut Date is: " + checkOutDate);

    }

}