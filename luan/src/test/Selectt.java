package test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Selectt {
	public static void main(String[] args) throws InterruptedException {
	Getdriver getDriver=new Getdriver();
   // WebDriver driver = getDriver.driver("https://123.sogou.com/"); 
	WebDriver driver = getDriver.driver("https://www.wjx.top/jq/21220369.aspx"); 
    
    
    //选择下拉值 ，有select标签
   /* WebElement input=driver.findElement(By.className("handle"));
    input.click();
    WebElement selector=driver.findElement(By.className("addr"));
    Select select = new Select(selector);
    select.selectByIndex(6);// 通过index
    Thread.sleep(3000); 
    select.selectByVisibleText("@sina.com");// 通过匹配到的可见字符
    Thread.sleep(3000); 
    select.selectByValue("yeah"); //通过匹配到标签里的value
*/    
     
	
	
   //依次点击下拉值，有select标签
/*    WebElement input=driver.findElement(By.className("handle"));
    input.click();
    WebElement selector=driver.findElement(By.className("addr"));
    Select select = new Select(selector);
   List<WebElement> list = select.getOptions(); //获取下拉值元素       
    for(int i = 0;i<list.size();i++)   //依次点击下拉值
    {
        WebElement we4 = list.get(i);
        we4.click();
        Thread.sleep(3000);
    }*/
   
   
	
	
    //选择下拉值 ，没有select标签，一层一层定位元素即可
/*    WebElement menu = driver.findElement(By.xpath(".//*[@id='engineMenuBtn']/i")); 
    menu.click();
    WebElement button = driver.findElement(By.xpath(".//*[@id='engineList']/div/a[4]/i[2]")); 
    button.click();
    Thread.sleep(5000);
    WebElement technicalQuestion = driver.findElement(By.className("jump"));
    technicalQuestion.click();*/
    
	
	
	
    //单选按钮radiobox  
    WebElement button1 = driver.findElement(By.xpath(".//*[@id='divquestion2']/ul/li[1]"));//男
    WebElement button2 = driver.findElement(By.xpath(".//*[@id='divquestion2']/ul/li[2]"));//女
    WebElement button3 = driver.findElement(By.xpath(".//*[@id='divquestion2']/ul/li[1]/input"));//男的input元素
    button1.click();
    Thread.sleep(3000); 
    System.out.println(button1.isSelected());
    System.out.println(button2.isSelected());
    System.out.println(button3.isSelected());

    System.out.println(button1.isEnabled());
    System.out.println(button2.isEnabled());
    System.out.println(button3.isEnabled());

    System.out.println(button1.isDisplayed());
    System.out.println(button2.isDisplayed());
    System.out.println(button3.isDisplayed());

    
    
/*    //多选：checkbox   
    List<WebElement> list = driver.findElements(By.xpath(".//*[@id='divquestion5']/ul/li"));//所选项列元素
    list.get(1).click();//多选中第二个选中
    list.get(3).click();//多选中第四个选中
    for (int i=0;i<list.size();i++){
    	WebElement inputlist=list.get(i).findElement(By.name("q5"));//定位元素下的元素
    	System.out.println(inputlist.isSelected());//依次判断多选按钮的选中状态
    }*/
    
    
    
    
    
	}   
}
