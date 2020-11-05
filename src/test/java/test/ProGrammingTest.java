package test;

import action.GeneralAction;
import action.ProGrammingAction;
import common.CommonDriver;
import common.CommonTest;
import common.ExcelData;
import common.IntelligentWait;
import object.ProGramming;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProGrammingTest extends CommonTest{
    public ProGrammingAction programmingAction;
    public ExcelData excelData;
    public IntelligentWait intelligentWait;
    public List<String> resultList =new ArrayList<String>();
    private String result;

    @DataProvider(name="login")
    public  Object[][] words() throws IOException {
        return excelData.getExcelData("src\\test\\java\\data","login.xlsx","sheet1");
    }

    @BeforeClass
    public void before(){
        excelData =new ExcelData();
        intelligentWait=new IntelligentWait();
    }

    @Test
    public void proGrammingTest() throws Error {
        //调用driver对象
        programmingAction = new ProGrammingAction(CommonDriver.getDriver());
        //加载驱动
        CommonTest.setDriver(programmingAction.getDriver());
        //调用Action里的方法对获取到的元素进行操作
        programmingAction.ProGranmmingButton();
    }

    @AfterClass
    public void after()
    {

    }

}
