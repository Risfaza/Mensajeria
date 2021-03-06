package com.tikal.mervel.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import static com.googlecode.objectify.ObjectifyService.ofy;
import com.tikal.mervel.modelo.login.Sucursal;

@Service("sucursalDao")
public class SucursalDaoImpl {
	
	 public  void save(Sucursal s) {    	
	        ofy().save().entity(s).now();
	    }

	    
	    public void delete(Sucursal s) {
	    	 System.out.println("si esta en daoimpl eliminando"+s);
	        ofy().delete().entity(s).now();
	        System.out.println("eliminando...");
	    }

	
		public void update(Sucursal s) {
		   System.out.print("sucursal:"+s.getId());
		   Sucursal old = this.consult(s.getId());
		System.out.print("old:"+old);
			if (old != null) {
				old.setNombre(s.getNombre());
				old.setCurp(s.getCurp());
				old.setDomiciio(s.getDomiciio());
				old.setRfc(s.getRfc());
				old.setTelefono(s.getTelefono());
				old.setTitular(s.getTitular());
				old.setUbicacion(s.getUbicacion());
				
				
			}

				ofy().save().entity(old);
	   }

	    
	
		public Sucursal consult(Long id) {
		   System.out.println("si esta en daoimpl consultando la sucursal.."+id);
	      return ofy().load().type(Sucursal.class).id(id).now();
			
		}


	   
		public List<Sucursal> findAll() {
			return ofy().load().type(Sucursal.class).list();
		}



}
