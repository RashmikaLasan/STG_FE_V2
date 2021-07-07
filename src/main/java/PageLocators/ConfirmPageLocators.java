package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConfirmPageLocators {

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/span[1]")
    public WebElement productName;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/span[2]")
    public WebElement date;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/span[3]")
    public WebElement guests;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/span[4]")
    public WebElement location;

    @FindBy(how = How.CSS, using = "div[class='sc-gKAaRy cLccOM'] span[class='sc-bqGGPW hKEfcw']")
    public WebElement paid;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/span[1]")
    public WebElement bookingID;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='here']")
    public WebElement cancelIcon;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Yes, cancel my booking']")
    public WebElement cancelBooking;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Are you sure you want to cancel your booking?')]")
    public WebElement cancelPopUp;

    @FindBy(how = How.CSS, using = "div[class='sc-gKAaRy duvetK'] div:nth-child(1) span:nth-child(2)")
    public WebElement checkInDate;

    @FindBy(how = How.CSS, using = ".duvetK > div:nth-of-type(2) > span:nth-of-type(2)")
    public WebElement checkOutDate;

    @FindBy(how = How.XPATH, using = "//span[@data-automation-id='overview-guests-distribution']")
    public WebElement hTLPaxCount;

    @FindBy(how = How.XPATH, using = "//div[@class='sc-gKAaRy dIntGq']//div[@class='sc-dlnjwi jSOZQm']")
    public WebElement hTLRoomCount;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'kMGdow')]//*[contains(@class, 'sc-gKAaRy')]/div[2]")
    public WebElement hTLRoomType;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/span[1]")
    public WebElement hTLCity;








}
