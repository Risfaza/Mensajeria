package com.tikal.mervel.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tikal.mervel.dao.PerfilDAO;
import com.tikal.mervel.dao.SessionDao;
import com.tikal.mervel.dao.SucursalDao;
import com.tikal.mervel.dao.UsuarioDao;
import com.tikal.mervel.modelo.login.Perfil;
import com.tikal.mervel.modelo.login.Sucursal;
import com.tikal.mervel.util.AsignadorDeCharset;
import com.tikal.mervel.util.JsonConvertidor;

@Controller
@RequestMapping("/sucursal")
public class SucursalController {
	
	 
		@Autowired
		@Qualifier("usuarioDao")
		UsuarioDao usuarioDao;
		
		@Autowired
		@Qualifier("perfilDAO")
		PerfilDAO perfilDAO;
		
		 @Autowired
		 @Qualifier("sessionDao")
		 SessionDao sessionDao;

		 @Autowired
		 @Qualifier("sucursalDao")
		 SucursalDao sucursalDao;

		 
		 @RequestMapping(value={"/prueba"},method = RequestMethod.GET)
		   
		   public void prueba(HttpServletResponse response, HttpServletRequest request) throws IOException {
			   response.getWriter().println("Prueba del mètodo Perfil");

		    }
		 
			@RequestMapping(value = { "/add/{userName}" }, method = RequestMethod.GET)
			public void crearPerfil(HttpServletRequest request, HttpServletResponse response, 
					@RequestBody String json, @PathVariable String userName)throws IOException {
//				if(SesionController.verificarPermiso2(request, usuarioDao, perfilDAO, 45, sessionDao,userName)){
				//	AsignadorDeCharset.asignar(request, response);
				//	System.out.println(" edgar manda:"+json);
					Sucursal sucursal = new Sucursal();
					sucursal.setNombre("prueba");
					sucursal.setRfc("prueba");
					sucursal.setCurp("prueba11111");
					sucursal.setDomiciio("pruebapruebapruebaprueba");
					sucursal.setTelefono("--------");
					sucursal.setTitular("prueba prueba");
					sucursal.setUbicacion("-------");
					sucursalDao.save(sucursal);
//				} else {
//					response.sendError(403);
//				}
			}
}
