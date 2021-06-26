package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutPageLocators {

    @FindBy(how = How.CSS, using = ".dCIRwY .sc-bBjRSN")
    public WebElement Title1;

    @FindBy(how = How.XPATH, using = "//span[text()='Mr']")
    public WebElement TitleSelect1;

    @FindBy(how = How.XPATH, using = "//input[@id='firstName']")
    public WebElement FName1;

    @FindBy(how = How.XPATH, using = "//input[@id='lastName']")
    public WebElement LName1;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public WebElement Email1;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]")
    public WebElement SomeWhere;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'RHFPhoneNumberFieldstyled__StyledButtonToggle-sc-13j4moq-0')]")
    public WebElement CountryCode1;

    @FindBy(how = How.ID, using = "phoneNumber-dropdown-country-toggle")
    public WebElement CountryCode2;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'btdiGj')]//span[text()='United Kingdom']")
    public WebElement CountryCodeSelect1;

    @FindBy(how = How.XPATH, using = "//*[@id='phoneNumber']")
    public WebElement MobileNumber1;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'iJGVTQ')]/div/form/div/div[2]/div[2]/div/div/div")
    public WebElement Language1;

    @FindBy(how = How.XPATH, using = "//span[text()='English - Audio']")
    public WebElement LanguageSelect;

    @FindBy(how = How.ID, using = "nameOnCard")
    public WebElement CardName;

    @FindBy(how = How.NAME, using = "cardnumber")
    public WebElement CardNumber;

    @FindBy(how = How.XPATH, using = "//h1[normalize-space()='YOUR DETAILS']")
    public WebElement YourDetails;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]")
    public WebElement Tick;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm & Pay')]")
    public WebElement Confirm;

    @FindBy(how = How.CSS, using = ".biLA-DA .sc-bqGGPW")
    public WebElement ProductName1;

    @FindBy(how = How.CSS, using = ".OverviewPanelstyled__Main-sc-33lk3x-3 .fjYqUh > span")
    public WebElement Date1;

    @FindBy(how = How.CSS, using = ".OverviewPanelstyled__Main-sc-33lk3x-3 .fjYqUh > span:nth-of-type(2)")
    public WebElement Guests1;

    @FindBy(how = How.CSS, using = ".OverviewPanelstyled__Main-sc-33lk3x-3 > div:nth-of-type(2) > span:nth-of-type(2)")
    public WebElement Location1;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Promo Code']")
    public WebElement PromoCodeBox;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Apply']")
    public WebElement PromoCodeApply;

    @FindBy(how = How.CSS, using = ".XYOqG > span:nth-of-type(2)")
    public WebElement SubPrice1;

    @FindBy(how = How.CSS, using = ".jPMSVP .igoXrd")
    public WebElement TotalPrice1;









}
