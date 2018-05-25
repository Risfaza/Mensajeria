package com.tikal.mervel.util;

import org.springframework.stereotype.Component;

import com.googlecode.objectify.ObjectifyService;
import com.tikal.mervel.modelo.entity.Empresa;
import com.tikal.mervel.modelo.entity.Envio;
import com.tikal.mervel.modelo.entity.Paquete;
import com.tikal.mervel.modelo.login.Perfil;
import com.tikal.mervel.modelo.login.SessionEntity;
import com.tikal.mervel.modelo.login.Usuario;
import com.tikal.mervel.modelo.login.Sucursal;

@Component
public class StartupEntities {
	
	
	public StartupEntities() {
		
		
		ObjectifyService.register(Usuario.class);
		ObjectifyService.register(Perfil.class);
		ObjectifyService.register(SessionEntity.class);
		ObjectifyService.register(Sucursal.class);
		ObjectifyService.register(Paquete.class);
		ObjectifyService.register(Envio.class);
		ObjectifyService.register(Empresa.class);
		
		
	}
	  
    
    
}
