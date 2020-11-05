package common;

import org.openqa.selenium.WebDriver;

public class CommonTest {
    public static WebDriver driver;
    public static void setDriver(WebDriver dr){
        driver=dr;
    }

    public void takescreen(String filename){
        SaveScreenShot.saveScreenShot(driver,filename);

    }
}
