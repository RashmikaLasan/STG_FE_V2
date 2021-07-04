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

    @FindBy(how = How.XPATH, using = "//*[contains(@class, 'iJGVTQ')]/div/form/div/div[2]/div[2]/div/div/div")
    public WebElement languageClick;

    @FindBy(how = How.XPATH, using = "//span[text()='English - Audio']")
    public WebElement languageSelect;


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
    public WebElement BirthDateLabel;

    @FindBy(how = How.ID, using = "dateOfBirth_dob-day")
    public WebElement birthDay;

    @FindBy(how = How.ID, using = "dateOfBirth_dob-month")
    public WebElement birthMonth;

    @FindBy(how = How.ID, using = "dateOfBirth_dob-year")
    public WebElement birthYear;


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Date of Birth')]")
    public WebElement birthDate;


}
