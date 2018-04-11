package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.TemporaryFilesystem;
import org.openqa.selenium.io.Zip;
import org.testng.annotations.Test; 
public class Filess {
	@Test
	public void  fileTest() throws IOException, InterruptedException  {	    
		/*File file=new File("/visa/luan/test");
		FileHandler.createDir(file);*/  //新增目录操作
		
		
		/*File file=new File("/visa/luan/test");
		FileHandler.delete(file);*/   //删除目录操作
		
			
	/*	File file = new File("filesource/1.txt");
		        if (file.exists()) {
		        	file.delete();
		        }   //删除文件  */
		        
		
		/*File filesou=new File("/visa/luan/filesource/1.txt");
		File filetar=new File("/visa/luan/filetarget/1.txt");
		FileHandler.copy(filesou, filetar);*/   //复制源目录中指定的文件到目的目录中
			
		
	/*	File filesou=new File("/visa/luan/filesource");
		File filetar=new File("/visa/luan/filetarget");
		FileHandler.copy(filesou, filetar);//复制源目录中所有的文件到目的目录中*/
		
		
	/*  File filesou=new File("/visa/luan/filesource");
		File filetar=new File("/visa/luan/filetarget");
		FileHandler.copy(filesou, filetar,".txt");//复制源目录中指定的后缀文件到目的目录中*/
	
				
	    /*File filesou=new File("/visa/luan/filesource/4.txt");
		String file=FileHandler.readAsString(filesou);
		System.out.println(file);//读取txt文件的内容*/
		
		
		/*File filesou=new File("/visa/luan/filesource/2.docx");
		 FileInputStream fis = new FileInputStream(filesou);
         XWPFDocument xdoc = new XWPFDocument(fis);
         XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
         String doc1 = extractor.getText();
         System.out.println(doc1);
        // fis.close();   //读取docx文件的内容*/
		
		
		/*File filesou=new File("/visa/luan/filesource");
		File filesou1=new File("/visa/luan/filesource1");
		File filezip=new File("/visa/luan/filezip.zip");
		Zip zip=new Zip();
		zip.zip(filesou, filezip);  //压缩文件
		System.out.println(FileHandler.isZipped("/visa/luan/filezip.zip"));//判断是否压缩文件
		zip.unzip(filezip, filesou1);//解压文件 */	
	
		
		/*File temp=TemporaryFilesystem.getDefaultTmpFS().createTempDir("filetemp", ".txt");//创建临时目录或文件
		System.out.println(temp.getAbsolutePath());//获取临时目录和文件的绝对路径
		System.out.println(temp.getFreeSpace());//获取临时目录和文件的可用空间*/
		
		
	/*	File filesh=new File("E:/baoxian/tz-jn/script/insurance.sh");
		if(!FileHandler.canExecute(filesh)){
			Boolean boo = FileHandler.canExecute(filesh);		
			FileHandler.makeExecutable(filesh);
		}  //修改文件的权限操作*/	
	
		
		//上传文件，有input标签
		/*File wwwdir=new File("filesource\\new.html");  //声明文件对象
		String www="file://"+wwwdir.getAbsolutePath();   //获取文件的绝对路径
		Getdriver getDriver=new Getdriver();	   
		WebDriver driver = getDriver.driver(www); 
		WebElement shang=driver.findElement(By.id("file"));
		File filedir=new File("screenshot\\elementShot.png");  //声明文件对象
		String filed=filedir.getAbsolutePath();   //获取文件的绝对路径
		shang.sendKeys(filed);  //上传文件
		System.out.println(shang.getAttribute("value"));  //获取上传文件的值*/
		
		
		// 下载文件
		// 可以在Firefox浏览器地址栏中输入about:config来查看属性
        // 设置下载文件放置路径，注意如果是windows环境一定要用\\,用/不行	        
	    // 配置响应下载参数
		// 创建一个FirefoxProfile实例，用于存放自定义配置
	        FirefoxProfile profile = new FirefoxProfile(); 
	    // 指定下载路径，默认只会自动创建一级目录，如果指定了多级不存在的目录，将会下载到默认路径
	        profile.setPreference("browser.download.dir", "E:\\visa\\luan\\filesource");
	    // 设置成2表示使用自定义下载路径；设置成0表示下载到桌面；设置成1表示下载到默认路径
	        profile.setPreference("browser.download.folderList", 2);
	    //在开始下载时是否显示下载管理器
	        profile.setPreference("browser.download.manager.showWhenStarting",false);	
	        //browser.helperApps.neverAsk.openFile表示直接打开下载文件，不显示确认框
	        //默认值为空字符串，下行代码行设定了多种文件的MIME类型
	        //例如application/exe，表示.exe类型的文件，application/excel表示Excel类型的文件
	        profile.setPreference("browser.helperApps.neverAsk.openFile",  
	                "application/xhtml+xml,application/xml,application/x-msdownload,application/octet/octet-stream,application/exe,txt/csv,application/pdf,application/x-msexcl,application/x-excel,application/excel,image/png,image/jpeg,text/html,text/plain,text/x-c");  
	        //对所给出文件类型不再弹出提示框进行询问，直接保存到本地磁盘
	        profile.setPreference("browser.helperApps.neverAsk.saveToDisk",  
	                "application/xhtml+xml,application/xml,application/x-msdownload,application/octet/octet-stream,application/exe,txt/csv,application/pdf,application/x-msexcl,application/x-excel,application/excel,image/png,image/jpeg,text/html,text/plain,text/x-c");  
	        //对于未知的MIME类型文件会弹出窗口让用户处理，默认值为True，设定为False表示不会记录打开未知MIME类型文件的方式
	        profile.setPreference("browser.helperApps.alwaysAsk.force", false);  
	        //下载.exe文件弹出警告，默认值是True，设定为False则不会弹出警告框
	        profile.setPreference("browser.download.manager.alertOnEXEopen", false);
	        //默认值为True，设定为False表示不获取焦点
	        profile.setPreference("browser.download.manager.focusWhenStarting", false); 
	        //设定为False会把下载框进行隐藏
	        profile.setPreference("browser.download.manager.useWindow", false);  
	        //browser.download.manager.showAlertOnComplete设定下载文件结束后是否显示下载完成提示框，默认为True，设定为False表示下载完成后不显示下载完成提示框
	        profile.setPreference("browser.download.manager.showAlertOnComplete", false); 
	        //browser.download.manager.closeWhenDone设定下载结束后是否自动关闭下载框，默认为True，设定为False表示不关闭下载管理器
	        profile.setPreference("browser.download.manager.closewhenDone", false);
	        System.setProperty("webdriver.firefox.bin",
	        		"D:\\Program Files (x86)\\Mozilla Firefo\\firefox.exe");
	        System.setProperty("webdriver.firefox.marionette", "configuration/driver/geckodriver.exe"); 
	        WebDriver driver = new FirefoxDriver(profile);
	        driver.get("http://ftp.mozilla.org/pub/firefox/releases/35.0b8/win32/zh-CN/");
	        driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[2]/a")).click();
	       

	   	
	}	
		
}
