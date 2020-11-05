package common;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowChange extends CommonObject {
    public WindowChange(WebDriver driver) {
        super(driver);
    }

    public void changeWindow() {
        String currentHandle = driver.getWindowHandle();  	//获取当前窗口句柄
        Set<String> allHandle = driver.getWindowHandles();  	//获取所有窗口句柄
        Iterator<String> it = allHandle.iterator();  	//迭代allhandle里面的句柄
        while(it.hasNext()) {                        	//用it.hasNext()判断时候有下一个窗口,如果有就切换到下一个窗口
            driver.switchTo().window(it.next());     	//切换到新窗口
        }
    }
}
