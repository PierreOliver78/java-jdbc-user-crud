package conexao_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class SingleConnection {
	
	private static String url = PropertyLoader.getProperty("url");
	private static String password = PropertyLoader.getProperty("password");
	private static String user = PropertyLoader.getProperty("user");
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	private static void conectar() {
		try {
			
			if (connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);				
				JOptionPane.showMessageDialog(null, "Conectou com Sucesso!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return connection;
	}

}
