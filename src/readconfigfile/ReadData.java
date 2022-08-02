package readconfigfile;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {

	static Properties prop;
	
	public  void ReadData() throws Exception {
	FileInputStream fis= new FileInputStream("./data/config");
	prop= new Properties();
	prop.load(fis);
	
	}
	
	public static String getUrl() {
		String URL= prop.getProperty("URL");
		return URL;
	}
}
	
