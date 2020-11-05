package test;

import action.GeneralAction;
import action.LoginAction;
import common.CommonDriver;
import common.CommonTest;
import common.ExcelData;
import common.IntelligentWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneralTest extends CommonTest{
    public GeneralAction generalAction;
    public ExcelData excelData;
    public IntelligentWait intelligentWait;
    public List<String> resultList =new ArrayList<String>();
    private String result;

    @BeforeClass
    public void before(){
        excelData =new ExcelData();
        intelligentWait=new IntelligentWait();
    }

    @Test
    public void generalTest() throws Error {
        //调用driver对象
        generalAction = new GeneralAction(CommonDriver.getDriver());
        //加载驱动
        CommonTest.setDriver(generalAction.getDriver());
        //调用Action里的方法对获取到的元素进行操作
        generalAction.generalButton();
    }

    @AfterClass
    public void after()
    {

    }

}
