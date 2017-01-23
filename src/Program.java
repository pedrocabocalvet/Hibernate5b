import java.sql.Date;

import org.hibernate.Session;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub7
		
		System.out.println("hola");
		
	 /*   //guardar normal 
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Empresa empresa = new Empresa();
		
		empresa.setCif("1135");
		empresa.setDireccion("Calle garcilaso");
		empresa.setEmpleados(20);
		empresa.setNombre("pepito perez g");
		
		session.save(empresa);
		session.getTransaction().commit();

		session.close();
		HibernateUtilities.getSessionFactory().close();
		
	*/	
		
		/*
		
		// recuperar normal
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		// recupera la empresa con identificador q le he puesto si es un int va sin comillas
		Empresa empresa = session.get(Empresa.class,"1111");
		System.out.println("recuperada empresa "+empresa.getNombre());
		
		session.getTransaction().commit();
		session.close();
		HibernateUtilities.getSessionFactory().close();
		
		*/
		
		/*   // aqui guardo normal item y pedidos antes de modificar la tabla
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Item item = new Item();
		Pedido pedido = new Pedido();
		
		item.setCantidad(100);
		item.setNombre("folios");
		
		java.util.Date utilDate = new java.util.Date(); //fecha actual
		long lnMilisegundos = utilDate.getTime();
		Date fecha = new Date(lnMilisegundos);
		
		pedido.setFecha(fecha);
		
		session.save(item);
		session.save(pedido);
		
		session.getTransaction().commit();
		session.close();
		HibernateUtilities.getSessionFactory().close();
		
		
		*/
		
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		
		
		java.util.Date utilDate = new java.util.Date(); //fecha actual
		long lnMilisegundos = utilDate.getTime();
		Date fecha = new Date(lnMilisegundos);
		Pedido pedido = new Pedido();
		pedido.setFecha(fecha);
		
		pedido.getItemsAtributo().add(new Item("Palo2",200));
		pedido.getItemsAtributo().add(new Item("Escoba2",250));
		
		session.save(pedido);
		
		session.getTransaction().commit();
		
		
		session.beginTransaction();
		
		Pedido pedidoRecuperado = session.get(Pedido.class,1);
		
		System.out.println("hemos recuperado el pedido con id: "+pedidoRecuperado.getId());
		
		for(Item item : pedidoRecuperado.getItemsAtributo()){
			System.out.println(item.getNombre());
		}
		
		session.close();
		HibernateUtilities.getSessionFactory().close();
		

	}

}
