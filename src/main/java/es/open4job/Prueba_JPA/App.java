package es.open4job.Prueba_JPA;

import javax.persistence.EntityManager;

import es.open4job.controller.PersistenceManager;
import es.open4job.vo.DatosVO;


public class App {
	public static void main(String[] args) {
		DatosVO datos = new DatosVO();
		datos.setNombre("Nombre");
		datos.setApellido1("Apellido1");
		datos.setApellido2("Apellido2");
		datos.setTelefono("976000001");

		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.persist(datos);
		em.getTransaction().commit();

		em.close();
		PersistenceManager.INSTANCE.close();
    	
    }
}
