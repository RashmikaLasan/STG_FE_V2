package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuestionLocators {


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Arrival Airline')]")
    public WebElement arrivalAirline;

    @FindBy(how = How.ID, using = "transfer_air_arrival_airline")
    public WebElement arrivalAirlineTextBox;


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Arrival Flight No')]")
    public WebElement arrivalFlightNo;

    @FindBy(how = How.ID, using = "transfer_air_arrival_flightNo")
    public WebElement arrivalFlightNoTextBox;


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Drop Off Location')]")
    public WebElement dropOffLocation;

    @FindBy(how = How.ID, using = "transfer_arrival_dropOff")
    public WebElement dropOffLocationTextBox;


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Tour/Activity Language')]")
    public WebElement language;

    @FindBy(how = How.XPATH, using = "//button[@data-automation-id='LANG-dropdown-toggle']")
    public WebElement languageClick;

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'btdiGj')]/a[1]")
    public WebElement languageSelect;


    @FindBy(how = How.XPATH, using = "//label[text()='Hotel Pickup']")
    public WebElement hotelPickup;

    @FindBy(how = How.CSS, using = "body.js-focus-visible:nth-child(2) div.core-styled__Container-sc-1n2dkln-0.ebnYyC div.sc-kHWWYL.core-styled__StyledContentContainer-sc-1n2dkln-2.zRuTu.nPQbq:nth-child(4) div.sc-jUfyBS.cbITWJ div.sc-jQAxuV.iJGVTQ:nth-child(4) div.sc-gKAaRy.kViyjc div.sc-gKAaRy.kViyjc:nth-child(2) div:nth-child(2) div.sc-gKAaRy.kViyjc:nth-child(2) div.sc-gKAaRy.fsPUru:nth-child(1) div.sc-gKAaRy.RHFDropdownFieldstyled__StyledDropDownContaner-sc-104elrx-4.jOJeXD.jLrOKS > div:nth-child(2)")
    public WebElement hotelPickupClick;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), \"I live locally / I'm staying with friends, relatives\")]")
    public WebElement hotelPickupSelect;



    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Passport Number')]")
    public WebElement passportNumber;

    @FindBy(how = How.ID, using = "passport_passportNo")
    public WebElement passportTextBox;


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Passport Nationality')]")
    public WebElement passportNationality;

    @FindBy(how = How.XPATH, using = "//button[@data-automation-id='passport_nationality-dropdown-toggle']//*[local-name()='svg']")
    public WebElement passportNationalityClick;

    @FindBy(how = How.XPATH, using = "//span[@class='sc-bqGGPW cKxAGJ'][normalize-space()='Algeria']")
    public WebElement passportNationalitySelect;


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Passport Expiry Date')]")
    public WebElement passportExpiryDate;

    @FindBy(how = How.NAME, using = "undefined.day")
    public WebElement passportExpiryDay;

    @FindBy(how = How.NAME, using = "undefined.month")
    public WebElement passportExpiryMonth;

    @FindBy(how = How.NAME, using = "undefined.year")
    public WebElement passportExpiryYear;


    @FindBy(how = How.XPATH, using = "//label[normalize-space()='Date of Birth']")
    public WebElement birthDateLabel;

    @FindBy(how = How.XPATH, using = "//*[@name='undefined.day']")
    public WebElement birthDay;

    @FindBy(how = How.XPATH, using = "//*[@name='undefined.month']")
    public WebElement birthMonth;

    @FindBy(how = How.XPATH, using = "//*[@name='undefined.year']")
    public WebElement birthYear;


    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'iJGVTQ')]/div/form/div/div[3]/div/div/div[2]/div/div/label")
    public WebElement birthDateLabel2;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement birthDay2;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    public WebElement birthMonth2;

    @FindBy(how = How.XPATH, using = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/input[1]")
    public WebElement birthYear2;




}
