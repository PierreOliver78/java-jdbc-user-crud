package conexao_jdbc;

import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
	
	private static Properties properties = new Properties();
	
	static {
		
		try {
			
			InputStream input =
		               PropertyLoader.class
		               .getClassLoader()
		               .getResourceAsStream("db.properties");

		            properties.load(input);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String chave) {
        return properties.getProperty(chave);
    }

}
