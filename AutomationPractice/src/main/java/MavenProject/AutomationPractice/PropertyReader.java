package MavenProject.AutomationPractice;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertyReader {
		
		//Method to read from the property file
		public String readProperty(String key) throws IOException
		{
			String result;
			Properties prop=new Properties();
			//inputing property file path to the file input stream,
			FileInputStream fip=new FileInputStream("Resources\\Property_file\\datapool.properties");
			prop.load(fip);		
			result=prop.getProperty(key);
			return result;
			
		}

	}

