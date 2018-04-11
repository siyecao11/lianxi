package test;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;
import org.testng.annotations.Test;
public class ScreenShot {
	
	/*@Test   //对页面整个屏进行截图保存
	public void shot() throws InterruptedException, IOException {	    
	Getdriver getDriver=new Getdriver();	   
	WebDriver driver = getDriver.driver("https://www.wjx.top/jq/21220369.aspx"); 
    Thread.sleep(3000);  
    ////指定了OutputType.FILE做为参数传递给getScreenshotAs()方法，其含义是将截取的屏幕以文件形式返回。保存到默认路径下
    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);  
    //利用FileUtils工具类的copyFile()方法保存getScreenshotAs()返回的文件对象到指定的目录下。
    FileUtils.copyFile(scrFile, new File("screenshot\\baidu_selenium.png"));
     }*/ 
	
	
	
	@Test   //对页面某个元素进行截图保存
	public void  elementShot() throws InterruptedException, IOException {	    
		Getdriver getDriver=new Getdriver();	   
		WebDriver driver = getDriver.driver("https://www.wjx.top/jq/21220369.aspx"); 
	    Thread.sleep(3000);  
	    WebElement element=driver.findElement(By.className("surveyhead"));//定位元素
	    WrapsDriver wrapsDriver = (WrapsDriver) element;  
        // 截图整个页面  
        File screen = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);  
        BufferedImage img = ImageIO.read(screen);  
        // 获得元素的高度和宽度  
        int width = element.getSize().getWidth();  
        int height = element.getSize().getHeight();  
        // 创建一个矩形使用上面的高度，和宽度  
        Rectangle rect = new Rectangle(width, height);  
        // 得到元素的坐标  
        Point p = element.getLocation();  
        BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width,rect.height);  
        //存为png格式  
        ImageIO.write(dest, "png", screen);  
        FileUtils.copyFile(screen, new File("screenshot\\elementShot.png"));
	}
	    
	    
	    
	    
	    
	    
	
	

}
