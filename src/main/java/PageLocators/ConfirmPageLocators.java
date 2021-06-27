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

}
