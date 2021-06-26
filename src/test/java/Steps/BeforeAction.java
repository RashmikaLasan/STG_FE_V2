package Steps;

import Utilities.SeleniumDriver;
import cucumber.api.java.*;


public class BeforeAction {

    @Before
    public static void setup(){

        SeleniumDriver.setUpDriver();
    }
}
