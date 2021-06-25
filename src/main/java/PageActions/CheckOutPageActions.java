package PageActions;

import PageLocators.CheckOutPageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPageActions {

    CheckOutPageLocators checkOutPageLocators;


    public CheckOutPageActions() {

        this.checkOutPageLocators = new CheckOutPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), checkOutPageLocators);

    }

    public void PassengerName(String FirstName, String LastName) throws InterruptedException {

        checkOutPageLocators.Title1.click();
        Thread.sleep(3000);
        checkOutPageLocators.TitleSelect1.click();

        checkOutPageLocators.FName1.sendKeys(FirstName);
        checkOutPageLocators.LName1.sendKeys(LastName);
        Thread.sleep(2000);

    }

    public void PassengerEmail(String EmailAddress) throws InterruptedException {

        checkOutPageLocators.Email1.click();
        checkOutPageLocators.Email1.sendKeys(EmailAddress);

    }

    public void ScrollDown() throws InterruptedException {

        JavascriptExecutor jsx = (JavascriptExecutor) SeleniumDriver.getDriver();
        jsx.executeScript("window.scrollBy(0,250)", "");

    }

    public void PassengerPhone(int Phone) throws InterruptedException {

        checkOutPageLocators.CountryCode1.click();
        Thread.sleep(3000);
        System.out.println("CountryCode1 Click Success1");
        checkOutPageLocators.CountryCodeSelect1.click();

        checkOutPageLocators.MobileNumber1.sendKeys(String.valueOf(Phone));
        Thread.sleep(3000);
        checkOutPageLocators.SomeWhere.click();

    }

    public void BookingQuestion() throws InterruptedException {

        checkOutPageLocators.Language1.click();
        Thread.sleep(3000);
        checkOutPageLocators.LanguageSelect.click();

    }

    public void PayementSection() throws InterruptedException {


        JavascriptExecutor jsx = (JavascriptExecutor) SeleniumDriver.getDriver();
        jsx.executeScript("window.scrollBy(0,250)", "");
        SeleniumDriver.getDriver().switchTo().frame(0);
        Thread.sleep(2500);

        checkOutPageLocators.CardNumber.sendKeys("555555555555444425255555555");

        SeleniumDriver.getDriver().switchTo().defaultContent();
        Thread.sleep(2500);
        checkOutPageLocators.CardName.sendKeys("LasanRash");
        jsx.executeScript("window.scrollBy(0,150)", "");


        checkOutPageLocators.Tick.click();
        checkOutPageLocators.Confirm.click();
        Thread.sleep(25000);


    }

}