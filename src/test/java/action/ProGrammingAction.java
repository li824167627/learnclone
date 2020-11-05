package action;

import com.sun.beans.editors.ByteEditor;
import common.CommonObject;
import common.Thread;
import object.ProGramming;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ProGrammingAction extends CommonObject {

    public ProGrammingAction(WebDriver driver) { super(driver); }
    private static Logger logger = Logger.getLogger(ProGrammingAction.class);
    public int A;
    static JavascriptExecutor js;
    public void ProGranmmingButton()
    {
        A=2000;
        ProGramming pro = new ProGramming(driver);
        js=(JavascriptExecutor)driver;
        driver.get("https://console1.cloud.inspur.com/iqs/#/home/overview?region=cn-north-3");
        logger.info("电路编程");
        //电路编程
        pro.circuit.click();
        Thread.sleep(A);
        //创建电路编程
        pro.creat.click();
        Thread.sleep(A);
        //描述
        pro.description.sendKeys("测试");
        Thread.sleep(A);
        //量子寄存器+
        pro.add.click();
        Thread.sleep(A);
        //量子寄存器+
        pro.add.click();
        Thread.sleep(A);
        //输入量子寄存器数量
        //pro.add.clear();
        //pro.add.sendKeys("5");
        //Thread.sleep(A);
        //量子寄存器-
        pro.minus.click();
        Thread.sleep(A);
        //经典寄存器
        //pro.classic.click();
        //Thread.sleep(A);
        //输入经典寄存器数量
        //pro.input.sendKeys("3");
        //Thread.sleep(A);
        //保存
        pro.storage.click();
        Thread.sleep(A);
        //电路编程
        pro.circuit.click();
        Thread.sleep(A);
        //列表选中删除
        pro.select.click();
        Thread.sleep(A);
        pro.delete.click();
        Thread.sleep(A);
        pro.reldelete.click();
        Thread.sleep(A);
        //进入详情
        pro.listdel.click();
        Thread.sleep(A);
        //运行
        pro.function.click();
        Thread.sleep(A);
        //量子计算机下拉框
        //pro.driver.switchTo().alert();
        //pro.driver.switchTo().frame(1);
        //js.executeScript("");
        pro.drop.click();
        Thread.sleep(A);
        //量子计算机选择下拉框第一个数据
        pro.box1.click();
        Thread.sleep(A);
        //shots数量
        pro.shots.click();
        Thread.sleep(A);
        //量子计算机选择下拉框第一个数据
        pro.box2.click();
        Thread.sleep(A);
        //运行弹窗确定
        //pro.driver.switchTo().alert().accept();
        pro.enter.click();
        //电路编程
        pro.circuit.click();
        Thread.sleep(A);
        //我的任务
        pro.task.click();
        Thread.sleep(A);
        //pro.driver.switchTo().frame(1);
}
}
