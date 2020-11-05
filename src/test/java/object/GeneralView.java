package object;

import common.CommonObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralView extends CommonObject {

    //定位元素
    //开始编程
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/overview/div[2]/span/a")
    public  WebElement start;
    //电路编程实验数
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/overview/nz-spin[1]/div/div/div[2]/div/p[1]/span[1]")
    public WebElement experiments;
    //待执行任务数
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/overview/nz-spin[1]/div/div/div[3]/div/p[1]/span[1]")
    public WebElement task;
    //运行结果数
    @FindBy(xpath="//*[@id=\"page-main\"]/div/div/div[2]/app-home/overview/nz-spin[1]/div/div/div[4]/div/p[1]/span[1]")
    public WebElement result;
    //概览
    @FindBy(xpath="//*[@id=\"page-main\"]/app-nav-aside/aside/ul/div/nav-item[1]/li/a")
    public WebElement generalview;



    public GeneralView(WebDriver driver) {
            super(driver);
            PageFactory.initElements(driver, this);
        }

}
