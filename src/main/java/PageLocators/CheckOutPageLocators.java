package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutPageLocators {

    @FindBy(how = How.CSS, using = ".dCIRwY .sc-bBjRSN")
    public WebElement title1;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'iJGVTQ')]/div/form/div/div[3]/div/div/div/div/div/div/div/div/button")
    public WebElement title2;

    @FindBy(how = How.XPATH, using = "//span[text()='Mr']")
    public WebElement titleSelect1;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'btdiGj')]//span[text()='Mr']")
    public WebElement titleSelect2;

    @FindBy(how = How.XPATH, using = "//input[@id='firstName']")
    public WebElement fName1;

    @FindBy(how = How.ID, using = "guests[0].firstName")
    public WebElement fName2;

    @FindBy(how = How.XPATH, using = "//input[@id='lastName']")
    public WebElement lName1;

    @FindBy(how = How.ID, using = "guests[0].lastName")
    public WebElement lName2;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public WebElement email1;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]")
    public WebElement someWhere;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'RHFPhoneNumberFieldstyled__StyledButtonToggle-sc-13j4moq-0')]")
    public WebElement countryCode1;

    @FindBy(how = How.ID, using = "phoneNumber-dropdown-country-toggle")
    public WebElement countryCode2;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'btdiGj')]//span[text()='United Kingdom']")
    public WebElement countryCodeSelect1;

    @FindBy(how = How.XPATH, using = "//*[@id='phoneNumber']")
    public WebElement mobileNumber1;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'iJGVTQ')]/div/form/div/div[2]/div[2]/div/div/div")
    public WebElement language1;

    @FindBy(how = How.XPATH, using = "//span[text()='English - Audio']")
    public WebElement languageSelect;

    @FindBy(how = How.ID, using = "nameOnCard")
    public WebElement cardName;

    @FindBy(how = How.NAME, using = "cardnumber")
    public WebElement cardNumber;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space()='YOUR DETAILS']")
    public WebElement yourDetails;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]")
    public WebElement tick;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm & Pay')]")
    public WebElement confirm;

    @FindBy(how = How.CSS, using = ".biLA-DA .sc-bqGGPW")
    public WebElement productName1;

    @FindBy(how = How.CSS, using = ".OverviewPanelstyled__Main-sc-33lk3x-3 .fjYqUh > span")
    public WebElement date1;

    @FindBy(how = How.CSS, using = ".OverviewPanelstyled__Main-sc-33lk3x-3 .fjYqUh > span:nth-of-type(2)")
    public WebElement guests1;

    @FindBy(how = How.CSS, using = ".OverviewPanelstyled__Main-sc-33lk3x-3 > div:nth-of-type(2) > span:nth-of-type(2)")
    public WebElement location1;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Promo Code']")
    public WebElement promoCodeBox;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Apply']")
    public WebElement promoCodeApply;

    @FindBy(how = How.CSS, using = ".XYOqG > span:nth-of-type(2)")
    public WebElement subPrice1;

    @FindBy(how = How.CSS, using = ".jPMSVP .igoXrd")
    public WebElement totalPrice1;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/span[1]")
    public WebElement hotelName1;

    @FindBy(how = How.CSS, using = ".OverviewPanelstyled__Main-sc-33lk3x-3 > div:nth-of-type(2) > span:nth-of-type(2)")
    public WebElement hTLAddress1;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/span[3]")
    public WebElement roomType1;

    @FindBy(how = How.CSS, using = "div[class='sc-gKAaRy diOUFQ'] div:nth-child(1) span:nth-child(2)")
    public WebElement checkIn1;

    @FindBy(how = How.CSS, using = ".diOUFQ > div:nth-of-type(2) > span:nth-of-type(2)")
    public WebElement checkOut1;

    @FindBy(how = How.CSS, using = ".OverviewPanelstyled__Main-sc-33lk3x-3 > div:nth-of-type(2) > span:nth-of-type(4)")
    public WebElement paxCount1;

}
