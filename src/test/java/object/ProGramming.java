package object;

import common.CommonObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProGramming extends CommonObject {

    //定位元素
    //电路编程
    @FindBy(xpath="//*[@id=\"page-main\"]/app-nav-aside/aside/ul/div/nav-item[2]/li/a")
    public  WebElement circuit ;
    //创建电路编程
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/circuit-programming/div[3]/div/div/button")
    public WebElement creat;
    //描述
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/quirk/div[3]/nzi-form/form/nz-form-item[2]/nz-form-control/div/span/textarea")
    public WebElement description;
    //量子寄存器+
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/quirk/div[3]/nzi-form/form/nz-form-item[3]/nz-form-control/div/span/nz-input-number/div[1]/span[1]/i")
    public WebElement add;
    //量子寄存器-
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/quirk/div[3]/nzi-form/form/nz-form-item[3]/nz-form-control/div/span/nz-input-number/div[1]/span[2]/i")
    public WebElement minus;
    //输入量子寄存器数量
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/quirk/div[3]/nzi-form/form/nz-form-item[3]/nz-form-control/div/span/nz-input-number/div[2]/input")
    public WebElement number;
    //经典寄存器手动输入去掉标记
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/quirk/div[4]/nzi-form/form/nz-form-item[4]/nz-form-control/div/span/label/span[1]/input")
    public WebElement classic;
    //输入经典寄存器数量
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/quirk/div[3]/nzi-form/form/nz-form-item[4]/nz-form-control/div/span/label/span[1]/input")
    public WebElement input;
    //保存
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/quirk/div[3]/button[2]")
    public WebElement storage;
    //运行
    @FindBy(xpath="/html/body/app-root/app-default/div/div/div/div[2]/app-home/quirk/div[4]/button[1]")
    public WebElement function;
    //量子计算机下拉框
    @FindBy(xpath = "/html/body/div/div[5]/div/nzi-modal/div/div[2]/div/div/div[2]/nzi-form/form/nz-form-item[1]/nz-form-control/div/span/nz-select/div/div/div")
    public WebElement drop;
    //量子计算机选择下拉框第一个数据
    @FindBy(xpath="/html/body/div/div[7]/div/div/div/ul/li")
    public WebElement box1;
    //shots数量
    @FindBy(xpath="/html/body/div/div[5]/div/nzi-modal/div/div[2]/div/div/div[2]/nzi-form/form/nz-form-item[2]/nz-form-control/div/span/nz-select/div/div/div")
    public WebElement shots;
    //量子计算机选择下拉框第一个数据
    @FindBy(xpath="/html/body/div/div[7]/div/div/div/ul/li[1]")
    public WebElement box2;
    //运行弹窗确定
    @FindBy(xpath="/html/body/div/div[5]/div/nzi-modal/div/div[2]/div/div/div[3]/button[1]")
    public WebElement enter;
    //我的任务
    @FindBy(xpath="//*[@id=\"page-main\"]/app-nav-aside/aside/ul/div/nav-item[3]/li/a")
    public WebElement task;
    //选中
    @FindBy(xpath="/html/body/app-root/app-default/div/div/div/div[2]/app-home/circuit-programming/div[3]/div/div/div/button")
    public WebElement select;
    //删除
    @FindBy(xpath="/html/body/div[1]/div[5]/div/nzi-modal/div/div[2]/div/div/div[3]/button[1]")
    public WebElement delete;
    //删除确定
    @FindBy(xpath="/html/body/div/div[5]/div/nzi-modal/div/div[2]/div/div/div[3]/button[1]")
    public WebElement reldelete;
    //列表名称选中
    @FindBy(xpath="/html/body/app-root/app-default/div/div/div/div[2]/app-home/circuit-programming/nz-table/nz-spin/div/div/div/div/table/tbody/tr[2]/td[2]/p[1]/a/span")
    public WebElement listdel;


    public ProGramming(WebDriver driver) {
            super(driver);
            PageFactory.initElements(driver, this);
        }

}
