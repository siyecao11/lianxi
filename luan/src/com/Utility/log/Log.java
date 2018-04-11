package com.Utility.log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	//Initialize Log4j logs
		private static Logger logger = Logger.getLogger(Log.class);
		
		// This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
		public static void startTestCase(String sTestCaseName){
			
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
		    logger.info("****************************************************************************************");
		    logger.info("****************************************************************************************");
		    logger.info("&&&&&&&&&&&&&&&&&&&&&&                "+sTestCaseName+ "       &&&&&&&&&&&&&&&&&&&&&&&&&");
		    logger.info("****************************************************************************************");
		    logger.info("****************************************************************************************");
		}
		 
		//This is to print log for the ending of the test case
		public static void endTestCase(String sTestCaseName){
			
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
			logger.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
			logger.info("X");
			logger.info("X");
			logger.info("X");
			logger.info("X");
		}
		
		public static void spub(){
			
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
			logger.info("||-------------------------------------ST-Exception-INFO----------------------------------------||");
			
		}
		
		public static void epub(){
			
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
			logger.info("||-------------------------------------ED-Exception-INFO----------------------------------------||");
			
		}
		
		//log.info("info")
		public static void info(String infoMessage) {
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
			logger.info(infoMessage);
		}
		
		//log.error("error")
		public static void error(String infoMessage){
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
			logger.error(infoMessage);
		}
		
		//log.warn("warn")
		public static void warn(String infoMessage){
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
			logger.warn(infoMessage);
		}
		
		//log.assertion("assertion")
		public static void assertion(String infoMessage){
			
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
			logger.info("*********************************************************************************************");
			logger.info("||-------------------------------------------------------------------------------------------||");
			logger.info("||--------------------------------------STAssertion------------------------------------------||");
			logger.info("||((^^^^^^^^^^^^^^" + infoMessage + "^^^^^^^^^^^^^^^))||");
			logger.info("||--------------------------------------EDAssertion------------------------------------------||");
			logger.info("||-------------------------------------------------------------------------------------------||");
			//logger.info("*********************************************************************************************");
		}
		
		//log.assertFailInfo("assertFail")
		public static void assertFailInfo(Object assertFailInfoMessage){
			
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
			logger.info("��������������������������������������������������������������������������///|*|*|    |*|*|///����������������������������������������������������������������������������");
			logger.info("                                         "+"F--A--I--L"+"                                      ");
			logger.info(assertFailInfoMessage);
			logger.info("��������������������������������������������������������������������������///|*|*|    |*|*|///����������������������������������������������������������������������������");
		}
		
		//log.assertPassInfo("assertPadd")
		public static void assertPassInfo(){
			
			PropertyConfigurator.configure("configuration\\properties\\log4j.properties");
			logger.info("��������������������������������������������������������������������������///|*|*|    |*|*|///����������������������������������������������������������������������������");
			logger.info("                                         "+"P--A--S--S"+"                                      ");
			logger.info("��������������������������������������������������������������������������///|*|*|   |*|*|///������������������������������������������������������������������������������");
		}
}
