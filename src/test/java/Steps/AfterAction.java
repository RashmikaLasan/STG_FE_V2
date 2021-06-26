package Steps;

import Utilities.SeleniumDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AfterAction {


    @After
    public static void tearDown(Scenario scenario) {

        WebDriver driver = SeleniumDriver.getDriver();
        System.out.println("Are there any Test failure: " + scenario.isFailed());
        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");

        }

        SeleniumDriver.tearDowns();
    }
}