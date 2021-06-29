package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConfirmPageLocators {

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/span[1]")
    public WebElement ProductName;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/span[2]")
    public WebElement Date;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/span[3]")
    public WebElement Guests;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/span[4]")
    public WebElement Location;

    @FindBy(how = How.CSS, using = "div[class='sc-gKAaRy cLccOM'] span[class='sc-bqGGPW hKEfcw']")
    public WebElement Paid;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/span[1]")
    public WebElement BookingID;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='here']")
    public WebElement CancelIcon;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Yes, cancel my booking']")
    public WebElement CancelBooking;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Are you sure you want to cancel your booking?')]")
    public WebElement CancelPopUp;

    @FindBy(how = How.CSS, using = "div[class='sc-gKAaRy duvetK'] div:nth-child(1) span:nth-child(2)")
    public WebElement CheckInDate;

    @FindBy(how = How.CSS, using = ".duvetK > div:nth-of-type(2) > span:nth-of-type(2)")
    public WebElement CheckOutDate;

    @FindBy(how = How.XPATH, using = "//span[@data-automation-id='overview-guests-distribution']")
    public WebElement HTLPaxCount;

    @FindBy(how = How.XPATH, using = "//div[@class='sc-gKAaRy dIntGq']//div[@class='sc-dlnjwi jSOZQm']")
    public WebElement HTLRoomCount;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'kMGdow')]//*[contains(@class, 'sc-gKAaRy')]/div[2]")
    public WebElement HTLRoomType;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span[1]")
    public WebElement HTLCity;








}
