package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutPageLocators {

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement Title1;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[5]/div[1]")
    public WebElement TitleSelect1;

    @FindBy(how = How.XPATH, using = "//input[@id='firstName']")
    public WebElement FName1;

    @FindBy(how = How.XPATH, using = "//input[@id='lastName']")
    public WebElement LName1;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    public WebElement Email1;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]")
    public WebElement SomeWhere;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement CountryCode1;

    @FindBy(how = How.ID, using = "phoneNumber-dropdown-country-toggle")
    public WebElement CountryCode2;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'hyxxKc')]//span[text()='United Kingdom']")
    public WebElement CountryCodeSelect1;

    @FindBy(how = How.XPATH, using = "//*[@id='phoneNumber']")
    public WebElement MobileNumber1;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'kBaBZg')]/div/form/div/div[2]/div[2]/div/div/div/div/button")
    public WebElement Language1;

    @FindBy(how = How.XPATH, using = "//span[text()='English - Audio']")
    public WebElement LanguageSelect;

    @FindBy(how = How.ID, using = "nameOnCard")
    public WebElement CardName;

    @FindBy(how = How.NAME, using = "cardnumber")
    public WebElement CardNumber;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]")
    public WebElement Tick;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Confirm & Pay')]")
    public WebElement Confirm;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
    public WebElement ProductName1;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
    public WebElement Date1;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/span[2]")
    public WebElement Guests1;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/span[2]")
    public WebElement Location1;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Promo Code']")
    public WebElement PromoCodeBox;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Apply'];")
    public WebElement PromoCodeApply;



}
