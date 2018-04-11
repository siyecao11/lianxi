package util.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.ex.ConfigurationException;



public class properties {
	
    public  PropertiesConfiguration loadTestProperties(String fileName) throws ConfigurationException {
  		FileBasedConfigurationBuilder<PropertiesConfiguration> builder = new FileBasedConfigurationBuilder<PropertiesConfiguration>(
  				PropertiesConfiguration.class).configure(
  						new Parameters().properties().setFileName(fileName).setThrowExceptionOnMissing(true)
  								.setListDelimiterHandler(new DefaultListDelimiterHandler(';'))
  								.setIncludesAllowed(false));
  		PropertiesConfiguration config = null;
  		config = builder.getConfiguration();  

  		return config;
  	}

	    
public  String loginPurchaseBeta(String Dir,String propertiesKey){	
			Properties pps = new Properties();
			FileInputStream in = null;
			try {
				in = new FileInputStream(Dir);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
						
			try {
				pps.load(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
				String propertiesValue = pps.getProperty(propertiesKey);
				return propertiesValue;
			}
			

		}

