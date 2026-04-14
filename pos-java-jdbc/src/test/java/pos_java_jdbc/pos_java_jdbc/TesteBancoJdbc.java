package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();

		
		userposjava.setNome("Rogério");
		userposjava.setEmail("rogerioteste@gmail.com");

		userPosDAO.salvar(userposjava);

	}

	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();

			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("-------------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void initBuscar() {

		UserPosDAO dao = new UserPosDAO();

		try {
			Userposjava userposjava = dao.buscar(5L);
			System.out.println(userposjava);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void initAtualizar() {

		try {

			UserPosDAO dao = new UserPosDAO();

			Userposjava objetoBanco = dao.buscar(2L);

			objetoBanco.setNome("Luana");

			dao.atualizar(objetoBanco);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	@Test
	public void initDelete() {
		try {
			
			UserPosDAO dao = new UserPosDAO();			
			dao.deletar(5L);	 
					
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void insertTelefone() {
		try {
			
						
			Telefone telefone = new Telefone();
			telefone.setNumero("(47)3425-6578");
			telefone.setTipo("Casa");
			telefone.setUsuario(9L);
			
			UserPosDAO dao = new UserPosDAO();
			dao.salvarTefefone(telefone);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void testeCarregaFoneUser() {
		try {
			
			UserPosDAO dao = new UserPosDAO();
			
			List<BeanUserFone> beanUserFones = dao.listaUserFone(9L);
			
			for (BeanUserFone beanUserFone : beanUserFones) {
				System.out.println(beanUserFone);
				System.out.println("======================================");
								
			}			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
