package action;

import common.CommonObject;
import object.GeneralView;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import common.Thread;

public class GeneralAction extends CommonObject {

    public GeneralAction(WebDriver driver) { super(driver); }
    private static Logger logger = Logger.getLogger(GeneralAction.class);
    public int A;

    public void generalButton()
    {
        A=1000;
        GeneralView general = new GeneralView(driver);
        driver.get("https://console1.cloud.inspur.com/iqs/#/home/overview?region=cn-north-3");
        logger.info("概览页相关跳转");
        general.start.click();
        Thread.sleep(A);
        general.generalview.click();
        Thread.sleep(A);
        general.experiments.click();
        Thread.sleep(A);
        general.generalview.click();
        Thread.sleep(A);
        general.task.click();
        Thread.sleep(A);
        general.generalview.click();
        Thread.sleep(A);
        general.result.click();
        Thread.sleep(A);
        general.generalview.click();
        Thread.sleep(A);
    }
}
