package test;

import action.GeneralAction;
import common.*;
import action.LoginAction;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoginTest extends CommonTest{
    public LoginAction loginaction;
    public ExcelData excelData;
    public IntelligentWait intelligentWait;
    public List<String> resultList =new ArrayList<String>();
    private String result;
    private Boolean test;


    @DataProvider(name="login")
    public  Object[][] words() throws IOException {
        return excelData.getExcelData("src\\test\\java\\data","login.xlsx","sheet1");
    }

    @BeforeClass
    public void before(){
        excelData =new ExcelData();
        intelligentWait=new IntelligentWait();
    }

    @Test(dataProvider="login")
    public void loginTest(HashMap<String, String> data) throws IOException {
        loginaction=new LoginAction(new CommonDriver().start());
        loginaction.loginButton(data.get("username"), data.get("password"));
        CommonTest.setDriver(loginaction.getDriver());
        intelligentWait.intelligentWait(loginaction.driver,20,data.get("toassert"));
        System.out.println("输出"+(loginaction.getDriver().getPageSource().contains(data.get("toassert"))));
        test=loginaction.getDriver().getPageSource().contains(data.get("toassert"));
        Assert.assertTrue(test,"断言成功");
        if (test=true)
            System.out.println("登陆成功");
        else
            System.out.println("登陆失败");
    }

    @AfterClass
    public void after()
    {

    }

}
