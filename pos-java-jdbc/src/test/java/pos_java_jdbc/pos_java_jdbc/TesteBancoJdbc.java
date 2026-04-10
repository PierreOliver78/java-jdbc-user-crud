package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import conexao_jdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc{
	
	
	@Test
	public void initBanco(){
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(6L);
		userposjava.setNome("Inês Teste");
		userposjava.setEmail("inesteste@gmail.com");
		
		userPosDAO.salvar(userposjava);
		
	}
	
	

}
