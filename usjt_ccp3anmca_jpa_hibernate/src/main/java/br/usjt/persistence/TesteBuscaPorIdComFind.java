package br.usjt.persistence;

import javax.persistence.EntityManager;
import br.usjt.usjt.model.Usuario;
import br.usjt.util.JPAUtil;

public class TesteBuscaPorIdComFind {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Usuario u = manager.find(Usuario.class, 1L);
		System.out.println("Busca: " + u.getNome());
		manager.close();
		JPAUtil.close();
		}

}
