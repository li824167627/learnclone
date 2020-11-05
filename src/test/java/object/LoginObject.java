package object;

import common.CommonObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject extends CommonObject {

    //定位元素
    @FindBy(id="username1")
    public  WebElement username;

    @FindBy(id="password1")
    public WebElement password;

    @FindBy(xpath="//*[@id=\"kc-login1\"]")
    public WebElement loginButton;

    @FindBy(xpath="//*[@id=\"kc-content-wrapper\"]/div[1]/div/span[2]")
    public WebElement errorLoginNotify;


    public LoginObject(WebDriver driver) {
            super(driver);
            PageFactory.initElements(driver, this);
        }

}
