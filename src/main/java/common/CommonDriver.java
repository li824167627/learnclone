package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class CommonDriver {

    private static File file;
    private static WebDriver driver ;

    public WebDriver start() throws IOException {
        //driver的位置
        file=new File("drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        //file=new File("drivers\\geckodriver.exe");
        //System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());

        File file = new File("drivers");

        String downloadpath = file.getAbsolutePath();
        System.out.println("浏览器新设置的下载绝对路径是："+downloadpath);
        //HashMap<String, Object> firefoxPrefs = new HashMap<String, Object>();
        //firefoxPrefs.put("profile.default_content_settings.popups", 0);
        //firefoxPrefs.put("download.default_directory", downloadpath);

        //FirefoxOptions options=new FirefoxOptions();
        //options.addArguments("--headless");
        //options.addArguments("start-maximized");
        //driver=new FirefoxDriver(options);

        driver = new ChromeDriver();
        //driver = new FirefoxDriver();//初始化driver
        driver.manage().window().maximize();

        driver.get(UrlAddress.login);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//加载元素等待
        return driver;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
    public static void setDriver(WebDriver dr)
    {
        driver=dr;
    }

    public void refresh(){
        //刷新浏览器
        driver.navigate().refresh();
    }

    public void quit(){
        //退出浏览器
        driver.close();
        driver.quit();
    }

    public static void deleteDriver()
    {
        driver=null;

    }




}
