package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.CapacitacionDAO;
import com.distribuida.entities.Capacitacion;

public class PrincipalCapacitacion {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		CapacitacionDAO capacitacionDAO = context.getBean("capacitacionDAOImpl",CapacitacionDAO.class);
		
		//EmpleadoDAO empleadoDAO = context.getBean("empleadoDAOImpl",EmpleadoDAO.class);

		Capacitacion capt = new Capacitacion(0,1,"Luis",new Date(),new Date(),"excelente");
		//capt.setEmpleado(empleado.findOne(1));
		capacitacionDAO.add(capt);
		
		Capacitacion capt2 = new Capacitacion(1,1,"Luis",new Date(),new Date(),"bien");
		//capt.setEmpleado(empleado.findOne(1));
		//capacitacionDAO.up(capt2);
		
		//del BORRADO
		//facturaDAO.del(86);
		//findOne
		
		
		System.out.println("*****DEL**"+capacitacionDAO.findOne(86));
		//findAll
		//List<Capacitacion> Capacitacion = CapacitacionDAO.findAll();	
		capacitacionDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
	

}
