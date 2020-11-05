package common;

import com.sun.istack.internal.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonObject {

    public WebDriver driver;
    public static Logger logger = Logger.getLogger(CommonObject.class);
    public CommonObject(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


}
