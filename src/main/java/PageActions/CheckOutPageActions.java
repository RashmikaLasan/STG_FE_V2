package PageActions;

import PageLocators.CheckOutPageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;

public class CheckOutPageActions {

    CheckOutPageLocators checkOutPageLocators;
    public boolean present;
    public static String ProductTitle;
    public static String DepartureDate;
    public static String GuestCount;
    public static String Location;
    public static String SubTotal;
    public static String FullPrice;
    public static String HotelTitle;
    public static String CheckInDate;
    public static String CheckOutDate;
    public static String HTLaddress;
    public static String Roomtype;
    public static String PaxNo;
    public static String HTLCityLocation;
    //    QuestionFillActions fillQuest = new QuestionFillActions();
    QuestionFillActions questionFillActions = new QuestionFillActions();


    public CheckOutPageActions() {

        this.checkOutPageLocators = new CheckOutPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), checkOutPageLocators);

    }


    public void LandedPage() {

        try {

            checkOutPageLocators.YourDetails.isDisplayed();
            present = true;
            System.out.println("Your Detail Element is Visible");

        } catch (NoSuchElementException e) {
            present = false;
        }

    }


    public void ProductName(String PName) {

        ProductTitle = checkOutPageLocators.ProductName1.getText();
        assertTrue(ProductTitle.contains(PName));
        System.out.println("Product Title is :" + ProductTitle);
        System.out.println("Product Title Assertion Success");

    }

    public void DepartureDate() {

        String FullDate = checkOutPageLocators.Date1.getText();
        DepartureDate = FullDate.split(":")[1];
        System.out.println("Departure Date is: " + DepartureDate);

    }

    public void Location() {

        String FullLocation = checkOutPageLocators.Location1.getText();
        Location = FullLocation.split(":")[1];
        System.out.println("Location is: " + Location);

    }

    public void GuestCount() {

        String FullGuestCount = checkOutPageLocators.Guests1.getText();
        GuestCount = FullGuestCount.split(":")[1];
        System.out.println("Guest Count is: " + GuestCount);

    }

    public void SubPrice() {

        String SubTot = checkOutPageLocators.SubPrice1.getText();
        SubTotal = SubTot.split("£")[1];
        System.out.println("Sub Total is: " + SubTotal);

    }

    public void FullTotal() {

        String FullTot = checkOutPageLocators.TotalPrice1.getText();
        FullPrice = FullTot.split("£")[1];
        System.out.println("Full Total is: " + FullPrice);

    }

    public void PassengerName(String FirstName, String LastName) throws InterruptedException {

        Thread.sleep(1000);
        checkOutPageLocators.Title1.click();
        Thread.sleep(3000);
        checkOutPageLocators.TitleSelect1.click();
        System.out.println("Passenger Title Select");

        checkOutPageLocators.FName1.sendKeys(FirstName);
        Thread.sleep(1500);
        System.out.println("First Name Entered");
        checkOutPageLocators.LName1.click();
        checkOutPageLocators.LName1.sendKeys(LastName);
        System.out.println("Last Name Entered");
        Thread.sleep(2000);

    }

    public void secondRoomPaxName(String firstName, String lastName) throws InterruptedException {

        Thread.sleep(1000);
        checkOutPageLocators.title2.click();
        Thread.sleep(1000);
        checkOutPageLocators.titleSelect2.click();
        System.out.println("Passenger Title Select for Second Room Passenger");

        checkOutPageLocators.fName2.sendKeys(firstName);
        Thread.sleep(1500);
        System.out.println("First Name Entered for Second Room Passenger");
        checkOutPageLocators.lName2.click();
        checkOutPageLocators.lName2.sendKeys(lastName);
        System.out.println("Last Name Entered for Second Room Passenger");
        Thread.sleep(2000);

    }

    public void PassengerEmail(String EmailAddress) {

        checkOutPageLocators.Email1.click();
        checkOutPageLocators.Email1.sendKeys(EmailAddress);
        System.out.println("Email1 Entered");

    }

    public void ScrollDown() {

        JavascriptExecutor jsx = (JavascriptExecutor) SeleniumDriver.getDriver();
        jsx.executeScript("window.scrollBy(0,250)", "");
        System.out.println("Scroll Down");
        checkOutPageLocators.SomeWhere.click();

    }

    public void PassengerPhone(String Phone) throws InterruptedException {

        checkOutPageLocators.CountryCode1.click();
        Thread.sleep(3000);
        System.out.println("Country Code Drop down Click Success");
        checkOutPageLocators.CountryCodeSelect1.click();
        System.out.println("Country Selected Success");

        checkOutPageLocators.MobileNumber1.sendKeys(String.valueOf(Phone));
        Thread.sleep(3000);
        checkOutPageLocators.SomeWhere.click();

    }

    public void BookingQuestion() throws InterruptedException {

        questionFillActions.addPassportNumber();
        questionFillActions.languageSelect();
        questionFillActions.addBirthDate();
        questionFillActions.addPassportNationality();
        questionFillActions.addPassportExpiryDate();
        questionFillActions.addArrivalAirline();
        questionFillActions.arrivalFlightNo();
        questionFillActions.dropOffLocation();

    }

    public void PaymentSection() throws InterruptedException {


        JavascriptExecutor jsx = (JavascriptExecutor) SeleniumDriver.getDriver();
        jsx.executeScript("window.scrollBy(0,250)", "");
        SeleniumDriver.getDriver().switchTo().frame(0);
        Thread.sleep(2500);

        checkOutPageLocators.CardNumber.sendKeys("555555555555444425255555555");

        SeleniumDriver.getDriver().switchTo().defaultContent();
        Thread.sleep(2500);
        checkOutPageLocators.CardName.sendKeys("LasanRash");
        jsx.executeScript("window.scrollBy(0,150)", "");


    }

    public void ConfirmCart() throws InterruptedException {

        checkOutPageLocators.Tick.click();
        System.out.println("Tick the Box");
        checkOutPageLocators.Confirm.click();
        System.out.println("Click Confirm Button");
        Thread.sleep(25000);
    }

    public void PromoApply(String Promo) throws InterruptedException {

        Thread.sleep(2000);
        checkOutPageLocators.PromoCodeBox.sendKeys(Promo);
        checkOutPageLocators.PromoCodeApply.click();
        System.out.println("Promo Code applied");
        Thread.sleep(2000);

    }


    public void HotelName(String HName) {

        HotelTitle = checkOutPageLocators.HotelName1.getText();
        assertTrue(HotelTitle.contains(HName));
        System.out.println("Hotel Name is :" + HotelTitle);
        System.out.println("Hotel Name Assertion Success");

    }

    public void HTLAddress1() {

        String HTL_Address = checkOutPageLocators.HTLAddress1.getText();
        HTLaddress = HTL_Address.split(":")[1];
        System.out.println("HTL Address is: " + HTLaddress);

    }

    public void RoomType() {

        String Room_Type = checkOutPageLocators.RoomType1.getText();
        Roomtype = Room_Type.split(":")[1];
        System.out.println("Room Type is: " + Roomtype);

    }


    public void PaxCount() {

        String Pax_Count = checkOutPageLocators.paxCount1.getText();
        PaxNo = Pax_Count.split(":")[1];
        System.out.println("Pax Count is: " + PaxNo);

    }

//    public void HTLCity() {
//
//        String HTL_City = checkOutPageLocators.PaxCount1.getText();
//        HTLCityLocation = HTL_City.split(":")[1];
//        System.out.println("HTL City is: " + HTLCityLocation);
//
//    }


    public void CheckInDate() {

        CheckInDate = checkOutPageLocators.CheckIn1.getText();
        System.out.println("CheckIn Date is: " + CheckInDate);

    }


    public void CheckOutDate() {

        CheckOutDate = checkOutPageLocators.CheckOut1.getText();
        System.out.println("CheckOut Date is: " + CheckOutDate);

    }

}