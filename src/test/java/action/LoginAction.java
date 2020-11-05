package action;

import common.CommonObject;
import object.LoginObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAction extends CommonObject {

    public LoginAction(WebDriver driver) {
        super(driver);
    }
    private static Logger logger = Logger.getLogger(LoginAction.class);


    public void loginButton(String user,String pwd)
    {
        LoginObject login = new LoginObject(driver);
        logger.info("进入登录页面开始登陆");
        login.username.clear();
        login.username.sendKeys(user);
        login.password.clear();
        login.password.sendKeys(pwd);
        login.loginButton.click();
    }
}
